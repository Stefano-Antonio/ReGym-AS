package com.example.regym.generacion_rutina.movimientos_piso_gr;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.generacion_rutina.Mostrar_Niveles_Piso_Gr;


public class Movimientos_Piso_N4_Gr extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(com.example.regym.R.layout.movimientos_piso_n1_gr);

//botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Generar_btn = findViewById(R.id.Generar_btn);
//switchs
        Switch miSwitch1 = findViewById(R.id.Movimiento1_swtch);
        Switch miSwitch2 = findViewById(R.id.Movimiento2_swtch);
        Switch miSwitch3 = findViewById(R.id.Movimiento3_swtch);
        Switch miSwitch4 = findViewById(R.id.Movimiento4_swtch);
        Switch miSwitch5 = findViewById(R.id.Movimiento5_swtch);
        Switch miSwitch6 = findViewById(R.id.Movimiento6_swtch);
        Switch miSwitch7 = findViewById(R.id.Movimiento7_swtch);
        Switch miSwitch8 = findViewById(R.id.Movimiento8_swtch);
        Switch miSwitch9 = findViewById(R.id.Movimiento9_swtch);


//boton Regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N4_Gr.this, Mostrar_Niveles_Piso_Gr.class);
                startActivity(intent);
            }
        });
//boton Generar
        Generar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Envía los datos a la actividad de destino
                Intent intent = new Intent(Movimientos_Piso_N4_Gr.this, Rutina_Generada_Piso.class);
                intent.putExtra("mostrarInformacion", miSwitch1.isChecked());
                intent.putExtra("mostrarInformacion2", miSwitch2.isChecked());
                intent.putExtra("mostrarInformacion3", miSwitch3.isChecked());
                intent.putExtra("mostrarInformacion4", miSwitch4.isChecked());
                intent.putExtra("mostrarInformacion5", miSwitch5.isChecked());
                intent.putExtra("mostrarInformacion6", miSwitch6.isChecked());
                intent.putExtra("mostrarInformacion7", miSwitch7.isChecked());
                intent.putExtra("mostrarInformacion8", miSwitch8.isChecked());
                intent.putExtra("mostrarInformacion9", miSwitch9.isChecked());
                startActivity(intent);
            }
              /*  if (miSwitch1.isChecked()) { // Verifica si el Switch está activado
                    Intent intent = new Intent(Movimientos_Piso_N1_GR.this, Rutina_Generada_Piso_n1_gr.class);
                    intent.putExtra("mostrarInformacion", true);
                    startActivity(intent); // Abre la segunda Activity
                } else if(miSwitch2.isChecked()){
                    Intent intent = new Intent(Movimientos_Piso_N1_GR.this, Rutina_Generada_Piso_n1_gr.class);
                    intent.putExtra("mostrarInformacion2", true);
                    startActivity(intent); // Abre la segunda Activity
                }else if(miSwitch3.isChecked()){
                    Intent intent = new Intent(Movimientos_Piso_N1_GR.this, Rutina_Generada_Piso_n1_gr.class);
                    intent.putExtra("mostrarInformacion3", true);
                    startActivity(intent); // Abre la segunda Activity
                }else if(miSwitch4.isChecked()){
                    Intent intent = new Intent(Movimientos_Piso_N1_GR.this, Rutina_Generada_Piso_n1_gr.class);
                    intent.putExtra("mostrarInformacion4", true);
                    startActivity(intent); // Abre la segunda Activity
                }else if(miSwitch5.isChecked()){
                    Intent intent = new Intent(Movimientos_Piso_N1_GR.this, Rutina_Generada_Piso_n1_gr.class);
                    intent.putExtra("mostrarInformacion5", true);
                    startActivity(intent); // Abre la segunda Activity
                }else if(miSwitch6.isChecked()){
                    Intent intent = new Intent(Movimientos_Piso_N1_GR.this, Rutina_Generada_Piso_n1_gr.class);
                    intent.putExtra("mostrarInformacion6", true);
                    startActivity(intent); // Abre la segunda Activity
                }else if(miSwitch7.isChecked()){
                    Intent intent = new Intent(Movimientos_Piso_N1_GR.this, Rutina_Generada_Piso_n1_gr.class);
                    intent.putExtra("mostrarInformacion7", true);
                    startActivity(intent); // Abre la segunda Activity
                }else if(miSwitch8.isChecked()){
                    Intent intent = new Intent(Movimientos_Piso_N1_GR.this, Rutina_Generada_Piso_n1_gr.class);
                    intent.putExtra("mostrarInformacion8", true);
                    startActivity(intent); // Abre la segunda Activity
                }else if(miSwitch9.isChecked()){
                    Intent intent = new Intent(Movimientos_Piso_N1_GR.this, Rutina_Generada_Piso_n1_gr.class);
                    intent.putExtra("mostrarInformacion9", true);
                    startActivity(intent); // Abre la segunda Activity
                }else {
                    // El Switch está desactivado, puedes mostrar un mensaje o realizar otra acción
                    //Toast.makeText(Movimientos_Piso_N1_GR.this, "Activa el Switch para generar la rutina", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Movimientos_Piso_N1_GR.this, Rutina_Generada_Piso_n1_gr.class);
                    startActivity(intent); // Abre la segunda Activity
                }
            }
        });*/
        });
/*
//switch_1
        miSwitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
//switch_2
        miSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
//switch_3
        miSwitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
//switch_4
        miSwitch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
//switch_5
        miSwitch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
//switch_6
        miSwitch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
//switch_7
        miSwitch7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
//switch_8
        miSwitch8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
//switch_9
        miSwitch9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });*/
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}