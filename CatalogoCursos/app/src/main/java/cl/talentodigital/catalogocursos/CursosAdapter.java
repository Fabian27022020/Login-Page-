package cl.talentodigital.catalogocursos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CursosAdapter extends RecyclerView.Adapter <CursosAdapter.ViewHolder> {

    private ArrayList<Curso> listadoDeCursos;

    public CursosAdapter(ArrayList<Curso> arrayList) {
        this.listadoDeCursos = listadoDeCursos;

    }
    @NonNull
    @Override
    public CursosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_curso,parent,false);
        CursosViewHolder cursosViewHolder = new CursosViewHolder(cursoIteView);
        return new CursosViewHolder(cursosViewHolder);
    }

    @Override
    public void onBindViewHolder(@NonNull CursosViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listadoDeCursos.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

