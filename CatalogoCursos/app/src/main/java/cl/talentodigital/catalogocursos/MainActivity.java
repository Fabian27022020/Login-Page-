package cl.talentodigital.catalogocursos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnIrALista;
    private Button btnIrAComponente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIrALista = findViewById(R.id.btnIrALista);
        btnIrAComponente= findViewById(R.id.btnIrAComponente);

        btnIrALista.setOnClickListener((View v) -> goToLista());
        btnIrAComponente.setOnClickListener((View v) -> goToComponente());

    }

    private void goToComponente() {
        Intent intent = new Intent(this,IrAComponenteActivity.class);
        startActivity(intent);
    }

    private void goToLista() {
        Intent intent = new Intent(this, ListaActivity.class);
        startActivity(intent);
    }
}