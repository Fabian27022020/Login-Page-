package cl.talentodigital.catalogocursos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListaActivity extends AppCompatActivity {

    private Button btnVolver;
    private RecyclerView rvCurso;
    private CursosAdapter cursosAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener((View v) -> irAMenu());
        rvCurso = findViewById(R.id.rvCurso);
        rvCurso.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvCurso.setLayoutManager(layoutManager);


    }

    private void irAMenu() {

        finish();
    }
}
