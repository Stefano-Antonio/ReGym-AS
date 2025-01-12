package com.example.regym.manual_gimnasia.movimiento_Individual;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.example.regym.ApiClient;
import com.example.regym.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RespuestaAdapter extends RecyclerView.Adapter<RespuestaAdapter.RespuestaViewHolder> {

    private final Movimiento_Pantalla context;
    private List<ApiClient.Respuesta> respuestas; // Cambiado a List<Respuesta> en lugar de List<Comentario>
    private String usuarioId;
    private String comentarioId;
    
    public RespuestaAdapter(List<ApiClient.Respuesta> respuestas, Movimiento_Pantalla context, String usuarioId, String comentarioId) {
        this.respuestas = respuestas;
        this.context = context;
        this.usuarioId = usuarioId;
        this.comentarioId = comentarioId;
    }

    @Override
    public RespuestaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_respuesta, parent, false);
        return new RespuestaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RespuestaViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ApiClient.Respuesta respuesta = respuestas.get(position); // Utilizando el objeto Respuesta en lugar de Comentario
        Log.d("ComentarioAdapter", "Cargando respuesta: " + respuesta.getRespuesta());  // Verifica el texto de la respuesta
        holder.tvRespuesta.setText(respuesta.getRespuesta()); // Asumiendo que tienes un método getRespuesta() que devuelve el texto de la respuesta
        holder.tvNombreUsuarioRespuesta.setText(respuesta.getNombre());

    Log.d("RespuestaAdapter", "Comentario ID: " + comentarioId);
    Log.d("RespuestaAdapter", "Usuario ID: " + usuarioId);
    Log.d("RespuestaAdapter", "Respuesta ID: " + respuesta);

        if (respuesta.getUsuario_id() != null &&!respuesta.getUsuario_id().equals(usuarioId)) {

            holder.btn_Eliminar_Respuesta.setVisibility(View.GONE);
        }


//Eliminar Respuesta

        holder.btn_Eliminar_Respuesta.setOnClickListener(v -> {
            Log.d("RespuestaAdapter2", "Comentario ID: " + comentarioId);
            Log.d("RespuestaAdapter2", "Respuesta ID: " + respuesta.getRespuesta_id());

            // Mostrar un diálogo de confirmación
            new AlertDialog.Builder(context)
                    .setTitle("Eliminar respuesta")
                    .setMessage("¿Estás seguro de que deseas eliminar esta respuesta?")
                    .setPositiveButton("Eliminar", (dialog, which) -> {
                        // Llamada a la API para eliminar la respuesta
                        ApiClient.getApiService().eliminarRespuesta(comentarioId, respuesta.getRespuesta_id()).enqueue(new Callback<Void>() {
                                    @Override
                                    public void onResponse(Call<Void> call, Response<Void> response) {
                                        if (response.isSuccessful()) {
                                            // Eliminar la respuesta de la lista local
                                            if (position >= 0 && position < respuestas.size()) {
                                                respuestas.remove(position);
                                                notifyItemRemoved(position);

                                                // Verificar si la lista está vacía después de eliminar
                                                if (respuestas.isEmpty()) {
                                                    // Si la lista está vacía, puedes actualizar la UI para reflejar esto
                                                    notifyDataSetChanged(); // Refresca completamente el adaptador
                                                } else {
                                                    // Si hay elementos restantes, actualiza los índices del RecyclerView
                                                    notifyItemRangeChanged(position, respuestas.size());
                                                }
                                            } else {
                                                Log.e("EliminarRespuesta", "Posición fuera de rango. Posición: " + position);
                                                Toast.makeText(context, "Error: No se pudo eliminar la respuesta", Toast.LENGTH_SHORT).show();
                                            }
                                        } else {
                                            Log.e("EliminarRespuesta", "Código de estado: " + response.code());
                                            Log.e("EliminarRespuesta", "Mensaje de error: " + response.message());
                                            Toast.makeText(context, "Error: No se pudo eliminar la respuesta", Toast.LENGTH_SHORT).show();
                                        }
                                    }

                                    @Override
                                    public void onFailure(Call<Void> call, Throwable t) {
                                        Toast.makeText(context, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                                        Log.e("RespuestaAdapter", "Error al eliminar respuesta", t);
                                    }
                                });
                    })
                    .setNegativeButton("Cancelar", null)
                    .show();
        });

    }

    @Override
    public int getItemCount() {
        return respuestas.size();
    }

    public class RespuestaViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombreUsuarioRespuesta;
        TextView tvRespuesta;
        ImageButton btn_Eliminar_Respuesta;

        public RespuestaViewHolder(View itemView) {
            super(itemView);
            tvNombreUsuarioRespuesta = itemView.findViewById(R.id.tvNombreUsuarioRespuesta);
            tvRespuesta = itemView.findViewById(R.id.tvRespuesta);
            btn_Eliminar_Respuesta = itemView.findViewById(R.id.btn_Eliminar_Respuesta);

        }

    }
}

