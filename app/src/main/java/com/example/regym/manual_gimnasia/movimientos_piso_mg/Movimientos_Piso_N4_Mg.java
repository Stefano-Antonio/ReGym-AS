package com.example.regym.manual_gimnasia.movimientos_piso_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;


public class Movimientos_Piso_N4_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_piso_n4_mg);

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

                Intent intent = new Intent(Movimientos_Piso_N4_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n4_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n4_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Pararse cerca de la esquina 2, mirando hacia el lado 3. Los números de la ilustración\n" +
                        "coinciden con el tiempo/ritmo de la música.\n" +
                        "Comenzar de pie sobre la pierna izquierda extendida (pie ligeramente girado hacia afuera) con\n" +
                        "el pie derecho cruzado frente al tobillo izquierdo. La pierna derecha se encuentra flexionada\n" +
                        "con la parte superior del pie derecho apoyado en el suelo (los dedos apuntados); la rodilla\n" +
                        "derecha girada hacia afuera.\n" +
                        "Brazos: El brazo derecho se flexiona con el dorso de la mano y el antebrazo derechos\n" +
                        "colocados en la parte baja de la espalda. El brazo izquierdo se encuentra en diagonal abajo al\n" +
                        "lado.\n" +
                        "Enfoque: Abajo hacia la mano izquierda.\n" +
                        "El orden de la frase de danza inicial es el siguiente: (seguir los números de arriba del\n" +
                        "esquema)\n" +
                        "1. Hacer demi-plié con la pierna izquierda y extender al mismo tiempo la pierna derecha para\n" +
                        "apuntar el pie derecho que toque el suelo.\n" +
                        "Brazos: El brazo derecho permanece en la espalda. Levantar el brazo izquierdo hacia\n" +
                        "al lado-arriba hasta completamente arriba, palma hacia afuera.\n" +
                        "Enfoque: A la derecha hacia la esquina 6.\n" +
                        "2. Empujar hacia abajo el suelo con la pierna izquierda y levantar ligeramente el talón\n" +
                        "izquierdo a relevé para realizar un ¼ (90°) de giro con presión de talón hacia afuera y a la\n" +
                        "derecha para terminar mirando hacia la esquina 6. Simultáneamente, flexionar y levantar la\n" +
                        "pierna derecha para apuntar el pie derecho al lado de la rodilla izquierda (passé al frente).\n" +
                        "Brazos: Bajar el brazo izquierdo hacia al frente-abajo para terminar fluidamente al frenteen\n" +
                        "medio con la mano extendida, palma hacia abajo. La mano derecha permanece en la\n" +
                        "espalda.\n" +
                        "Enfoque: A la izquierda.\n" +
                        "3. Dar un paso atrás con la derecha en relevé.\n" +
                        "Brazos: Levantar ambos brazos hacia arriba hasta completamente arriba.\n" +
                        "Enfoque: Opcional.\n" +
                        "4. Dar un paso atrás con la izquierda en relevé.\n" +
                        "Brazos: Ambos brazos permanecen arriba.\n" +
                        "N4 Suelo - 3\n" +
                        "Si se invierte el ARCO ATRÁS A UNA PIERNA, apuntar el pie izquierdo adelante.\n");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Alineación: La posición del cuerpo debe ser correcta y alineada.\n" +
                        "Equilibrio: La pose inicial debe ser estable y equilibrada.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=qRCCHfGWPsA&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","P_n1_m1");
                intent.putExtra("titulo", "POSE INICIAL");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n4_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n4_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Si el ARCO ATRÁS A UNA PIERNA se completó con un desplante o con los pies cerrados,\n" +
                        "dar un paso atrás con la derecha y simultáneamente dar ¼ (90°) de giro a la derecha mientras\n" +
                        "se cierra el pie izquierdo junto al pie derecho para terminar en una pose en relevé en 1ra\n" +
                        "posición con ambos pies girados hacia afuera con el torso mirando al final hacia el lado 1.\n" +
                        "Brazos: Levantar hasta arriba a la corona.\n" +
                        "Bajar inmediatamente el talón izquierdo, hacer demi-plié con la pierna izquierda y extender la\n" +
                        "pierna derecha a un desplante lateral, con el pie derecho apuntado para tocar el suelo.\n" +
                        "Brazos: Dirigiendo con las palmas hacia abajo, bajar ambos brazos fluidamente hacia los\n" +
                        "lados-en medio.\n" +
                        "Enfoque: Al frente.\n" +
                        "Mientras se mantiene la pierna izquierda en demi-plié (es aceptable mover ligeramente el pie\n" +
                        "izquierdo a una posición paralela), flexionar la pierna derecha y apuntar el pie derecho hacia\n" +
                        "adelante para tocar la rodilla izquierda (pose de passé al frente). Durante la pose de\n" +
                        "contracción de passé al frente, contraer el torso al jalar los abdominales e inclinarse\n" +
                        "ligeramente hacia adelante con la parte superior del cuerpo. La pierna derecha puede girarse\n" +
                        "ligeramente hacia adentro durante la contracción.\n" +
                        "Brazos: Mantener la parte superior de los brazos a los lados-en medio y flexionar ambos\n" +
                        "brazos con precisión cerca del pecho con las palmas hacia afuera.\n" +
                        "Enfoque: Abajo.\n" +
                        "Mientras se mantiene el demi-plié con la pierna izquierda (pie izquierdo paralelo o girado hacia\n" +
                        "afuera), extender la pierna derecha y apuntar el pie derecho hacia un lado para tocar el suelo\n" +
                        "(pie apuntado hacia la esquina 2). Al finalizar la extensión de la pierna, girar el torso\n" +
                        "ligeramente hacia la izquierda con los hombros presionados hacia abajo.\n" +
                        "Brazos: Extender el brazo izquierdo para terminar en diagonal arriba al lado. Mover el brazo\n" +
                        "derecho flexionado para tocar el hombro izquierdo con las puntas de los dedos índice y medio,\n" +
                        "con la palma hacia afuera.\n" +
                        "Enfoque: A la derecha, hacia la esquina 2.\n" +
                        "4. Chassé lateral con ¼ (90°) de giro, Pose en desplante,\n" +
                        "½ (180°) giro pivote, Pose en desplante, Parada con piernas separadas,\n" +
                        "Al moverse hacia la esquina 2, hacer demi-plié con el pie derecho y transferir el peso a ambos\n" +
                        "pies en 2da posición en demi-plié con los talones en el suelo. Empujar el suelo con ambos pies\n" +
                        "para juntar los pies en el aire y realizar un chassé lateral a la derecha. Antes o al aterrizar,\n" +
                        "realizar ¼ (90°) de giro a la derecha. Aterrizar en demi-plié en la pierna izquierda con el pie\n" +
                        "izquierdo ligeramente girado, mirando a la esquina 2. La pierna derecha permanece al frente,\n" +
                        "apuntando abajo hacia el suelo.\n" +
                        "Brazos: Bajar el brazo izquierdo hacia al lado-abajo o hacia el lado-en medio. Al mismo\n" +
                        "tiempo, abrir el brazo derecho hacia el lado o hacia el lado-en medio.\n" +
                        "Completar el chassé lateral con ¼ (90°) de giro al dar un paso adelante con la derecha,\n" +
                        "luego dar un paso largo adelante con la izquierda hacia la esquina 2 para terminar con una\n" +
                        "pose en desplante izquierdo con la pierna izquierda en demi-plié y la pierna derecha\n" +
                        "extendida hacia atrás, los dedos del pie derecho apuntados sobre el suelo, con el pie y la\n" +
                        "rodilla ligeramente girados hacia afuera.\n" +
                        "Brazos: Hacer un círculo con ambos brazos hacia atrás-abajo o hasta completamente abajo.\n" +
                        "Continuar levantando ambos brazos, con las palmas hacia arriba, hacia adelante y arriba para\n" +
                        "terminar amplios en diagonal adelante y arriba. Los brazos deben terminar cuando se hace la\n" +
                        "pose en desplante.\n" +
                        "Enfoque: En diagonal adelante y arriba.\n" +
                        "Hacia la derecha, realizar ½ (180°) giro pivote con los pies separados y terminar con la\n" +
                        "pierna izquierda extendida y el pie izquierdo en planta. El talón derecho se levanta del suelo\n" +
                        "(arco forzado), hacia afuera para terminar en una pose en desplante derecho, distribuyendo\n" +
                        "la mayor parte del peso sobre el pie izquierdo.\n" +
                        "Brazos: Bajar ambos brazos a hacia adelante-abajo para terminar atrás en diagonal hacia\n" +
                        "abajo.\n" +
                        "Enfoque: A la esquina 6 al terminar el giro.\n" +
                        "Mientras se da ¼ (90°) de giro a la izquierda, presionar a relevé con el pie izquierdo para\n" +
                        "mostrar una posición parada con las piernas separadas momentánea con ambos pies\n" +
                        "girados hacia afuera en relevé.\n" +
                        "Brazos: Manos en la cadera.\n" +
                        "Enfoque: Al frente hacia el lado 3.\n" +
                        "Mientras se da ¼ (90°) de giro a la derecha, bajar el pie izquierdo para volver a la pose en\n" +
                        "desplante con la pierna derecha flexionada hacia adelante y el pie derecho en arco forzado.\n" +
                        "Brazos: Opcional.\n" +
                        "Enfoque: Opcional.\n" +
                        "Si realiza la siguiente diagonal desde una talacha con potencia, cerrar los pies para terminar\n" +
                        "uno al lado del otro.\n" +
                        "Brazos: Opcional.\n" +
                        "Si se invierte el RESORTE A UNA PIERNA, la INVERSIÓN LATERAL también tiene que\n" +
                        "invertirse.\n" +
                        "5. (*) RESORTE A UNA PIERNA (0.60), (*) INVERSIÓN LATERAL (0.40),\n" +
                        "RODADA ATRÁS CON BRAZOS EXTENDIDOS A PARADA DE MANOS\n" +
                        "(0.40)\n" +
                        "cambio vista\n" +
                        "(*) RESORTE A UNA PIERNA (0.60)\n" +
                        "Hacer una talacha con potencia o dar un paso con la izquierda y hacer la talacha con una de\n" +
                        "las técnicas aceptables que se muestran en el Glosario.\n" +
                        "Estirar ambas manos hacia adelante y colocarlas en el suelo, una al lado de la otra, a la altura\n" +
                        "de los hombros, mientras se patea la pierna izquierda hacia atrás y hacia arriba por encima de\n" +
                        "la cabeza. Cuando las manos toquen el suelo, extenderse con fuerza a través de los hombros\n" +
                        "creando un movimiento fuerte hacia atrás y hacia arriba. Rotar el cuerpo en una posición\n" +
                        "apretada y extendida para realizar un RESORTE A UNA PIERNA.\n" +
                        "Mientras se realiza el RESORTE A UNA PIERNA, el objetivo del elemento es acelerar y rotar\n" +
                        "rápidamente. Se debe evitar un bloqueo largo y alto. Debe parecerse a un arco al frente a una\n" +
                        "pierna potente con un vuelo y una altura mínimos. Una técnica aceptable es inclinar ambos\n" +
                        "hombros (plancha) sobre las muñecas mientras se activa la patada hacia atrás.\n" +
                        "Brazos: Levantar los brazos hacia adelante y arriba, cubriendo las orejas hasta que se haga\n" +
                        "contacto con el suelo. Los brazos permanecen junto a las orejas en todo momento y el ángulo\n" +
                        "de los hombros se abre en la fase posterior al vuelo del elemento. Si se usa la técnica de\n" +
                        "“plancha”, no se requiere un ángulo de hombros abierto en todo momento, pero debe\n" +
                        "mostrarse al final del elemento.\n" +
                        "Enfoque: Hacia las manos en todo momento, con la cabeza neutra y la barbilla hacia adelante.\n" +
                        "(*) INVERSIÓN LATERAL (0.40)\n" +
                        "Al terminar el RESORTE A UNA PIERNA, continuar hacia adelante para realizar una\n" +
                        "INVERSIÓN LATERAL a la derecha. La entrada a la INVERSIÓN LATERAL puede ser a\n" +
                        "través de un desplante o entrada “tipo escalador”. La cabeza permanece alineada, con el\n" +
                        "ángulo de los hombros y el de la cadera abiertos, y el enfoque por debajo del brazo izquierdo\n" +
                        "para ver el suelo en el descenso. Dar ¼ (90°) de giro hacia adentro para bajar la izquierda.\n" +
                        "Cerrar el pie derecho al lado del pie izquierdo para terminar en una posición recta y ahuecada\n" +
                        "del cuerpo (en planta o en relevé) O mantener la forma redondeada e inmediatamente hacer\n" +
                        "plié con ambas piernas para continuar a la RODADA ATRÁS A PARADA DE MANOS.\n" +
                        "Brazos: Arriba, con el ángulo de hombros abierto en todo momento y cuando se hace el\n" +
                        "descenso.\n" +
                        "Enfoque: Durante la INVERSIÓN LATERAL, la cabeza debe colocarse al lado de la parte\n" +
                        "superior del brazo izquierdo, buscando la posición de aterrizaje de los pies.\n" +
                        "RODADA ATRÁS CON BRAZOS EXTENDIDOS A PARADA DE MANOS\n" +
                        "(0.40)\n" +
                        "Doblar las rodillas para llegar a una posición en cuclillas, manteniendo los pies en el suelo.\n" +
                        "Empezar a rodar hacia atrás con la cabeza metida, la barbilla contra el pecho. Con los brazos\n" +
                        "extendidos y las manos hacia adentro, estirarse hacia atrás para colocar los lados de los\n" +
                        "dedos meñiques en el suelo detrás de la cabeza a un ancho no mayor que el ancho de los\n" +
                        "hombros para realizar una RODADA ATRÁS A PARADA DE MANOS con las piernas juntas.\n" +
                        "Se permite que las manos cambien o den un salto hacia la fase de parada de manos.\n" +
                        "Bajar la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar con\n" +
                        "la pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la izquierda al\n" +
                        "lado del pie derecho para terminar con ambas piernas extendidas y los pies en planta\n" +
                        "apoyados en el suelo (rodada atrás figura 8) O para terminar en un desplante derecho,\n" +
                        "presionando la rodilla derecha y toda la cadera hacia adelante (rodada atrás figura 9).\n" +
                        "Brazos: Se mantienen arriba al empezar la rodada. Terminar el descenso con los brazos\n" +
                        "arriba, después abrir en diagonal arriba a los lados.\n" +
                        "Enfoque: En diagonal adelante y arriba.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Equilibrio: Requiere un gran equilibrio sobre una pierna.\n" +
                        "Flexibilidad: Es necesaria una buena flexibilidad en la cadera y los aductores.\n" +
                        "Alineación: La rodilla de la pierna de apoyo debe estar alineada con el tobillo.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=qRCCHfGWPsA&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","P_n1_m2");
                intent.putExtra("titulo", "POSE EN RELEVÉ, DESPLANTE LATERAL");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n4_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n4_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Empujar hacia abajo el suelo (comenzar a hacer el relevé con el metatarso del pie derecho) y\n" +
                        "levantar ligeramente el talón derecho para comenzar a “presionar” el talón para realizar un ¼\n" +
                        "(90°) de giro de presión de talón a la derecha para terminar con el torso mirando hacia el lado\n" +
                        "3. Simultáneamente, levantar y flexionar la pierna izquierda y colocar el pie izquierdo junto al\n" +
                        "pie derecho, terminando con la parte superior del pie izquierdo colocado en el suelo (los\n" +
                        "dedos apuntados hacia abajo). La rodilla izquierda se encuentra hacia adentro/cruzando el\n" +
                        "cuerpo, se apunta hacia el lado 5 en la pose.\n" +
                        "Brazos: Bajar ambos brazos hacia los lados-abajo o en diagonal abajo a los lados.\n" +
                        "En dirección al lado 3, dar un paso adelante con la izquierda en relevé.\n" +
                        "Brazos: Cuando comienza el paso, mover ambos brazos hacia adelante y en medio, luego,\n" +
                        "flexionándolos y extendiéndolos, presionar fluidamente los brazos hacia adelante y en medio\n" +
                        "para terminar con precisión con las manos extendidas y las palmas hacia abajo.\n" +
                        "Patear la pierna derecha hacia adelante y arriba a la horizontal o más arriba (en relevé).\n" +
                        "Brazos: Levantar ambos brazos hacia atrás, en diagonal, arriba para terminar en diagonal\n" +
                        "arriba a los lados.\n" +
                        "Dar un paso adelante con la derecha, cerrar el pie izquierdo al lado del derecho para terminar\n" +
                        "con ambos pies uno al lado del otro (paralelos y en planta), mirando al lado 3.\n" +
                        "Brazos: Bajar ambos brazos en diagonal abajo a los lados o hasta completamente abajo.\n" +
                        "Enfoque: Al frente.\n" +
                        "Hacer demi-plié con ambas piernas y simultáneamente levantar ambos talones del suelo para\n" +
                        "terminar en una pose de arco forzado.\n" +
                        "N4 Suelo - 10\n" +
                        "Brazos: Flexionar y levantar el brazo derecho hacia adelante y arriba para tocar el hombro\n" +
                        "izquierdo con las puntas de los dedos índice y medio, con la palma hacia afuera.\n" +
                        "Simultáneamente, levantar el brazo izquierdo hacia al lado-arriba o al lado-en medio, con la\n" +
                        "palma hacia abajo.\n" +
                        "Enfoque: A la izquierda.\n" +
                        "Extender ambas piernas con precisión y bajar ambos talones al suelo.\n" +
                        "Brazos: Bajar ambos brazos a los lados-abajo con precisión, y ambos brazos “de golpe” para\n" +
                        "terminar completamente abajo o en diagonal atrás abajo.\n" +
                        "Enfoque: Al frente.\n" +
                        "Hacer demi-plié con ambas piernas. Extender ambas piernas a través de la cadera, rodillas,\n" +
                        "tobillos y dedos de los pies con las piernas juntas para realizar un SALTO EXTENDIDO CON\n" +
                        "1/2 (180°) GIRO a la derecha.\n" +
                        "Brazos: Los brazos se levantar al frente-arriba a la corona para el SALTO EXTENDIDO CON\n" +
                        "1/2 (180°) GIRO y el aterrizaje.\n" +
                        "Al aterrizar del SALTO EXTENDIDO CON 1/2 (180°) GIRO, realizar inmediatamente un\n" +
                        "pequeño rebote, extendiendo ambas piernas a través de la cadera, rodillas, tobillos y dedos\n" +
                        "de los pies con las piernas juntas.\n" +
                        "Brazos: Permanecen en corona.\n" +
                        "Aterrizar el pequeño rebote con el pie derecho. Estirar la pierna izquierda hacia atrás para\n" +
                        "terminar en una pose ½ arrodillada (espinilla izquierda en el suelo) con el tobillo derecho\n" +
                        "alineado frente a la rodilla derecha con toda la cadera cuadrada hacia adelante y el pie\n" +
                        "delantero ligeramente girado hacia afuera.\n" +
                        "Brazos: “Presentación: un movimiento continuo” bajar ambos brazos hacia los lados-abajo o\n" +
                        "hasta completamente abajo. Continuar levantando ambos brazos hacia adelante y arriba o\n" +
                        "adelante y en medio, cruzando las muñecas con las palmas hacia arriba. Terminar el\n" +
                        "movimiento abriendo ambos brazos a los lados y en medio, con las palmas hacia arriba (los\n" +
                        "brazos deben estar abiertos a los lados-en medio para cuando termine la pose en las rodillas).\n" +
                        "Enfoque: Al frente.\n" +
                        "Extender ambas piernas y cerrar el pie izquierdo detrás del pie derecho en un “bloqueo” de\n" +
                        "equilibrio en relevé.\n" +
                        "Brazos: Sin romper el movimiento continuo de los brazos, bajar ambos brazos hacia los\n" +
                        "lados-abajo o hasta completamente abajo.\n" +
                        "Enfoque: Abajo.\n" +
                        "Brazos: Sin dudarlo, continuar levantando el brazo izquierdo hacia adelante y arriba para\n" +
                        "terminar en la corona con la palma hacia el techo. Simultáneamente, levantar el brazo\n" +
                        "derecho hacia al frente-arriba hasta curvado adelante-en medio, con la palma hacia afuera.\n" +
                        "N4 Suelo - 11\n" +
                        "Enfoque: Terminar el movimiento cambiando “de golpe” y con precisión el enfoque hacia la\n" +
                        "derecha." +
                        "<Brazos>: Al finalizar la rodada, colocar la mano derecha en la cadera y levantar el brazo izquierdo hacia adelante y arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una buena coordinación entre los pies y brazos.\n" +
                        "Precisión: La rotación de 180° debe ser precisa.\n" +
                        "Altura: La altura del salto puede variar según el nivel de dificultad.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=qRCCHfGWPsA&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","P_n1_m3");
                intent.putExtra("titulo", "POSE, PASO PATADA, POSE, (*) SALTO EXTENDIDO CON 1/2 (180°)");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n4_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n4_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "En dirección hacia el lado 7, dar un paso adelante con la izquierda en demi-plié. Empujar el\n" +
                        "suelo extendiéndose a través de la cadera, rodilla, tobillo y los dedos del pie del lado izquierdo\n" +
                        "para realizar un salto hop en passé al frente. Durante el salto hop en passé al frente,\n" +
                        "flexionar la rodilla derecha hacia adelante y jalar el pie derecho en punta arriba hasta tocar la\n" +
                        "rodilla izquierda (passé al frente). Aterrizar en demi-plié con la pierna izquierda con el pie\n" +
                        "izquierdo girado hacia afuera.\n" +
                        "Brazos: Bajar el brazo derecho hacia abajo a la cadera derecha. Baje el brazo izquierdo al\n" +
                        "lado-abajo hasta completamente abajo y continuar levantándolo hacia adelante-arriba para\n" +
                        "terminar adelante-en medio con la palma hacia abajo.\n" +
                        "Enfoque: Al frente hacia el lado 7.\n" +
                        "Al aterrizar el salto hop en passé al frente, girar 45° a la izquierda y dar un paso hacia al\n" +
                        "lado al pie derecho (girado hacia afuera) a través de la 2da posición en demi-plié con los\n" +
                        "talones en o cerca del piso. Empujar el suelo con ambos pies para realizar un chassé lateral,\n" +
                        "cerrando el pie izquierdo al lado del pie derecho en el aire.\n" +
                        "Brazos: Mover el brazo izquierdo al lado-en medio. Simultáneamente, levantar el brazo\n" +
                        "derecho hacia al lado-arriba o al lado-en medio.\n" +
                        "Aterrizar en demi-plié en la pierna izquierda con el pie izquierdo ligeramente girado. La pierna\n" +
                        "derecha se abre al lado, apuntando el pie derecho hacia el suelo.\n" +
                        "Continuar en diagonal hacia el lado 7, dar un paso adelante con la derecha en demi-plié.\n" +
                        "Brazos: Bajar ambos brazos hacia los lados-abajo o hasta completamente abajo.\n" +
                        "Empujar el suelo extendiéndose a través de la cadera, rodilla, tobillo y dedos de los pies del\n" +
                        "lado derecho para realizar un salto hop en passé con 135° de giro a la derecha para\n" +
                        "terminar mirando hacia el lado 3. Durante el salto hop en passé, flexionar la rodilla izquierda\n" +
                        "hacia adelante y jalar el pie izquierdo en punta arriba hasta tocar la rodilla derecha (passé al\n" +
                        "frente). Aterrizar en demi-plié con la pierna derecha.\n" +
                        "N4 Suelo - 12\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba a la corona.\n" +
                        "Hacia el lado 3, dar un paso adelante con el pie izquierdo (ligeramente girado) a través de la\n" +
                        "4ta posición en demi-plié. Empujar el suelo con ambos pies para realizar un chassé al frente,\n" +
                        "cerrando el pie derecho detrás del pie izquierdo en el aire (5ta posición apretada). Aterrizar en\n" +
                        "demi-plié en la pierna derecha con el pie derecho ligeramente girado. La pierna izquierda\n" +
                        "permanece al frente, apuntando hacia el suelo.\n" +
                        "Brazos: Mover ambos brazos hacia los lados-abajo o al lado-en medio y permanecer en medio-al lado para el chassé al frente.\n" +
                        "8. SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS (120°) (0.60), Pose de pescado\n" +
                        "Dar un paso largo (o carrera baja con la pierna extendida) con el pie izquierdo en demi-plié,\n" +
                        "después balancear la pierna derecha extendida hacia adelante y arriba hasta la horizontal y\n" +
                        "empujar el suelo con la pierna izquierda. Balancear la pierna izquierda hacia atrás-arriba para\n" +
                        "realizar un SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS con un mínimo 120° de\n" +
                        "separación uniforme de piernas en el vuelo.\n" +
                        "Aterrizar sobre la pierna derecha en demi-plié con la pierna izquierda extendida hacia atrás y\n" +
                        "ligeramente girada hacia afuera al pasar por una posición de arabesca baja. El enfoque está\n" +
                        "en la alineación del cuerpo y la altura del salto leap split.\n" +
                        "Brazos: Abajo en el paso. Durante y en el aterrizaje del SALTO LEAP SPLIT CON PIERNAS\n" +
                        "EXTENDIDAS, usar una de las tres posiciones de brazos aceptables para los saltos leap split\n" +
                        "mostradas en el Glosario.\n" +
                        "Continuar en dirección al lado 3, dar un paso adelante con la izquierda en relevé.\n" +
                        "Brazos: Bajar ambos brazos hasta completamente abajo.\n" +
                        "Enfoque: Abajo.\n" +
                        "Dar un paso adelante con la derecha en relevé y flexionar la pierna izquierda hacia atrás y\n" +
                        "arriba a mínimo 90° para terminar con ambas rodillas juntas para realizar la pose de\n" +
                        "pescado.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba o completamente arriba, palmas hacia\n" +
                        "enfrente.\n" +
                        "Enfoque: Arriba al techo.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una excelente coordinación entre los pies y brazos.\n" +
                        "Ritmo: El movimiento debe ser fluido y rítmico.\n" +
                        "Precisión: La rotación de 135° debe ser precisa.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=qRCCHfGWPsA&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","P_n1_m4");
                intent.putExtra("titulo", "SALTO HOP EN PASSÉ AL FRENTE, CHASSÉ LATERAL, SALTO HOP CON ¾ (135°)");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n4_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n4_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso adelante (en planta o relevé y con el pie paralelo o girado) a la izquierda. Cerrar\n" +
                        "el pie derecho al lado del pie izquierdo en paralelo O cerrar el pie derecho (adelante o atrás)\n" +
                        "para tocar el pie izquierdo en 1ra, 3ra o 5ta posición girada hacia afuera. Hacer demi-plié con\n" +
                        "ambas piernas.\n" +
                        "Brazos: Bajar ambos brazos a los lados-abajo hasta completamente abajo o atrás en\n" +
                        "diagonal abajo.\n" +
                        "Enfoque: Al frente.\n" +
                        "Empujar el suelo, extendiendo las piernas a través de la cadera, rodillas, tobillos y dedos de\n" +
                        "los pies para realizar un SALTO JUMP SQUAT con un mínimo de 120° de separación\n" +
                        "uniforme de piernas. Durante el SALTO JUMP SQUAT, la gimnasta debe mostrar las piernas\n" +
                        "giradas con las rodillas hacia el techo (el SALTO JUMP SQUAT puede ser un salto de split\n" +
                        "lateral o un salto carpado con las piernas separadas). Aterrizar con ambos pies uno al lado del\n" +
                        "otro en demi-plié.\n" +
                        "Brazos: Levantar ambos brazos para terminar hacia los lados en diagonal arriba en el salto\n" +
                        "(el recorrido es opcional). Mover los brazos a la corona en el aterrizaje.\n" +
                        "SALTO JUMP\n" +
                        "SQUAT (120°)\n" +
                        "(0.40)\n" +
                        "Hasta 0.20 Separación desigual de las piernas\n" +
                        "0.10 No aterrizar con los dos pies al mismo\n" +
                        "tiempo.\n" +
                        "Hasta 0.10 No aterrizar con los pies cerrados.\n" +
                        "Puntos de énfasis:\n" +
                        "postura, amplitud, alineación correcta de piernas\n" +
                        "Mientras se realiza un arco con la parte superior del cuerpo, dar un paso atrás con la izquierda\n" +
                        "en relevé, luego con la derecha, colocando la espinilla derecha en el suelo mientras se baja el\n" +
                        "cuerpo para terminar en una pose arrodillada/sentada con el metatarso del pie izquierdo\n" +
                        "junto a la rodilla/espinilla derecha. La pierna derecha se encuentra flexionada con la espinilla\n" +
                        "derecha en el suelo y el pie derecho en punta. Los glúteos apoyados sobre el talón derecho.\n" +
                        "Brazos: Abrir ambos brazos en diagonal arriba a los lados en el paso izquierdo. Continuar\n" +
                        "bajando ambos brazos hacia los lados-abajo para apoyar los dedos en el piso.\n" +
                        "Enfoque: En el paso con la izquierda, el enfoque está arriba. En la pose arrodillada/sentada,\n" +
                        "el enfoque está abajo.\n" +
                        "Levantar los glúteos del talón derecho y girar el torso ¼ (90°) a la izquierda. Levantar y\n" +
                        "extender la pierna izquierda y apuntar el pie izquierdo hacia el lado 7. El torso se encuentra\n" +
                        "hacia el lado 1 para completar la pose ½ arrodillada. El torso y la pierna izquierda deben\n" +
                        "estar en línea recta entre sí.\n" +
                        "N4 Suelo - 14\n" +
                        "Brazos: Estirar la mano derecha hacia adelante a lo largo del suelo hacia el lado 3. Poner\n" +
                        "todo el peso en la mano derecha. Simultáneamente, mover el brazo izquierdo al lado-abajo\n" +
                        "para terminar en diagonal arriba al lado.\n" +
                        "Enfoque: En la mano derecha.\n" +
                        "Mientras el torso da ¾ (135°) de giro hacia la izquierda para mirar hacia la esquina 6, sentarse\n" +
                        "hacia atrás, bajar y rodar hacia la derecha, luego poner la cadera izquierda en el piso.\n" +
                        "Simultáneamente, flexionar la pierna izquierda un mínimo de 90° en una posición girada\n" +
                        "ligeramente separada del suelo (el lado de la pierna derecha todavía se encuentra en el suelo\n" +
                        "en este punto).\n" +
                        "Brazos: Mientras se mantiene la presión sobre la mano derecha, mover la mano izquierda\n" +
                        "hacia atrás y abajo para terminar con ambas manos colocadas en el suelo detrás de la\n" +
                        "espalda.\n" +
                        "Sin dudarlo, continuar girando el torso ¼ (90°) hacia la izquierda para terminar mirando hacia\n" +
                        "la esquina 4. Durante el ¼ (90°) de giro, bajar la pierna izquierda y cruzar la pierna derecha\n" +
                        "flexionada sobre la pierna izquierda para pasar por una posición de sentado agrupado\n" +
                        "momentánea con la pierna izquierda flexionada debajo de la pierna derecha.");
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere una gran flexibilidad en las piernas.\n" +
                        "Fuerza: Se necesita fuerza en las piernas para realizar el salto.\n" +
                        "Precisión: La rotación de 120° debe ser precisa.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=qRCCHfGWPsA&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","P_n1_m5");
                intent.putExtra("titulo", "SALTO JUMP SQUAT (120°)");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n4_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n4_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Al terminar el giro en sentado agrupado, levantar los glúteos de los talones, extender la\n" +
                        "cadera y colocar la pierna derecha hacia adelante para colocar el pie derecho en el suelo\n" +
                        "girado hacia afuera en una pose ½ arrodillada con el tobillo derecho alineado frente a la\n" +
                        "rodilla derecha con toda la cadera cuadrada hacia adelante hacia la esquina 4.\n" +
                        "Brazos: Empujar el suelo con la mano derecha, luego con la mano izquierda para llegar a la\n" +
                        "pose ½ arrodillada. Al completar la pose ½ arrodillada, levantar ambos brazos hacia\n" +
                        "adelante-arriba a la corona.\n" +
                        "Deslizar la pierna derecha adelante hacia la esquina 4 y estirar la pierna izquierda para\n" +
                        "terminar en un SPLIT AL FRENTE derecho con el pecho hacia arriba.\n" +
                        "Brazos: Empuje para abrir fluidamente hacia los lados-en medio.\n" +
                        "Enfoque: Al frente.");
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere una gran flexibilidad en las piernas.\n" +
                        "Equilibrio: Mantener el equilibrio en la posición de split es difícil.\n" +
                        "Precisión: La apertura del split debe ser de 0.20 metros");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=qRCCHfGWPsA&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","P_n1_m6");
                intent.putExtra("titulo", "POSE ½ ARRODILLADA, SPLIT AL FRENTE (0.20)");
                startActivity(intent);
            }
        });

//Boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m7_n4_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n4_m7);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Al realizar el ½ (180°) giro boca abajo a giro de tronco, el cuerpo hará un giro completo\n" +
                        "1/1 (360°) que comienza con el SPLIT AL FRENTE mirando la esquina 4 para terminar\n" +
                        "de pie frente a la esquina 4.\n" +
                        "cambio vista\n" +
                        "cambio vista\n" +
                        "giro boca abajo\n" +
                        "a tronco\n" +
                        "izquierda\n" +
                        "Para salir del SPLIT AL FRENTE, girar el torso ¼ (90°) hacia la izquierda, bajar el torso y juntar\n" +
                        "las piernas para pasar por una posición boca abajo momentánea, mirando hacia el lado 3.\n" +
                        "Brazos: A medida que el torso gira y baja, estirar ambos brazos hacia adelante y abajo para\n" +
                        "colocar las manos en el suelo con ambos codos flexionados al lado del cuerpo.\n" +
                        "Empujar contra el suelo para facilitar e inmediatamente realizar ½ (180°) giro boca abajo a\n" +
                        "giro de tronco hacia la izquierda. Mientras se lleva el hombro izquierdo hacia atrás, continuar\n" +
                        "rodando en tronco, transfiriendo el peso a los glúteos para terminar con la pierna derecha\n" +
                        "extendida, apuntando hacia la esquina 4. A medida que el peso se lleva a los glúteos, “doblar”\n" +
                        "la pierna izquierda debajo de la pierna derecha y terminar mirando hacia la esquina 4.\n" +
                        "Brazos: Mientras se mantiene la presión sobre la mano derecha, mover la mano izquierda a\n" +
                        "través del pecho, estirándose hacia atrás para terminar con ambas manos colocadas en el\n" +
                        "suelo detrás de la espalda.\n" +
                        "Levantar los glúteos del suelo, extender la cadera y colocar la pierna derecha hacia adelante\n" +
                        "para colocar el pie derecho en planta en el suelo para pasar a través de la posición ½\n" +
                        "arrodillada con el tobillo derecho alineado frente a la rodilla derecha con toda la cadera\n" +
                        "cuadrada hacia adelante, todavía mirando hacia la esquina 4.\n" +
                        "Brazos: Continuar empujando contra el suelo para facilitar completar el giro y terminar con los\n" +
                        "brazos en diagonal atrás abajo.\n" +
                        "Extender inmediatamente ambas piernas para levantarse sobre la pierna derecha (pie girado\n" +
                        "hacia afuera), con la pierna izquierda extendida hacia atrás, los dedos del pie izquierdo\n" +
                        "apuntados sobre el suelo.\n" +
                        "Brazos: Terminar en diagonal atrás abajo.\n" +
                        "Enfoque: Al frente hacia la esquina 4.\n" +
                        "N4 Suelo - 16\n" +
                        "12. “Bloqueo” de equilibrio en relevé, (*) 1/1 (360º) GIRO EN PASSÉ AL\n" +
                        "FRENTE (0.40), “Bloqueo” de equilibrio en relevé, Parada con piernas\n" +
                        "separadas, Parada recta\n" +
                        "cambio vista\n" +
                        "derecha\n" +
                        "cambio vista\n" +
                        "Presionar hacia abajo para el relevé con el pie derecho y cerrar el pie izquierdo detrás del pie\n" +
                        "derecho en un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Brazos de “molino”. Hacer un círculo con el brazo derecho hacia adelante y arriba\n" +
                        "hasta completamente arriba y continuar el círculo hacia atrás y hacia abajo. A medida que el\n" +
                        "brazo derecho comienza el círculo hacia abajo, levantar el brazo izquierdo hacia adelante y\n" +
                        "arriba hasta la diagonal adelante y arriba.\n" +
                        "Enfoque: En diagonal adelante y arriba.\n" +
                        "Si se invierte el 1/1 (360°) GIRO EN PASSÉ AL FRENTE, bajar el talón derecho y transferir\n" +
                        "el peso a la pierna izquierda. Además, invertir el recorrido de los brazos en preparación para\n" +
                        "el giro.\n" +
                        "Bajar el talón izquierdo, luego transferir el peso al pie derecho por medio de una de las\n" +
                        "preparaciones de giros aceptables que se muestran en el Glosario.\n" +
                        "Brazos: Hay dos opciones de preparación de brazos para empezar el giro:\n" +
                        "1. Mover ambos brazos a los lados-en medio.\n" +
                        "2. Bajar el brazo izquierdo al lado-en medio y levantar el brazo derecho curvado adelante en\n" +
                        "medio.\n" +
                        "Realizar un 1/1 (360°) GIRO EN PASSÉ AL FRENTE a la derecha en relevé, al flexionar la\n" +
                        "rodilla izquierda al frente y jalar el pie izquierdo en punta al frente hasta tocar la rodilla\n" +
                        "derecha (passé al frente). Marcar esta posición en relevé al completar el giro. Se permite\n" +
                        "que el talón baje al suelo después de marcar la posición.\n" +
                        "Brazos: Los brazos permanecen en la corona en el giro. El recorrido para mover los brazos\n" +
                        "hacia la corona es opcional.\n" +
                        "Revisado el 16 de agosto, 2021\n" +
                        "N4 Suelo - 17\n" +
                        "(*)\n" +
                        "1/1 (360º) GIRO\n" +
                        "EN PASSÉ AL\n" +
                        "FRENTE\n" +
                        "(0.40)\n" +
                        "0.10 Piernas en la posición incorrecta (no en\n" +
                        "passé al frente)\n" +
                        "0.30 Usar la técnica de giro de presión de talón\n" +
                        "Puntos de énfasis:\n" +
                        "colocación inmediata de la pierna libre en la posición de passé al frente, giro de 360°\n" +
                        "completo en relevé, control al terminar\n" +
                        "Dar un paso adelante en relevé sobre el pie izquierdo. Cerrar el pie derecho detrás del pie\n" +
                        "izquierdo en un “bloqueo” de equilibrio en relevé, mirando hacia la esquina 4.\n" +
                        "Brazos: En el paso con la izquierda, abrir ambos brazos hacia los lados-en medio. A medida\n" +
                        "que el pie derecho se cierra, mover los brazos hacia adelante, cruzando/envolviéndolos frente\n" +
                        "al cuerpo para tocar los hombros opuestos con las manos (abrazo).\n" +
                        "Enfoque: Opcional.\n" +
                        "Si se invirtió el 1/1 (360°) GIRO EN PASSÉ AL FRENTE, simplemente continuar con el\n" +
                        "texto como está escrito.\n" +
                        "Girar ¼ (90°) a la derecha, dar un paso a la izquierda (en planta) para terminar parada con\n" +
                        "piernas separadas mirando hacia el lado 5. Durante el giro, cambiar el peso al pie derecho,\n" +
                        "de modo que ambos pies estén sobre la planta y ligeramente girados en la parada con\n" +
                        "piernas separadas.\n" +
                        "Brazos: “Desenvolver” los brazos y bajar ambos brazos hacia abajo para terminar en diagonal\n" +
                        "abajo a los lados.\n" +
                        "Enfoque: Opcional.\n" +
                        "Sin mover los pies, girar el torso ¼ (90°) a la derecha para terminar con el torso mirando hacia\n" +
                        "la esquina 8 (se permite que la cadera gire ligeramente a la derecha).\n" +
                        "Brazos: Simultáneamente, empujar con precisión (flexionando y extendiendo) el brazo\n" +
                        "derecho al lado-arriba, o al lado-en medio y el brazo izquierdo al lado-arriba o completamente\n" +
                        "arriba (con la palma hacia afuera).\n" +
                        "Enfoque: A la derecha hacia el lado 3.\n" +
                        "Desenrollar el torso y transferir el peso al pie izquierdo mientras se gira al mismo tiempo 90° a\n" +
                        "la derecha, cerrando el pie derecho al lado del pie izquierdo para terminar parada recta (en\n" +
                        "planta o relevé), mirando hacia la esquina 8.\n" +
                        "Brazos: Mover hacia abajo o atrás en diagonal hacia abajo.\n" +
                        "Enfoque: Al frente hacia la esquina 8.");
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una buena coordinación para realizar el giro.\n" +
                        "Control: Es fundamental mantener el control del cuerpo durante el giro.\n" +
                        "Equilibrio: Mantén el equilibrio en la posición final.\n");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=qRCCHfGWPsA&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","P_n1_m7");
                intent.putExtra("titulo", "½ (180°) GIRO BOCA ABAJO A GIRO DE TRONCO/GIRAR A LEVANTARSE");
                startActivity(intent);
            }
        });

//Boton Movimiento8
        Movimiento8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m8_n4_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n4_m8);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Correr (sin número específico de pasos) y hacer una talacha con alguna de las tres técnicas\n" +
                        "de talacha aceptables mostradas en el Glosario y realizar una REDONDILLA.\n" +
                        "(*)\n" +
                        "REDONDILLA\n" +
                        "(0.40)\n" +
                        "Hasta 0.30 No pasar por la vertical\n" +
                        "0.10 No aterrizar con los dos pies al mismo\n" +
                        "tiempo.\n" +
                        "Puntos de énfasis:\n" +
                        "posiciones del cuerpo y brazos al lado de las orejas en todo momento\n" +
                        "Revisado el 6/6/21\n" +
                        "Esquema del patrón de Suelo\n" +
                        "corregido\n" +
                        "N4 Suelo - 19\n" +
                        "FLIC-FLAC (0.60)\n" +
                        "FLIC-FLAC (0.60)\n" +
                        "Brincar inmediatamente hacia atrás a las manos en una posición del cuerpo extendida\n" +
                        "invertida para realizar dos FLIC-FLACS. Empujar explosivamente desde el suelo inclinado\n" +
                        "con los brazos y los hombros mientras simultáneamente baja de golpe para aterrizar con\n" +
                        "ambos pies en una posición de pie y ahuecada del cuerpo.\n" +
                        "Rebotar inmediatamente con el cuerpo extendido. Aterrizar en demi-plié en posición\n" +
                        "controlada y equilibrada (“plantada”). Pausar.\n" +
                        "Brazos: Arriba en todo momento. A medida que se produce el aterrizaje del rebote, la\n" +
                        "posición de brazos es opcional.\n" +
                        "Estirar las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Mover hasta arriba, después abrir en diagonal arriba a los lados.\n" +
                        "FLIC-FLACS\n" +
                        "A DOS PIES\n" +
                        "(Cada uno 0.60)\n" +
                        "Cada vez hasta 0.30 Hacer cuclillas antes del flic-flac\n" +
                        "Cada vez 0.10 No aterrizar con los dos pies al\n" +
                        "mismo tiempo.\n" +
                        "0.10 No rebotar inmediatamente\n" +
                        "0.05 No pausar en un “plantado”\n" +
                        "controlado\n" +
                        "Puntos de énfasis:\n" +
                        "aceleración, potencia y piernas extendidas en todo momento\n" +
                        "Falta de aceleración\n" +
                        "en la serie\n" +
                        "Hasta 0.20 No aplica si se toma una deducción de\n" +
                        "0.30 por detenerse entre los elementos\n" +
                        "14. Caída hacia los dedos (de una pierna) a pose arrodillada/sentada\n" +
                        "Pose lateral ½ arrodillada, Pose final\n" +
                        "cambio vista\n" +
                        "cambio vista\n" +
                        "Dar un paso adelante con el pie derecho en planta.\n" +
                        "Brazos: Bajar ambos brazos hacia los lados-abajo o hasta completamente abajo.\n" +
                        "Apuntar el pie/dedos del pie izquierdo hacia abajo, luego presionar a relevé con el pie\n" +
                        "derecho. Simultáneamente realizar un arco con la espalda alta.\n" +
                        "Brazos: A medida que el pie/dedos del pie izquierdo apunta hacia abajo, levantar ambos\n" +
                        "brazos hacia adelante-arriba a la corona. A medida que el cuerpo se arquea, presionar los\n" +
                        "brazos hacia los lados o a los lados en diagonal arriba.\n" +
                        "Enfoque: Cuando el pie/los dedos apunten hacia abajo, llevar la cabeza hacia atrás y mirar\n" +
                        "hacia el techo.\n" +
                        "Con los dedos hacia abajo, hacer demi-plié con la pierna derecha para empezar la caída\n" +
                        "hacia los dedos (de una pierna) para llegar a una pose arrodillada/sentada con el\n" +
                        "metatarso del pie derecho junto a la rodilla/espinilla izquierda. La pierna izquierda se\n" +
                        "encuentra flexionada con la espinilla izquierda en el suelo y el pie izquierdo en punta. Los\n" +
                        "glúteos apoyados sobre el talón izquierdo y el torso contraído hacia adelante.\n" +
                        "Brazos: Bajar ambos brazos hacia los lados y abajo para apoyar las puntas de los dedos en\n" +
                        "el suelo a los lados del cuerpo.\n" +
                        "Enfoque: Abajo.\n" +
                        "Levantar los glúteos del talón izquierdo y extender la cadera y el torso. Levantar y extender la\n" +
                        "pierna derecha y apuntar el pie derecho hacia afuera hacia el lado 7. El torso se encuentra\n" +
                        "hacia la esquina 4 para completar la pose lateral ½ arrodillada.\n" +
                        "Brazos: Levantar hacia los lados-arriba o hacia los lados-en medio.\n" +
                        "Enfoque: Al frente.\n" +
                        "Flexionar y cerrar la pierna derecha junto a la pierna izquierda para terminar en la pose final.\n" +
                        "En la pose final, la gimnasta debe tener las rodillas y los muslos juntos en una pose erguida\n" +
                        "de rodillas o en una pose arrodillada/sentada con los glúteos apoyados en los talones. La\n" +
                        "rodilla izquierda debe permanecer en contacto con el suelo en todo momento.\n" +
                        "Brazos: Opcional.\n" +
                        "Enfoque: Opcional.\n" +
                        "Torso: Opcional.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere una gran flexibilidad en la espalda.\n" +
                        "Fuerza: Se necesita fuerza en el core para mantener la posición.\n" +
                        "Equilibrio: Mantener el equilibrio en la posición de redondilla es difícil.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=qRCCHfGWPsA&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","P_n1_m8");
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

