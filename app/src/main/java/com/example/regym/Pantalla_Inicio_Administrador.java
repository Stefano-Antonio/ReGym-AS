package com.example.regym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Pantalla_Inicio_Administrador extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_inicio_administrador);
// Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

//botones
        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button agregar_usuario_btn = findViewById(R.id.agregar_usuario_btn);
        Button eliminar_usuario_btn = findViewById(R.id.eliminar_usuario_btn);
        Button administrar_comentarios_btn = findViewById(R.id.administrar_comentarios_btn);
        Button editar_usuario_btn = findViewById(R.id.editar_usuario_btn);
        Button administrar_matriculas_btn = findViewById(R.id.administrar_matriculas_btn);


//boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Inicio_Administrador.this, Pantalla_Iniciar_Sesion.class);
                startActivity(intent);
            }
        });
//boton agregar usuario
        agregar_usuario_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {
/*
                Intent intent = new Intent(Pantalla_Inicio_Entrenador.this, Generar_rutina.class);
                startActivity(intent);*/
            }
        });
//boton eliminar usuario
        eliminar_usuario_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

              /*  Intent intent = new Intent(Pantalla_Inicio_Entrenador.this, Manual_gimnasia.class);
                startActivity(intent);*/
            }
        });
//boton administrar comentarios
        administrar_comentarios_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {
/*
                Intent intent = new Intent(Pantalla_Inicio_Entrenador.this, Clase_basica.class);
                startActivity(intent);*/
            }
        });
//boton editar un usuario
        editar_usuario_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {
/*
                Intent intent = new Intent(Pantalla_Inicio_Entrenador.this, Clase_basica.class);
                startActivity(intent);*/
            }
        });
//boton administrar matriculas
        administrar_matriculas_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {
/*
                Intent intent = new Intent(Pantalla_Inicio_Entrenador.this, Clase_basica.class);
                startActivity(intent);*/
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
