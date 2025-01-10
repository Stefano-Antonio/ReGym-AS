package com.example.regym.manual_gimnasia.movimientos_barra_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Barra_N4_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_barra_n4_mg);

//Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

//Botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Movimiento1 = findViewById(R.id.movimiento_1_btn);
        Button Movimiento2 = findViewById(R.id.movimiento_2_btn);
        Button Movimiento3 = findViewById(R.id.movimiento_3_btn);
        Button Movimiento4 = findViewById(R.id.movimiento_4_btn);
        Button Movimiento5 = findViewById(R.id.movimiento_5_btn);
        Button Movimiento6 = findViewById(R.id.movimiento_6_btn);

//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N4_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n4_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n4_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Se puede usar un botador o una superficie elevada (como un colchón plegable\n" +
                        "fabricado o un bloque de elementos/asistencia acolchonado) como superficie para entradas,\n" +
                        "pero debe retirarse lo antes posible después de que la gimnasta haya entrado.\n" +
                        "(*) Indica que el elemento puede invertirse\n" +
                        "1. ENTRADA: KIP CARPADO O CON PIERNAS SEPARADAS (0.60)\n" +
                        "Brincar con ambos pies y levantar la cadera hacia atrás y hacia arriba para sujetar la barra\n" +
                        "inferior con una toma dorsal, con las manos separadas a la altura de los hombros.\n" +
                        "Mantener una posición del cuerpo ahuecada con las piernas extendidas y la cabeza neutra.\n" +
                        "Balancear el cuerpo hacia adelante con las piernas juntas (carpada) o separadas. Al finalizar\n" +
                        "el balanceo de kip hacia adelante, las piernas están juntas y la cadera completamente\n" +
                        "extendida. Levantar rápidamente los pies a la barra y jalar la barra hacia abajo, subiendo las\n" +
                        "piernas hasta la cadera para realizar un KIP.\n" +
                        "Mientras jala hacia abajo, mover las manos hacia la parte superior de la barra para llegar a un\n" +
                        "soporte frontal con las piernas/pies delante de la barra (cuerpo ligeramente carpado), los\n" +
                        "hombros hacia adelante y la cabeza neutra. Mantener los brazos y las piernas extendidos en\n" +
                        "todo momento.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Fuerza: Requiere una fuerza considerable en brazos, hombros y core para mantener el cuerpo suspendido.\n" +
                        "Equilibrio: Mantener el equilibrio en una sola barra es más difícil que en dos.\n" +
                        "Variaciones: Existen diversas posiciones y elementos que se pueden realizar en barra inferior, cada una con sus propias dificultades.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","B_n4_m1");
                intent.putExtra("titulo", "BARRA INFERIORO");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n4_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n4_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Con los hombros ligeramente delante de la barra, inmediatamente balancear las piernas hacia\n" +
                        "atrás y hacia arriba. Empujar hacia abajo la barra, extendiéndose a través de los hombros,\n" +
                        "para levantar el cuerpo de la barra y realizar un IMPULSO A LA HORIZONTAL con las\n" +
                        "piernas juntas. Mantener una posición del cuerpo recta y ahuecada con los glúteos y los\n" +
                        "abdominales apretados, los brazos y las piernas extendidos y la cabeza neutra.\n" +
                        "Una vez completado el IMPULSO A LA HORIZONTAL, mantener la inclinación de los\n" +
                        "hombros adelante mientras se realiza un regreso controlado de la cadera a la barra.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Potencia: Requiere un impulso potente para alcanzar la posición horizontal.\n" +
                        "Control: El regreso al apoyo frontal debe ser controlado para evitar lesiones.\n" +
                        "Equilibrio: Mantener el equilibrio durante todo el movimiento es fundamental.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","B_n4_m2");
                intent.putExtra("titulo", "IMPULSO A LA HORIZONTAL Y REGRESO AL APOYO FRONTAL");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n4_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n4_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Si se realiza el IMPULSO, COLOCACIÓN DE CUCLILLAS o DE PLANTILLAS CARPADA:\n" +
                        "Realizar inmediatamente otro IMPULSO con los brazos extendidos y las piernas juntas.\n" +
                        "Flexionar las piernas (o mantener las piernas rectas) y colocar los metatarsos en la barra\n" +
                        "entre las manos en una posición agrupada (o carpada) para realizar la COLOCACIÓN DE\n" +
                        "CUCLILLAS o de PLANTILLAS CARPADA. Si se realiza la colocación de PLANTILLAS\n" +
                        "CARPADA, se permite que las piernas se flexionen después del contacto inicial con la barra\n" +
                        "para facilitar el siguiente salto a la barra superior.\n" +
                        "Si se realiza las PLANTILLAS COMPLETAS ATRÁS, la gimnasta puede utilizar una de las\n" +
                        "siguientes tres técnicas aceptables:\n" +
                        "A. INICIO DE COLOCACIÓN DE CUCLILLAS: Manteniendo la posición de los hombros\n" +
                        "hacia adelante, realizar inmediatamente un impulso con los brazos extendidos y las\n" +
                        "piernas juntas. Flexionar las piernas y colocar los metatarsos en la barra entre las\n" +
                        "manos en una posición agrupada. Estirar las piernas, hacer relevé y realizas las\n" +
                        "PLANTILLAS COMPLETAS ATRÁS.\n" +
                        "Las rodillas pueden flexionarse o permanecer extendidas en la fase del balanceo hacia\n" +
                        "arriba. Terminar el círculo con apoyo sobre los pies.\n" +
                        "B. INICIO DE COLOCACIÓN DE PLANTILLAS CARPADA: Manteniendo la posición de\n" +
                        "los hombros hacia adelante, realizar inmediatamente un impulso con los brazos\n" +
                        "extendidos y las piernas juntas. Carpar la cadera y colocar los metatarsos en la barra\n" +
                        "N4 Barras - 4\n" +
                        "entre las manos en una posición carpada. Hacer relevé y realizas las PLANTILLAS\n" +
                        "COMPLETAS ATRÁS.\n" +
                        "Las rodillas pueden flexionarse o permanecer extendidas en la fase del balanceo hacia\n" +
                        "arriba. Terminar el círculo con apoyo sobre los pies.\n" +
                        "C. INICIO TARDÍO DEL DESCENSO: Inclinar/descender/empujar los hombros hacia atrás\n" +
                        "para iniciar el círculo alrededor de la barra y mantener la tensión en todo el cuerpo\n" +
                        "mientras se empuja. La técnica para el descenso es opcional; sin embargo, debe ser un\n" +
                        "“descenso tardío”. Es aceptable utilizar una técnica de “una pierna primero” para el\n" +
                        "descenso.\n" +
                        "Cerrar el ángulo de la cadera debajo de la barra (descenso tardío) al llevar los pies\n" +
                        "dentro de los brazos para lograr una posición carpada invertida compacta con el torso\n" +
                        "redondeado en la parte de abajo del círculo. Mantener el torso redondeado con la\n" +
                        "cabeza neutra y las piernas extendidas en todo el círculo. A medida que la cadera sube\n" +
                        "(balanceo hacia arriba), cambiar las manos hacia la parte superior de la barra para\n" +
                        "realizar unas PLANTILLAS COMPLETAS ATRÁS.\n" +
                        "Las rodillas pueden flexionarse o permanecer extendidas en la fase del balanceo hacia\n" +
                        "arriba. Terminar el círculo con apoyo sobre los pies." +
                        "<Brazos>: Al finalizar la rodada, colocar la mano derecha en la cadera y levantar el brazo izquierdo hacia adelante y arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Advertencias:\n" +
                        "\n" +
                        "Flexibilidad: Requiere una buena flexibilidad en las caderas y hombros.\n" +
                        "Fuerza: Se necesita una fuerza considerable en piernas y core para mantener la posición de cuclillas.\n" +
                        "Equilibrio: Mantener el equilibrio en una posición tan cerrada es desafiante.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","B_n4_m3");
                intent.putExtra("titulo", "IMPULSO, COLOCACIÓN DE CUCLILLAS\n");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n4_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n4_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Desde la posición agrupada (o carpada) en la barra inferior, SALTAR inmediatamente hacia\n" +
                        "arriba para tomar la barra superior mientras mantiene una posición recta y ahuecada del\n" +
                        "cuerpo. Con las piernas juntas, mover el cuerpo hacia abajo, hacia adelante y hacia arriba\n" +
                        "casi a la horizontal (línea recta desde los hombros hasta los pies).\n" +
                        "Al finalizar el balanceo hacia adelante, levantar rápidamente los pies a la barra y jalar la barra\n" +
                        "hacia abajo, subiendo las piernas hasta la cadera para realizar un KIP DE SUSPENSIÓN\n" +
                        "N4 Barras - 5\n" +
                        "LARGA. Mientras jala hacia abajo, mover las manos hacia la parte superior de la barra para\n" +
                        "llegar a un soporte frontal con las piernas/pies delante de la barra (cuerpo ligeramente\n" +
                        "carpado), los hombros hacia adelante y la cabeza neutra. Mantener los brazos y las piernas\n" +
                        "extendidos en todo momento.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una coordinación precisa entre brazos y piernas.\n" +
                        "Fuerza: Se necesita una fuerza explosiva para realizar el salto.\n" +
                        "Equilibrio: Mantener el equilibrio durante la suspensión larga es fundamental.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","B_n4_m4");
                intent.putExtra("titulo", "SALTO A KIP DE SUSPENSIÓN LARGA\n");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n4_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n4_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Con los hombros ligeramente delante de la barra, inmediatamente balancear las piernas hacia\n" +
                        "atrás y hacia arriba. Empujar hacia abajo la barra, extendiéndose a través de los hombros,\n" +
                        "para levantar el cuerpo de la barra y realizar un IMPULSO A LA HORIZONTAL con las\n" +
                        "piernas juntas.\n" +
                        "Mantener una posición del cuerpo recta y ahuecada con los glúteos y los abdominales\n" +
                        "apretados, los brazos y las piernas extendidos y la cabeza neutra.");
                intent.putExtra("informacion_ayuda", "Potencia: Requiere un impulso aún más potente que el movimiento anterior.\n" +
                        "Altura: La altura del impulso puede variar dependiendo del siguiente elemento.\n" +
                        "Control: El cuerpo debe estar completamente extendido en la posición horizontal.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","B_n4_m5");
                intent.putExtra("titulo", "IMPULSO A LA HORIZONTAL");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n4_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n4_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Antes de que la cadera regrese a la barra, inclinar los hombros hacia atrás y hacer que el\n" +
                        "cuerpo haga un círculo hacia atrás alrededor de la barra con una posición del cuerpo recta y\n" +
                        "ahuecada para realizar una VUELTA ATRÁS.\n" +
                        "Mientras se mantiene los brazos y piernas extendidos en todo momento, mover las manos\n" +
                        "hacia la parte superior de la barra para pasar por un apoyo frontal extendido momentáneo.\n" +
                        "Mantener la posición neutra de la cabeza en todo momento");
                intent.putExtra("informacion_ayuda", "Dificultad: Las vueltas atrás en nivel 4 suelen ser más complejas y pueden incluir giros adicionales.\n" +
                        "Rotación: La rotación debe ser completa y controlada.\n" +
                        "Equilibrio: Mantener el equilibrio durante la rotación es fundamental.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","B_n4_m6");
                intent.putExtra("titulo", "VUELTA ATRÁS");
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
