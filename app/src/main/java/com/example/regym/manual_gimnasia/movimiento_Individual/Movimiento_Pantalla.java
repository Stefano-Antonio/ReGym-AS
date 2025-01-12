package com.example.regym.manual_gimnasia.movimiento_Individual;

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

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Movimiento_Pantalla extends AppCompatActivity {
    private ComentarioAdapter comentarioAdapter;
    public static Movimiento_Pantalla context;
    private List<ApiClient.Comentario> listaComentariosEnMemoria = new ArrayList<>();
    private boolean comentariosVisible = false; // Variable para controlar la visibilidad de los comentarios

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //cargarComentarios();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimiento_pantalla);

//botones, scrolls, editTexts
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
        ImageButton enviarComentarioBtn = findViewById(R.id.agregar_comentario_btn);
        TextView nuevo_comentario_edit_text = findViewById(R.id.nuevo_comentario_edit_text);
        Button regresar_btn = findViewById(R.id.Regresar_btn);

        //GIFS
        ImageView imageViewGif = findViewById(R.id.Movimiento_gift);
        //Traer el gift del movimiento
        int gifResource = getIntent().getIntExtra("movimiento_gift", R.raw.m1_n1_piso); // GIF predeterminado si no se pasa nada
        //Traer la tabla del movimiento
        int tablaImagenRec = getIntent().getIntExtra("tabla_imagen", R.drawable.tabla_piso_n1_m1);
        ImageView tablaImagen = findViewById(R.id.tabla);


        Log.d("DEBUG", "Título recibido: " + getIntent().getStringExtra("titulo"));
        Log.d("DEBUG", "Descripción recibida: " + getIntent().getStringExtra("descripcion_texto_a_mostrar"));

        //Traer el texto del movimiento
        TextView descripcion_texto = findViewById(R.id.descripcion);
        TextView titulo_txt = findViewById(R.id.Mensaje_bienvenida);
        String titulo = getIntent().getStringExtra("titulo");
        String descripcion = getIntent().getStringExtra("descripcion_texto_a_mostrar");

        if (titulo != null) {
            titulo_txt.setText(titulo);
        } else {
            Log.e("ERROR", "Título no encontrado en el Intent");
        }

        if (descripcion != null) {
            descripcion_texto.setText(descripcion);
        } else {
            Log.e("ERROR", "Descripción no encontrada en el Intent");
        }


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

        regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();  // Cierra la actividad actual y regresa a la anterior
            }
        });

//boton descripcion
        bnt_descripcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (descripcion1_seccion.getVisibility() == View.GONE) {
                    descripcion1_seccion.setVisibility(View.VISIBLE);  // Muestra la sección de comentarios
                    descripcion_texto.setText((CharSequence) getIntent().getStringExtra("descripcion_texto_a_mostrar"));
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

// Botón agregar comentario
        enviarComentarioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lista de malas palabras
                List<String> malasPalabras = Arrays.asList(
                        "maldito", "idiota", "estúpido", "imbécil", "tonto",
                        "mierda", "cabron", "cabrona", "pendejo", "pendeja",
                        "puto", "puta", "put@", "pvt@", "pvto", "pvta",
                        "fck", "f*ck", "fuck", "f#ck", "shit", "sh1t",
                        "mierd@", "culero", "culera", "cabrón", "bastardo",
                        "hdp", "hijo de puta", "hijueputa", "perra", "zorra",
                        "zorr@", "imbecil", "bastarda", "madre", "chingar",
                        "chingón", "chingada", "pito", "verga", "v3rga", "vrga",
                        "naco", "güey", "guey", "w3y", "gay", "gaylord",
                        "@ss", "asshole", "coño", "picha", "estupido","tonta",
                        "tonto", "estúpida", "estúpido", "imbécil", "imbécil@",
                        "burro", "burra", "pendejada", "pendejo", "pendeja", "mamón",
                        "mamona", "idiota", "idiota@", "desgraciado", "desgraciada",
                        "bruto", "bruta", "menso", "mensa", "cabrón", "cabrona", "perro",
                        "perra", "mierda", "mirda", "mierd@", "culo", "cl0", "culo@",
                        "verga", "v3rga", "vrga", "vrga", "coño", "pto", "puto",
                        "puta", "chingar", "chingada", "chingón", "chingue",
                        "pa madre", "hijo de p*", "hijueputa", "zorra", "puta madre",
                        "asesino", "asesina", "matón", "matona", "violador",
                        "violadora", "violación", "tortura", "naco", "nac@",
                        "nac@zo", "gorilla", "gorill@", "indio", "india", "negro",
                        "negra", "joto", "maricón", "put@", "lesbiana", "travesti",
                        "pinga", "picha", "teta", "tetas", "huevos", "chorizo",
                        "vagina", "mamada", "chupaculo", "follar", "follada",
                        "sexo anal", "sexo oral", "mamón", "cabrón", "hijo de perra",
                        "pedazo de mierda", "malparido", "maldito", "maldita sea",
                        "racista", "xenófobo", "homofóbico", "misoginia",
                        "machista", "feminazi", "fck", "f#ck", "sh1t", "sh!t",
                        "b!tch", "btch", "c0ño", "c**o","cabrón", "cabrona",
                        "chinga", "chnga", "put@ madre", "v3rg@", "verga",
                        "chupapija", "p**o", "coo", "gilipollas", "imbécil",
                        "tarado", "pendejo", "pendeja", "hijueputa",
                        "chingaquedito", "zorra", "marrano", "cerdo", "chacal",
                        "malnacido", "malparido", "perra", "sucia", "tont@hija",
                        "mamón", "pto", "follón", "corto de mente", "paparulo",
                        "idiota", "subnormal", "pito", "tont@bola", "chupapollas",
                        "marica", "trapo", "tontorrona", "pendón", "cabronazo",
                        "culero", "cul@o", "apestado", "mujerzuela", "hombrezuela",
                        "enfermo", "putón", "cabrito", "nazi", "gay", "marimacho",
                        "put@rama", "soplapollas", "sucka", "mordaz",
                        "chanchullero", "nefasto", "feminazi", "machista",
                        "sodomita", "depravado", "vulgar", "analfabeto", "pelmazo",
                        "enviado", "loco", "follador", "sodomizador", "antipático",
                        "putaculos", "coo", "negrero", "asqueroso", "resabiado",
                        "guarro", "fracasado", "alcornoque", "peludo", "comemierda",
                        "mujeriego", "piruja", "guarra", "chafalonja", "zocorro",
                        "cabr@n", "naco", "mamerta", "loser", "cacas", "feo", "marica",
                        "pobretón", "porquería", "nazi", "gordo", "sarnoso",
                        "desgarrador", "frutero", "violadora", "solitario", "enfermo",
                        "cacho", "vulgar", "patán", "perro",
                        "petardo", "cochino", "imbécil", "peste", "drogadicto","put0",
                        "pUt0", "pU7o", "pt0", "put@","pUt@", "v3rg@", "v3rga",
                        "v3rg@a", "vergaa", "ch1nga", "ch1ng@","ch!nga", "ch!n6a",
                        "p3ndejo", "p3nd3j0", "p3nd3j@", "p3nd3h0", "c4brón",
                        "c4br0n", "c4br0n@", "c@br0n", "chup@p1ja", "chupap!ja",
                        "chup4p1ja", "c0ño", "c0n@o", "coñ0", "c@ño", "c0n0",
                        "put0madre", "put0madree", "put@madre", "putomadre",
                        "pu7o", "f0ll@r", "f0ll@r", "foll@r", "f0ll@do", "mar1c0n",
                        "m@r1c0n", "m4r1c0n", "maric@0", "mam0n", "mam0n@",
                        "mam0n3", "m@mon", "g!lipollas", "g1lipollas",
                        "gilip0llas", "g!l!p0llas", "imb3cil", "1mb3c!l",
                        "1mb3c1l", "tar@d0", "t@r@d0", "t@r4d0", "put@r@m@3",
                        "put@r@ma", "put@r@m@e", "pu7a", "pu7a", "p@ta",
                        "s0rra", "s0rra@", "s0rr@", "marr@no", "m@rr@no",
                        "cerd0", "c3rd0", "cerd@", "maln@c!d0", "maln@c!d@",
                        "malparid0", "malp@r!d@", "f@ll4r", "f@l!4r", "f@ll@r", "p!to",
                        "p!t0","t!to", "chup@p0llas", "chup@p0ll@s", "p$%o", "p%to",
                        "ch@p@j@","p#t@", "put4", "put@0", "put0m@dre", "f0ll4r",
                        "f0l!ar", "g!l!p0lla", "g!l!p0l@as", "t@r@d0", "t@r@do",
                        "m@mn", "m4m0n", "m4r!c0n", "m@r!c0n", "m@r1c0n", "s0rr@r",
                        "s0rr@d0", "m!r3nd@4", "c@br0n", "cabroN", "m@lac0n",
                        "m@lac0n@", "ch!p0", "ch!p@", "p!l0r", "p1tr@n", "b@rri0n",
                        "c0ñ0", "c@ñ0", "chup@p0ll@s", "chup@p0ll@as", "put#ra",
                        "put@r@", "put@r0", "put0m@dre", "chup4c0n", "put@",
                        "c@br0n@do", "t@r@d0", "g@rr@0n", "c0nch!n@d0", "p!!ja",
                        "m!@ta", "m@r!c@d0", "m4r!c@0", "pu7@madre", "pu7o",
                        "b0lud0", "c!n@gr@", "ch!ng@r", "f@ll@r", "foll@r",
                        "p3nd3j@", "g1l!p0llas", "g!l!p0l@as", "g!!l!p0ll@s",
                        "chup4m@dres", "g!l!p0", "mal0", "m4l0", "g!r@t0",
                        "t!g@rr@", "p0rt@l", "f@ll4r", "c0j0n", "g!l!p0ll@r",
                        "p@l3t0", "s@gr@d@", "f0ll@d@", "g3r0n", "m4l@c0n",
                        "p@l!t0", "g@rr!on", "m@l@madre", "ch!nga", "m0r@l@c0n",
                        "ch!p0", "c!p0", "t4r@", "t4r@do", "put#ra", "c@br@n",
                        "c@br0", "p0l@r", "f!c@r@", "chup0", "f@ll3r", "t0r@",
                        "put@r@nd@", "f@ll@", "ch!g@l0", "g0rr0n", "g@rr!o",
                        "g!p@ll@", "m!r3n@3", "chup@p@r", "g@r0n", "g!l!p0",
                        "g@l!b@r", "t@l@", "c0ñ0", "m@l0s", "put@", "ch!ngr@",
                        "s@p@r0", "g1rr@", "g4rr0n","m4r1c0n", "f@ll3r", "b@l0c@d@",
                        "g@ll0n", "f0l!d@"
                );
                // Obtén los datos de SharedPreferences, la actividad anterior y comentarios
                SharedPreferences preferences = getSharedPreferences("DatosUsuario", MODE_PRIVATE);
                String userId = preferences.getString("userId", null); // Debe ser el ObjectId del usuario
                String nombre = preferences.getString("nombre", null); // Debe ser el ObjectId del usuario
                String comentarioTexto = inputComentario.getText().toString().trim();
                String movimiento = getIntent().getStringExtra("mov");
                Log.d("DEBUG", "userId: " + userId);
                Log.d("DEBUG", "comentarioTexto: " + comentarioTexto);
                Log.d("DEBUG", "movimiento: " + movimiento);

                // Verificar si el comentario supera los 40 caracteres
                if (comentarioTexto.length() > 70) {
                    Toast.makeText(getApplicationContext(), "El comentario no puede tener más de 40 caracteres", Toast.LENGTH_SHORT).show();
                    return; // Detener el proceso
                }

                for (String malaPalabra : malasPalabras) {
                    if (comentarioTexto.toLowerCase().contains(malaPalabra)) {
                        Toast.makeText(getApplicationContext(), "El comentario contiene lenguaje inapropiado", Toast.LENGTH_SHORT).show();
                        return; // Detener el proceso
                    }
                }

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

        // Obtén el link usando la clave correcta
        String link_video = getIntent().getStringExtra("link");
        if (link_video != null) {
            link.setText(link_video);  // Muestra el link recibido en el TextView
        }

        // Link de ayuda
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (link_video != null) {
                    // Si el enlace es válido, abre la URL
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link_video));
                    startActivity(intent);
                }
            }
        });

        // Crea el Dialog
        dialogo.setContentView(pantalla_emergente);
        dialogo.show();
    }


    public void mostrarComentarios(String movimientoId) {
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
                    // Imprimir los IDs de los comentarios y respuestas
                    for (ApiClient.Comentario comentario : comentariosDelBackend) {
                        Log.d("COMENTARIOS", "Comentario ID: " + comentario.getComentario_id());
                        for (ApiClient.Respuesta respuesta : comentario.getRespuestas()) {
                            Log.d("COMENTARIOS", "Respuesta ID: " + respuesta.getRespuesta_id());
                            Log.d("usuarioId", "usuarioId : " + respuesta.getUsuario_id());
                            Log.d("nombre", "nombre : " + respuesta.getNombre());
                            Log.d("respuesta", "respuesta : " + respuesta.getRespuesta());
                            Log.d("comentario_id", "comentario_id : " + respuesta.getComentario_id());


                        }
                    }

                    //Guardar lista de likes:
                    RecyclerView recyclerView = findViewById(R.id.recyclerViewComentarios);
                    recyclerView.setLayoutManager(new LinearLayoutManager( Movimiento_Pantalla.this));

                    // Inicializa el adaptador con una lista vacía
                    SharedPreferences preferences = getSharedPreferences("DatosUsuario", MODE_PRIVATE);
                    String userId = preferences.getString("userId", null); // Debe ser el ObjectId del usuario
                    String matricula = "Z";

                    // Limpia y actualiza la lista en memoria
                    listaComentariosEnMemoria.clear();
                    listaComentariosEnMemoria.addAll(comentariosDelBackend);
                    comentarioAdapter = new ComentarioAdapter(listaComentariosEnMemoria, Movimiento_Pantalla.this, userId, matricula);
                    // Asigna el adaptador al RecyclerView
                    recyclerView.setAdapter(comentarioAdapter);
                    // Imprimir los comentarios y sus respuestas
                    for (ApiClient.Comentario comentario : listaComentariosEnMemoria) {
                        Log.d("COMENTARIO", "Comentario ID: " + comentario.getComentario_id());
                        Log.d("COMENTARIO", "Comentario: " + comentario.getComentario());
                        // Imprimir las respuestas asociadas
                        for (ApiClient.Respuesta respuesta : comentario.getRespuestas()) {
                            Log.d("RESPUESTA", "Respuesta ID: " + respuesta.getRespuesta_id());
                            Log.d("RESPUESTA", "Respuesta: " + respuesta.getRespuesta());
                        }
                    }
                    // Notifica al adaptador que los datos han cambiado
                    comentarioAdapter.notifyDataSetChanged();
                    Log.d("COMENTARIOS", "Comentarios cargados correctamente: " + comentariosDelBackend.size());
                } else {
                    Log.e("API_RESPONSE", "Error al obtener comentarios: " + response.message());
                    Toast.makeText(getApplicationContext(), "No hay comentarios disponibles.", Toast.LENGTH_SHORT).show();
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
        //Obtiene un identificador único basado en la dirección MAC. @return Un arreglo de 5 bytes que representa el identificador único.
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
        //Convierte un entero a un arreglo de bytes de 4 elementos. @param value El valor entero.@return Un arreglo de 4 bytes.
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


