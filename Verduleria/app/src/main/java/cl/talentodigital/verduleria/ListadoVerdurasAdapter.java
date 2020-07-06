package cl.talentodigital.verduleria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListadoVerdurasAdapter extends RecyclerView.Adapter<VerdurasViewHolder> {

    private ArrayList<Verdura>verduras;

    public ListadoVerdurasAdapter(ArrayList<Verdura> verduras) {
        this.verduras = verduras;
    }
    @NonNull
    @Override
    //ESTA ES LA FORMA DE CREAR UN VIEW HOLDER
    public VerdurasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.verduras_item, parent, false);
        return new VerdurasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerdurasViewHolder holder, int position) {


        }
//REPRESENTA LA CANTIDAD DE ELEMENTOS QUE TIENE UN RECYCLERVIEW
    @Override
    public int getItemCount() {
        return verduras.size();
    }
}
