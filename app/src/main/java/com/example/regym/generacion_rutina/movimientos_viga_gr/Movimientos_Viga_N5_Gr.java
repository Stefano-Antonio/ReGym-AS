package com.example.regym.generacion_rutina.movimientos_viga_gr;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.generacion_rutina.Mostrar_Niveles_Salto_Gr;
import com.example.regym.generacion_rutina.Rutina_Generada;

public class Movimientos_Viga_N5_Gr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_viga_n5_gr);

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
                findViewById(R.id.Movimiento9_swtch),
                findViewById(R.id.Movimiento10_swtch),
                findViewById(R.id.Movimiento11_swtch),
        };

        // Botón "Regresar"
        Regresar_btn.setOnClickListener(v -> {
            Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_viga_gr.Movimientos_Viga_N5_Gr.this, Mostrar_Niveles_Salto_Gr.class);
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
                            fortalecimiento.append("-Flexiones de Brazos-Realiza 3 series de 12 flexiones. \n");
                            aparato.append("-Saltos en Caja-Realiza 3 series de 15 saltos. \n");
                            acondicionamiento.append("-Entrada de Pose de Pescado-Practica 3 series de 8 repeticiones de entrada de apoyo de pose de pescado al frente en la viga.\n ");
                            break;
                        case 2:
                            fortalecimiento.append("-Flexiones de Piernas-Realiza 3 series de 12 flexiones de piernas. \n");
                            aparato.append("-Plancha Lateral-Mantén la posición de plancha lateral durante 30-45 segundos por lado. \n");
                            acondicionamiento.append("-Arco Atrás-Practica 3 series de 8 repeticiones de arco atrás a una pierna en la viga. \n");
                            break;
                        case 3:
                            fortalecimiento.append("-Flexiones de Brazos-Realiza 3 series de 12 flexiones. \n");
                            aparato.append("-Rodadas en el Suelo-Realiza 3 series de 10 rodadas atrás. \n");
                            acondicionamiento.append("-Rodada Atrás-Practica 3 series de 8 repeticiones de rodada atrás a mínimo ¾ de parada de manos en la viga.\n");
                            break;
                        case 4:
                            fortalecimiento.append("-Sentadillas-Realiza 3 series de 15 sentadillas.\n ");
                            aparato.append("-Saltos en Caja-Realiza 3 series de 12 saltos. \n");
                            acondicionamiento.append("-Flic-Flac a Una Pierna-Practica 3 series de 8 repeticiones de flic-flac a una pierna en la viga. \n");
                            break;
                        case 5:
                            fortalecimiento.append("-Sentadillas-Realiza 3 series de 15 sentadillas.\n ");
                            aparato.append("-Saltos en Caja-Realiza 3 series de 12 saltos.\n");
                            acondicionamiento.append("-Flic-Flac a Dos Piernas-Practica 3 series de 8 repeticiones de flic-flac a dos piernas en la viga.\n ");
                            break;
                        case 6:
                            fortalecimiento.append("-Flexiones de Piernas-Realiza 3 series de 12 flexiones de piernas. \n");
                            aparato.append("-Plancha Lateral-Mantén la posición de plancha lateral durante 30-45 segundos por lado.\n");
                            acondicionamiento.append("-Arco al Frente-Practica 3 series de 8 repeticiones de arco al frente a una pierna en la viga. \n");
                            break;
                        case 7:
                            fortalecimiento.append("-Sentadillas-Realiza 3 series de 15 sentadillas. \n");
                            aparato.append("-Elevaciones de Piernas-Realiza 3 series de 12 elevaciones de piernas.\n");
                            acondicionamiento.append("-Desplante Lateral y Passé-Practica 3 series de 10 repeticiones de desplante lateral seguido de pose de passé al frente en la viga. \n");
                            break;
                        case 8:
                            fortalecimiento.append("-Elevaciones de Piernas-Realiza 3 series de 15 elevaciones de piernas. \n");
                            aparato.append("-Flexiones de Piernas-Realiza 3 series de 12 flexiones de piernas. \n");
                            acondicionamiento.append("-Patada Atrás y Passé-Practica 3 series de 10 repeticiones de patada atrás seguida de pose de passé al frente en la viga. \n");
                            break;
                        case 9:
                            fortalecimiento.append("-Elevaciones de Piernas-Realiza 3 series de 15 elevaciones de piernas. \n");
                            aparato.append("-Plancha-Mantén la posición de plancha durante 45-60 segundos. \n");
                            acondicionamiento.append("-Palanca y Salto Leap Split-Practica 3 series de 8 repeticiones de palanca por arriba de la horizontal seguida de salto leap split con piernas extendidas a 150° en la viga. \n");
                            break;
                        case 10:
                            fortalecimiento.append("-Flexiones de Piernas-Realiza 3 series de 12 flexiones de piernas. \n");
                            aparato.append("-Elevaciones de Piernas-Realiza 3 series de 15 elevaciones de piernas. \n");
                            acondicionamiento.append("-Inversión Lateral-Practica 3 series de 8 repeticiones de inversión lateral en la viga. \n");
                            break;
                        case 11:
                            fortalecimiento.append("-Sentadillas con Salto-Realiza 3 series de 12 sentadillas con salto. \n");
                            aparato.append("-Saltos en Caja-Realiza 3 series de 15 saltos en caja. \n");
                            acondicionamiento.append("-Mortal Atrás-Practica 3 series de 8 repeticiones de salida de mortal atrás agrupado en la viga.\n");
                            break;
                    }
                }
            }

            if (switchChecked) {
                Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_viga_gr.Movimientos_Viga_N5_Gr.this, Rutina_Generada.class);
                intent.putExtra("fortalecimiento", fortalecimiento.toString().trim());
                intent.putExtra("aparato", aparato.toString().trim());
                intent.putExtra("acondicionamiento", acondicionamiento.toString().trim());
                intent.putExtra("tipo", "viga");
                startActivity(intent);
            }

            if (!switchChecked) {
                Toast.makeText(com.example.regym.generacion_rutina.movimientos_viga_gr.Movimientos_Viga_N5_Gr.this, "Activa un Switch para generar la rutina", Toast.LENGTH_SHORT).show();
            }
        });
    }
}