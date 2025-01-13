package com.example.regym.administrador;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.regym.ApiClient;
import com.example.regym.R;
import com.example.regym.manual_gimnasia.movimiento_Individual.ComentarioAdapter;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Comentarios_Usuario extends AppCompatActivity {

    private ComentarioAdapter comentarioAdapter;
    public static Movimiento_Pantalla context;
    private List<ApiClient.Comentario> listaComentariosEnMemoria = new ArrayList<>();
    private boolean comentariosVisible = false; // Variable para controlar la visibilidad de los comentarios

    //@SuppressLint("ClickableViewAccessibility")
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //cargarComentarios();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comentarios_usuario);
        String usuarioId = getIntent().getStringExtra("usuarioId");
        String matricula = getIntent().getStringExtra("matricula");


        //botones, scrolls, editTexts
        Button Regresar_btn = findViewById(R.id.Regresar_btn);

        //comentarios
        NestedScrollView Comentarios_seccion = findViewById(R.id.commentarios_seccion);
        ImageButton btn_comentarios = findViewById(R.id.comentarios_btn);

//boton comentarios

        btn_comentarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!comentariosVisible) {
                    // Muestra la sección de comentarios
                    Comentarios_seccion.setVisibility(View.VISIBLE);
                    btn_comentarios.setImageResource(R.drawable.editar_comentario_doble_wt); // Cambia la imagen del botón
                    comentariosVisible = true; // Actualiza el estado a visible

                    // Llama al método para mostrar los comentarios
                    mostrarComentarios(getIntent().getStringExtra("ComId"), matricula);
                } else {
                    // Oculta la sección de comentarios
                    Comentarios_seccion.setVisibility(View.GONE);
                    btn_comentarios.setImageResource(R.drawable.editar_comentario_doble_bk); // Cambia la imagen del botón
                    comentariosVisible = false; // Actualiza el estado a no visible
                }
            }
        });

//boton Regresar

        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Comentarios_Usuario.this, Manual_Gimansia_Comentarios.class);
                intent.putExtra("usuarioId", usuarioId);
                intent.putExtra("matricula", matricula);
                startActivity(intent);
            }
        });


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void mostrarComentarios(String movimientoId, String matricula) {
        String userId = getIntent().getStringExtra("usuarioId");

        Call<List<ApiClient.Comentario>> call = ApiClient.getApiService().obtenerComentariosPorId(movimientoId, userId);

        call.enqueue(new Callback<List<ApiClient.Comentario>>() {
            @Override
            public void onResponse(Call<List<ApiClient.Comentario>> call, Response<List<ApiClient.Comentario>> response) {
                if (response.isSuccessful()) {
                    List<ApiClient.Comentario> comentariosDelBackend = response.body();

                    if (comentariosDelBackend == null || comentariosDelBackend.isEmpty()) {
                        Log.e("API_RESPONSE", "No hay comentarios todavia.");
                        Toast.makeText(getApplicationContext(), "No hay comentarios todavia.", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    // Imprimir los IDs de los comentarios y respuestas
                    for (ApiClient.Comentario comentario : comentariosDelBackend) {
                        Log.d("COMENTARIOS", "Comentario ID: " + comentario.getComentario_id());
                        for (ApiClient.Respuesta respuesta : comentario.getRespuestas()) {
                            Log.d("COMENTARIOS", "Respuesta ID: " + respuesta.getRespuesta_id());
                        }
                    }

                    RecyclerView recyclerView = findViewById(R.id.recyclerViewComentarios);
                    recyclerView.setLayoutManager(new LinearLayoutManager( Comentarios_Usuario.this));

                    // Inicializa el adaptador con una lista vacía
                    SharedPreferences preferences = getSharedPreferences("DatosUsuario", MODE_PRIVATE);
                    String usuarioId = getIntent().getStringExtra("usuarioId");

                   /* Collections.sort(listaComentariosEnMemoria, new Comparator<ApiClient.Comentario>() {
                        @Override
                        public int compare(ApiClient.Comentario u1, ApiClient.Comentario u2) {
                            return u1.getNombre().compareTo(u2.getNombre()); // Comparar por el nombre
                        }
                    });*/
                    comentarioAdapter = new ComentarioAdapter(listaComentariosEnMemoria, Comentarios_Usuario.context, usuarioId, matricula);

                    // Asigna el adaptador al RecyclerView
                    recyclerView.setAdapter(comentarioAdapter);

                    // Limpia y actualiza la lista en memoria
                    listaComentariosEnMemoria.clear();
                    listaComentariosEnMemoria.addAll(comentariosDelBackend);

                    // Notifica al adaptador que los datos han cambiado
                    comentarioAdapter.notifyDataSetChanged();

                    Log.d("COMENTARIOS", "Comentarios cargados correctamente: " + comentariosDelBackend.size());
                } else {
                    Log.e("API_RESPONSE", "No hay comentarios todavia: " + response.message());
                    Toast.makeText(getApplicationContext(), "No hay comentarios todavia.", Toast.LENGTH_SHORT).show();
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

