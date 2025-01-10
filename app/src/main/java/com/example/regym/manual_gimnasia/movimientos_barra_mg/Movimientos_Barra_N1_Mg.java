package com.example.regym.manual_gimnasia.movimientos_barra_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Barra_N1_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_barra_n1_mg);

//Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

//Botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Movimiento1 = findViewById(R.id.movimiento_1_btn);
        Button Movimiento2 = findViewById(R.id.movimiento_2_btn);
        Button Movimiento3 = findViewById(R.id.movimiento_3_btn);
        Button Movimiento4 = findViewById(R.id.movimiento_4_btn);
        Button Movimiento5 = findViewById(R.id.movimiento_5_btn);

//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N1_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n1_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n1_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Equipamiento: Se puede usar una sola barra para la competencia, siempre que cumpla con\n" +
                        "las especificaciones de la barra inferior, como está escrito en las Reglas y Políticas actuales.\n" +
                        "Posición inicial (PI): Parada con los pies juntos mirando hacia la barra inferior. Se puede\n" +
                        "usar un botador o una superficie elevada (como un colchón plegable fabricado o un bloque de\n" +
                        "elementos/asistencia acolchonado) como superficie para entradas, pero debe retirarse lo\n" +
                        "antes posible después de que la gimnasta haya entrado.\n" +
                        "1. ENTRADA: SUBIDA DE ESTÓMAGO (0.60)\n" +
                        "Sujetar la barra inferior con una toma dorsal, con las manos separadas a la altura de los\n" +
                        "hombros. Levantar ambas piernas hacia arriba y sobre la barra inferior mientras jala con los\n" +
                        "brazos flexionados. Continuar levantando la cadera sobre la barra para realizar una ENTRADA\n" +
                        "DE SUBIDA DE ESTÓMAGO.\n" +
                        "Mover las manos hacia la parte superior de la barra y estirar los brazos para llegar a un apoyo\n" +
                        "frontal extendido. Mantener las piernas extendidas y una posición neutra de la cabeza en todo\n" +
                        "momento.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Agarre firme: Asegúrate de tener un agarre sólido en la barra para evitar resbalones.\n" +
                        "Control abdominal: Mantén los abdominales contraídos durante todo el movimiento para proteger la espalda baja.\n" +
                        "Flexibilidad: La falta de flexibilidad en los hombros o muñecas puede dificultar este movimiento y aumentar el riesgo de lesiones.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=VRRayd3ZMmc&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDE%3D\n");
                intent.putExtra("mov","B_n1_m1");
                intent.putExtra("titulo", "ENTRADA: SUBIDA DE ESTÓMAGO");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n1_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n1_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Con los hombros ligeramente delante de la barra, balancear las piernas hacia adelante y\n" +
                        "luego hacia atrás y hacia arriba. Empujar hacia abajo la barra, extendiéndose a través de los\n" +
                        "hombros, para levantar el cuerpo de la barra y realizar un IMPULSO con las piernas juntas.\n" +
                        "Mantener una posición del cuerpo recta y ahuecada con los glúteos y los abdominales\n" +
                        "apretados, los brazos y las piernas extendidos y la cabeza neutra.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Técnica correcta: Un impulso incorrecto puede llevar a desequilibrios y caídas.\n" +
                        "Fuerza en brazos y hombros: Asegúrate de tener suficiente fuerza en los brazos y hombros para realizar el impulso con seguridad.\n" +
                        "Altura de la barra: La altura de la barra debe ser adecuada para tu nivel y capacidad.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=VRRayd3ZMmc&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDE%3D\n");
                intent.putExtra("mov","B_n1_m2");
                intent.putExtra("titulo", "IMPULSO");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n1_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n1_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "<Brazos>: Al finalizar la rodada, colocar la mano derecha en la cadera y levantar el brazo izquierdo hacia adelante y arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Miedo a la altura: El miedo a la altura puede afectar tu concentración y aumentar el riesgo de caídas.\n" +
                        "Rotación completa: Asegúrate de completar la rotación de manera controlada para evitar lesiones en el cuello o la espalda.\n" +
                        "Desequilibrio: Un desequilibrio durante la vuelta atrás puede provocar una caída.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=VRRayd3ZMmc&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDE%3D\n");
                intent.putExtra("mov","B_n1_m3");
                intent.putExtra("titulo", "VUELTA ATRÁS");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n1_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n1_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Coordinación: Este movimiento requiere una buena coordinación entre brazos y piernas.\n" +
                        "Equilibrio: Mantén el equilibrio durante todo el movimiento para evitar caídas.\n" +
                        "Fuerza en piernas: La fuerza en las piernas es fundamental para este ejercicio.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=VRRayd3ZMmc&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDE%3D\n");
                intent.putExtra("mov","B_n1_m4");
                intent.putExtra("titulo", "IMPULSO A COLOCAR PIERNAS SEPARADAS");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n1_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n1_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "");
                intent.putExtra("informacion_ayuda", "Control del cuerpo: Mantén el cuerpo controlado durante todo el movimiento para evitar caídas.\n" +
                        "Agarre firme: Un agarre débil puede provocar que te resbales de la barra.\n" +
                        "Impulso adecuado: El impulso inicial debe ser suficiente para completar el movimiento.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=VRRayd3ZMmc&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDE%3D\n");
                intent.putExtra("mov","B_n1_m5");
                intent.putExtra("titulo", "SALIDA DE SUB BALANCEO");
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
