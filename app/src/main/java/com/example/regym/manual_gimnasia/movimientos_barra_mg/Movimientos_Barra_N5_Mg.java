package com.example.regym.manual_gimnasia.movimientos_barra_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Barra_N5_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_barra_n5_mg);

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
        Button Movimiento7 = findViewById(R.id.movimiento_7_btn);
        Button Movimiento8 = findViewById(R.id.movimiento_8_btn);
        Button Movimiento9 = findViewById(R.id.movimiento_9_btn);
        Button Movimiento10 = findViewById(R.id.movimiento_10_btn);
        Button Movimiento11 = findViewById(R.id.movimiento_11_btn);
        Button Movimiento12 = findViewById(R.id.movimiento_12_btn);
        Button Movimiento13 = findViewById(R.id.movimiento_13_btn);
        Button Movimiento14 = findViewById(R.id.movimiento_14_btn);
        Button Movimiento15 = findViewById(R.id.movimiento_15_btn);

//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Parada con los pies juntos, por fuera de las barras, mirando hacia la\n" +
                        "barra inferior. Se puede usar un botador o una superficie elevada (como un colchón plegable\n" +
                        "fabricado o un bloque de elementos/asistencia acolchonado) como superficie para entradas,\n" +
                        "pero debe retirarse lo antes posible después de que la gimnasta haya entrado.\n" +
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
                intent.putExtra("informacion_ayuda", "Variedad: Existen diversas posiciones iniciales, cada una con sus propias particularidades.\n" +
                        "Equilibrio: La posición inicial debe ser estable y equilibrada.\n" +
                        "Fuerza: Se requiere fuerza en brazos, hombros y core para mantener la posición.\n");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m1");
                intent.putExtra("titulo", "POSICION INICIAL");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Con los hombros ligeramente delante de la barra, inmediatamente balancear las piernas hacia\n" +
                        "atrás y hacia arriba. Empujar hacia abajo la barra, extendiéndose a través de los hombros,\n" +
                        "para levantar el cuerpo de la barra y realizar un IMPULSO POR ARRIBA DE LA\n" +
                        "HORIZONTAL con las piernas juntas. El impulso también se puede realizar con una técnica\n" +
                        "de doblar la cadera con las piernas separadas para lograr el ángulo completo.\n" +
                        "Independientemente de la técnica elegida para realizar el impulso, la gimnasta debe mostrar\n" +
                        "una posición recta y ahuecada del cuerpo con los glúteos y abdominales apretados, los\n" +
                        "brazos y piernas extendidos y la cabeza neutra con las piernas cerradas al completar el\n" +
                        "ángulo logrado.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Potencia: Requiere un impulso extremadamente potente.\n" +
                        "Altura: La altura del impulso es crucial para los elementos siguientes.\n" +
                        "Control: El cuerpo debe estar completamente extendido en la posición horizontal.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m2");
                intent.putExtra("titulo", "IMPULSO POR ARRIBA DE LA HORIZONTAL");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Inclinar/descender/empujar los hombros hacia atrás para iniciar el círculo alrededor de la barra\n" +
                        "y mantener la tensión en todo el cuerpo mientras se empuja. Empujar la barra hacia la parte\n" +
                        "inferior de los muslos mientras que se continúa con el círculo. Mantener una posición\n" +
                        "ahuecada del cuerpo con la cabeza neutra durante todo el círculo. Es aceptable que los\n" +
                        "muslos rocen ligeramente la barra en la fase del balanceo hacia arriba del círculo. A medida\n" +
                        "que la cadera se eleva, jalar la barra abriendo ligeramente el ángulo de los hombros. Mover\n" +
                        "las manos hacia la parte superior de la barra para realizar una VUELTA DE APOYO LIBRE,\n" +
                        "que termine en apoyo libre con el cuerpo extendido a mínimo por ARRIBA DE LA\n" +
                        "HORIZONTAL y los hombros ligeramente inclinados hacia adelante sobre la barra. Mantener\n" +
                        "los brazos y las piernas extendidos en todo momento.\n" +
                        "Nota: el ángulo alcanzado se determina mediante una línea trazada desde los hombros hasta\n" +
                        "el punto medio de la parte del cuerpo más abajo (abdomen, cadera, rodillas o pies) cuando el\n" +
                        "cuerpo alcanza una posición de apoyo libre con las manos desplazadas hacia la parte\n" +
                        "superior de la barra y la cadera separada de la barra.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Dificultad: Es un elemento muy complejo que requiere una gran coordinación y fuerza.\n" +
                        "Rotación: La rotación debe ser completa y controlada.\n" +
                        "Equilibrio: Mantener el equilibrio durante la rotación es fundamental.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m3");
                intent.putExtra("titulo", "VUELTA DE APOYO LIBRE POR ARRIBA DE LA HORIZONTAL\n");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Si se realiza las PLANTILLAS COMPLETAS ATRÁS AL APOYO LIBRE, la gimnasta puede\n" +
                        "utilizar una de las tres técnicas de entrada aceptables:\n" +
                        "A. Después del impulso, empujar los hombros para abrirlos mientras se llevan los pies a la\n" +
                        "barra y se inicia el círculo. En el balanceo hacia abajo, colocar los metatarsos en la\n" +
                        "barra (al final del primer cuarto o al comienzo del segundo cuarto del balanceo) entre\n" +
                        "las manos en una posición carpada O al lado de las manos, fuera de las mismas en\n" +
                        "una posición con piernas ligeramente separadas. Mantener las piernas extendidas, con\n" +
                        "la cabeza neutra durante todo el círculo. A medida que la cadera sube (balanceo hacia\n" +
                        "arriba), jalar la barra para abrir el ángulo de los hombros y quitar los pies de la barra\n" +
                        "antes del apoyo libre. Mover las manos hacia la parte superior de la barra para realizar\n" +
                        "unas PLANTILLAS COMPLETAS ATRÁS AL APOYO LIBRE.\n" +
                        "N5 Barras - 5\n" +
                        "B. Después del impulso, iniciar el balanceo hacia abajo antes de separar las piernas. Una\n" +
                        "vez empezado el balanceo hacia abajo, separar las piernas y colocar el metatarso de\n" +
                        "un pie en la barra (en el primer cuarto del balanceo), entre las manos, y continuar el\n" +
                        "descenso/círculo. Colocar el metatarso del segundo pie en la barra, entre las manos,\n" +
                        "en el balanceo hacia abajo dentro del segundo cuarto del balanceo. Mantener las\n" +
                        "piernas extendidas, con la cabeza neutra durante todo el círculo. A medida que la\n" +
                        "cadera sube (balanceo hacia arriba), jalar la barra para abrir el ángulo de los hombros y\n" +
                        "quitar los pies de la barra antes del apoyo libre. Mover las manos hacia la parte\n" +
                        "superior de la barra para realizar unas PLANTILLAS COMPLETAS ATRÁS AL\n" +
                        "APOYO LIBRE.\n" +
                        "C. Después del impulso, iniciar un ligero arco apretado en el torso y la cadera, con los\n" +
                        "hombros ligeramente cerrados en el balanceo hacia abajo. Empujar con fuerza el\n" +
                        "cuerpo hacia atrás mientras simultáneamente cierra “de golpe” los metatarsos en la\n" +
                        "barra (al final del primer cuarto o al comienzo del segundo cuarto del balanceo) entre\n" +
                        "las manos en una posición carpada O al lado de las manos, fuera de las mismas en\n" +
                        "una posición con piernas ligeramente separadas. Mantener las piernas extendidas, con\n" +
                        "la cabeza neutra durante todo el círculo. A medida que la cadera sube (balanceo hacia\n" +
                        "arriba), jalar la barra para abrir el ángulo de los hombros y quitar los pies de la barra\n" +
                        "antes del apoyo libre. Mover las manos hacia la parte superior de la barra para realizar\n" +
                        "unas PLANTILLAS COMPLETAS ATRÁS AL APOYO LIBRE.\n" +
                        "Nota: El ángulo alcanzado se determina mediante una línea trazada desde los hombros hasta\n" +
                        "la cadera cuando el cuerpo alcanza una posición de apoyo libre con las manos\n" +
                        "desplazadas hacia la parte superior de la barra y los pies separados de la barra. No se\n" +
                        "requiere que la gimnasta abra el ángulo de la cadera al completar el círculo.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere una gran flexibilidad en las caderas y hombros.\n" +
                        "Fuerza: Se necesita una fuerza considerable en piernas y core.\n" +
                        "Coordinación: La coordinación entre brazos y piernas es esencial.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m4");
                intent.putExtra("titulo", "PLANTILLAS COMPLETAS ATRÁS AL APOYO LIBRE\n");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Si se realiza un STALDER ATRÁS AL APOYO LIBRE, la técnica de entrada es opcional. La\n" +
                        "gimnasta puede utilizar la técnica de “descenso” que se muestra en las PLANTILLAS\n" +
                        "COMPETAS ATRÁS AL APOYO LIBRE pero sin los pies en la barra.\n" +
                        "Después del impulso, empujar los hombros para abrirlos mientras se llevan los pies hacia la\n" +
                        "barra para iniciar el círculo alrededor de la barra. Cerrar el ángulo de la cadera en el balanceo\n" +
                        "hacia abajo al llevar los pies por fuera de los brazos para lograr una posición con piernas\n" +
                        "separadas invertida y compacta, con el torso redondeado en la parte de abajo del círculo.\n" +
                        "Mantener el torso redondeado con la cabeza neutra en todo el círculo. A medida que la cadera\n" +
                        "se eleva (balanceo hacia arriba), jalar la barra abriendo ligeramente el ángulo de los hombros.\n" +
                        "Mover las manos hacia la parte superior de la barra para realizar un STALDER ATRÁS AL\n" +
                        "APOYO LIBRE.\n" +
                        "Las piernas deben permanecer extendidas durante todo el elemento, pero la posición de las\n" +
                        "piernas en relación con el cuerpo al final del círculo es opcional (carpada, piernas abiertas o\n" +
                        "cadera abierta).");
                intent.putExtra("informacion_ayuda", "Dificultad: Es un elemento muy avanzado que requiere una gran fuerza y técnica.\n" +
                        "Posición: Mantener la posición de stalder requiere una gran fuerza en los brazos.\n" +
                        "Equilibrio: El equilibrio es crucial durante todo el movimiento.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m5");
                intent.putExtra("titulo", "STALDER ATRÁS AL APOYO LIBRE");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Al finalizar el círculo, empuje la barra hacia afuera y continuar abriendo el ángulo de los\n" +
                        "hombros y carpar la cadera para realizar un balanceo de kip al frente con las piernas juntas\n" +
                        "(carpado) o con piernas separadas. Al finalizar el balanceo de kip hacia adelante, las piernas\n" +
                        "están juntas y la cadera completamente extendida. Levantar rápidamente los pies a la barra y\n" +
                        "jalar la barra hacia abajo, subiendo las piernas hasta la cadera para realizar un KIP.\n" +
                        "Mientras jala hacia abajo, mover las manos hacia la parte superior de la barra para llegar a un\n" +
                        "soporte frontal con las piernas/pies delante de la barra (cuerpo ligeramente carpado), los\n" +
                        "hombros hacia adelante y la cabeza neutra. Mantener los brazos y las piernas extendidos en\n" +
                        "todo momento.");
                intent.putExtra("informacion_ayuda", "Variedad: Existen diferentes tipos de kip, cada uno con sus propias dificultades.\n" +
                        "Coordinación: La coordinación entre brazos y piernas es esencial.\n" +
                        "Fuerza: Se necesita una fuerza explosiva para realizar el kip.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m6");
                intent.putExtra("titulo", "KIP CARPADO O CON PIERNAS SEPARADAS\n");
                startActivity(intent);
            }
        });

//Boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m7_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m7);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Si se realiza el IMPULSO, COLOCACIÓN DE CUCLILLAS o DE PLANTILLAS CARPADA:\n" +
                        "Realizar inmediatamente un IMPULSO con los brazos extendidos y las piernas juntas.\n" +
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
                        "entre las manos en una posición carpada. Hacer relevé y realizas las PLANTILLAS\n" +
                        "COMPLETAS ATRÁS.\n" +
                        "N5 Barras - 9\n" +
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
                        "arriba. Terminar el círculo con apoyo sobre los pies.");
                intent.putExtra("informacion_ayuda", "En este movimiento se recomienda trabajar sobre una linea recta al momento de realizar la vuelta de carro, asi como ayudarse con un colchon al momento de poner las manos, esto para que facilite a la gimnasta la realización del ejercicio correctamente");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m7");
                intent.putExtra("titulo", "IMPULSO, COLOCACIÓN DE CUCLILLAS");
                startActivity(intent);
            }
        });

//Boton Movimiento8
        Movimiento8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m8_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m8);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Desde la posición agrupada (o carpada) en la barra inferior SALTAR inmediatamente hacia\n" +
                        "arriba para tomar la barra superior mientras mantiene una posición recta y ahuecada del\n" +
                        "cuerpo. Con las piernas juntas, mover el cuerpo hacia abajo, hacia adelante y hacia arriba\n" +
                        "casi a la horizontal (línea recta desde los hombros hasta los pies).\n" +
                        "Al finalizar el balanceo hacia adelante, levantar rápidamente los pies a la barra y jalar la barra\n" +
                        "hacia abajo, subiendo las piernas hasta la cadera para realizar un KIP DE SUSPENSIÓN\n" +
                        "LARGA. Mientras jala hacia abajo, mover las manos hacia la parte superior de la barra para\n" +
                        "llegar a un soporte frontal con las piernas/pies delante de la barra (cuerpo ligeramente\n" +
                        "N5 Barras - 10\n" +
                        "carpado), los hombros hacia adelante y la cabeza neutra. Mantener los brazos y las piernas\n" +
                        "extendidos en todo momento.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "En este movimiento se recomienda trabajar sobre una linea recta al momento de realizar la vuelta de carro, asi como ayudarse con un colchon al momento de poner las manos, esto para que facilite a la gimnasta la realización del ejercicio correctamente");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m8");
                intent.putExtra("titulo", "SALTO A KIP DE SUSPENSIÓN LARGA");
                startActivity(intent);
            }

        });

        //Boton Movimiento9
        Movimiento9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m9_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m9);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Con los hombros ligeramente delante de la barra, inmediatamente balancear las piernas hacia\n" +
                        "atrás y hacia arriba. Empujar hacia abajo la barra, extendiéndose a través de los hombros,\n" +
                        "para levantar el cuerpo de la barra y realizar un IMPULSO POR ARRIBA DE LA\n" +
                        "HORIZONTAL con las piernas juntas. El impulso también se puede realizar con una técnica\n" +
                        "de doblar la cadera con las piernas separadas para lograr el ángulo completo.\n" +
                        "Independientemente de la técnica elegida para realizar el impulso, la gimnasta debe mostrar\n" +
                        "una posición recta y ahuecada del cuerpo con los glúteos y abdominales apretados, los\n" +
                        "brazos y piernas extendidos y la cabeza neutra con las piernas cerradas al completar el\n" +
                        "ángulo logrado.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Riesgo de sobreextensión: Un impulso excesivamente fuerte puede llevar a una sobreextensión de los hombros, lo que puede causar lesiones.\n" +
                        "Dificultad para controlar la altura: Es difícil controlar la altura exacta del impulso, lo que puede afectar la ejecución de los elementos siguientes.\n" +
                        "Caída: Si el impulso no es suficiente, la gimnasta puede caerse de la barra.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m9");
                intent.putExtra("titulo", "IMPULSO POR ARRIBA DE LA HORIZONTAL");
                startActivity(intent);
            }

        });
        //Boton Movimiento10
        Movimiento10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m10_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m10);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Abrir el ángulo de los hombros para empujar hacia atrás, mientras se mantiene una posición\n" +
                        "ahuecada del cuerpo a medida que empieza el balanceo hacia abajo y hacia enfrente. En\n" +
                        "cualquier momento durante el balanceo hacia abajo, relajar la posición ahuecada del cuerpo y\n" +
                        "formar un ligero arco.\n" +
                        "Mantener esta posición por la vertical (por debajo de la barra) y patear agresivamente hacia\n" +
                        "adelante y hacia arriba por encima de la barra superior. La cabeza permanece neutra. A\n" +
                        "medida que la cadera se levanta por encima de la barra, mantener la toma dorsal y mover las\n" +
                        "manos hacia la parte superior de la barra para realizar un MEDIO GIGANTE AL APOYO.\n" +
                        "Pasar por una fase de apoyo con la cadera tocando la barra o separada de la misma, y\n" +
                        "mantener los brazos y las piernas extendidos en todo momento.\n" +
                        "Nota: No hay deducciones si la gimnasta añade una vuelta atrás al final del MEDIO\n" +
                        "GIGANTE AL APOYO.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Dificultad: Es un elemento muy avanzado que requiere una gran fuerza y técnica.\n" +
                        "Rotación: La rotación debe ser precisa y controlada.\n" +
                        "Equilibrio: Mantener el equilibrio durante la rotación es fundamental.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m10");
                intent.putExtra("titulo", "MEDIO GIGANTE AL APOYO");
                startActivity(intent);
            }

        });
        //Boton Movimiento11
        Movimiento11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m11_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m11);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Presionar inmediatamente la barra hacia abajo para hacer contacto de la parte media a la parte\n" +
                        "inferior de los muslos, mientras se mantiene la cabeza neutra, el pecho y el torso ahuecados y\n" +
                        "los brazos extendidos. Mantener esta posición mientras se inclina los hombros hacia atrás y se\n" +
                        "hace un círculo en la barra con la cadera alejada de la misma. Un ligero toque de los muslos\n" +
                        "con la barra es aceptable. A medida que la cadera se eleva, abrir completamente el ángulo de\n" +
                        "los hombros mientras se empuja la barra hacia atrás para realizar el SUB BALANCEO.\n" +
                        "Mantener una posición del cuerpo recta y ahuecada con los brazos y las piernas extendidos y\n" +
                        "la cabeza neutra en todo momento. Se debe poner más atención en la posición correcta del\n" +
                        "cuerpo que en la altura del SUB BALANCEO.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Equilibrio: Mantener el equilibrio durante el balanceo es fundamental.\n" +
                        "Coordinación: La coordinación entre brazos y piernas es esencial.\n" +
                        "Fuerza: Se necesita fuerza en los brazos y core para controlar el balanceo.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m11");
                intent.putExtra("titulo", "SUB BALANCEO, PRIMER CONTRABALANCEO");
                startActivity(intent);
            }

        });
        //Boton Movimiento12
        Movimiento12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m12_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m12);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Seguir empujando la barra hacia atrás. Realizar el balanceo hacia abajo, con una ligera guía\n" +
                        "de los talones para realizar un CONTRABALANCEO. Mantener esta ligera guía de talones a\n" +
                        "través de la vertical (por debajo de la barra), en donde el cuerpo se acorta al jalar hacia abajo\n" +
                        "de la barra y levantar la cadera hacia atrás y hacia arriba hasta una posición ahuecada del\n" +
                        "cuerpo con las piernas juntas. La cadera se eleva a un mínimo de 15° por debajo del nivel\n" +
                        "de la barra superior (horizontal) con los pies apuntando hacia abajo.\n" +
                        "N5 Barras - 13\n" +
                        "La técnica prevista es mostrar una posición de pecho ahuecado con un ángulo de cadera\n" +
                        "redondeado. La cadera no se debe abrir a una posición extendida o arqueada con los pies\n" +
                        "sobre la barra inferior y los dedos apuntando hacia arriba por encima de la horizontal durante\n" +
                        "el CONTRABALANCEO. La cabeza permanece neutra entre los brazos, con el pecho\n" +
                        "ahuecado. Las piernas permanecen juntas con los pies apuntados hacia abajo.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Pérdida de equilibrio: Un pequeño error en la ejecución puede provocar una pérdida de equilibrio y una caída.\n" +
                        "Lesiones en las muñecas: Si el contrabalanceo se realiza de manera brusca, puede causar lesiones en las muñecas.\n" +
                        "Dificultad para controlar la amplitud: Es difícil controlar la amplitud del balanceo, lo que puede dificultar la ejecución de los elementos siguientes.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m12");
                intent.putExtra("titulo", "PRIMER CONTRABALANCEO");
                startActivity(intent);
            }

        });
        //Boton Movimiento13
        Movimiento13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m13_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m13);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Mantener la posición ahuecada del cuerpo mientras éste comienza el balanceo hacia abajo y\n" +
                        "hacia adelante. Se permite que las piernas permanezcan juntas o se separen en el balanceo\n" +
                        "hacia abajo. En cualquier momento durante el balanceo hacia abajo, relajar la posición\n" +
                        "ahuecada del cuerpo y formar un ligero arco.\n" +
                        "Mantener esta posición a través de la parte de abajo (por debajo de la barra superior) y patear\n" +
                        "agresivamente hacia adelante y hacia arriba con las piernas/pies juntos para realizar un\n" +
                        "BALANCEO AL FRENTE con posición del cuerpo recta y ahuecada, terminar con los pies al\n" +
                        "nivel de la barra superior.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Dirección: El balanceo cambia de dirección, lo que requiere una adaptación.\n" +
                        "Equilibrio: Mantener el equilibrio durante el cambio de dirección es desafiante.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m13");
                intent.putExtra("titulo", "BALANCEO AL FRENTE, SEGUNDO CONTRABALANCEO");
                startActivity(intent);
            }

        });
        //Boton Movimiento14
        Movimiento14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m14_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m14);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Realizar un segundo CONTRABALANCEO (ver #9) con la cadera que se eleva a un mínimo\n" +
                        "de 15° por debajo del nivel de la barra superior (horizontal) y los pies apuntando hacia\n" +
                        "abajo.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una coordinación extremadamente precisa entre brazos, piernas y cuerpo para ejecutar la salida Flyaway en el momento exacto.\n" +
                        "Fuerza explosiva: La salida Flyaway demanda una gran fuerza explosiva en las piernas para despegar del balanceo.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m14");
                intent.putExtra("titulo", "SEGUNDO CONTRABALANCEO");
                startActivity(intent);
            }

        });
        //Boton Movimiento15
        Movimiento15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m15_n5_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n5_m15);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Mantener la posición ahuecada del cuerpo mientras éste comienza el balanceo hacia abajo y\n" +
                        "hacia adelante. Se permite que las piernas permanezcan juntas o se separen en el balanceo\n" +
                        "hacia abajo. En cualquier momento durante el balanceo hacia abajo, relajar la posición\n" +
                        "ahuecada del cuerpo y formar un ligero arco.\n" +
                        "Mantener el ligero arco a través de la parte de abajo (por debajo de la barra superior) y patear\n" +
                        "agresivamente hacia adelante y hacia arriba con las piernas/pies juntos hasta una posición\n" +
                        "recta y ahuecada del cuerpo con la cabeza neutra, con enfoque en los dedos de los pies.\n" +
                        "N5 Barras - 15\n" +
                        "A medida que los pies se acercan al nivel de la barra superior, soltar la barra con un ángulo de\n" +
                        "hombros abierto, manteniendo una posición neutra de la cabeza. El cuerpo continúa\n" +
                        "elevándose para realizar una SALIDA DE FLYAWAY, con el mortal realizado mínimo a la\n" +
                        "altura de la barra superior en una POSICIÓN AGRUPADA, CARPADA O EXTENDIDA.\n" +
                        "Si se realiza un FLYAWAY AGRUPADO O CARPADO, extender la cadera (y las rodillas para\n" +
                        "el agrupado) rápidamente para prepararse para el aterrizaje. Si se realiza un FLYAWAY\n" +
                        "EXTENDIDO, mantener una posición recta y ahuecada del cuerpo en todo momento. Aterrizar\n" +
                        "en demi-plié en posición controlada y equilibrada (“plantada”).\n" +
                        "Brazos: Opcionales al aterrizar.\n" +
                        "Estirar las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Levantar hacia al frente-arriba a una posición alta.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Complejidad: Combina varios elementos y requiere una gran habilidad.\n" +
                        "Coordinación: La coordinación entre todos los movimientos es esencial.\n" +
                        "Fuerza: Se necesita una fuerza explosiva para realizar la salida.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=N8ZK3yVE5NY&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDU%3D\n");
                intent.putExtra("mov","B_n5_m15");
                intent.putExtra("titulo", "BALANCEO AL FRENTE A SALIDA DE FLYAWAY");
                startActivity(intent);
            }

        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
