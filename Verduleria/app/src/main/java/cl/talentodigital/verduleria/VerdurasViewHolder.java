package cl.talentodigital.verduleria;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VerdurasViewHolder extends RecyclerView.ViewHolder {

    private TextView tvNombreVerdura;
    private TextView tvDescripcion;
    private TextView tvNumero;


    public VerdurasViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNombreVerdura = itemView.findViewById(R.id.tvNombreVerdura);
        tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
        tvNumero = itemView.findViewById(R.id.tvNumero);

    }
    }