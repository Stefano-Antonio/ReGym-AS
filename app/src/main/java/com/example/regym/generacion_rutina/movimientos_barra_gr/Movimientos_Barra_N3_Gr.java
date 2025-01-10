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

public class Movimientos_Barra_N3_Gr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_barra_n3_gr);

        // Botones
        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Generar_btn = findViewById(R.id.Generar_btn);

        // Switches
        Switch[] switches = {
                findViewById(R.id.Movimiento1_swtch),
                findViewById(R.id.Movimiento2_swtch),
                findViewById(R.id.Movimiento3_swtch),
                findViewById(R.id.Movimiento4_swtch),
                findViewById(R.id.Movimiento5_swtch),
                findViewById(R.id.Movimiento6_swtch),
                findViewById(R.id.Movimiento7_swtch),
        };

        // Botón "Regresar"
        Regresar_btn.setOnClickListener(v -> {
            Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N3_Gr.this, Mostrar_Niveles_Piso_Gr.class);
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
                            fortalecimiento.append("Dominadas-Realiza 3 series de 12 dominadas. \n");
                            aparato.append("Elevaciones de Piernas Colgando-Realiza 3 series de 15 repeticiones. \n");
                            acondicionamiento.append("Movimientos Básicos en Barras Asimétricas-Practica 3 series de 8 repeticiones de movimientos básicos en barras asimétricas.\n ");
                            break;
                        case 2:
                            fortalecimiento.append("Abdominales-Realiza 3 series de 20 abdominales. \n");
                            aparato.append("Plancha-Mantén la posición de plancha durante 45-60 segundos. \n");
                            acondicionamiento.append("Levantamiento de Piernas Colgando-3 series de 12 repeticiones colgándote de la barra y levantando las piernas hacia el pecho. \n");
                            break;
                        case 3:
                            fortalecimiento.append("Flexiones de Brazos-Realiza 3 series de 15 flexiones. \n");
                            aparato.append("Saltos en Caja-Realiza 3 series de 12 saltos. \n");
                            acondicionamiento.append("Balanceo Frontal-Practica 3 series de 12 balanceos hacia adelante en la barra. \n");
                            break;
                        case 4:
                            fortalecimiento.append("Elevaciones de Piernas Colgando-Realiza 3 series de 15 repeticiones.\n ");
                            aparato.append("Saltos en Caja-Realiza 3 series de 15 saltos. \n");
                            acondicionamiento.append("Balanceo Frontal y Atrás-Practica 3 series de 10 balanceos hacia adelante y hacia atrás en la barra. \n");
                            break;
                        case 5:
                            fortalecimiento.append("Flexiones de Brazos-Realiza 3 series de 12 flexiones.\n ");
                            aparato.append("Puentes-Realiza 3 series de 6 puentes. \n");
                            acondicionamiento.append("Vuelta Atrás en Barra-Practica 3 series de 10 repeticiones de vuelta atrás en la barra.\n ");
                            break;
                        case 6:
                            fortalecimiento.append("Abdominales-Realiza 3 series de 20 abdominales. \n");
                            aparato.append("Rodadas en el Suelo-Realiza 3 series de 10 rodadas al frente. \n");
                            acondicionamiento.append("Vuelta al Frente en Barra-Practica 3 series de 8 repeticiones de vuelta al frente en la barra.\n");
                            break;
                        case 7:
                            fortalecimiento.append("Sentadillas-Realiza 3 series de 15 sentadillas. \n");
                            aparato.append("Estocadas-Realiza 3 series de 12 estocadas por pierna. \n");
                            acondicionamiento.append("Balanceo y Salto Extendido-Practica 3 series de 8 repeticiones de impulso a cuclillas seguido de salida de salto extendido en la barra. \n");
                            break;

                    }
                }
            }

            if (switchChecked) {
                Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N3_Gr.this, Rutina_Generada.class);
                intent.putExtra("fortalecimiento", fortalecimiento.toString().trim());
                intent.putExtra("aparato", aparato.toString().trim());
                intent.putExtra("acondicionamiento", acondicionamiento.toString().trim());
                intent.putExtra("tipo", "piso");
                startActivity(intent);
            }

            if (!switchChecked) {
                Toast.makeText(com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N3_Gr.this, "Activa un Switch para generar la rutina", Toast.LENGTH_SHORT).show();
            }
        });
    }
}