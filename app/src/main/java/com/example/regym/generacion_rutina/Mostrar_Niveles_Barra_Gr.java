package com.example.regym.generacion_rutina;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N1_Gr;
import com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N2_Gr;
import com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N3_Gr;
import com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N4_Gr;
import com.example.regym.generacion_rutina.movimientos_barra_gr.Movimientos_Barra_N5_Gr;

public class Mostrar_Niveles_Barra_Gr extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_niveles_barra_gr);

        //botones
        Button Nivel1_btn = findViewById(R.id.Nivel1_btn);
        Button Nivel2_btn = findViewById(R.id.Nivel2_btn);
        Button Nivel3_btn = findViewById(R.id.Nivel3_btn);
        Button Nivel4_btn = findViewById(R.id.Nivel4_btn);
        Button Nivel5_btn = findViewById(R.id.Nivel5_btn);
        Button Regresar_btn = findViewById(R.id.Regresar_btn);


//boton Nivel1
        Nivel1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Barra_Gr.this, Movimientos_Barra_N1_Gr.class);
                startActivity(intent);
            }
        });
//boton Nivel2
        Nivel2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Barra_Gr.this, Movimientos_Barra_N2_Gr.class);
                startActivity(intent);
            }
        });
//boton Nivel3
        Nivel3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Barra_Gr.this, Movimientos_Barra_N3_Gr.class);
                startActivity(intent);
            }
        });
//boton Nivel4
        Nivel4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Barra_Gr.this, Movimientos_Barra_N4_Gr.class);
                startActivity(intent);
            }
        });
//boton Nivel5
        Nivel5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Barra_Gr.this, Movimientos_Barra_N5_Gr.class);
                startActivity(intent);
            }
        });
//boton Regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Barra_Gr.this, Generar_Rutina.class);
                startActivity(intent);
            }
        });
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
