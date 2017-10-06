package itchetumal.edu.mx.dadm.ciclovidaactividad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity
    implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Se creó la actividad", Toast.LENGTH_LONG).show();

        Button btnAceptar = (Button) findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(this);

        //Controlar evento onClick con clase anónima
        btnAceptar.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Ejecutando listener con clases anónima",
                                Toast.LENGTH_LONG).show();
                    }
                }


        );

    }

    @Override
    public void onStart() { super.onStart();
        //Nuestro código a ejecutar en este momento
        Toast.makeText(this, "Se inició la actividad", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onRestart() { super.onRestart();
        //Nuestro código a ejecutar en este momento
        Toast.makeText(this, "Se reinició la actividad", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onResume() {
        super.onResume();
        //Nuestro código a ejecutar en este momento
        Toast.makeText(this, "Se continúa la actividad", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onPause() {
        super.onPause();
        //Nuestro código a ejecutar en este momento
        Toast.makeText(this, "Se pausa la actividad", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onStop() {
        super.onStop();
        //Nuestro código a ejecutar en este momento
        Toast.makeText(this, "Se detiene la actividad", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        //Nuestro código a ejecutar en este momento
        Toast.makeText(this, "Se destruye la actividad", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Controlando el evento onClick", Toast.LENGTH_LONG).show();
    }
}
