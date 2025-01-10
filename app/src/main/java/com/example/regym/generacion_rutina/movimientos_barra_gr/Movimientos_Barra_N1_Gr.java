package com.example.regym.generacion_rutina.movimientos_barra_gr;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.generacion_rutina.Mostrar_Niveles_Piso_Gr;
import com.example.regym.generacion_rutina.Rutina_Generada;

public class Movimientos_Barra_N1_Gr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_barra_n1_gr);

        // Botones
        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Generar_btn = findViewById(R.id.Generar_btn);

        // Switches
        Switch[] switches = {
                findViewById(R.id.Movimiento1_swtch),
                findViewById(R.id.Movimiento3_swtch),
                findViewById(R.id.Movimiento4_swtch),
                findViewById(R.id.Movimiento5_swtch),
                findViewById(R.id.Movimiento6_swtch),
        };

        // Botón "Regresar"
        Regresar_btn.setOnClickListener(v -> {
            Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N1_Gr.this, Mostrar_Niveles_Piso_Gr.class);
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
                            fortalecimiento.append("Abdominales-Realiza series de 15 abdominales.\n");
                            aparato.append("Plancha-Mantén la posición de plancha durante 30-60 segundos.\n");
                            acondicionamiento.append("Levantamiento de Piernas Colgando-3 series de 10 repeticiones colgándote de la barra y levantando las piernas hacia el pecho.\n");
                            break;
                        case 2:
                            fortalecimiento.append("Elevaciones de Piernas Colgando-Realiza 3 series de 12 repeticiones. \n");
                            aparato.append("Saltos en Caja-Realiza 3 series de 15 saltos.\n");
                            acondicionamiento.append("Balanceo Frontal y Atrás-Practica 3 series de 10 balanceos hacia adelante y hacia atrás.\n");
                            break;
                        case 3:
                            fortalecimiento.append("Flexiones de Brazos-Realiza 3 series de 10 flexiones. \n");
                            aparato.append("Puentes-Realiza 3 series de 5 puentes.\n");
                            acondicionamiento.append("Balanceos con Vuelta Atrás-Realiza 3 series de 8 repeticiones de vuelta atrás en la barra. \n");
                            break;
                        case 4:
                            fortalecimiento.append("Sentadillas-Realiza 3 series de 15 sentadillas.\n ");
                            aparato.append("Estocadas-Realiza 3 series de 10 estocadas por pierna. \n");
                            acondicionamiento.append("Balanceo con Separación de Piernas-Practica 3 series de 8 repeticiones separando las piernas al impulso. \n");
                            break;
                        case 5:
                            fortalecimiento.append("Dominadas-Realiza 3 series de 8 dominadas.\n ");
                            aparato.append("Flexiones en Barra-Realiza 3 series de 12 flexiones colgándote de la barra. \n");
                            acondicionamiento.append("Balanceo y Salida-Practica 3 series de 8 repeticiones de salida con sub balanceo en la barra.\n ");
                            break;
                    }
                }
            }

            if (switchChecked) {
                Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N1_Gr.this, Rutina_Generada.class);
                intent.putExtra("fortalecimiento", fortalecimiento.toString().trim());
                intent.putExtra("aparato", aparato.toString().trim());
                intent.putExtra("acondicionamiento", acondicionamiento.toString().trim());
                intent.putExtra("tipo", "piso");
                startActivity(intent);
            }

            if (!switchChecked) {
                Toast.makeText(com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N1_Gr.this, "Activa un Switch para generar la rutina", Toast.LENGTH_SHORT).show();
            }
        });
    }
}