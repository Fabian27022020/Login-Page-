package cl.talentodigital.verduleria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnIrAListadoDeProductos;
    private Button btnPromociones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIrAListadoDeProductos = findViewById(R.id.btnIrAListadoDeProductos);
        btnPromociones = findViewById(R.id.btnPromociones);

        btnIrAListadoDeProductos.setOnClickListener((View v) -> goToIrAListado());
        btnPromociones.setOnClickListener((View v) -> goToPromociones());

    }

    private void goToPromociones() {
        Intent intent = new Intent(this,PromocionesActivity.class);
        startActivity(intent);
    }

    private void goToIrAListado() {
        Intent intent = new Intent(this,ListadoActivity.class);
        startActivity(intent);

    }
}