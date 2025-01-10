package com.example.regym.generacion_rutina.movimientos_salto_gr;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.generacion_rutina.Mostrar_Niveles_Salto_Gr;
import com.example.regym.generacion_rutina.Rutina_Generada;

public class Movimientos_Salto_N4_Gr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_salto_n4_gr);

        // Botones
        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Generar_btn = findViewById(R.id.Generar_btn);

        // Switches
        Switch[] switches = {
                findViewById(R.id.Movimiento1_swtch),
        };

        // Botón "Regresar"
        Regresar_btn.setOnClickListener(v -> {
            Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_salto_gr.Movimientos_Salto_N4_Gr.this, Mostrar_Niveles_Salto_Gr.class);
            startActivity(intent);
        });

        // Botón "Generar"
        Generar_btn.setOnClickListener(v -> {
            boolean switchChecked = false;
            StringBuilder fortalecimiento = new StringBuilder();
            StringBuilder aparato = new StringBuilder();
            StringBuilder acondicionamiento = new StringBuilder();

            for (int i = 0; i < switches.length; i++) {
                if (switches[i].isChecked()) {
                    switchChecked = true;
                    switch (i + 1) {
                        case 1:
                            fortalecimiento.append("-Flexiones de Brazos-Realiza 3 series de 15 flexiones. \n");
                            aparato.append("-Elevaciones de Piernas Colgando-Realiza 3 series de 15 elevaciones de piernas. \n");
                            acondicionamiento.append("-Flic-Flac Completo-Practica 3 series de 10 repeticiones de flic-flac completo.");
                            break;
                    }
                }
            }

            if (switchChecked) {
                Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_salto_gr.Movimientos_Salto_N4_Gr.this, Rutina_Generada.class);
                intent.putExtra("fortalecimiento", fortalecimiento.toString().trim());
                intent.putExtra("aparato", aparato.toString().trim());
                intent.putExtra("acondicionamiento", acondicionamiento.toString().trim());
                intent.putExtra("tipo", "salto");
                startActivity(intent);
            }

            if (!switchChecked) {
                Toast.makeText(com.example.regym.generacion_rutina.movimientos_salto_gr.Movimientos_Salto_N4_Gr.this, "Activa un Switch para generar la rutina", Toast.LENGTH_SHORT).show();
            }
        });
    }
}