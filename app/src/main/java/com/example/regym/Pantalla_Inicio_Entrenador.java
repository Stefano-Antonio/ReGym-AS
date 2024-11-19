package com.example.regym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.clase_basica.Inicio_Clase_Basica;
import com.example.regym.generacion_rutina.Generar_Rutina;
import com.example.regym.manual_gimnasia.Manual_Gimnasia;

public class Pantalla_Inicio_Entrenador extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_inicio_entrenador);
// Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

//botones
        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button gen_rut_btn = findViewById(R.id.gen_rut_btn);
        Button man_gim_btn = findViewById(R.id.man_gim_btn);
        Button most_clase_bas_btn = findViewById(R.id.most_clase_bas_btn);

//boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Entrenador.this, Pantalla_Iniciar_Sesion.class);
                startActivity(intent);
            }
        });
//boton generar rutina
        gen_rut_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Entrenador.this, Generar_Rutina.class);
                startActivity(intent);
            }
        });
//boton manual
        man_gim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Entrenador.this, Manual_Gimnasia.class);
                String userId = getIntent().getStringExtra("userId");
                intent.putExtra("userId",userId);
                startActivity(intent);
            }
        });
//boton Clase basica
        most_clase_bas_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Entrenador.this, Inicio_Clase_Basica.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
