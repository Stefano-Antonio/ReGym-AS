package com.example.regym.manual_gimnasia.movimientos_salto_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Salto_N2_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_salto_n2_mg);

//Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

//Botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Movimiento1 = findViewById(R.id.movimiento_1_btn);

//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_salto_mg.Movimientos_Salto_N2_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_salto_mg.Movimientos_Salto_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n2_salto);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_salto_n2_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "\n" +
                        "1. La gimnasta puede realizar dos saltos, y la mejor puntuación es la que cuenta.\n" +
                        "2. Se permiten tres intentos para poder completar exitosamente uno o dos saltos.\n" +
                        "3. Se puede realizar una carrera vacía dentro de los tres intentos sin penalizaciones.\n" +
                        "● Cualquier carrera vacía adicional se considerará un salto NULO.\n" +
                        "4. Una carrera vacía se describe como una aproximación de carrera que resulta en una caída\n" +
                        "durante la corrida, una detención a mitad de la carrera, salirse de la pista o hacer contacto\n" +
                        "con el botador o la pila de colchones sin llegar a recargarse o apoyarse en la parte de\n" +
                        "arriba de la pila de colchones.\n" +
                        "5. No se permite un cuarto intento.\n" +
                        "NIVEL 2 SALTO ~ PUNTOS PARA LA EVALUACIÓN\n" +
                        "1. La carrera se acelera y mantiene la velocidad para hacer contacto con el botador con los\n" +
                        "pies delante del cuerpo.\n" +
                        "2. Los brazos se balancean hacia adelante hasta una posición de hombros completamente\n" +
                        "extendida con el cuerpo extendido en una posición recta y ahuecada en el vuelo previo con\n" +
                        "la cabeza en posición neutra.\n" +
                        "3. El cuerpo alcanza una posición de PARADA DE MANOS vertical con los brazos\n" +
                        "extendidos en la fase de apoyo.\n" +
                        "4. El cuerpo se mantiene en una posición del cuerpo recta y ahuecada desde el apoyo en\n" +
                        "PARADA DE MANOS hasta la posición de acostada en la espalda con las piernas juntas y\n" +
                        "los pies en puntas durante todo el DESCENSO A LA POSICIÓN DE EXTENSIÓN\n" +
                        "ACOSTADA EN LA ESPALDA.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Al realizar giros, existe el riesgo de perder el equilibrio y caer.\n" +
                        "Consejo: Concéntrate en mantener la cabeza erguida y los ojos en un punto fijo durante el giro.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","S_n2_m1");
                intent.putExtra("titulo", "SALTO N2");
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
