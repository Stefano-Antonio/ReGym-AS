// Movimientos_Piso_N1_Gr.java
package com.example.regym.generacion_rutina.movimientos_piso_gr;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.generacion_rutina.Mostrar_Niveles_Piso_Gr;
import com.example.regym.generacion_rutina.Rutina_Generada;

public class Movimientos_Piso_N1_Gr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_piso_n1_gr);

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
                findViewById(R.id.Movimiento8_swtch),
        };

        // Botón "Regresar"
        Regresar_btn.setOnClickListener(v -> {
            Intent intent = new Intent(Movimientos_Piso_N1_Gr.this, Mostrar_Niveles_Piso_Gr.class);
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
                            fortalecimiento.append("-Plancha-Mantén la posición de plancha durante 30-45 segundos. \n");
                            aparato.append("-Elevaciones de Piernas Colgando-Realiza 3 series de 12 repeticiones. \n");
                            acondicionamiento.append("-Vuelta de Carro-Practica 3 series de 8 repeticiones de vuelta de carro.\n ");
                            break;
                        case 2:
                            fortalecimiento.append("-Flexiones de Brazos-Realiza 3 series de 10 flexiones. \n");
                            aparato.append("-Rodadas en el Suelo-Realiza 3 series de 8 rodadas atrás. \n");
                            acondicionamiento.append("-Rodada Atrás-Practica 3 series de 10 repeticiones de rodada atrás agrupada.\n");
                            break;
                        case 3:
                            fortalecimiento.append("-Abdominales-Realiza 3 series de 20 abdominales. \n");
                            aparato.append("-Elevaciones de Piernas-Realiza 3 series de 15 elevaciones de piernas.\n");
                            acondicionamiento.append("-Rodada a Vela-Practica 3 series de 8 repeticiones de rodada a vela. \n");
                            break;
                        case 4:
                            fortalecimiento.append("-Sentadillas-Realiza 3 series de 15 sentadillas.\n ");
                            aparato.append("-Elevaciones de Piernas-Realiza 3 series de 12 elevaciones de piernas. \n");
                            acondicionamiento.append("-Equilibrio en Passé-Practica 3 series de 10 repeticiones de equilibrio en passé al frente.\n");
                            break;
                        case 5:
                            fortalecimiento.append("-Elevaciones de Piernas-Realiza 3 series de 12 elevaciones de piernas.\n ");
                            aparato.append("-Saltos en Caja-Realiza 3 series de 10 saltos.\n");
                            acondicionamiento.append("-Chassé al Frente-Practica 3 series de 10 repeticiones de chassé al frente.\n ");
                            break;
                        case 6:
                            fortalecimiento.append("-Sentadillas-Realiza 3 series de 15 sentadillas.\n");
                            aparato.append("-Saltos en Caja-Realiza 3 series de 12 saltos.\n");
                            acondicionamiento.append("-Salto Extendido-Practica 3 series de 8 repeticiones de salto extendido. \n");
                            break;
                        case 7:
                            fortalecimiento.append("-Flexiones de Brazos-Realiza 3 series de 10 flexiones. \n");
                            aparato.append("-Rodadas en el Suelo-Realiza 3 series de 10 rodadas al frente. \n");
                            acondicionamiento.append("-Rodada al Frente-Practica 3 series de 10 repeticiones de rodada al frente agrupada. \n");
                            break;
                        case 8:
                            fortalecimiento.append("-Flexiones de Brazos-Realiza 3 series de 12 flexiones. \n");
                            aparato.append("-Plancha-Mantén la posición de plancha durante 30-45 segundos. \n");
                            acondicionamiento.append("-Parada de Manos-Practica 3 series de 8 repeticiones de parada de manos (3/4). \n");
                            break;
                    }
                }
            }

            if (switchChecked) {
                Intent intent = new Intent(Movimientos_Piso_N1_Gr.this, Rutina_Generada.class);
                intent.putExtra("fortalecimiento", fortalecimiento.toString().trim());
                intent.putExtra("aparato", aparato.toString().trim());
                intent.putExtra("acondicionamiento", acondicionamiento.toString().trim());
                intent.putExtra("tipo", "piso");
                startActivity(intent);
                }

            if (!switchChecked) {
                Toast.makeText(Movimientos_Piso_N1_Gr.this, "Activa un Switch para generar la rutina", Toast.LENGTH_SHORT).show();
            }
        });
    }
}