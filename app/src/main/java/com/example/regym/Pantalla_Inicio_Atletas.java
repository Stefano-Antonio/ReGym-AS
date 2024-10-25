package com.example.regym;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.manual_gimnasia.Mostrar_Niveles_Barra_Mg;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Salto_Mg;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Viga_Mg;

public class Pantalla_Inicio_Atletas extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_inicio_atletas);
// Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

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

                Intent intent = new Intent(Pantalla_Inicio_Atletas.this, Mostrar_Niveles_Salto_Mg.class);
                startActivity(intent);
            }
        });
//boton Piso
        Piso_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Atletas.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });
//boton Barra
        Barra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Atletas.this, Mostrar_Niveles_Barra_Mg.class);
                startActivity(intent);
            }
        });
//boton Viga
        Viga_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Atletas.this, Mostrar_Niveles_Viga_Mg.class);
                startActivity(intent);
            }
        });
//boton Regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Atletas.this, Pantalla_Iniciar_Sesion.class);
                startActivity(intent);
            }
        });



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
