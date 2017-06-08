package com.example.erwinfischer.hola2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private TextView msgMostrar, btLimpiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msgMostrar = (TextView) findViewById(R.id.TV_mostrarSaludo);
        btLimpiar = (Button) findViewById(R.id.BT_Limpiar);

    }
    public void mostrarMensaje(View v){
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        Date fechaActual = Calendar.getInstance().getTime();

        String s = formato.format(fechaActual);
        msgMostrar.setText(String.format("Hola Mundo: %s", s));
        btLimpiar.setVisibility(View.VISIBLE);
    }

    public void limpiarMensaje(View v){

        msgMostrar.setText("");
        btLimpiar.setVisibility(View.INVISIBLE);



    }
}
