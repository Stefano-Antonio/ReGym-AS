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

public class Movimientos_Salto_N5_Gr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_salto_n5_gr);

        // Botones
        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Generar_btn = findViewById(R.id.Generar_btn);

        // Switches
        Switch[] switches = {
                findViewById(R.id.Movimiento1_swtch),
        };

        // Botón "Regresar"
        Regresar_btn.setOnClickListener(v -> {
            Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_salto_gr.Movimientos_Salto_N5_Gr.this, Mostrar_Niveles_Salto_Gr.class);
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
                            fortalecimiento.append("(1)Parado de manos completa... \n");
                            aparato.append("(2)Intento vuelta de carro normal... \n");
                            acondicionamiento.append("(3)Lagartijas...\n ");
                            break;
                        case 2:
                            fortalecimiento.append("(4)Postura cuchara rodillas dobladas... \n");
                            aparato.append("(5)Intento rodada atrás... \n");
                            acondicionamiento.append("(6)Abdominales agrupadas... \n");
                            break;
                        case 3:
                            fortalecimiento.append("(7)Postura de velita... \n");
                            aparato.append("(8)Intento de velita... \n");
                            acondicionamiento.append("(9)Abdominales a postura... \n");
                            break;
                        case 4:
                            fortalecimiento.append("(10)Mantener equilibrio un pie...\n ");
                            aparato.append("(11)Práctica del movimiento completo... \n");
                            acondicionamiento.append("(12)Ejercicio elevar puntas... \n");
                            break;
                        case 5:
                            fortalecimiento.append("(1)Parado de manos completa...\n ");
                            aparato.append("(--) Caballitos... \n");
                            acondicionamiento.append("(6)Abdominales agrupadas...\n ");
                            break;
                        case 6:
                            fortalecimiento.append("(1)Parado de manos completa... \n");
                            aparato.append("(--) Salto extendido... \n");
                            acondicionamiento.append("(6)Abdominales agrupadas... \n");
                            break;
                        case 7:
                            fortalecimiento.append("(1)Parado de manos completa... \n");
                            aparato.append("(14)Intento rodada atrás... \n");
                            acondicionamiento.append("(6)Abdominales agrupadas... \n");
                            break;
                        case 8:
                            fortalecimiento.append("(15)Palanca nivel 1... \n");
                            aparato.append("(16)Intento escorpión... \n");
                            acondicionamiento.append("(17)Postura de plancha... \n");
                            break;
                        case 9:
                            fortalecimiento.append("(1)Parado de manos completa... \n");
                            aparato.append("(2)Intento vuelta de carro normal... \n");
                            acondicionamiento.append("(3)Lagartijas... \n");
                            break;
                    }
                }
            }

            if (switchChecked) {
                Intent intent = new Intent(com.example.regym.generacion_rutina.movimientos_salto_gr.Movimientos_Salto_N5_Gr.this, Rutina_Generada.class);
                intent.putExtra("fortalecimiento", fortalecimiento.toString().trim());
                intent.putExtra("aparato", aparato.toString().trim());
                intent.putExtra("acondicionamiento", acondicionamiento.toString().trim());
                intent.putExtra("tipo", "piso");
                startActivity(intent);
            }

            if (!switchChecked) {
                Toast.makeText(com.example.regym.generacion_rutina.movimientos_salto_gr.Movimientos_Salto_N5_Gr.this, "Activa un Switch para generar la rutina", Toast.LENGTH_SHORT).show();
            }
        });
    }
}