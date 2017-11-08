package com.example.a21639999.apppruebasreconstruccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Button btnAumentar;
    private Button btnReiniciar;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.txvContador);
        btnAumentar = (Button)findViewById(R.id.btnAumentar);
        btnReiniciar = (Button)findViewById(R.id.btnReiniciar);
    }

    public void aumentar (View v){
        contador ++;
        tv.setText(String.valueOf(contador));
    }
    public void  reiniciar (View v){
        contador = 0;
        tv.setText(String.valueOf(contador));
    }

    public void onSaveInstanceState (Bundle b){
        super.onSaveInstanceState(b);
        b.putInt(getResources().getString(R.string.clave_contador), contador);

    }

    public  void onRestoreInstanceState(Bundle datos){
        super.onRestoreInstanceState(datos);
        contador = datos.getInt(getResources().getString(R.string.clave_contador));
        tv.setText(String.valueOf(contador));
    }
}
