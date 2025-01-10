package com.example.regym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_main);
//BotonES
        Button Iniciar_sesion_btn = findViewById(R.id.Iniciar_sesion_btn);
        Button Registrarse_btn = findViewById(R.id.Registrarse_btn);
        Button Creditos = findViewById(R.id.creditos_btn);

//Boton iniciar sesion
        Iniciar_sesion_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Pantalla_Iniciar_Sesion.class);
                startActivity(intent);
            }
        });
//Boton registrar
        Registrarse_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Pantalla_Registrar.class);
                startActivity(intent);
            }
        });
//Boton creditos
        Creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Pantalla_Inicio_Entrenador.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();

    }
}