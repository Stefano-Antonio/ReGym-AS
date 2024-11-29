package com.example.regym.manual_gimnasia.movimientos_piso_mg.movimientos_Individuales.movimientos_piso_n1_mg;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.transition.Transition;
import com.example.regym.ApiClient;
import com.example.regym.R;
import com.example.regym.manual_gimnasia.movimientos_piso_mg.Movimientos_Piso_N1_Mg;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Movimiento_Piso_N1_Mg extends AppCompatActivity {

    private List<ApiClient.Comentario> listaComentariosEnMemoria = new ArrayList<>();
    private ComentarioAdapter comentarioAdapter;
    private boolean comentariosVisible = false; // Variable para controlar la visibilidad de los comentarios

    //@SuppressLint("ClickableViewAccessibility")
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //cargarComentarios();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimiento_piso_no1_mg);

//botones, scrolls, editTexts

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        ImageButton Ayuda_btn = findViewById(R.id.boton_ayuda_imagen);
        //descripcion
        ImageButton bnt_descripcion = findViewById(R.id.descripcion_btn);
        NestedScrollView descripcion1_seccion = findViewById(R.id.description_seccion);
        //tabla
        ImageButton bnt_tabla= findViewById(R.id.tabla_btn);
        NestedScrollView tabla_seccion = findViewById(R.id.tabla_seccion);
        //comentarios
        NestedScrollView Comentarios_seccion = findViewById(R.id.commentarios_seccion);
        ImageButton btn_comentarios = findViewById(R.id.comentarios_btn);
        EditText inputComentario = findViewById(R.id.nuevo_comentario_edit_text);
        Button enviarComentarioBtn = findViewById(R.id.agregar_comentario_btn);
        TextView nuevo_comentario_edit_text = findViewById(R.id.nuevo_comentario_edit_text);
//GIFS

        ImageView imageViewGif = findViewById(R.id.Movimiento_gift);

        //Traer el gift del movimiento
        int gifResource = getIntent().getIntExtra("movimiento_gift", R.raw.m1_n1_piso); // GIF predeterminado si no se pasa nada
        //Traer el texto del movimiento
        String descripcion_texto_a_mostrar = getIntent().getStringExtra("descripcion_texto_a_mostrar");
        TextView descripcion_texto = findViewById(R.id.descripcion);
        //Traer la tabla del movimiento

        // Obtén el recurso de la imagen pasada por Intent
        int tablaImagenRec = getIntent().getIntExtra("tabla_imagen", R.drawable.tabla_piso_n1_m1);
        // Encuentra el ImageView en el XML
        ImageView tablaImagen = findViewById(R.id.tabla);

        //Gift funcion
        Glide.with(this)
                .asGif()
                .load(gifResource) // Asegúrate de que el recurso sea correcto
                .into(new com.bumptech.glide.request.target.CustomTarget<GifDrawable>() {
                    @Override
                    public void onResourceReady(GifDrawable resource, Transition<? super GifDrawable> transition) {
                        imageViewGif.setImageDrawable(resource);

                        // Detener la animación del GIF inicialmente
                        resource.stop();


                        // Iniciar o detener la animación del GIF al hacer clic
                        imageViewGif.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if (resource.isRunning()) {
                                    resource.stop(); // Si está corriendo, lo detiene
                                } else {
                                    resource.start(); // Si está detenido, lo empieza
                                }
                            }
                        });
                    }

                    @Override
                    public void onLoadCleared(android.graphics.drawable.Drawable placeholder) {
                        // Maneja la limpieza del recurso cuando la vista ya no se necesita
                    }
                });


//boton descripcion
        bnt_descripcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (descripcion1_seccion.getVisibility() == View.GONE) {
                    descripcion1_seccion.setVisibility(View.VISIBLE);  // Muestra la sección de comentarios
                    descripcion_texto.setText((CharSequence) descripcion_texto_a_mostrar);
                    bnt_descripcion.setImageResource(R.drawable.ocultar_descripcion_btn);  // Cambia la imagen del botón
                }else {
                    descripcion1_seccion.setVisibility(View.GONE);  // Oculta la sección de comentarios
                    bnt_descripcion.setImageResource(R.drawable.mostrar_descripcion_btn);  // Cambia la imagen del botón
                }
            }
        });

//boton tabla
        bnt_tabla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tabla_seccion.getVisibility() == View.GONE) {
                    tabla_seccion.setVisibility(View.VISIBLE);  // Muestra la sección de comentarios
                    tablaImagen.setImageResource(tablaImagenRec); // Cambia la imagen del ImageView
                    bnt_tabla.setImageResource(R.drawable.ocultar_tabla_btn);  // Cambia la imagen del botón
                } else {
                    tabla_seccion.setVisibility(View.GONE);  // Oculta la sección de comentarios
                    bnt_tabla.setImageResource(R.drawable.mostrar_tabla_btn);  // Cambia la imagen del botón
                }
            }
        });

//boton comentarios
        //Guardar lista de likes:
        RecyclerView recyclerView = findViewById(R.id.recyclerViewComentarios);
        recyclerView.setLayoutManager(new LinearLayoutManager( Movimiento_Piso_N1_Mg.this));

        // Inicializa el adaptador con una lista vacía
        SharedPreferences preferences = getSharedPreferences("DatosUsuario", MODE_PRIVATE);
        String userId = preferences.getString("userId", null); // Debe ser el ObjectId del usuario
        comentarioAdapter = new ComentarioAdapter(listaComentariosEnMemoria, this, userId);

        // Asigna el adaptador al RecyclerView
        recyclerView.setAdapter(comentarioAdapter);

        btn_comentarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!comentariosVisible) {
                    // Muestra la sección de comentarios
                    Comentarios_seccion.setVisibility(View.VISIBLE);
                    btn_comentarios.setImageResource(R.drawable.ocultar_comentarios_btn); // Cambia la imagen del botón
                    comentariosVisible = true; // Actualiza el estado a visible

                    // Llama al método para mostrar los comentarios
                    mostrarComentarios(getIntent().getStringExtra("mov"));
                } else {
                    // Oculta la sección de comentarios
                    Comentarios_seccion.setVisibility(View.GONE);
                    btn_comentarios.setImageResource(R.drawable.mostrar_comentarios_btn); // Cambia la imagen del botón
                    comentariosVisible = false; // Actualiza el estado a no visible
                }
            }
        });



//Comentarios:

// Botón agregar comentario
        // Botón agregar comentario
        enviarComentarioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtén los datos de SharedPreferences, la actividad anterior y comentarios
                SharedPreferences preferences = getSharedPreferences("DatosUsuario", MODE_PRIVATE);
                String userId = preferences.getString("userId", null); // Debe ser el ObjectId del usuario
                String nombre = preferences.getString("nombre", null); // Debe ser el ObjectId del usuario
                String comentarioTexto = inputComentario.getText().toString().trim();
                String movimiento = getIntent().getStringExtra("mov");
                Log.d("DEBUG", "userId: " + userId);
                Log.d("DEBUG", "comentarioTexto: " + comentarioTexto);
                Log.d("DEBUG", "movimiento: " + movimiento);

                if (userId != null && !comentarioTexto.isEmpty() && movimiento != null) {
                    // Crea el comentario con el ID del usuario, el texto del comentario y el movimiento
                int like = 0;

                String customObjectId = ObjectIdGenerator.generateCustomObjectId();
                    Log.d("DEBUG", "objectId: " + customObjectId);

                    ApiClient.Comentario nuevoComentario = new ApiClient.Comentario(userId, nombre,comentarioTexto,  movimiento, like, customObjectId);

                    // Llama a la API
                    Call<ResponseBody> call = ApiClient.getApiService().crearComentario(nuevoComentario);
                    call.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                            if (response.isSuccessful()) {
                                try {
                                    // Obtener el comentarioId de la respuesta
                                    JSONObject responseObject = new JSONObject(response.body().string());
                                    String comentarioId = responseObject.getString("comentarioId");
                                    Log.d("DEBUG", "comentarioId recibido: " + comentarioId);

                                    // Suponiendo que el número de likes también está presente en la respuesta, lo actualizas:
                                    int likes = responseObject.getInt("num_likes");
                                    nuevoComentario.setNum_likes(likes); // Actualiza los likes
                                    printComentarioDetails(nuevoComentario);
                                    mostrarComentarios(getIntent().getStringExtra("mov"));
                                    nuevo_comentario_edit_text.setText("");

                                } catch (JSONException | IOException e) {
                                    e.printStackTrace();
                                }


                            } else {
                                try {

                                    // Obtener el cuerpo de error
                                    String errorBody = response.errorBody() != null ? response.errorBody().string() : "Error desconocido";
                                    Log.e("API_ERROR", "Error: " + errorBody);
                                    Toast.makeText(getApplicationContext(), "Error al guardar comentario", Toast.LENGTH_SHORT).show();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }

                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {
                            Log.e("API_ERROR", "Error de conexión: " + t.getMessage());
                            Toast.makeText(getApplicationContext(), "Error de conexión", Toast.LENGTH_SHORT).show();
                        }
                    });
                } else {
                    Toast.makeText(getApplicationContext(), "Usuario no autenticado, comentario vacío o movimiento no válido", Toast.LENGTH_SHORT).show();
                }
            }
        });



//boton ayuda

        Ayuda_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarPopup();
            }
        });
//boton Regresar

        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Movimiento_Piso_N1_Mg.this, Movimientos_Piso_N1_Mg.class);
                startActivity(intent);
            }
        });



//ScrollView funcionamiento

        descripcion1_seccion.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void mostrarPopup() {


        Dialog dialogo = new Dialog(this);

        // Obtén el mensaje de ayuda usando la clave correcta
        String mensajeAyuda = getIntent().getStringExtra("informacion_ayuda");

        // Infla el layout de la pantalla emergente
        View pantalla_emergente = getLayoutInflater().inflate(R.layout.movimiento1_piso_mg_ayuda, null);

        // Encuentra el TextView en el layout inflado
        TextView textViewAyuda = pantalla_emergente.findViewById(R.id.advertencia_texto_txt);

        // Establece el texto con el mensaje recibido
        if (mensajeAyuda != null) {
            textViewAyuda.setText(mensajeAyuda);
        }

        // Obtiene referencias a los elementos
        Button regresar = pantalla_emergente.findViewById(R.id.Regresar_btn);
        TextView link = pantalla_emergente.findViewById(R.id.hipervinculo);
        ScrollView scrollView = pantalla_emergente.findViewById(R.id.scrollView4);

        // Configura listeners para los botones
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para el botón 1
                dialogo.dismiss();
            }
        });
        // Obtén el link  usando la clave correcta
        String link_video = getIntent().getStringExtra("link");
        TextView textViewLink = pantalla_emergente.findViewById(R.id.hipervinculo);
        if (mensajeAyuda != null) {
            textViewLink.setText(link_video);
        }
        //Link de ayuda
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON"; // Reemplaza con la URL real
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                startActivity(intent);
            }
        });

        // Crea el Dialog
        dialogo.setContentView(pantalla_emergente);
        dialogo.show();
    }

    private void mostrarComentarios(String movimientoId) {
        Call<List<ApiClient.Comentario>> call = ApiClient.getApiService().obtenerComentariosPorMovimiento(movimientoId);

        call.enqueue(new Callback<List<ApiClient.Comentario>>() {
            @Override
            public void onResponse(Call<List<ApiClient.Comentario>> call, Response<List<ApiClient.Comentario>> response) {
                if (response.isSuccessful()) {
                    List<ApiClient.Comentario> comentariosDelBackend = response.body();

                    if (comentariosDelBackend == null || comentariosDelBackend.isEmpty()) {
                        Log.e("API_RESPONSE", "No hay comentarios disponibles.");
                        Toast.makeText(getApplicationContext(), "No hay comentarios disponibles.", Toast.LENGTH_SHORT).show();
                        return;
                    }
//Guardar lista de likes:
                    RecyclerView recyclerView = findViewById(R.id.recyclerViewComentarios);
                    recyclerView.setLayoutManager(new LinearLayoutManager( Movimiento_Piso_N1_Mg.this));

                    // Inicializa el adaptador con una lista vacía
                    SharedPreferences preferences = getSharedPreferences("DatosUsuario", MODE_PRIVATE);
                    String userId = preferences.getString("userId", null); // Debe ser el ObjectId del usuario
               //     comentarioAdapter = new ComentarioAdapter(listaComentariosEnMemoria, this, userId);

                    // Asigna el adaptador al RecyclerView
                    recyclerView.setAdapter(comentarioAdapter);

                    // Limpia y actualiza la lista en memoria
                    listaComentariosEnMemoria.clear();
                    listaComentariosEnMemoria.addAll(comentariosDelBackend);

                    // Notifica al adaptador que los datos han cambiado
                    comentarioAdapter.notifyDataSetChanged();

                    Log.d("COMENTARIOS", "Comentarios cargados correctamente: " + comentariosDelBackend.size());
                } else {
                    Log.e("API_RESPONSE", "Error al obtener comentarios: " + response.message());
                    Toast.makeText(getApplicationContext(), "No se pudieron cargar los comentarios.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<ApiClient.Comentario>> call, Throwable t) {
                Log.e("API_ERROR", "Fallo en la llamada de API: " + t.getMessage());
                Toast.makeText(getApplicationContext(), "Error de conexión: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    // Función para imprimir los detalles del objeto Comentario
    private void printComentarioDetails(ApiClient.Comentario comentario) {
        Log.d("Comentario Details", "ID Usuario: " + comentario.getUsuario_id());
        Log.d("Comentario Details", "Nombre Usuario: " + comentario.getNombre());
        Log.d("Comentario Details", "Comentario Texto: " + comentario.getComentario());
        Log.d("Comentario Details", "Movimiento: " + comentario.getMovimiento());
        Log.d("Comentario Details", "Número de Likes: " + comentario.getNum_likes());
        Log.d("Comentario Details", "Comentario ID: " + comentario.getComentario_id());
        Log.d("Comentario Details", "Respuestas: " + comentario.getRespuestas());
    }



    public class ObjectIdGenerator {
        /**
         * Genera un ObjectId personalizado siguiendo el formato estándar:
         * 4 bytes: Marca de tiempo (segundos desde el epoch, 1 de enero de 1970).
         * 5 bytes: ID único de máquina (basado en la dirección MAC).
         * 3 bytes: Incremento aleatorio.
         *
         * @return Un ObjectId válido.
         */
        public static String generateCustomObjectId() {
            try {
                long timestamp = System.currentTimeMillis() / 1000; // Marca de tiempo en segundos desde 1970
                byte[] machineId = getMachineIdentifier(); // ID único de máquina (5 bytes)
                int randomIncrement = new SecureRandom().nextInt(0xFFFFFF); // Incremento aleatorio (3 bytes)

                ByteBuffer buffer = ByteBuffer.allocate(12);
                buffer.putInt((int) timestamp); // 4 bytes
                buffer.put(machineId);          // 5 bytes
                buffer.put((byte) (randomIncrement >> 16)); // 1er byte del incremento
                buffer.put((byte) (randomIncrement >> 8));  // 2do byte del incremento
                buffer.put((byte) randomIncrement);         // 3er byte del incremento

                byte[] objectIdBytes = buffer.array();
                StringBuilder objectId = new StringBuilder();
                for (byte b : objectIdBytes) {
                    objectId.append(String.format("%02x", b)); // Convierte cada byte a hexadecimal
                }

                return objectId.toString(); // Retorna un String de 24 caracteres en formato hexadecimal
            } catch (Exception e) {
                throw new RuntimeException("Error al generar el ObjectId personalizado", e);
            }
        }


        /**
         * Obtiene un identificador único basado en la dirección MAC.
         *
         * @return Un arreglo de 5 bytes que representa el identificador único.
         */
        private static byte[] getMachineIdentifier() {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface network = networkInterfaces.nextElement();
                    if (!network.isLoopback() && network.getHardwareAddress() != null) {
                        byte[] mac = network.getHardwareAddress();
                        byte[] machineId = new byte[5];
                        System.arraycopy(mac, 0, machineId, 0, Math.min(mac.length, 5));
                        return machineId;
                    }
                }
            } catch (Exception e) {
                // Loguear el error si es necesario
                Log.e("ObjectIdGenerator", "Error obteniendo la dirección MAC: " + e.getMessage());
            }

            // Si no se puede obtener la MAC, genera un ID único alternativo
            byte[] fallbackId = new byte[5];
            new SecureRandom().nextBytes(fallbackId); // Genera 5 bytes aleatorios como fallback
            Log.w("ObjectIdGenerator", "Usando un ID único alternativo para machineId");
            return fallbackId;
        }


        /**
         * Convierte un entero a un arreglo de bytes de 4 elementos.
         *
         * @param value El valor entero.
         * @return Un arreglo de 4 bytes.
         */
        private static byte[] intToBytes(int value) {
            return new byte[]{
                    (byte) (value >> 24),
                    (byte) (value >> 16),
                    (byte) (value >> 8),
                    (byte) value
            };
        }
    }






}


