package com.example.semana7diegonavea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMensaje;
    private Button botonEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMensaje = findViewById(R.id.editTextNombre);
        botonEnviar = findViewById(R.id.btn_Enviar);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensaje = editTextMensaje.getText().toString();
                Intent intent = new Intent(MainActivity.this, Resultado.class);
                intent.putExtra("mensaje",mensaje);
                startActivity(intent);
            }
        });
    }
}