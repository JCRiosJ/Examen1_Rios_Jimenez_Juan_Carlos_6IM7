package com.example.cecyt9.examen1_rios_jimenez_juan_carlos_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Actividad2 extends AppCompatActivity {
    double peso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        Bundle datos2 = new Bundle();
        datos2 = this.getIntent().getExtras();
            peso = datos2.getDouble("peso");
            TextView txtResultado = (TextView) findViewById(R.id.txtResultado);
            txtResultado.setText(" "+peso+" ");
    }

    public void onClickEnviar(View v) {
        Intent envia = new Intent(Intent.ACTION_SEND);
        envia.setType("text/plain");
        envia.putExtra(Intent.EXTRA_SUBJECT, "Examen 1er parcial.");
        envia.putExtra(Intent.EXTRA_TEXT, "Valor de conversión: "+peso+".");
        envia.putExtra(Intent.EXTRA_EMAIL, new String [] {"eoropezag@ipn.mx"});
        startActivity(envia);
    }

}
