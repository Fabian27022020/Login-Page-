package cl.talentodigital.ejerciciolistas;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListEjemploActivity extends AppCompatActivity {

    private RecyclerView rvContactos;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_ejemplo);
        rvContactos = findViewById(R.id.rvContactos);
        rvContactos.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this,);
        rvContactos.setLayoutManager(layoutManager);




    }
}