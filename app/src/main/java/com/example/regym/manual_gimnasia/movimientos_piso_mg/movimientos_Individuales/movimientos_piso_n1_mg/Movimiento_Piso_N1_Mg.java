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

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Movimiento_Piso_N1_Mg extends AppCompatActivity {


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
        btn_comentarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Comentarios_seccion.getVisibility() == View.GONE) {
                    Comentarios_seccion.setVisibility(View.VISIBLE);  // Muestra la sección de comentarios
                    btn_comentarios.setImageResource(R.drawable.ocultar_comentarios_btn);  // Cambia la imagen del botón
                    mostrarComentarios(getIntent().getStringExtra("mov"));
                } else {
                    Comentarios_seccion.setVisibility(View.GONE);  // Oculta la sección de comentarios
                    btn_comentarios.setImageResource(R.drawable.mostrar_comentarios_btn);  // Cambia la imagen del botón
                }
            }
        });

//Comentarios:

// Botón agregar comentario
        enviarComentarioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtén los datos de SharedPreferences, la actividad anterio y comentarios
                SharedPreferences preferences = getSharedPreferences("DatosUsuario", MODE_PRIVATE);
                String userId = preferences.getString("userId", null); // Debe ser el ObjectId del usuario
                String comentarioTexto = inputComentario.getText().toString().trim();
                String movimiento = getIntent().getStringExtra("mov");

                // Imprimir los valores en el logcat
                  Log.d("DEBUG", "userId: " + userId);
                  Log.d("DEBUG", "comentarioTexto: " + comentarioTexto);
                  Log.d("DEBUG", "movimiento: " + movimiento);

                // Mostrar valores en un TextView
               if (userId != null && !comentarioTexto.isEmpty() && movimiento != null) {
                    // Crea el comentario con el ID del usuario, el texto del comentario y el movimiento
                    ApiClient.Comentario nuevoComentario = new ApiClient.Comentario(userId, comentarioTexto, movimiento);
                    // Llama a la API
                    Call<ResponseBody> call = ApiClient.getApiService().crearComentario(nuevoComentario);
                    call.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                            if (response.isSuccessful()) {
                                Log.d("API_RESPONSE", "Comentario guardado exitosamente");
                                Toast.makeText(getApplicationContext(), "Comentario guardado exitosamente", Toast.LENGTH_SHORT).show();
                                // Puedes manejar la respuesta aquí, si es necesario
                            } else {
                                try {
                                    // Obtener el cuerpo de error
                                    String errorBody = response.errorBody() != null ? response.errorBody().string() : "Error desconocido";
                                    Log.d("API_RESPONSE", "Código de estado: " + response.code());
                                    Log.d("API_RESPONSE", "Mensaje: " + response.message());
                                    Log.e("API_ERROR", "Error: " + errorBody);
                                    Toast.makeText(getApplicationContext(), "Error al guardar comentario", Toast.LENGTH_SHORT).show();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            //cargarComentarios();
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
                List<ApiClient.Comentario> listaComentarios = response.body();

                for (ApiClient.Comentario comentario : listaComentarios) {
                    Log.d("COMENTARIOS", "Comentario recibido: " + comentario.getComentario());
                }
                if (response.isSuccessful() && response.body() != null) {


                    // Verifica si la lista de comentarios no está vacía
                    if (!listaComentarios.isEmpty()) {
                        // Configura el RecyclerView y su LayoutManager
                        RecyclerView recyclerView = findViewById(R.id.recyclerViewComentarios);
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        // Configura el adaptador de RecyclerView con los comentarios
                        ComentarioAdapter adapter = new ComentarioAdapter(listaComentarios);
                        recyclerView.setAdapter(adapter);
                    } else {
                        Log.e("API_RESPONSE", "No hay comentarios disponibles");
                        // Mostrar un mensaje de que no hay comentarios
                    }
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


}


