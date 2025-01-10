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

public class Movimientos_Barra_N5_Gr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_barra_n5_gr);

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
                findViewById(R.id.Movimiento12_swtch),
                findViewById(R.id.Movimiento13_swtch),
                findViewById(R.id.Movimiento14_swtch),
                findViewById(R.id.Movimiento15_swtch),
        };

        // Botón "Regresar"
        Regresar_btn.setOnClickListener(v -> {
            Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N5_Gr.this, Mostrar_Niveles_Piso_Gr.class);
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
                            fortalecimiento.append("Plancha-Mantén la posición de plancha durante 45-60 segundos. \n");
                            aparato.append("Elevaciones de Piernas Colgando-Realiza 3 series de 15 repeticiones. \n");
                            acondicionamiento.append("Posición Inicial y Balanceo-Practica 3 series de 10 repeticiones comenzando en la posición inicial y balanceándote ligeramente.\n ");
                            break;
                        case 2:
                            fortalecimiento.append("Elevaciones de Piernas Colgando-Realiza 3 series de 12 repeticiones. \n");
                            aparato.append("Saltos en Caja-Realiza 3 series de 15 saltos. \n");
                            acondicionamiento.append("Balanceo Frontal y Atrás-Practica 3 series de 10 balanceos hacia adelante y hacia atrás en la barra, asegurándote de llegar por encima de la horizontal. \n");
                            break;
                        case 3:
                            fortalecimiento.append("Flexiones de Brazos-Realiza 3 series de 12 flexiones. \n");
                            aparato.append("Rodadas en el Suelo-Realiza 3 series de 10 rodadas al frente. \n");
                            acondicionamiento.append("Vuelta de Apoyo Libre-Practica 3 series de 10 repeticiones de vuelta de apoyo libre por encima de la horizontal en la barra. \n");
                            break;
                        case 4:
                            fortalecimiento.append("Sentadillas-Realiza 3 series de 15 sentadillas.\n ");
                            aparato.append("Estocadas-Realiza 3 series de 12 estocadas por pierna. \n");
                            acondicionamiento.append("Plantillas Atrás en Barra-Practica 3 series de 8 repeticiones de plantillas completas atrás al apoyo libre en la barra. \n");
                            break;
                        case 5:
                            fortalecimiento.append("Abdominales-Realiza 3 series de 20 abdominales.\n ");
                            aparato.append("Flexiones en Barra-Realiza 3 series de 12 flexiones colgándote de la barra. \n");
                            acondicionamiento.append("Stalder Atrás-Practica 3 series de 8 repeticiones de stalder atrás al apoyo libre en la barra.\n ");
                            break;
                        case 6:
                            fortalecimiento.append("Dominadas-Realiza 3 series de 12 dominadas. \n");
                            aparato.append("Elevaciones de Piernas Colgando-Realiza 3 series de 15 repeticiones. \n");
                            acondicionamiento.append("Kip Carpado-Practica 3 series de 8 repeticiones de kip carpado o con piernas separadas en la barra. \n");
                            break;
                        case 7:
                            fortalecimiento.append("Sentadillas-Realiza 3 series de 15 sentadillas. \n");
                            aparato.append("Estocadas-Realiza 3 series de 12 estocadas por pierna. \n");
                            acondicionamiento.append("Impulso y Cuclillas-Practica 3 series de 10 repeticiones de impulso seguido de colocación de cuclillas en la barra. \n");
                            break;
                        case 8:
                            fortalecimiento.append("Dominadas-Realiza 3 series de 12 dominadas. \n");
                            aparato.append("Flexiones de Brazos-Realiza 3 series de 15 flexiones. \n");
                            acondicionamiento.append("Salto a Kip-Practica 3 series de 8 repeticiones de salto a kip de suspensión larga en la barra. \n");
                            break;
                        case 9:
                            fortalecimiento.append("Elevaciones de Piernas Colgando-Realiza 3 series de 15 repeticiones. \n");
                            aparato.append("Saltos en Caja-Realiza 3 series de 15 saltos. \n");
                            acondicionamiento.append("Balanceo Frontal a la Horizontal-Practica 3 series de 10 repeticiones de impulso por arriba de la horizontal en la barra. \n");
                            break;
                        case 10:
                            fortalecimiento.append("Flexiones de Brazos-Realiza 3 series de 12 flexiones.\n ");
                            aparato.append("Dominadas-Realiza 3 series de 10 dominadas. \n");
                            acondicionamiento.append("Medio Gigante-Practica 3 series de 8 repeticiones de medio gigante al apoyo en la barra. \n");
                            break;
                        case 11:
                            fortalecimiento.append("Plancha-Mantén la posición de plancha durante 45-60 segundos.\n ");
                            aparato.append("Elevaciones de Piernas Colgando-Realiza 3 series de 15 repeticiones.\n");
                            acondicionamiento.append("Sub Balanceo y Contrabalanceo-Practica 3 series de 10 repeticiones de sub balanceo seguido de primer contrabalanceo en la barra.\n ");
                            break;
                        case 12:
                            fortalecimiento.append("Abdominales-Realiza 3 series de 20 abdominales. \n");
                            aparato.append("Flexiones en Barra-Realiza 3 series de 12 flexiones colgándote de la barra. \n");
                            acondicionamiento.append("Primer Contrabalanceo-Practica 3 series de 8 repeticiones de primer contrabalanceo en la barra.\n");
                            break;
                        case 13:
                            fortalecimiento.append("Elevaciones de Piernas Colgando-Realiza 3 series de 15 repeticiones. \n");
                            aparato.append("Saltos en Caja-Realiza 3 series de 12 saltos. \n");
                            acondicionamiento.append("Balanceo al Frente y Contrabalanceo-Practica 3 series de 10 repeticiones de balanceo al frente seguido de segundo contrabalanceo en la barra. \n");
                            break;
                        case 14:
                            fortalecimiento.append("Flexiones de Brazos-Realiza 3 series de 12 flexiones. \n");
                            aparato.append("Puentes-Realiza 3 series de 6 puentes. \n");
                            acondicionamiento.append("Segundo Contrabalanceo-Practica 3 series de 8 repeticiones de segundo contrabalanceo en la barra.\n");
                            break;
                        case 15:
                            fortalecimiento.append("Dominadas-Realiza 3 series de 12 dominadas. \n");
                            aparato.append("Elevaciones de Piernas Colgando-Realiza 3 series de 15 repeticiones. \n");
                            acondicionamiento.append("Flyaway-Practica 3 series de 8 repeticiones de balanceo al frente seguido de salida de flyaway en la barra.\n");
                            break;
                    }
                }
            }

            if (switchChecked) {
                Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N5_Gr.this, Rutina_Generada.class);
                intent.putExtra("fortalecimiento", fortalecimiento.toString().trim());
                intent.putExtra("aparato", aparato.toString().trim());
                intent.putExtra("acondicionamiento", acondicionamiento.toString().trim());
                intent.putExtra("tipo", "piso");
                startActivity(intent);
            }

            if (!switchChecked) {
                Toast.makeText(com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N5_Gr.this, "Activa un Switch para generar la rutina", Toast.LENGTH_SHORT).show();
            }
        });
    }
}