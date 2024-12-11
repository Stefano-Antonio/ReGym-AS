package com.example.regym.manual_gimnasia.movimiento_Individual;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.regym.ApiClient;
import com.example.regym.R;
import com.google.api.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ComentarioAdapter extends RecyclerView.Adapter<ComentarioAdapter.ComentarioViewHolder> {
    public static List<ApiClient.Comentario> comentarioList;
    private final String matricula;
    private Movimiento_Pantalla context;
    private Context context2;
    private String UserId;
    private boolean aux;
    private String[] liked_by;

    public ComentarioAdapter(List<ApiClient.Comentario> comentarioList, Movimiento_Pantalla context, String usuarioId, String matricula) {
        this.comentarioList = comentarioList;
        this.context = context;
        this.UserId = usuarioId;
        this.matricula = matricula;
    }

    @NonNull
    @Override
    public ComentarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comentario, parent, false);

        return new ComentarioViewHolder(view);
    }


    //cargar contenido del comentario:
    @Override
    public void onBindViewHolder(@NonNull ComentarioViewHolder holder, @SuppressLint("RecyclerView") int position) {

        ApiClient.Comentario comentario = comentarioList.get(position);

        //convertir la lista de likes  a una lista:
        if (Arrays.asList(comentario.getLiked_by()) != null) {
            // Solo convierte a lista si liked_by no es null
            List<String> likedByList = Arrays.asList(comentario.getLiked_by());

        } else {
            // Maneja el caso donde liked_by es null, por ejemplo, inicializándolo a un array vacío
            List<String> likedByList = new ArrayList<>();
            // Resto de la lógica aquí
        }

        // Muestra el comentario para adinistrador
        if (matricula.charAt(0) == 'A') {

            holder.tvComentario.setText("Likes:");

            // Muestra el nombre del usuario
            if (comentario.getNombre() != null) {
                holder.tvNombreUsuario.setText(comentario.getComentario());
            } else {
                holder.tvNombreUsuario.setText("Usuario desconocido"); // Fallback
            }
        }else{

            holder.tvComentario.setText(comentario.getComentario());

            // Muestra el nombre del usuario
            if (comentario.getNombre() != null) {
                holder.tvNombreUsuario.setText(comentario.getNombre());
            } else {
                holder.tvNombreUsuario.setText("Usuario desconocido"); // Fallback
            }
        }


        // Muestra los likes
        holder.tvLikesCount.setText(String.valueOf(comentario.getNum_likes()));

        if (UserId != null && Arrays.asList(comentario.getLiked_by()).contains(UserId)) {
            comentario.setLiked(true);  // Si el usuarioId está en liked_by, se marca como true
        } else {
            comentario.setLiked(false);    // Si no está, sigue siendo false
        }

        if (!comentario.isLiked()) {
            holder.bntlike.setImageResource(R.drawable.like);
        } else {
            holder.bntlike.setImageResource(R.drawable.likebck);
        }
        Log.e("ESTADO1:" , String.valueOf(comentario.isLiked()));
        // Configurar el comportamiento del botón
        Log.e("ESTADO1:" , String.valueOf(comentario.isLiked()));

        Log.d("ComentarioAdapter", "Respuestas del comentario: " + comentario.getRespuestas().size());

        for (ApiClient.Respuesta respuesta : comentario.getRespuestas()) {
            Log.d("ComentarioAdapter", "Respuesta: " + respuesta.getRespuesta() + ", Usuario: " + respuesta.getNombre());
        }
        Log.d("ComentarioAdapter", "Respuestas del comentario: " + comentario.getRespuestas());

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        holder.recyclerViewRespuestas.setLayoutManager(layoutManager);

        //visualizacion de eliminar y editar solo si el comentario es del mismo usuarrio:
        if (comentario.getUsuario_id().equals(UserId)) {
            holder.btn_Eliminar.setVisibility(View.VISIBLE);
            holder.btn_Editar.setVisibility(View.VISIBLE);

        } else {
            holder.btn_Eliminar.setVisibility(View.GONE);
            holder.btn_Editar.setVisibility(View.GONE);

            View tvLikesCount = holder.tvLikesCount;
            ViewGroup.LayoutParams params = tvLikesCount.getLayoutParams();
            ViewGroup.MarginLayoutParams marginParams = (ViewGroup.MarginLayoutParams) params;

            // Modificar el margen final (marginEnd) en función de las unidades de densidad (dp)
            int newMarginEnd = 575; // Por ejemplo, 50 píxeles (o el valor en dp convertido a px)
            marginParams.setMarginEnd(newMarginEnd);

            // Aplicar los nuevos LayoutParams al View
            tvLikesCount.setLayoutParams(marginParams);

        }

        //Ocultar botones al administrador:
        if (matricula.charAt(0) == 'A') {
            holder.btn_Responder.setVisibility(View.GONE);
            holder.btn_Editar.setVisibility(View.GONE);
            holder.bntlike.setVisibility(View.GONE);
            holder.btn_Respuestas.setVisibility(View.GONE);

            View tvLikesCount = holder.tvLikesCount;
            ViewGroup.LayoutParams params = tvLikesCount.getLayoutParams();
            ViewGroup.MarginLayoutParams marginParams = (ViewGroup.MarginLayoutParams) params;

            // Modificar el margen final (marginEnd) en función de las unidades de densidad (dp)
            int newMarginEnd = 750; // Por ejemplo, 50 píxeles (o el valor en dp convertido a px)
            marginParams.setMarginEnd(newMarginEnd);

            // Aplicar los nuevos LayoutParams al View
            tvLikesCount.setLayoutParams(marginParams);
        }

//respuestas

        holder.btn_Respuestas.setOnClickListener(v -> {
            if (holder.recyclerViewRespuestas.getVisibility() == View.GONE) {
                holder.recyclerViewRespuestas.setVisibility(View.VISIBLE);
                holder.btn_Respuestas.setImageResource(R.drawable.flecha_arriba); // Cambiar el ícono a "responder"
                RespuestaAdapter respuestaAdapter = new RespuestaAdapter(comentario.getRespuestas(), context, UserId, comentario.getComentario_id());
                holder.recyclerViewRespuestas.setAdapter(respuestaAdapter);
                respuestaAdapter.notifyDataSetChanged();
            }else{
                holder.btn_Respuestas.setImageResource(R.drawable.flecha_abajo); // Cambiar el ícono a "responder"
                holder.recyclerViewRespuestas.setVisibility(View.GONE);


            }
        });




        holder.btn_Responder.setOnClickListener(v -> {
            if (holder.escribirRespuesta.getVisibility() == View.GONE) {
                holder.escribirRespuesta.setVisibility(View.VISIBLE);
                holder.escribirRespuesta.requestFocus();
                holder.tvComentario.setVisibility(View.GONE); // Ocultar el texto original
                holder.btn_Editar.setVisibility(View.GONE);
                holder.btn_Eliminar.setVisibility(View.GONE);
                holder.btn_Respuestas.setVisibility(View.GONE);
                holder.bntlike.setVisibility(View.GONE);
                holder.tvLikesCount.setVisibility(View.GONE);
                holder.btn_Responder.setImageResource(R.drawable.enviar); // Cambiar el ícono a "responder"

            } else {
                String respuesta = holder.escribirRespuesta.getText().toString().trim();

                if (respuesta.isEmpty()) {
                    Toast.makeText(context, "La respuesta no puede estar vacía.", Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    holder.tvComentario.setVisibility(View.VISIBLE);
                    holder.btn_Respuestas.setVisibility(View.VISIBLE);
                    holder.bntlike.setVisibility(View.VISIBLE);
                    holder.tvLikesCount.setVisibility(View.VISIBLE);
                    holder.escribirRespuesta.setVisibility(View.GONE);

                    // Crear el objeto de la solicitud
                    String respuesta_id= "";
                    String nombre= "";

                    ApiClient.ResponderComentarioRequest request = new ApiClient.ResponderComentarioRequest(
                            respuesta_id,
                            UserId,
                            nombre,
                            respuesta,
                            comentario.getComentario_id()
                    );

                    // Realizar la petición a la API
                    ApiClient.getApiService().responderComentario(request).enqueue(new Callback<ApiClient.Respuesta>() {
                        @Override
                        public void onResponse(Call<ApiClient.Respuesta> call, Response<ApiClient.Respuesta> response) {
                            if (response.isSuccessful() && response.body() != null) {
                                ApiClient.Respuesta nuevaRespuesta = response.body();
                                Log.e("Respuesta de entrada","respuesta:"+response.body());
                                // Agregar la nueva respuesta a la lista
                                comentario.getRespuestas().add(nuevaRespuesta); // Agregar la nueva respuesta a la lista
                                comentario.setLiked(comentario.isLiked());
                                comentario.setNum_likes(comentario.getNum_likes());
                                notifyDataSetChanged(); // Actualizar la vista
                                Toast.makeText(context, "Respuesta agregada con éxito.", Toast.LENGTH_SHORT).show();

                                // Mantén el estado de isLiked y num_likes del comentario
                                holder.bntlike.setImageResource(!comentario.isLiked() ? R.drawable.likebck : R.drawable.like);

                                // Resetear el botón y ocultar el campo de texto
                                holder.escribirRespuesta.setText("");
                                holder.escribirRespuesta.setVisibility(View.GONE);
                                holder.btn_Responder.setImageResource(R.drawable.responder); // Cambiar el ícono a "responder"

                            } else {
                                Toast.makeText(context, "Error al agregar la respuesta.", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<ApiClient.Respuesta> call, Throwable t) {
                            Toast.makeText(context, "Fallo en la conexión: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });

//boton likes
        holder.bntlike.setOnClickListener(v -> {
            boolean currentState = comentario.isLiked();
            int newLikes = currentState ? comentario.getNum_likes() - 1 : comentario.getNum_likes() + 1;

            // Actualización temporal en la UI
            comentario.setLiked(currentState);
            comentario.setNum_likes(newLikes);
            holder.tvLikesCount.setText(String.valueOf(newLikes));
            holder.bntlike.setImageResource(currentState ? R.drawable.likebck : R.drawable.like);

            ApiClient.LikeRequest likeRequest = new ApiClient.LikeRequest(
                    comentario.getComentario_id(),
                    UserId,
                    currentState, // Estado actual, no sincronizado
                    comentario.getNum_likes()
            );

            holder.bntlike.setEnabled(false); // Deshabilitar temporalmente el botón

            ApiClient.getApiService().likeComentario(likeRequest).enqueue(new Callback<ApiClient.LikeResponse>() {
                @Override
                public void onResponse(Call<ApiClient.LikeResponse> call, Response<ApiClient.LikeResponse> response) {
                    holder.bntlike.setEnabled(true); // Habilitar el botón después de la respuesta

                    if (response.isSuccessful() && response.body() != null) {
                        ApiClient.LikeResponse likeResponse = response.body();

                        // Sincronizar datos del servidor con el objeto `comentario`
                        comentario.setNum_likes(likeResponse.getNum_likes());
                        comentario.setLiked(likeResponse.isLiked());
                        comentario.setLiked_by(likeResponse.getLiked_by());

                        // Actualizar la UI con datos reales
                        holder.tvLikesCount.setText(String.valueOf(likeResponse.getNum_likes()));
                        holder.bntlike.setImageResource(likeResponse.isLiked() ? R.drawable.likebck : R.drawable.like);
                    } else {
                        Log.e("LikeButton", "Error al actualizar: " + response.code());

                        // Revertir el estado en caso de error
                        comentario.setLiked(currentState);
                        comentario.setNum_likes(currentState ? comentario.getNum_likes() + 1 : comentario.getNum_likes() - 1);
                        holder.tvLikesCount.setText(String.valueOf(comentario.getNum_likes()));
                        holder.bntlike.setImageResource(currentState ? R.drawable.likebck : R.drawable.like);
                    }
                }

                @Override
                public void onFailure(Call<ApiClient.LikeResponse> call, Throwable t) {
                    Log.e("LikeButton", "Fallo al comunicarse con el servidor", t);
                    holder.bntlike.setEnabled(true); // Habilitar el botón en caso de fallo

                    // Revertir el estado en caso de fallo
                    holder.tvLikesCount.setText(String.valueOf(comentario.getNum_likes()));
                    holder.bntlike.setImageResource(comentario.isLiked() ? R.drawable.likebck : R.drawable.like);
                }
            });
        });





//Configurar el botón de eliminar
       holder.btn_Eliminar.setOnClickListener(v -> {
            // Llamar a la función para eliminar el comentario
                new AlertDialog.Builder(context)
                    .setTitle("Eliminar respuesta")
                    .setMessage("¿Estás seguro de que deseas eliminar este comentario?")
                     .setPositiveButton("Eliminar", (dialog, which) -> {

                                ApiClient.getApiService().eliminarComentario(comentario.getComentario_id()).enqueue(new Callback<Void>() {
                @Override
                public void onResponse(Call<Void> call, Response<Void> response) {
                    if (response.isSuccessful()) {
                        // Eliminar el comentario de la lista local
                        if (position >= 0 && position < comentarioList.size()) {
                            // Eliminar el comentario en la posición dada
                            comentarioList.remove(position);
                            notifyItemRemoved(position);

                            // Verificar si la lista está vacía después de eliminar
                            if (comentarioList.isEmpty()) {
                                // Si la lista está vacía, puedes actualizar la UI para reflejar esto
                                notifyDataSetChanged(); // Refresca completamente el adaptador
                            } else {
                                // Si hay elementos restantes, actualiza los índices del RecyclerView
                                notifyItemRangeChanged(position, comentarioList.size() - position);
                            }
                        } else {
                            Log.e("ComentarioAdapter", "Posición fuera de rango o lista vacía. Posición: " + position);
                        }

                    } else {
                        Log.e("ComentarioAdapter", "Intento de acceso a una posición inválida: " + position);

                    }
                }

                @Override
                public void onFailure(Call<Void> call, Throwable t) {
                }
            });
                     })
                        .setNegativeButton("Cancelar", null)
                        .show();
            Toast.makeText(context, "Comentario eliminado", Toast.LENGTH_SHORT).show();
       });




//boton editar
        holder.btn_Editar.setOnClickListener(v -> {

            if (holder.etEditarComentario.getVisibility() == View.GONE) {
                // Entrar en modo edición
                holder.tvComentario.setVisibility(View.GONE);
                holder.btn_Responder.setVisibility(View.GONE);
                holder.etEditarComentario.setVisibility(View.VISIBLE);
                holder.etEditarComentario.setText(comentario.getComentario()); // Prellenar con el texto actual
                holder.btn_Editar.setImageResource(R.drawable.enviar); // Cambiar ícono
                holder.btn_Respuestas.setVisibility(View.GONE);
                holder.btn_Eliminar.setVisibility(View.GONE);
                holder.bntlike.setVisibility(View.GONE);
                holder.tvLikesCount.setVisibility(View.GONE);
            } else {
                // Confirmar la edición (guardar)
                String nuevoTexto = holder.etEditarComentario.getText().toString().trim();
                // Confirmar la edición
                comentarioList.get(position).setComentario(nuevoTexto);
                notifyItemChanged(position); // Asegurarte de que la UI se refresque

                if (nuevoTexto.isEmpty()) {
                    Toast.makeText(context, "El comentario no puede estar vacío.", Toast.LENGTH_SHORT).show();
                    return; // Evitar continuar si está vacío
                }

                ApiClient.EditarComentarioRequest request = new ApiClient.EditarComentarioRequest(UserId, nuevoTexto);

                ApiClient.getApiService()
                        .editarComentario(comentario.getComentario_id(), request)
                        .enqueue(new Callback<Void>() {
                            @Override
                            public void onResponse(Call<Void> call, Response<Void> response) {
                                if (response.isSuccessful()) {
                                    // Actualizar el texto del comentario en la lista
                                    comentarioList.get(position).setComentario(nuevoTexto);

                                    // Mantén los likes y el estado de like
                                    // Mantén el valor de num_likes que es devuelto del backend o ajustado previamente
                                    comentarioList.get(position).setNum_likes(comentario.getNum_likes());

                                    // Mantén el estado del like
                                    boolean likedEstado = comentario.isLiked();  // Usar el estado actual de liked
                                    comentarioList.get(position).setLiked(likedEstado);

                                    // Refrescar el adaptador para reflejar los cambios
                                    notifyItemChanged(position);

                                    Toast.makeText(context, "Comentario editado exitosamente", Toast.LENGTH_SHORT).show();

                                    // Actualizar el ícono de "like" en el holder con el estado correcto
                                    holder.bntlike.setImageResource(likedEstado ? R.drawable.likebck : R.drawable.like);
                                } else {
                                    Toast.makeText(context, "No tienes permiso para editar este comentario", Toast.LENGTH_SHORT).show();
                                }

                                // Restaurar la visibilidad de los elementos
                                holder.tvComentario.setVisibility(View.VISIBLE);
                                holder.etEditarComentario.setVisibility(View.GONE);
                                holder.btn_Responder.setVisibility(View.VISIBLE);
                                holder.btn_Editar.setImageResource(R.drawable.editar); // Restaurar ícono original
                                holder.btn_Respuestas.setVisibility(View.VISIBLE);
                                holder.btn_Eliminar.setVisibility(View.VISIBLE);
                                holder.bntlike.setVisibility(View.VISIBLE);
                                holder.tvLikesCount.setVisibility(View.VISIBLE);

                                // Asegurarse de que el estado del "like" sea el correcto
                                holder.bntlike.setImageResource(comentario.isLiked() ? R.drawable.likebck : R.drawable.like);
                            }



                            @Override
                            public void onFailure(Call<Void> call, Throwable t) {
                                Toast.makeText(context, "Error al editar el comentario: " + t.getMessage(), Toast.LENGTH_SHORT).show();

                                // Restaurar la visibilidad de los elementos
                                holder.tvComentario.setVisibility(View.VISIBLE);
                                holder.etEditarComentario.setVisibility(View.GONE);
                                holder.btn_Responder.setVisibility(View.VISIBLE);
                                holder.btn_Respuestas.setVisibility(View.VISIBLE);
                                holder.btn_Eliminar.setVisibility(View.VISIBLE);
                                holder.bntlike.setVisibility(View.VISIBLE);
                                holder.tvLikesCount.setVisibility(View.VISIBLE);
                                holder.btn_Editar.setImageResource(R.drawable.editar); // Restaurar ícono original

                                // Respetar el estado actual del botón "like"
                                holder.bntlike.setImageResource(comentario.isLiked() ? R.drawable.likebck : R.drawable.like);
                            }
                        });
            }

        });


    }

    @Override
    public int getItemCount() {
        return comentarioList.size();
    }

    public static class ComentarioViewHolder extends RecyclerView.ViewHolder {
        TextView tvComentario;
        TextView tvNombreUsuario;
        TextView tvLikesCount;
        ImageButton bntlike;
        ImageButton btn_Eliminar;
        ImageButton btn_Editar;
        EditText etEditarComentario;
        ImageButton btn_Responder;
        ImageButton btn_Respuestas;
        RecyclerView recyclerViewRespuestas;
        EditText escribirRespuesta;
        LinearLayout likeSection;

        public ComentarioViewHolder(View itemView) {
            super(itemView);
            tvComentario = itemView.findViewById(R.id.tvComentario);
            tvNombreUsuario = itemView.findViewById(R.id.tvNombreUsuario);
            tvLikesCount = itemView.findViewById(R.id.tvLikesCount);
            bntlike = itemView.findViewById(R.id.btn_Like);
            btn_Eliminar = itemView.findViewById(R.id.btn_Eliminar);
            btn_Editar = itemView.findViewById(R.id.btn_Editar);
            etEditarComentario = itemView.findViewById(R.id.etEditarComentario);
            btn_Responder = itemView.findViewById(R.id.btn_Responder);
            recyclerViewRespuestas = itemView.findViewById(R.id.recyclerViewRespuestas);
            escribirRespuesta = itemView.findViewById(R.id.escribirRespuesta);
            btn_Respuestas = itemView.findViewById(R.id.btn_Respuestas);
            likeSection = itemView.findViewById(R.id.likeSection);
        }
    }
    // Método para actualizar la lista de comentarios
    public void setComentarios(List<ApiClient.Comentario> nuevosComentarios) {
        this.comentarioList.clear(); // Limpia la lista actual
        this.comentarioList.addAll(nuevosComentarios); // Agrega los nuevos comentarios
    }





}
