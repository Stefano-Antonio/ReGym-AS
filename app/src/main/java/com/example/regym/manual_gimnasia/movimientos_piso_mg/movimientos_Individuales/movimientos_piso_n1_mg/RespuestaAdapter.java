package com.example.regym.manual_gimnasia.movimientos_piso_mg.movimientos_Individuales.movimientos_piso_n1_mg;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.regym.ApiClient;
import com.example.regym.R;

import java.util.List;

public class RespuestaAdapter extends RecyclerView.Adapter<RespuestaAdapter.RespuestaViewHolder> {

    private final Movimiento_Piso_N1_Mg context;
    private List<ApiClient.Respuesta> respuestas; // Cambiado a List<Respuesta> en lugar de List<Comentario>
    
    public RespuestaAdapter(List<ApiClient.Respuesta> respuestas, Movimiento_Piso_N1_Mg context) {
        this.respuestas = respuestas;
        this.context = context;
    }

    @Override
    public RespuestaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_respuesta, parent, false);
        return new RespuestaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RespuestaViewHolder holder, int position) {
        ApiClient.Respuesta respuesta = respuestas.get(position); // Utilizando el objeto Respuesta en lugar de Comentario
        Log.d("ComentarioAdapter", "Cargando respuesta: " + respuesta.getRespuesta());  // Verifica el texto de la respuesta
        holder.tvRespuesta.setText(respuesta.getRespuesta()); // Asumiendo que tienes un método getRespuesta() que devuelve el texto de la respuesta
        holder.tvNombreUsuarioRespuesta.setText(respuesta.getNombre());

        holder.btn_Eliminar_Respuesta.setOnClickListener(v -> {




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

