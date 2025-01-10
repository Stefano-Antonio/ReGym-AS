package com.example.regym.manual_gimnasia.movimientos_piso_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Piso_N2_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_piso_n2_mg);

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

//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N2_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n2_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n2_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Desde la posición inicial recta de pie, hacer demi-plié con ambas piernas. Contraer ligeramente\n" +
                        "los abdominales e inclinar el torso ligeramente hacia adelante.\n" +
                        "Brazos: Mover ambos brazos hacia adelante y arriba para terminar con ambos brazos\n" +
                        "flexionados hacia adelante y en medio con las palmas hacia afuera.\n" +
                        "Enfoque: Abajo.\n" +
                        "Estirar el torso y las piernas hasta una posición recta de pie.\n" +
                        "Brazos: Abrir ambos brazos a los lados-en medio.\n" +
                        "Enfoque: Al frente.\n" +
                        "Si se invierte la (*) INVERSIÓN LATERAL, apuntar el pie izquierdo adelante.\n" +
                        "izquierda\n" +
                        "Apuntar el pie derecho adelante en el suelo.\n" +
                        "Brazos: Levantar ambos brazos hacia los lados-arriba hasta completamente arriba.\n" +
                        "Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada de\n" +
                        "tipo escalador” (figura 3) con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo para colocar la mano derecha de lado\n" +
                        "sobre el suelo mientras el cuerpo gira 90° a la izquierda. Continuar para levantar la pierna\n" +
                        "izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar la mano izquierda en el suelo de lado o ligeramente hacia adentro (las manos\n" +
                        "separadas al ancho de los hombros) mientras la pierna derecha empuja fuera del suelo para\n" +
                        "realizar una INVERSIÓN LATERAL a la derecha.\n" +
                        "La cabeza permanece alineada, con el ángulo de los hombros y el de la cadera abiertos, y el\n" +
                        "enfoque por debajo del brazo izquierdo para ver el suelo en el descenso.\n" +
                        "Girar 90° hacia adentro para descender con la izquierda mientras mantiene los brazos\n" +
                        "cubriendo las orejas para terminar con la pierna izquierda extendida (o ligeramente flexionada)\n" +
                        "y cerrar inmediatamente el pie derecho al lado del pie izquierdo para terminar recta de pie (en\n" +
                        "planta o en relevé).\n" +
                        "Brazos: Permanecen arriba en todo momento y cuando se hace el descenso.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Equilibrio: Requiere un gran equilibrio y control corporal.\n" +
                        "Flexibilidad: Es necesaria una buena flexibilidad en la espalda y hombros.\n" +
                        "Fuerza: Se necesita fuerza en el core para mantener la posición.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hIsMBFly4rU&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMg%3D%3D\n");
                intent.putExtra("mov","P_n1_m1");
                intent.putExtra("titulo", "Pose, (*) INVERSIÓN LATERAL");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n2_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n2_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Doblar las rodillas para llegar a una posición en cuclillas, manteniendo los pies en el suelo.\n" +
                        "Empezar a rodar hacia atrás con la cabeza metida, la barbilla contra el pecho. Con los brazos\n" +
                        "extendidos y las manos hacia adentro, estirarse hacia atrás para colocar los lados de los\n" +
                        "dedos meñiques en el suelo detrás de la cabeza a un ancho no mayor que el ancho de los\n" +
                        "hombros y realizar una RODADA ATRÁS A POSICIÓN DE LAGARTIJA (mantener una\n" +
                        "posición recta y ahuecada del cuerpo) con las piernas juntas y los metatarsos en el suelo.\n" +
                        "Brazos: Permanecen arriba. No se permite entrelazar los dedos.\n" +
                        "Deslizar los pies hacia adelante mientras se flexionan simultáneamente las rodillas para llegar\n" +
                        "a una posición sentada-arrodillada con los glúteos apoyados en los talones.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba a la corona.\n" +
                        "Inmediatamente levantar los glúteos de los talones, extender la cadera y levantar la pierna\n" +
                        "derecha hacia adelante para colocar el pie derecho en el suelo girado hacia afuera en una\n" +
                        "pose ½ arrodillada con el tobillo derecho alineado frente a la rodilla derecha con toda la\n" +
                        "cadera cuadrada hacia adelante.\n" +
                        "Estirar ambas piernas y cerrar el pie izquierdo junto al pie derecho para llegar a parada.\n" +
                        "N2 Suelo - 4\n" +
                        "Brazos: Hacer un círculo con ambos brazos hacia los lados o hacia atrás y abajo. En la parte\n" +
                        "inferior del círculo, colocar la mano derecha en la cadera. Continuar el círculo con el brazo\n" +
                        "izquierdo hacia al frente-arriba a la corona.\n" +
                        "Enfoque: Opcional.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Equilibrio: Requiere un gran equilibrio y control corporal.\n" +
                        "Flexibilidad: Es necesaria una buena flexibilidad en la espalda y hombros.\n" +
                        "Fuerza: Se necesita fuerza en el core para mantener la posición.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hIsMBFly4rU&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMg%3D%3D\n");
                intent.putExtra("mov","P_n1_m2");
                intent.putExtra("titulo", "RODADA ATRÁS A POSICIÓN DE LAGARTIJA");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n2_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n2_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Si se invierte el ½ (180°) GIRO EN PASSÉ AL FRENTE (GIRO DE PRESIÓN DE TALÓN),\n" +
                        "dar un paso adelante con la pierna izquierda. Además, invertir el recorrido de los brazos en\n" +
                        "preparación para el giro.\n" +
                        "Dar un paso hacia adelante sobre la pierna derecha extendida con el pie derecho ligeramente\n" +
                        "girado hacia afuera (no en relevé). Flexionar la rodilla izquierda hacia adelante junto con el pie\n" +
                        "izquierdo en punta hacia adelante para tocar la rodilla derecha y realizar la pose de passé al\n" +
                        "frente. Marcar esta posición.\n" +
                        "Brazos: Levantar el brazo derecho hacia curvado adelante en medio. Bajar el brazo izquierdo\n" +
                        "hacia abajo o hacia el lado en medio.\n" +
                        "Empujar el suelo hacia abajo con el pie derecho para extender el tobillo derecho y llegar a una\n" +
                        "posición de relevé. Inmediatamente bajar el talón derecho de regreso al suelo.\n" +
                        "Brazos: El brazo izquierdo permanece al lado-en medio. El brazo derecho permanece\n" +
                        "curvado adelante en medio.\n" +
                        "Empujar el suelo hacia abajo (comenzar a hacer un relevé en el metatarso del pie derecho) y\n" +
                        "comenzar a “presionar” el talón alrededor para realizar un ½ (180°) GIRO EN PASSÉ AL\n" +
                        "FRENTE (GIRO DE PRESIÓN DE TALÓN) hacia la derecha.\n" +
                        "Incrementar el relevé a lo largo de la vuelta para terminar el giro en relevé completo. Al\n" +
                        "terminar el giro, inmediatamente bajar el talón derecho de regreso al suelo.\n" +
                        "Brazos: Inician el giro al cerrar el brazo izquierdo hacia adelante en medio pero curvado.\n" +
                        "Mantener el curvado adelante-en medio en todo el giro.\n" +
                        "Dar un paso hacia adelante con la izquierda y cerrar el pie derecho detrás del pie izquierdo en\n" +
                        "un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: En el paso con la izquierda, abrir ambos brazos hacia los lados-en medio. A medida\n" +
                        "que el pie derecho se cierra, mover los brazos hacia adelante, cruzando/envolviéndolos\n" +
                        "frente al cuerpo para tocar los hombros opuestos con las manos (abrazo).");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Equilibrio: Requiere un gran equilibrio sobre una pierna.\n" +
                        "Flexibilidad: Es necesaria una buena flexibilidad en la pierna de apoyo y en la pierna que se lleva al frente.\n" +
                        "Posición: La posición de la pelvis y los hombros debe ser correcta para mantener el equilibrio.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hIsMBFly4rU&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMg%3D%3D\n");
                intent.putExtra("mov","P_n1_m3");
                intent.putExtra("titulo", "Pose DE PASSÉ AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n2_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n2_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Bajar el talón derecho al suelo y mover el pie izquierdo hacia adelante a través de una 1ra\n" +
                        "posición girada para apuntar al suelo.\n" +
                        "Brazos: Abrir ambos brazos a los lados-en medio.\n" +
                        "Dar un paso adelante con el pie izquierdo (ligeramente girado) a través de la 4ta posición en\n" +
                        "demi-plié. Empujar el suelo con ambos pies para realizar un CHASSÉ AL FRENTE, cerrando\n" +
                        "el pie derecho detrás del pie izquierdo en el aire (5ta posición apretada). Aterrizar en demi-plié\n" +
                        "en la pierna derecha con el pie derecho ligeramente girado. La pierna izquierda permanece al\n" +
                        "frente, apuntando hacia el suelo.\n" +
                        "BRAZOS: Permanecen a los lados-en medio.\n" +
                        "Dar un paso largo (o carrera con la pierna extendida) con el pie izquierdo en demi-plié,\n" +
                        "después balancear la pierna derecha extendida hacia adelante y arriba hasta la horizontal y\n" +
                        "empujar el suelo con la pierna izquierda. Balancear la pierna izquierda hacia atrás-arriba para\n" +
                        "realizar un SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS con un mínimo 60° de\n" +
                        "separación uniforme de piernas en el vuelo.\n" +
                        "Aterrizar sobre la pierna derecha en demi-plié con la pierna izquierda extendida hacia atrás y\n" +
                        "ligeramente girada hacia afuera al pasar por una posición de arabesca baja. El enfoque está\n" +
                        "en la alineación del cuerpo y la altura del salto leap split.\n" +
                        "Brazos: Abajo en el paso. Durante y en el aterrizaje del SALTO LEAP SPLIT CON PIERNAS\n" +
                        "EXTENDIDAS, usar una de las tres posiciones de brazos aceptables para los saltos leap split\n" +
                        "mostradas en el Glosario.\n" +
                        "Revisado el 12 de junio, 2021\n" +
                        "N2 Suelo - 6\n" +
                        "Dar un paso adelante con la pierna izquierda en demi-plié. Inmediatamente extender la pierna\n" +
                        "izquierda para pararse con la pierna derecha extendida hacia atrás y ligeramente girada, y el\n" +
                        "pie derecho apuntado en el suelo para realizar una pose.\n" +
                        "Brazos: Bajar hacia los lados-abajo, hacia adelante y arriba para terminar hacia adelante-en\n" +
                        "medio con los brazos cruzados a la altura de las muñecas.\n" +
                        "Enfoque: Al frente.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una coordinación precisa entre los pies.\n" +
                        "Ritmo: El chassé debe realizarse con un ritmo constante.\n" +
                        "Altura: La altura del salto puede variar según el nivel de dificultad.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hIsMBFly4rU&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMg%3D%3D\n");
                intent.putExtra("mov","P_n1_m4");
                intent.putExtra("titulo", "CHASSÉ AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n2_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n2_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Cerrar el pie derecho al lado del izquierdo para terminar con ambos pies uno al lado del otro\n" +
                        "(pies en planta).\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba a la corona.\n" +
                        "Hacer demi-plié con ambas piernas. Empujar el suelo, extendiendo las piernas a través de la\n" +
                        "cadera, rodillas, tobillos y dedos de los pies para realizar un SALTO JUMP SPLIT con una\n" +
                        "separación uniforme de piernas a mínimo 60° con la pierna derecha adelante y la pierna\n" +
                        "izquierda atrás.\n" +
                        "Aterrizar con ambos pies uno al lado del otro en demi-plié, presionando a través de los\n" +
                        "metatarsos para bajar los talones al suelo O aterrizar con los talones ligeramente separados\n" +
                        "del suelo.\n" +
                        "Brazos: Durante el plié, bajar los brazos hacia los lados-abajo o hasta completamente abajo.\n" +
                        "Durante el SALTO JUMP SPLIT, levantar ambos brazos hacia los lados-arriba o a los ladosen\n" +
                        "medio. Bajar ambos brazos hacia los lados-abajo hasta completamente abajo en el\n" +
                        "aterrizaje.\n" +
                        "Estirar ambas piernas hasta una posición recta de pie.\n" +
                        "Brazos: Levantar ambos brazos a los lados-arriba para terminar en diagonal arriba a los\n" +
                        "lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere una gran flexibilidad en las piernas.\n" +
                        "Fuerza: Se necesita fuerza en las piernas para realizar el salto.\n" +
                        "Caída: Al aterrizar, amortigua el impacto para evitar lesiones en las rodillas.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hIsMBFly4rU&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMg%3D%3D\n");
                intent.putExtra("mov","P_n1_m5");
                intent.putExtra("titulo", "SALTO JUMP SPLIT");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n2_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n2_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Apuntar el pie derecho adelante en el suelo.\n" +
                        "Brazos: Arriba.\n" +
                        "Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada de\n" +
                        "tipo escalador” (figura 3) con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo al suelo. Continuar para levantar la\n" +
                        "pierna izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar las manos una al lado de la otra, al ancho de los hombros, en el suelo mientras se\n" +
                        "empuja la pierna derecha para llegar a una PARADA DE MANOS con las piernas juntas, los\n" +
                        "brazos extendidos, los hombros abiertos y extendidos, el ángulo de la cadera abierto y plano,\n" +
                        "y el enfoque en las manos mostrando una línea recta desde las muñecas hasta los tobillos.\n" +
                        "Mantener por un segundo.\n" +
                        "Bajar la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar con\n" +
                        "la pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la izquierda al\n" +
                        "lado del pie derecho para terminar con ambas piernas extendidas (figura 7) O para terminar\n" +
                        "en un desplante derecho, presionando la rodilla derecha y toda la cadera hacia adelante\n" +
                        "(figura 8).\n" +
                        "Brazos: Permanecen arriba en todo momento y cuando se hace el descenso. Abrir en\n" +
                        "diagonal arriba a los lados al final.\n" +
                        "Si se elige terminar la PARADA DE MANOS en desplante, cerrar el pie izquierdo al lado del\n" +
                        "pie derecho antes de realizar la VELA.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Fuerza: Requiere una gran fuerza en los brazos y el core.\n" +
                        "Equilibrio: Mantener el equilibrio sobre las manos es muy difícil.\n" +
                        "Caída: Existe un alto riesgo de caída si la parada de manos no se ejecuta correctamente.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hIsMBFly4rU&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMg%3D%3D\n");
                intent.putExtra("mov","P_n1_m6");
                intent.putExtra("titulo", "(*) PARADA DE MANOS");
                startActivity(intent);
            }
        });

//Boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m7_n2_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n2_m7);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Doblar las rodillas para llegar a una posición en cuclillas, manteniendo los pies en el suelo.\n" +
                        "Comenzar a rodar hacia atrás para extender el cuerpo a una posición de VELA (arriba sobre\n" +
                        "los hombros, los dedos de los pies apuntando hacia el techo, el ángulo de la cadera abierto).\n" +
                        "Brazos: Bajar hacia adelante y abajo para terminar con las palmas apoyadas en el suelo\n" +
                        "frente a los glúteos O mantener los brazos arriba en todo momento.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere una gran flexibilidad en la espalda.\n" +
                        "Fuerza: Se necesita fuerza en el core para mantener la posición.\n" +
                        "Equilibrio: Mantener el equilibrio en la posición de vela es difícil.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hIsMBFly4rU&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMg%3D%3D\n");
                intent.putExtra("mov","P_n1_m7");
                intent.putExtra("titulo", "VELA");
                startActivity(intent);
            }
        });

//Boton Movimiento8
        Movimiento8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m8_n2_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n2_m8);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Salir rodando de la VELA para llegar a una posición sentada extendida con las piernas\n" +
                        "extendidas.\n" +
                        "Brazos: Arriba en la posición de sentada.\n" +
                        "Bajar el cuerpo hasta una posición acostada boca arriba con las rodillas flexionadas y los pies\n" +
                        "apoyados en el suelo a la altura de los hombros. (Los pies también pueden estar juntos).\n" +
                        "También es aceptable bajar el cuerpo a una posición acostada boca arriba con el cuerpo\n" +
                        "extendido antes de flexionar las piernas.\n" +
                        "Brazos: Colocar las manos en el suelo cerca de los hombros, con las palmas hacia abajo y\n" +
                        "los dedos apuntando hacia los hombros.\n" +
                        "Empujar hacia abajo contra el suelo y extender los brazos y las piernas para llegar a una\n" +
                        "posición de ARCO con los brazos extendidos, separados al ancho de los hombros o más\n" +
                        "cerca, con los hombros sobre o más allá de las manos. Las piernas se encuentran extendidas\n" +
                        "o flexionadas (los pies pueden estar separados al ancho de los hombros o más cerca).\n" +
                        "Enfoque: Mantener la cabeza en una posición neutra y mantener el enfoque en las manos." +
                        "4. Mantener buena alineación en el CHASSÉ AL FRENTE y el SALTO EXTENDIDO.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una coordinación precisa entre brazos y piernas.\n" +
                        "Flexibilidad: Es necesaria una buena flexibilidad en la espalda y piernas.\n" +
                        "Fuerza: Se necesita fuerza en el core para mantener la posición de arco.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hIsMBFly4rU&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMg%3D%3D\n");
                intent.putExtra("mov","P_n1_m8");
                intent.putExtra("titulo", "ARCO, (*) PATADA A PASAR");
                startActivity(intent);
            }

        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
