package com.example.regym.generacion_rutina;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;

public class Generar_Rutina extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.generar_rutina);


        //botones
        Button Salto_btn = findViewById(R.id.Salto_btn);
        Button Piso_btn = findViewById(R.id.Piso_btn);
        Button Barra_btn = findViewById(R.id.Barra_btn);
        Button Viga_btn = findViewById(R.id.Viga_btn);


//boton Salto
        Salto_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Generar_Rutina.this, Mostrar_Niveles_Salto_Gr.class);
                startActivity(intent);
            }
        });
//boton Piso
        Piso_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Generar_Rutina.this, Mostrar_Niveles_Piso_Gr.class);
                startActivity(intent);
            }
        });
//boton Barra
        Barra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Generar_Rutina.this, Mostrar_Niveles_Barra_Gr.class);
                startActivity(intent);
            }
        });
//boton Viga
        Viga_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Generar_Rutina.this, Mostrar_Niveles_Viga_Gr.class);
                startActivity(intent);
            }
        });






    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
