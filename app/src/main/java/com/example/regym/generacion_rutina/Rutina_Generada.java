package com.example.regym.generacion_rutina;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;

public class Rutina_Generada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rutina_generada);

        // Botones
        //Button regresarBtn = findViewById(R.id.Regresar_btn);
        ImageButton guardarBtn = findViewById(R.id.buttonGuardar);

        // TextViews principales
        TextView fortalecimientoTxt = findViewById(R.id.fortalecimiento_txt);
        TextView aparatoTxt = findViewById(R.id.aparato_txt);
        TextView acondicionamientoTxt = findViewById(R.id.acondicionamiento_txt);

        // Obtener datos del Intent
        String fortalecimiento = getIntent().getStringExtra("fortalecimiento");
        String aparato = getIntent().getStringExtra("aparato");
        String acondicionamiento = getIntent().getStringExtra("acondicionamiento");
        String tipo = getIntent().getStringExtra("tipo");
        // Mostrar datos en los TextViews principales si no son nulos
        fortalecimientoTxt.setText(fortalecimiento != null ? fortalecimiento : "Sin datos");
        aparatoTxt.setText(aparato != null ? aparato : "Sin datos");
        acondicionamientoTxt.setText(acondicionamiento != null ? acondicionamiento : "Sin datos");

        // Acciones del botón "Regresar"
        /*regresarBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Rutina_Generada.this, Generar_Rutina.class);
            startActivity(intent);
        });*/

        // Acciones del botón "Guardar"
        guardarBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Rutina_Generada.this, Rutina_Generada_Guardar.class);
            intent.putExtra("fortalecimiento", fortalecimiento.toString().trim());
            intent.putExtra("aparato", aparato.toString().trim());
            intent.putExtra("acondicionamiento", acondicionamiento.toString().trim());
            intent.putExtra("tipo", tipo.toString().trim());
            startActivity(intent);
        });


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

