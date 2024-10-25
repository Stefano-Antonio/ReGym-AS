package com.example.regym.clase_basica;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.Pantalla_Inicio_Entrenador;
import com.example.regym.R;

public class Clase_Basica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.clase_basica);

//botones
        Button Salto_btn = findViewById(R.id.Salto_btn);
        Button Piso_btn = findViewById(R.id.Piso_btn);
        Button Barra_btn = findViewById(R.id.Barra_btn);
        Button Viga_btn = findViewById(R.id.Viga_btn);
        Button Regresar_btn = findViewById(R.id.Regresar_btn);


//boton Salto
        Salto_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Clase_Basica.this, Clase_Basica.class);
                startActivity(intent);
            }
        });
//boton Piso
        Piso_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Clase_Basica.this, Clase_Basica.class);
                startActivity(intent);
            }
        });
//boton Barra
        Barra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Clase_Basica.this, Clase_Basica.class);
                startActivity(intent);
            }
        });
//boton Viga
        Viga_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Clase_Basica.this, Clase_Basica.class);
                startActivity(intent);
            }
        });
//boton Regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Clase_Basica.this, Pantalla_Inicio_Entrenador.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
