package com.example.regym.manual_gimnasia.movimientos_salto_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Salto_N3_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_salto_n3_mg);

//Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

//Botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Movimiento1 = findViewById(R.id.movimiento_1_btn);

//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_salto_mg.Movimientos_Salto_N3_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_salto_mg.Movimientos_Salto_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n2_salto);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_salto_n2_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "1. La gimnasta puede realizar dos saltos, y la mejor puntuación es la que cuenta.\n" +
                        "2. Se permiten tres intentos para poder completar exitosamente uno o dos saltos.\n" +
                        "3. Una carrera vacía se describe como una aproximación de carrera que resulta en una\n" +
                        "caída durante la corrida, una detención a mitad de la carrera, salirse de la pista o\n" +
                        "hacer contacto con el botador o la pila de colchones sin llegar a recargarse o apoyarse\n" +
                        "en la parte de arriba de la pila de colchones.\n" +
                        "● Se puede realizar una carrera vacía dentro de los tres intentos sin penalizaciones.\n" +
                        "● Cualquier carrera vacía adicional se considerará un salto NULO.\n" +
                        "4. No se permite un cuarto intento.\n" +
                        "\n" +
                        "\n" +
                        "1. La carrera se acelera y mantiene la velocidad para hacer contacto con el botador con los\n" +
                        "pies delante del cuerpo.\n" +
                        "2. Los brazos se balancean hacia adelante hasta una posición de hombros completamente\n" +
                        "extendida (o ¾ de extensión) con el cuerpo extendido en una posición recta en la primera\n" +
                        "fase de vuelo con la cabeza en posición neutra.\n" +
                        "3. El cuerpo alcanza una posición de parada de manos vertical con los brazos extendidos\n" +
                        "en la fase de apoyo.\n" +
                        "4. El cuerpo mantiene una posición recta desde el apoyo en la parada de manos hasta el\n" +
                        "aterrizaje, con las piernas juntas y los pies en punta.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Los saltos con tornillo requieren una técnica precisa para evitar lesiones en la espalda.\n" +
                        "Consejo: Practica la rotación del cuerpo en el suelo antes de intentar el salto completo.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=o4c_1l8-zAE&pp=ygUUcnV0aW5hIHNhbHRvIG5pdmVsIDM%3D\n");
                intent.putExtra("mov","S_n1_m1");
                intent.putExtra("titulo", "SALTO N3");
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
