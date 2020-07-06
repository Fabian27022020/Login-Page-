package cl.talentodigital.verduleria;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PromocionesActivity extends AppCompatActivity {

    private Button btnVolver2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones);
        btnVolver2 = findViewById(R.id.btnVolver2);

        btnVolver2.setOnClickListener((View v) -> IrAMenu());
    }

    private void IrAMenu() {
        finish();
    }
}
