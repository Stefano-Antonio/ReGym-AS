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

//Botones
        Button Salto_btn = findViewById(R.id.Salto_btn);
        Button Piso_btn = findViewById(R.id.Piso_btn);
        Button Barra_btn = findViewById(R.id.Barra_btn);
        Button Viga_btn = findViewById(R.id.Viga_btn);
        Button Regresar_btn = findViewById(R.id.Regresar_btn);

//Boton salto
        Salto_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Atletas.this, Mostrar_Niveles_Salto_Mg.class);
                startActivity(intent);
            }
        });
//Boton piso
        Piso_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Atletas.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });
//Boton barra
        Barra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Atletas.this, Mostrar_Niveles_Barra_Mg.class);
                startActivity(intent);
            }
        });
//Boton viga
        Viga_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Atletas.this, Mostrar_Niveles_Viga_Mg.class);
                startActivity(intent);
            }
        });
//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
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
