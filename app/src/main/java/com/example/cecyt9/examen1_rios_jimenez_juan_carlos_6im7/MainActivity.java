package com.example.cecyt9.examen1_rios_jimenez_juan_carlos_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickConvertir(View v)
    {
        Intent intento = new Intent(this, Actividad2.class);
        Bundle datos = new Bundle();
        Double peso;

        txtPeso = (EditText) findViewById(R.id.txtPesos);

        try
        {
            peso = Double.parseDouble(txtPeso.getText().toString());
            peso = peso / 15;
            datos.putDouble("peso", peso);
            intento.putExtras(datos);
            finish();
            startActivity(intento);
        }
        catch(Exception e)
        {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Solo se aceptan números.", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
