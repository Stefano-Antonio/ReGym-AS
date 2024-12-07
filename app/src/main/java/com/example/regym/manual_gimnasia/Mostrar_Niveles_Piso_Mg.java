package com.example.regym.manual_gimnasia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.Pantalla_Inicio_Atletas;
import com.example.regym.R;
import com.example.regym.manual_gimnasia.movimientos_piso_mg.Movimientos_Piso_N2_Mg;
import com.example.regym.manual_gimnasia.movimientos_piso_mg.Movimientos_Piso_N3_Mg;
import com.example.regym.manual_gimnasia.movimientos_piso_mg.Movimientos_Piso_N4_Mg;



public class Mostrar_Niveles_Piso_Mg extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_niveles_piso_mg);

//Botones
        Button Nivel1_btn = findViewById(R.id.Nivel1_btn);
        Button Nivel2_btn = findViewById(R.id.Nivel2_btn);
        Button Nivel3_btn = findViewById(R.id.Nivel3_btn);
        Button Nivel4_btn = findViewById(R.id.Nivel4_btn);
        Button Nivel5_btn = findViewById(R.id.Nivel5_btn);
        Button Regresar_btn = findViewById(R.id.Regresar_btn);

//Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

//Boton Nivel1
        Nivel1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Piso_Mg.this, com.example.regym.manual_gimnasia.movimientos_piso_mg.Movimientos_Piso_N1_Mg.class);
                String userId = getIntent().getStringExtra("userId");
                intent.putExtra("userId",userId);
                startActivity(intent);
            }
        });

//Boton Nivel2
        Nivel2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent = new Intent(Mostrar_Niveles_Piso_Mg.this, Movimientos_Piso_N2_Mg.class);
                startActivity(intent);
            }
        });

//Boton Nivel3
        Nivel3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Piso_Mg.this, Movimientos_Piso_N3_Mg.class);
                startActivity(intent);
            }
        });

//Boton Nivel4
        Nivel4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Piso_Mg.this, Movimientos_Piso_N4_Mg.class);
                startActivity(intent);
            }
        });

//Boton Nivel5
        Nivel5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//Boton Regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tipoUsuario != "Atletas") {
                    Log.d("TipoUsuario", "El usuario es un: " + tipoUsuario);
                    Intent intent = new Intent(Mostrar_Niveles_Piso_Mg.this, Pantalla_Inicio_Atletas.class);
                    startActivity(intent);
                } else {
                    Log.d("TipoUsuario", "Tipo de usuario no recibido");
                    Intent intent = new Intent(Mostrar_Niveles_Piso_Mg.this, Manual_Gimnasia.class);
                    startActivity(intent);
                }
            }
        });



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
