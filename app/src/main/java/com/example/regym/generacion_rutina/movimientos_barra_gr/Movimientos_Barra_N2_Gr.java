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

public class Movimientos_Barra_N2_Gr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_barra_n2_gr);

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
        };

        // Botón "Regresar"
        Regresar_btn.setOnClickListener(v -> {
            Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N2_Gr.this, Mostrar_Niveles_Piso_Gr.class);
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
                            fortalecimiento.append("Flexiones Laterales-Realiza 3 series de 10 flexiones laterales por lado.\n");
                            aparato.append("Plancha Lateral-Mantén la posición de plancha lateral durante 30-45 segundos por lado. \n");
                            acondicionamiento.append("Inversión Lateral en Barra-Practica 3 series de 8 repeticiones de inversión lateral en la barra.\n ");
                            break;
                        case 2:
                            fortalecimiento.append("Flexiones de Brazos-Realiza 3 series de 12 flexiones. \n");
                            aparato.append("Rodadas en el Suelo-Realiza 3 series de 8 rodadas atrás en el suelo. \n");
                            acondicionamiento.append("Rodada Atrás en la Barra-Practica 3 series de 10 repeticiones de rodada atrás en la barra. \n");
                            break;
                        case 3:
                            fortalecimiento.append("Elevaciones de Piernas Colgando-Realiza 3 series de 15 repeticiones. \n");
                            aparato.append("Saltos en Caja-Realiza 3 series de 12 saltos. \n");
                            acondicionamiento.append("Balanceo Frontal y Atrás-Practica 3 series de 12 balanceos hacia adelante y hacia atrás en la barra. \n");
                            break;
                        case 4:
                            fortalecimiento.append("Flexiones de Brazos-Realiza 3 series de 10 flexiones..\n ");
                            aparato.append("Puentes-Realiza 3 series de 6 puentes. \n");
                            acondicionamiento.append("Vuelta Atrás en Barra-Practica 3 series de 10 repeticiones de vuelta atrás en la barra. \n");
                            break;
                        case 5:
                            fortalecimiento.append("Dominadas-Realiza 3 series de 10 dominadas.\n ");
                            aparato.append("Flexiones en Barra-Realiza 3 series de 15 flexiones colgándote de la barra. \n");
                            acondicionamiento.append("Balanceo y Salida-Practica 3 series de 10 repeticiones de salida con sub balanceo en la barra.\n ");
                            break;

                    }
                }
            }

            if (switchChecked) {
                Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N2_Gr.this, Rutina_Generada.class);
                intent.putExtra("fortalecimiento", fortalecimiento.toString().trim());
                intent.putExtra("aparato", aparato.toString().trim());
                intent.putExtra("acondicionamiento", acondicionamiento.toString().trim());
                intent.putExtra("tipo", "piso");
                startActivity(intent);
            }

            if (!switchChecked) {
                Toast.makeText(com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N2_Gr.this, "Activa un Switch para generar la rutina", Toast.LENGTH_SHORT).show();
            }
        });
    }
}