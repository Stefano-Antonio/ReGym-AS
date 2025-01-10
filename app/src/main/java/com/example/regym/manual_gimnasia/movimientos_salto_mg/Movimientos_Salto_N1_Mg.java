package com.example.regym.manual_gimnasia.movimientos_salto_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Salto_N1_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_salto_n1_mg);

//Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

//Botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Movimiento1 = findViewById(R.id.movimiento_1_btn);

//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_salto_mg.Movimientos_Salto_N1_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_salto_mg.Movimientos_Salto_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n2_salto);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_salto_n2_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "1. Aceleración de la carrera, mostrar buena forma y técnica y mantener la velocidad\n" +
                        "hacia el botador para el SALTO EXTENDIDO.\n" +
                        "2. Los brazos se balancean hacia adelante hasta una posición frente al cuerpo con hombros\n" +
                        "completamente extendidos con los pies en el botador y se muestra una posición de cuerpo\n" +
                        "recto y apretado durante el SALTO EXTENDIDO.\n" +
                        "3. Lograr una posición de PARADA DE MANOS vertical con los brazos rectos antes y\n" +
                        "durante el DESCENSO A LA POSICIÓN DE EXTENSIÓN ACOSTADA.\n" +
                        "4. Mantener una posición del cuerpo recta y ahuecada desde el apoyo en PARADA DE\n" +
                        "MANOS hasta la POSICIÓN DE EXTENSIÓN ACOSTADA con las piernas juntas y los\n" +
                        "pies en puntas durante todo el DESCENSO A LA POSICIÓN DE EXTENSIÓN\n" +
                        "ACOSTADA.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", " Es común caer hacia atrás al intentar saltar sobre una pierna.\n" +
                        "Consejo: Practica la coordinación de brazos y piernas para mantener el equilibrio.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=yxCr0XsBFks&pp=ygUUcnV0aW5hIHNhbHRvIG5pdmVsIDE%3D");
                intent.putExtra("mov","S_n1_m1");
                intent.putExtra("titulo", "PARADA DE MANOS A DESCENSO A LA POSICIÓN DE EXTENSIÓN ACOSTADA");
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
