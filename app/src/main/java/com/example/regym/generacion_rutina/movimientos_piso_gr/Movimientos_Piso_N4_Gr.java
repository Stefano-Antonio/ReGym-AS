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


public class Movimientos_Piso_N4_Gr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_piso_n2_gr);

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
            Intent intent = new Intent(Movimientos_Piso_N4_Gr.this, Mostrar_Niveles_Piso_Gr.class);
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
                            fortalecimiento.append("-Plancha-Mantén la posición de plancha durante 45-60 segundos. \n");
                            aparato.append("-Elevaciones de Piernas Colgando-Realiza 3 series de 15 repeticiones. \n");
                            acondicionamiento.append("Pose Inicial y Balanceo-Practica 3 series de 10 repeticiones comenzando en la pose inicial y balanceándote ligeramente.\n ");
                            break;
                        case 2:
                            fortalecimiento.append("-Flexiones Laterales-Realiza 3 series de 10 flexiones laterales por lado. \n");
                            aparato.append("-Plancha Lateral-Mantén la posición de plancha lateral durante 30-45 segundos por lado. \n");
                            acondicionamiento.append("-Pose en Relevé y Desplante Lateral-Practica 3 series de 8 repeticiones de pose en relevé seguido de desplante lateral. \n");
                            break;
                        case 3:
                            fortalecimiento.append("-Sentadillas-Realiza 3 series de 15 sentadillas. \n");
                            aparato.append("-Estocadas-Realiza 3 series de 12 estocadas por pierna. \n");
                            acondicionamiento.append("-Salto Extendido con 1/2 Giro-Practica 3 series de 8 repeticiones de pose, paso patada, pose seguido de salto extendido con 1/2 giro. \n");
                            break;
                        case 4:
                            fortalecimiento.append("-Elevaciones de Piernas-Realiza 3 series de 15 elevaciones de piernas.\n ");
                            aparato.append("-Saltos en Caja-Realiza 3 series de 12 saltos. \n");
                            acondicionamiento.append("-Salto Hop y Chassé Lateral-Practica 3 series de 10 repeticiones de salto hop en passé al frente seguido de chassé lateral y salto hop con ¾ giro. \n");
                            break;
                        case 5:
                            fortalecimiento.append("-Sentadillas-Realiza 3 series de 15 sentadillas.\n ");
                            aparato.append("-Saltos en Caja-Realiza 3 series de 12 saltos. \n");
                            acondicionamiento.append("-Salto Jump Squat-Practica 3 series de 10 repeticiones de salto jump squat con 120° de giro.\n ");
                            break;
                        case 6:
                            fortalecimiento.append("-Abdominales-Realiza 3 series de 20 abdominales.\n");
                            aparato.append("-Elevaciones de Piernas-Realiza 3 series de 15 elevaciones de piernas. \n");
                            acondicionamiento.append("-Split al Frente-Practica 3 series de 8 repeticiones de pose ½ arrodillada seguida de split al frente.\n");
                            break;
                        case 7:
                            fortalecimiento.append("-Elevaciones de Piernas Colgando-Realiza 3 series de 15 repeticiones. \n");
                            aparato.append("-Saltos en Caja-Realiza 3 series de 12 saltos. \n");
                            acondicionamiento.append("-Giro de 180° a Tronco-Practica 3 series de 10 repeticiones de ½ giro boca abajo a giro de tronco y levantarse. \n");
                            break;
                        case 8:
                            fortalecimiento.append("-Flexiones de Brazos-Realiza 3 series de 12 flexiones.. \n");
                            aparato.append("-Plancha-Mantén la posición de plancha durante 45-60 segundos.\n");
                            acondicionamiento.append("-Redondilla-Practica 3 series de 10 repeticiones de redondilla en el piso. \n");
                            break;
                    }
                }
            }

            if (switchChecked) {
                Intent intent = new Intent(Movimientos_Piso_N4_Gr.this, Rutina_Generada.class);
                intent.putExtra("fortalecimiento", fortalecimiento.toString().trim());
                intent.putExtra("aparato", aparato.toString().trim());
                intent.putExtra("acondicionamiento", acondicionamiento.toString().trim());
                startActivity(intent);
            } else {
                Toast.makeText(Movimientos_Piso_N4_Gr.this, "Activa un Switch para generar la rutina", Toast.LENGTH_SHORT).show();
            }
        });
    }
}