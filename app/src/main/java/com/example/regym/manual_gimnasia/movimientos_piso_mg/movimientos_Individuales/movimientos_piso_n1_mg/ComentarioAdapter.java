package com.example.regym.manual_gimnasia.movimientos_piso_mg.movimientos_Individuales.movimientos_piso_n1_mg;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.regym.ApiClient;
import com.example.regym.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ComentarioAdapter extends RecyclerView.Adapter<ComentarioAdapter.ComentarioViewHolder> {
    public static List<ApiClient.Comentario> comentarioList;
    private Movimiento_Piso_N1_Mg context;
    private String UserId;
    private boolean aux;
    private String[] liked_by;

    public ComentarioAdapter(List<ApiClient.Comentario> comentarioList,  Movimiento_Piso_N1_Mg context, String usuarioId) {
        this.comentarioList = comentarioList;
        this.context = context;
        this.UserId = usuarioId;
    }



    @NonNull
    @Override
    public ComentarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comentario, parent, false);

        return new ComentarioViewHolder(view);
    }

    //cargar contenido del comentario:
    @Override
    public void onBindViewHolder(@NonNull ComentarioViewHolder holder, int position) {

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

        // Muestra el comentario
        holder.tvComentario.setText(comentario.getComentario());

        // Muestra el nombre del usuario
        if (comentario.getNombre() != null) {
            holder.tvNombreUsuario.setText(comentario.getNombre());
        } else {
            holder.tvNombreUsuario.setText("Usuario desconocido"); // Fallback
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
        holder.bntlike.setOnClickListener(v -> {
            boolean currentState = comentario.isLiked();

            int newLikes = currentState ? comentario.getNum_likes() - 1 : comentario.getNum_likes() + 1;

            // Actualización visual temporal
            holder.tvLikesCount.setText(String.valueOf(newLikes));
            holder.bntlike.setImageResource(currentState ? R.drawable.like : R.drawable.likebck);

            ApiClient.LikeRequest likeRequest = new ApiClient.LikeRequest(
                    comentario.getComentario_id(),
                    UserId,
                    comentario.isLiked(),
                    comentario.getNum_likes()
            );
            holder.bntlike.setEnabled(false); // Deshabilitar durante la solicitud
            ApiClient.getApiService().likeComentario(likeRequest).enqueue(new Callback<ApiClient.LikeResponse>() {
                @Override
                public void onResponse(Call<ApiClient.LikeResponse> call, Response<ApiClient.LikeResponse> response) {
                    holder.bntlike.setEnabled(true); // Habilitar después de la respuesta
                    if (response.isSuccessful() && response.body() != null) {
                        ApiClient.LikeResponse likeResponse = response.body();



                        // Sincroniza con los datos reales del servidor
                        comentario.setNum_likes(likeResponse.getNum_likes());
                        comentario.setLiked_by(likeResponse.getLiked_by());
                        comentario.setLiked(likeResponse.isLiked());

                        // Actualiza el estado visual
                        holder.tvLikesCount.setText(String.valueOf(likeResponse.getNum_likes()));
                        holder.bntlike.setImageResource(likeResponse.isLiked() ? R.drawable.likebck : R.drawable.like);
                    } else {
                        Log.e("LikeButton", "Error al actualizar: " + response.code());
                        // Revertir estado en caso de error
                        holder.tvLikesCount.setText(String.valueOf(comentario.getNum_likes()));
                        holder.bntlike.setImageResource(comentario.isLiked() ? R.drawable.likebck : R.drawable.like);
                    }
                }

                @Override
                public void onFailure(Call<ApiClient.LikeResponse> call, Throwable t) {
                    Log.e("LikeButton", "Fallo al comunicarse con el servidor", t);
                    holder.bntlike.setEnabled(true); // Habilitar también en caso de fallo
                    // Revertir estado en caso de fallo
                    holder.tvLikesCount.setText(String.valueOf(comentario.getNum_likes()));
                    holder.bntlike.setImageResource(comentario.isLiked() ? R.drawable.likebck : R.drawable.like);
                }
            });
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

        public ComentarioViewHolder(View itemView) {
            super(itemView);
            tvComentario = itemView.findViewById(R.id.tvComentario);
            tvNombreUsuario = itemView.findViewById(R.id.tvNombreUsuario);
            tvLikesCount = itemView.findViewById(R.id.tvLikesCount);
            bntlike = itemView.findViewById(R.id.btn_Like);

        }
    }
    // Método para actualizar la lista de comentarios
    public void setComentarios(List<ApiClient.Comentario> nuevosComentarios) {
        this.comentarioList.clear(); // Limpia la lista actual
        this.comentarioList.addAll(nuevosComentarios); // Agrega los nuevos comentarios
    }


}
