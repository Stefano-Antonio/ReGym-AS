package com.example.regym.manual_gimnasia.movimientos_piso_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;


public class Movimientos_Piso_N3_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_piso_n3_mg);

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

                Intent intent = new Intent(Movimientos_Piso_N3_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n3_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n3_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Comenzar de pie sobre la pierna izquierda extendida (pie ligeramente girado hacia afuera) con\n" +
                        "el pie derecho cruzado frente al tobillo izquierdo. La pierna derecha se encuentra flexionada\n" +
                        "con la parte superior del pie derecho apoyado en el suelo (los dedos apuntados); la rodilla\n" +
                        "derecha girada hacia afuera.\n" +
                        "Brazos: El brazo derecho se flexiona con el dorso de la mano y el antebrazo derechos\n" +
                        "colocados en la parte baja de la espalda. El brazo izquierdo se encuentra en diagonal abajo al\n" +
                        "lado.\n" +
                        "Enfoque: Abajo hacia la mano izquierda.\n" +
                        "Hacer demi-plié con la pierna izquierda y extender la pierna derecha a un desplante lateral\n" +
                        "con el pie derecho apuntado para tocar el suelo.\n" +
                        "Brazos: Mover ambos brazos hacia los lados arriba o hacia los lados en medio.\n" +
                        "Enfoque: Al frente.\n" +
                        "Mientras se mantiene la pierna izquierda en demi-plié (es aceptable mover ligeramente el pie\n" +
                        "izquierdo a una posición paralela), flexionar la pierna derecha y apuntar el pie derecho hacia\n" +
                        "adelante para tocar la rodilla izquierda (pose de passé al frente). Durante la pose de passé\n" +
                        "al frente, el torso permanece recto.\n" +
                        "Brazos: Mover ambos brazos hacia los lados-abajo y colocar las manos en la cadera.\n" +
                        "Enfoque: Al frente.\n" +
                        "Mientras se mantiene el demi-plié con la pierna izquierda (pie izquierdo paralelo o girado hacia\n" +
                        "afuera), extender la pierna derecha y apuntar el pie derecho hacia un lado para tocar el suelo\n" +
                        "(pie apuntado hacia la esquina 6) para realizar un desplante lateral.\n" +
                        "Brazos: Abrir ambos brazos a los lados-en medio.\n" +
                        "Enfoque: Al frente.\n" +
                        "Empujar hacia abajo el suelo (comenzar a hacer el relevé con el metatarso del pie izquierdo) y\n" +
                        "levantar ligeramente el talón izquierdo para comenzar a “presionar” el talón para realizar un ¼\n" +
                        "(90°) de giro (presión de talón) hacia afuera y a la derecha para terminar recta de pie (en\n" +
                        "planta o relevé) mirando hacia la esquina 6.\n" +
                        "Brazos: Bajar ambos brazos a hacia abajo para terminar atrás en diagonal hacia abajo.\n" +
                        "Enfoque: Al frente hacia la esquina 6.\n" +
                        "N3 Suelo - 3\n" +
                        "Si se invierte la PARADA DE MANOS RODADA AL FRENTE, apuntar el pie izquierdo\n" +
                        "adelante.\n");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Equilibrio: Requiere un buen equilibrio sobre una pierna.\n" +
                        "Flexibilidad: Es necesaria una buena flexibilidad en la cadera y los aductores.\n" +
                        "Alineación: La rodilla de la pierna de apoyo debe estar alineada con el tobillo.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=DF1pTCLzm0w&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","P_n3_m1");
                intent.putExtra("titulo", "DESPLANTE LATERAL");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n3_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n3_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso adelante con el pie derecho (ligeramente girado) a través de la 4ta posición en\n" +
                        "demi-plié. Empujar el suelo con ambos pies para realizar un chassé al frente, cerrando el pie\n" +
                        "izquierdo detrás del pie derecho en el aire (5ta posición apretada). Aterrizar en demi-plié en la\n" +
                        "pierna izquierda con el pie izquierdo ligeramente girado. La pierna derecha permanece al\n" +
                        "frente, apuntando abajo hacia el suelo.\n" +
                        "Brazos: Bajar ambos brazos hacia los lados abajo o hacia los lados en medio.\n" +
                        "Transferir el peso a la pierna derecha a través de la 4ta posición en demi-plié, luego dar un\n" +
                        "paso largo adelante con la izquierda hacia la esquina 6 para terminar con una pose en\n" +
                        "desplante izquierdo con la pierna izquierda en demi-plié y la pierna derecha extendida hacia\n" +
                        "atrás, los dedos del pie derecho apuntados sobre el suelo, con el pie y la rodilla ligeramente\n" +
                        "girados hacia afuera.\n" +
                        "Brazos: Hacer un círculo con ambos brazos hacia atrás-abajo o hasta completamente abajo.\n" +
                        "Continuar levantando ambos brazos, con las palmas hacia arriba, hacia adelante y arriba para\n" +
                        "terminar amplios en diagonal adelante y arriba. Los brazos deben terminar cuando se hace la\n" +
                        "pose en desplante.\n" +
                        "Enfoque: En diagonal adelante y arriba.\n" +
                        "Hacia la derecha, realizar ½ (180°) giro pivote con los pies separados y terminar con la\n" +
                        "pierna izquierda extendida y el pie izquierdo en planta. El talón derecho se levanta del suelo\n" +
                        "(arco forzado), hacia afuera para terminar en una pose en desplante derecho, distribuyendo\n" +
                        "la mayor parte del peso sobre el pie izquierdo, mirando hacia la esquina 2.\n" +
                        "Brazos: Bajar ambos brazos hacia adelante-abajo y colocar las manos en la cadera.\n" +
                        "Hacer relevé con el pie izquierdo y cerrar el pie derecho junto al izquierdo para terminar con\n" +
                        "los pies uno al lado del otro en relevé o en planta.\n" +
                        "Brazos: Levantar ambos brazos a los lados-en medio, palmas hacia arriba.\n" +
                        "Enfoque: Opcional.\n" +
                        "N3 Suelo - 5\n" +
                        "4. Chassé al frente, SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS (90º)\n" +
                        "(0.60), Pose de pescado\n" +
                        "Hacia la esquina 2, dar un paso adelante con el pie izquierdo (ligeramente girado) a través de\n" +
                        "la 4ta posición en demi-plié. Empujar el suelo con ambos pies para realizar un chassé al\n" +
                        "frente, cerrando el pie derecho detrás del pie izquierdo en el aire (5ta posición apretada).\n" +
                        "Aterrizar en demi-plié en la pierna derecha con el pie derecho ligeramente girado. La pierna\n" +
                        "izquierda permanece al frente, apuntando hacia el suelo.\n" +
                        "Brazos: Permanecen a los lados-en medio. Girar las palmas hacia abajo.\n" +
                        "Dar un paso largo (o carrera con la pierna extendida) con el pie izquierdo en demi-plié,\n" +
                        "después balancear la pierna derecha extendida hacia adelante y arriba hasta la horizontal y\n" +
                        "empujar el suelo con la pierna izquierda. Balancear la pierna izquierda hacia atrás-arriba para\n" +
                        "realizar un SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS con un mínimo 90° de\n" +
                        "separación uniforme de piernas en el vuelo.\n" +
                        "Aterrizar sobre la pierna derecha en demi-plié con la pierna izquierda extendida hacia atrás y\n" +
                        "ligeramente girada hacia afuera al pasar por una posición de arabesca baja. El enfoque está\n" +
                        "en la alineación del cuerpo y la altura del salto leap split.\n" +
                        "Brazos: Abajo en el paso. Durante y en el aterrizaje del SALTO LEAP SPLIT CON PIERNAS\n" +
                        "EXTENDIDAS, usar una de las tres posiciones de brazos aceptables para los saltos leap split\n" +
                        "mostradas en el Glosario.\n" +
                        "Continuar en dirección a la esquina 2, dar un paso adelante con la izquierda (en planta o\n" +
                        "relevé).\n" +
                        "Brazos: Bajar ambos brazos hasta completamente abajo.\n" +
                        "Enfoque: Abajo.\n" +
                        "Dar un paso adelante con la derecha en relevé y flexionar la pierna izquierda hacia atrás y\n" +
                        "arriba a mínimo 90° para terminar con ambas rodillas juntas para realizar la pose de\n" +
                        "pescado.\n" +
                        "Brazos: Levantar ambos brazos hacia arriba a los lados para terminar hacia adelante-en\n" +
                        "medio con los brazos cruzados a la altura de las muñecas.\n" +
                        "Enfoque: Al frente.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una buena coordinación entre los pies.\n" +
                        "Transición: La transición del chassé al despante debe ser fluida.\n" +
                        "Equilibrio: Mantén el equilibrio en el despante.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=DF1pTCLzm0w&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","P_n3_m2");
                intent.putExtra("titulo", "Chassé AL FRENTE, Pose EN DESPLANTE");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n3_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n3_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Hacia la esquina 2, dar un paso adelante con el pie izquierdo (ligeramente girado) a través de\n" +
                        "la 4ta posición en demi-plié. Empujar el suelo con ambos pies para realizar un chassé al\n" +
                        "frente, cerrando el pie derecho detrás del pie izquierdo en el aire (5ta posición apretada).\n" +
                        "Aterrizar en demi-plié en la pierna derecha con el pie derecho ligeramente girado. La pierna\n" +
                        "izquierda permanece al frente, apuntando hacia el suelo.\n" +
                        "Brazos: Permanecen a los lados-en medio. Girar las palmas hacia abajo.\n" +
                        "Dar un paso largo (o carrera con la pierna extendida) con el pie izquierdo en demi-plié,\n" +
                        "después balancear la pierna derecha extendida hacia adelante y arriba hasta la horizontal y\n" +
                        "empujar el suelo con la pierna izquierda. Balancear la pierna izquierda hacia atrás-arriba para\n" +
                        "realizar un SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS con un mínimo 90° de\n" +
                        "separación uniforme de piernas en el vuelo.\n" +
                        "Aterrizar sobre la pierna derecha en demi-plié con la pierna izquierda extendida hacia atrás y\n" +
                        "ligeramente girada hacia afuera al pasar por una posición de arabesca baja. El enfoque está\n" +
                        "en la alineación del cuerpo y la altura del salto leap split.\n" +
                        "Brazos: Abajo en el paso. Durante y en el aterrizaje del SALTO LEAP SPLIT CON PIERNAS\n" +
                        "EXTENDIDAS, usar una de las tres posiciones de brazos aceptables para los saltos leap split\n" +
                        "mostradas en el Glosario.\n" +
                        "Continuar en dirección a la esquina 2, dar un paso adelante con la izquierda (en planta o\n" +
                        "relevé).\n" +
                        "Brazos: Bajar ambos brazos hasta completamente abajo.\n" +
                        "Enfoque: Abajo.\n" +
                        "Dar un paso adelante con la derecha en relevé y flexionar la pierna izquierda hacia atrás y\n" +
                        "arriba a mínimo 90° para terminar con ambas rodillas juntas para realizar la pose de\n" +
                        "pescado.\n" +
                        "Brazos: Levantar ambos brazos hacia arriba a los lados para terminar hacia adelante-en\n" +
                        "medio con los brazos cruzados a la altura de las muñecas.\n" +
                        "Enfoque: Al frente." +
                        "<Brazos>: Al finalizar la rodada, colocar la mano derecha en la cadera y levantar el brazo izquierdo hacia adelante y arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere una gran flexibilidad en las piernas.\n" +
                        "Fuerza: Se necesita fuerza en las piernas para realizar el salto.\n" +
                        "Altura: La altura del salto puede variar según el nivel de dificultad.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=DF1pTCLzm0w&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","P_n3_m3");
                intent.putExtra("titulo", "Chassé al frente, SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n3_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n3_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Mirando hacia la esquina 2, apuntar el pie derecho adelante en el suelo.\n" +
                        "Brazos: Permanecen arriba.\n" +
                        "Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada de\n" +
                        "tipo escalador” (figura 3) con la pierna derecha.\n" +
                        "N3 Suelo - 8\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo al suelo. Continuar para levantar la\n" +
                        "pierna izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar las manos una al lado de la otra, al ancho de los hombros, en el suelo mientras se\n" +
                        "empuja la pierna derecha para llegar a una PARADA DE MANOS con las piernas juntas, los\n" +
                        "brazos extendidos, los hombros abiertos y extendidos, el ángulo de la cadera abierto y plano,\n" +
                        "y el enfoque en las manos mostrando una línea recta desde las muñecas hasta los tobillos.\n" +
                        "Enfoque: En las manos.\n" +
                        "Continuar abriendo el ángulo de los hombros más allá de las manos y arquear la espalda alta,\n" +
                        "bajando las piernas extendidas hacia el suelo. Colocar los pies en planta en el suelo\n" +
                        "separados a la altura de los hombros o más cerca con las piernas extendidas o flexionadas\n" +
                        "para completar una PARADA DE MANOS ARCO.\n" +
                        "Para realizar el PATEAR A PASAR, patear la pierna derecha por encima de la cabeza\n" +
                        "mientras se empuja el suelo con la pierna izquierda para pasar por la vertical en la posición de\n" +
                        "parada de manos con una separación de piernas de mínimo 120°, hombros extendidos. (Es\n" +
                        "aceptable mover/ajustar el pie izquierdo más cerca de las manos cuando la pierna derecha\n" +
                        "inicia la patada).\n" +
                        "Bajar la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar con\n" +
                        "la pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la izquierda al\n" +
                        "lado del pie derecho para terminar con ambas piernas extendidas y los pies en planta\n" +
                        "apoyados en el suelo (figura 11) O para terminar en un desplante derecho, presionando la\n" +
                        "rodilla derecha y toda la cadera hacia adelante (figura 12).\n" +
                        "Brazos: Permanecen arriba en todo momento y cuando se hace el descenso. Abrir en\n" +
                        "diagonal arriba a los lados al final.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Fuerza: Requiere una gran fuerza en los brazos y el core.\n" +
                        "Coordinación: La coordinación entre brazos y piernas es esencial.\n" +
                        "Flexibilidad: Es necesaria una buena flexibilidad en la espalda y piernas.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=DF1pTCLzm0w&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","P_n3_m4");
                intent.putExtra("titulo", "PARADA DE MANOS ARCO, PATADA A PASAR");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n3_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n3_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Si la PATADA A PASAR terminó en un desplante, extender la pierna derecha.\n" +
                        "Realizar un arco con la parte superior del cuerpo, mientras se apunta el pie izquierdo hacia\n" +
                        "atrás y abajo. Bajar el cuerpo y colocar la espinilla izquierda en el suelo para terminar en una\n" +
                        "pose arrodillada/sentada con el pie derecho en planta junto a la rodilla/espinilla izquierda.\n" +
                        "Los glúteos apoyados sobre el talón izquierdo.\n" +
                        "Brazos: Ambos brazos permanecen en diagonal arriba a los lados mientras se apunta con el\n" +
                        "pie izquierdo. Continuar bajando ambos brazos hacia los lados-abajo para apoyar los dedos\n" +
                        "en el suelo.\n" +
                        "Enfoque: Cuando el pie/los dedos apunten hacia abajo, llevar la cabeza hacia atrás y mirar\n" +
                        "hacia el techo. El enfoque está hacia abajo durante la postura arrodillada/sentada.\n" +
                        "Brazos: Abrir ambos brazos en diagonal arriba a los lados mientras se apunta con el pie\n" +
                        "izquierdo. Continuar bajando ambos brazos hacia los lados-abajo para apoyar los dedos en el\n" +
                        "suelo.\n" +
                        "Levantar los glúteos del talón izquierdo, extender la cadera y colocar la pierna derecha\n" +
                        "extendida hacia adelante para colocar el pie derecho en punta sobre el suelo, con toda la\n" +
                        "cadera cuadrada hacia la esquina 2.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba a la corona.\n" +
                        "Deslizar la pierna derecha adelante hacia la esquina 2 y estirar la pierna izquierda para\n" +
                        "terminar en un SPLIT AL FRENTE derecho con el pecho hacia arriba.\n" +
                        "Brazos: Empuje para abrir fluidamente hacia los lados-en medio.\n" +
                        "Enfoque: Al frente.");
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere una gran flexibilidad en las piernas.\n" +
                        "Equilibrio: Mantener el equilibrio en la posición de split es difícil.\n" +
                        "Alineación: Las caderas deben estar alineadas con los hombros.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=DF1pTCLzm0w&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","P_n3_m5");
                intent.putExtra("titulo", "Pose arrodillada/sentada, SPLIT AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n3_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n3_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Al realizar el ½ (180°) giro boca abajo a giro de tronco, el cuerpo hará un giro\n" +
                        "completo (360°) que comienza con el SPLIT AL FRENTE mirando la esquina 2 para terminar\n" +
                        "de pie frente a la esquina 2.\n" +
                        "cambio vista\n" +
                        "cambio vista\n" +
                        "giro boca abajo\n" +
                        "a tronco\n" +
                        "izquierda\n" +
                        "Para salir del SPLIT AL FRENTE, girar el torso ¼ (90°) hacia la izquierda, bajar el torso y juntar\n" +
                        "las piernas para pasar por una posición boca abajo momentánea, mirando hacia el lado 1.\n" +
                        "Brazos: A medida que el torso gira y baja, estirar ambos brazos hacia adelante y abajo para\n" +
                        "colocar las manos en el suelo con ambos codos flexionados al lado del cuerpo.\n" +
                        "Empujar contra el suelo para facilitar e inmediatamente realizar ½ (180°) giro boca abajo\n" +
                        "a giro de tronco hacia la izquierda. Mientras se lleva el hombro izquierdo hacia atrás,\n" +
                        "continuar rodando en tronco, transfiriendo el peso a los glúteos para terminar con la pierna\n" +
                        "derecha extendida, apuntando hacia la esquina 2. A medida que el peso se lleva a los glúteos,\n" +
                        "“doblar” la pierna izquierda debajo de la pierna derecha y terminar mirando hacia la esquina 2.\n" +
                        "Brazos: Mientras se mantiene la presión sobre la mano derecha, mover la mano izquierda a\n" +
                        "través del pecho, estirándose hacia atrás para terminar con ambas manos colocadas en el\n" +
                        "suelo detrás de la espalda.\n" +
                        "Levantar los glúteos del suelo, extender la cadera y colocar la pierna derecha hacia adelante\n" +
                        "para colocar el pie derecho en planta en el suelo para pasar a través de la posición ½ arrodillada\n" +
                        "con el tobillo derecho alineado frente a la rodilla derecha con toda la cadera cuadrada hacia\n" +
                        "adelante, todavía mirando hacia la esquina 2.\n" +
                        "Brazos: Continuar empujando contra el suelo para facilitar completar el giro y terminar con los\n" +
                        "brazos en diagonal atrás abajo.\n" +
                        "Extender inmediatamente ambas piernas para levantarse sobre la pierna derecha (pie girado\n" +
                        "hacia afuera), con la pierna izquierda extendida hacia atrás, los dedos del pie izquierdo\n" +
                        "apuntados sobre el suelo.\n" +
                        "Brazos: Terminar en diagonal atrás abajo.\n" +
                        "Enfoque: Al frente hacia la esquina 2.");
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una buena coordinación para realizar el giro.\n" +
                        "Control: Es fundamental mantener el control del cuerpo durante el giro.\n" +
                        "Equilibrio: Mantén el equilibrio en la posición final.\n");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=DF1pTCLzm0w&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","P_n3_m6");
                intent.putExtra("titulo", "½ (180°) giro boca ABAJO A GIRO DE POSE");
                startActivity(intent);
            }
        });

//Boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m7_n3_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n3_m7);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "DESCENSO A POSICIÓN DE LAGARTIJA (0.40)\n" +
                        "cambio vista\n" +
                        "Doblar las rodillas para llegar a una posición en cuclillas, manteniendo los pies en el suelo.\n" +
                        "Empezar a rodar hacia atrás con la cabeza metida, la barbilla contra el pecho. Con los brazos\n" +
                        "extendidos y las manos hacia adentro, estirarse hacia atrás para colocar los lados de los\n" +
                        "dedos meñiques en el suelo detrás de la cabeza, a un ancho no mayor que el ancho de los\n" +
                        "hombros para realizar una RODADA ATRÁS, abriendo los hombros a 45° POR ARRIBA DE\n" +
                        "LA HORIZONTAL.\n" +
                        "Mantener una posición recta y ahuecada del cuerpo, bajar el cuerpo a una POSICIÓN DE\n" +
                        "LAGARTIJA con las piernas juntas y los metatarsos en el suelo.\n" +
                        "Brazos: Permanecen arriba. No se permite entrelazar los dedos.\n" +
                        "Deslizar los pies hacia adelante mientras se flexionan simultáneamente las rodillas para llegar\n" +
                        "a una posición sentada-arrodillada con los glúteos apoyados en los talones.\n" +
                        "Brazos: Las manos permanecen en el suelo.");
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una buena coordinación entre brazos y piernas.\n" +
                        "Control: Es fundamental mantener el control del cuerpo durante la rotación.\n" +
                        "Altura: La altura de la apertura depende de la flexibilidad y fuerza.\n");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=DF1pTCLzm0w&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","P_n3_m7");
                intent.putExtra("titulo", "RODADA ATRÁS A ABRIR A 45° POR ARRIBA DE LA HORIZONTAL");
                startActivity(intent);
            }
        });

//Boton Movimiento8
        Movimiento8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m8_n3_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n3_m8);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Inmediatamente levantar los glúteos de los talones, extender la cadera y levantar la pierna\n" +
                        "derecha hacia adelante para colocar el pie derecho en el suelo girado hacia afuera en una\n" +
                        "pose ½ arrodillada con el tobillo derecho alineado frente a la rodilla derecha con toda la\n" +
                        "cadera cuadrada hacia adelante.\n" +
                        "Brazos: “Presentación: un movimiento continuo”, levantar ambos brazos hacia adelante y\n" +
                        "arriba o adelante y en medio, cruzando las muñecas con las palmas hacia arriba. Terminar el\n" +
                        "movimiento abriendo ambos brazos a los lados y en medio, con las palmas hacia arriba (los\n" +
                        "brazos deben estar abiertos a los lados-en medio para cuando termine la pose en las rodillas).\n" +
                        "Enfoque: Al frente.\n" +
                        "Extender ambas piernas y cerrar el pie izquierdo detrás del pie derecho en un “bloqueo” de\n" +
                        "equilibrio en relevé.\n" +
                        "Brazos: Sin romper el movimiento continuo de los brazos, bajar ambos brazos hacia los\n" +
                        "lados-abajo o hasta completamente abajo.\n" +
                        "Enfoque: Abajo.\n" +
                        "Brazos: Sin dudarlo, continuar levantando ambos brazos y colocar las manos en la cadera.\n" +
                        "Enfoque: Terminar el movimiento cambiando “de golpe” y con precisión el enfoque hacia la\n" +
                        "derecha (hacia el lado 1).\n" +
                        "Girar ¼ (90°) a la izquierda, dar un paso a la izquierda (en planta) para terminar parada con\n" +
                        "piernas separadas mirando hacia el lado 3. Durante el giro, cambiar el peso al pie derecho,\n" +
                        "N3 Suelo - 14\n" +
                        "de modo que ambos pies estén sobre la planta y girados en la parada con piernas\n" +
                        "separadas.\n" +
                        "Brazos: Bajar ambos brazos hacia abajo para terminar en diagonal abajo a los lados.\n" +
                        "Enfoque: Al frente.\n" +
                        "Girar 90° a la derecha, mover el pie derecho al lado del pie izquierdo para terminar parada\n" +
                        "recta (en planta o en relevé) mirando hacia la esquina 6.\n" +
                        "Brazos: Mover hacia abajo o atrás en diagonal hacia abajo.\n" +
                        "Enfoque: Al frente hacia la esquina 6.\n" +
                        "12. (*) REDONDILLA (0.40), FLIC-FLAC (0.60), Rebote\n" +
                        "cambio vista\n" +
                        "pausa\n" +
                        "Correr (sin número específico de pasos) y hacer una talacha con alguna de las tres técnicas\n" +
                        "de talacha aceptables mostradas en el Glosario y realizar una REDONDILLA.\n" +
                        "Brincar inmediatamente hacia atrás a las manos en una posición del cuerpo extendida\n" +
                        "invertida para realizar un FLIC-FLAC. Empujar explosivamente desde el suelo inclinado con\n" +
                        "los brazos y los hombros mientras simultáneamente baja de golpe para aterrizar con ambos\n" +
                        "pies en una posición de pie y ahuecada del cuerpo.\n" +
                        "Rebotar inmediatamente con el cuerpo extendido. Aterrizar en demi-plié en posición\n" +
                        "controlada y equilibrada (“plantada”). Pausar.\n" +
                        "Brazos: Arriba en todo momento. A medida que se produce el aterrizaje del rebote, la\n" +
                        "posición de brazos es opcional.\n" +
                        "Estirar las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Mover hasta arriba, después abrir en diagonal arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Equilibrio: Requiere un buen equilibrio sobre una pierna.\n" +
                        "Flexibilidad: Es necesaria una buena flexibilidad en la cadera y los aductores.\n" +
                        "Alineación: La rodilla de la pierna de apoyo debe estar alineada con el tobillo.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=DF1pTCLzm0w&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","P_n3_m8");
                intent.putExtra("titulo", "(*)3/4 DE PARADA DE MANOS");
                startActivity(intent);
            }

        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
