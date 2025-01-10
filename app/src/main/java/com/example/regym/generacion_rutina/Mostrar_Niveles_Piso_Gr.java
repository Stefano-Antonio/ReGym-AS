package com.example.regym.generacion_rutina;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.generacion_rutina.movimientos_piso_gr.Movimientos_Piso_N1_Gr;
import com.example.regym.generacion_rutina.movimientos_piso_gr.Movimientos_Piso_N2_Gr;
import com.example.regym.generacion_rutina.movimientos_piso_gr.Movimientos_Piso_N3_Gr;
import com.example.regym.generacion_rutina.movimientos_piso_gr.Movimientos_Piso_N4_Gr;
import com.example.regym.generacion_rutina.movimientos_piso_gr.Movimientos_Piso_N5_Gr;

public class Mostrar_Niveles_Piso_Gr extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_niveles_piso_gr);


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

                Intent intent = new Intent(Mostrar_Niveles_Piso_Gr.this, Movimientos_Piso_N1_Gr.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n1_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "\"-Primera parte [POSE(*)]:Hacer demi-plié con ambas piernas. Contraer ligeramente los abdominales e inclinar el torso ligeramente hacia adelante.\n" +
                        "<Brazos>: Mover ambos brazos hacia adelante y arriba para terminar con ambos brazosflexionados hacia adelante y en medio con las palmas hacia afuera. Enfoque: Abajo(Extender el torso y las piernas).\n" +
                        "<Brazos>: Abrir ambos brazos a los lados en medio. ~Enfoque: 'Al frente', Si se invierte la (*) INVERSIÓN LATERAL, apuntar el pie izquierdo adelante.\n" +
                        "-Segunda parte [VUELTA DE CARRO]:Apuntar el pie derecho adelante en el suelo.\n" +
                        "<Brazos>: Permanecen arriba en todo momento y cuando se hace el descenso. Levantamos ambos brazos hacia los lados-arriba hasta completamente arriba. Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada detipo escalador” (figura 3) con la pierna derecha.\n Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las orejas cubiertas por los brazos mientras se llega abajo para colocar la mano derecha de lado sobre el suelo mientras el cuerpo gira 90° a la izquierda.\n" +
                        "Continuar para levantar la pierna izquierda hacia atrás y hacia arriba a medida que el torso desciende. Colocar la mano izquierda en el suelo de lado o ligeramente hacia adentro (las manosseparadas al ancho de los hombros) mientras la pierna derecha empuja fuera del suelo para realizar una 'INVERSIÓN LATERAL' a la derecha.\n La cabeza permanece alineada, con el ángulo de los hombros y el de la cadera abiertos, y el enfoque por debajo del brazo izquierdo para ver el suelo en el descenso.\n" +
                        "Girar 90° hacia adentro para descender con la izquierda mientras mantiene los brazos cubriendo las orejas para terminar con la pierna izquierda extendida (o ligeramente flexionada) y cerrar inmediatamente el pie derecho al lado del pie izquierdo para terminar recta de pie (en planta o en relevé).\n" +
                        "<Brazos>: Permanecen arriba en todo momento y cuando se hace el descenso. Si se invirtió la (*) INVERSIÓN LATERAL, simplemente regresar al texto.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "En este movimiento se recomienda trabajar sobre una linea recta al momento de realizar la vuelta de carro, asi como ayudarse con un colchon al momento de poner las manos, esto para que facilite a la gimnasta la realización del ejercicio correctamente");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","P_n1_m1");
                startActivity(intent);
            }
        });
//boton Nivel2
        Nivel2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Piso_Gr.this, Movimientos_Piso_N2_Gr.class);
                startActivity(intent);
            }
        });
//boton Nivel3
        Nivel3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Piso_Gr.this, Movimientos_Piso_N3_Gr.class);
                startActivity(intent);
            }
        });
//boton Nivel4
        Nivel4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Piso_Gr.this, Movimientos_Piso_N4_Gr.class);
                startActivity(intent);
            }
        });
//boton Nivel5
        Nivel5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Piso_Gr.this, Movimientos_Piso_N5_Gr.class);
                startActivity(intent);
            }
        });
//boton Regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Mostrar_Niveles_Piso_Gr.this, Generar_Rutina.class);
                startActivity(intent);
            }
        });



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}