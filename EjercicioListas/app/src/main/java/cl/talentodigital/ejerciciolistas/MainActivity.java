package cl.talentodigital.ejerciciolistas;

//ESTA APLICACION SE  LLAMA EJERCICIO lISTA

//IMPORTACIONES DE LIBRERIAS
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//NOMBRE DE LA CLASE QUE HEREDA DE OTRA CLASE
public class MainActivity extends AppCompatActivity {

    //EN ESTAS LINEAS DE CODIGO  SE DECLARAN LOS DOS BOTONES (U OTROS PROTOTIPOS)
    private Button btnIrALista;
    private Button btnIrALogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ESTAS LINEAS DE CODIGOS  HACEN QUE LOS BOTONES DECLARADOS EXISTAN
        btnIrALista = findViewById(R.id.btnIrALista);
        btnIrALogin = findViewById(R.id.btnIrALogin);

        //ESTA LINEA DE CODIGO ES PROGRAMAR CON LANDAX ES LA FORMA DE DARLE CLICK´S A LOS BOTONES
        //CONF:IR A LA PESTAÑA FILE/PROJECT STRUCTURE/MOÓDULOS/S.C. JAVA 1.8/T.C.JAVA 1.8
        //(CLASE VIEW) SE IMPORTA (LIBRERIA) (Alt+ENTER) -> SE CREA EL METODO -IR A-  (Alt+ENTER)
        btnIrALista.setOnClickListener((View v) -> goToLista());
        btnIrALogin.setOnClickListener((View v) -> goToLogin());
    }

    private void goToLogin() {

        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
    // EN ESTA LINEA DE CODIGO SE HACE EL LLAMADO (EL CLICK) CON UNA VARIABLE  INTENT CON METODO goToLista()
    //SE DECLARA UNA VARIABLE INTENT Y LLAMAMOS A SU CONSTRUCTOR (= new intent)// Y POR PARAMETRO() SE INGRESA EL CONTEXTO (this) Y A LA CLASE DONDE SE REQUIERE IR - EN ESTE CASO A LA CLASE CREADA (ListEjemploActivity)

    private void goToLista() {
        Intent intent = new Intent(this,ListEjemploActivity.class);
        startActivity(intent);


    }
}

