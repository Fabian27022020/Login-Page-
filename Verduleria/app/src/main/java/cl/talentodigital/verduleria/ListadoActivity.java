package cl.talentodigital.verduleria;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListadoActivity extends AppCompatActivity {

    private Button btnVolver;
    private RecyclerView rvListadoDeVerduras;
    private RecyclerView.LayoutManager layoutManager;
    private ListadoVerdurasAdapter verdurasAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener((View v ) -> IrAMenu());

        rvListadoDeVerduras = findViewById(R.id.rvListadoDeVerduras);
        rvListadoDeVerduras.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvListadoDeVerduras.setLayoutManager(layoutManager);

        verdurasAdapter = new ListadoVerdurasAdapter(getFakeVerduras());
        rvListadoDeVerduras.setAdapter(verdurasAdapter);



    }

    private ArrayList<Verdura> getFakeVerduras() {
        ArrayList<Verdura> verduras = new ArrayList<>();
        for (int i  =0; i < 50; i ++){
            verduras.add("verduras" +i );
        }
        return verduras;
    }

    private void IrAMenu() {
        finish();

    }
}
