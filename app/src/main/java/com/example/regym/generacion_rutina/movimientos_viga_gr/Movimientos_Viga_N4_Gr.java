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

public class Movimientos_Viga_N4_Gr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_viga_n4_gr);

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
            Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_viga_gr.Movimientos_Viga_N4_Gr.this, Mostrar_Niveles_Salto_Gr.class);
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
                            fortalecimiento.append("-Flexiones Laterales-Realiza 3 series de 12 flexiones laterales por lado. \n");
                            aparato.append("-Plancha Lateral-Mantén la posición de plancha lateral durante 30-45 segundos por lado. \n");
                            acondicionamiento.append("-Inversión Lateral-Practica 3 series de 8 repeticiones de inversión lateral en la viga. \n");
                            break;
                        case 3:
                            fortalecimiento.append("-Sentadillas-Realiza 3 series de 15 sentadillas. \n");
                            aparato.append("-Flexiones de Piernas-Realiza 3 series de 12 flexiones de piernas. \n");
                            acondicionamiento.append("-Desplante Lateral-Practica 3 series de 10 repeticiones de desplante lateral en la viga. \n");
                            break;
                        case 4:
                            fortalecimiento.append("-Elevaciones de Piernas-Realiza 3 series de 15 elevaciones de piernas.\n ");
                            aparato.append("-Flexiones de Piernas-Realiza 3 series de 12 flexiones de piernas. \n");
                            acondicionamiento.append("-Patada Atrás-Practica 3 series de 10 repeticiones de patada atrás en la viga.\n");
                            break;
                        case 5:
                            fortalecimiento.append("-Flexiones de Brazos-Realiza 3 series de 12 flexiones.\n ");
                            aparato.append("-Plancha-Mantén la posición de plancha durante 45-60 segundos.\n");
                            acondicionamiento.append("-Parada de ManosPractica 3 series de 8 repeticiones de parada de manos transversal en la viga.\n ");
                            break;
                        case 6:
                            fortalecimiento.append("-Elevaciones de Piernas-Realiza 3 series de 15 elevaciones de piernas. \n");
                            aparato.append("-Plancha-Mantén la posición de plancha durante 45-60 segundos.\n");
                            acondicionamiento.append("-Palanca-Practica 3 series de 8 repeticiones de palanca horizontal en la viga.\n");
                            break;
                        case 7:
                            fortalecimiento.append("-Sentadillas-Realiza 3 series de 15 sentadillas.\n");
                            aparato.append("-Estocadas-Realiza 3 series de 12 estocadas por pierna. \n");
                            acondicionamiento.append("-Salto Leap Split-Practica 3 series de 8 repeticiones de salto leap split con piernas extendidas a 120º en la viga.\n");
                            break;
                        case 8:
                            fortalecimiento.append("-Flexiones de Brazos-Realiza 3 series de 12 flexiones.\n");
                            aparato.append("-Plancha-Mantén la posición de plancha durante 45-60 segundos. \n");
                            acondicionamiento.append("-Inversión Lateral-Practica 3 series de 8 repeticiones de salida de inversión lateral a parada de manos en la viga. \n");
                            break;
                    }
                }
            }

            if (switchChecked) {
                Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_viga_gr.Movimientos_Viga_N4_Gr.this, Rutina_Generada.class);
                intent.putExtra("fortalecimiento", fortalecimiento.toString().trim());
                intent.putExtra("aparato", aparato.toString().trim());
                intent.putExtra("acondicionamiento", acondicionamiento.toString().trim());
                intent.putExtra("tipo", "viga");
                startActivity(intent);
            }

            if (!switchChecked) {
                Toast.makeText(com.example.regym.generacion_rutina.movimientos_viga_gr.Movimientos_Viga_N4_Gr.this, "Activa un Switch para generar la rutina", Toast.LENGTH_SHORT).show();
            }
        });
    }
}