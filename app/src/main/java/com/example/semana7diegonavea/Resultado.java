package com.example.semana7diegonavea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    private TextView textViewMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        textViewMensaje = findViewById(R.id.textView);

        String mensaje = getIntent().getStringExtra("mensaje");
        textViewMensaje.setText("Nombre de la imagen " + mensaje);
    }
}