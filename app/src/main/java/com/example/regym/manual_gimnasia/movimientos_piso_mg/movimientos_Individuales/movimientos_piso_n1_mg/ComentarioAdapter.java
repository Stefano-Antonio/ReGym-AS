package com.example.regym.manual_gimnasia.movimientos_piso_mg.movimientos_Individuales.movimientos_piso_n1_mg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.regym.ApiClient;
import com.example.regym.R;

import java.util.List;

public class ComentarioAdapter extends RecyclerView.Adapter<ComentarioAdapter.ComentarioViewHolder> {
    private List<ApiClient.Comentario> comentarioList;

    public ComentarioAdapter(List<ApiClient.Comentario> comentarioList) {
        this.comentarioList = comentarioList;
    }

    @NonNull
    @Override
    public ComentarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comentario, parent, false);
        return new ComentarioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ComentarioViewHolder holder, int position) {
        ApiClient.Comentario comentario = comentarioList.get(position);
        holder.tvComentario.setText(comentario.getComentario()); // Asegúrate de que el método getComentario() exista
    }

    @Override
    public int getItemCount() {
        return comentarioList.size();
    }

    public static class ComentarioViewHolder extends RecyclerView.ViewHolder {
        TextView tvComentario;

        public ComentarioViewHolder(View itemView) {
            super(itemView);
            tvComentario = itemView.findViewById(R.id.tvComentario);
        }
    }
}
