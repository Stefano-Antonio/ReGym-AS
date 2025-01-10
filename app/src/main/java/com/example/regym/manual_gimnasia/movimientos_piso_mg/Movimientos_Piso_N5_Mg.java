package com.example.regym.manual_gimnasia.movimientos_piso_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;


public class Movimientos_Piso_N5_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_piso_n5_mg);

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

//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N5_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n5_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n5_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Pararse a lo largo del lado 3, mirando hacia el lado 7. Los números de la ilustración coinciden\n" +
                        "con el tiempo/ritmo de la música.\n" +
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
                        "Enfoque: A la derecha.\n" +
                        "2. Brazos: Levantar el brazo izquierdo hacia al lado-arriba hasta completamente arriba,\n" +
                        "palma hacia afuera. La mano derecha permanece en la espalda.\n" +
                        "3. Empujar hacia abajo el suelo con la pierna izquierda y levantar ligeramente el talón\n" +
                        "izquierdo a relevé para realizar un ¼ (90°) de giro con presión de talón hacia afuera y a la\n" +
                        "derecha para terminar mirando hacia el lado 1. Simultáneamente, flexionar y levantar la\n" +
                        "pierna derecha para apuntar el pie derecho al lado de la rodilla izquierda (passé al frente).\n" +
                        "Brazos: Bajar el brazo izquierdo hacia al frente-abajo para terminar fluidamente al frenteen\n" +
                        "medio con la mano extendida, palma hacia abajo. La mano derecha permanece en la\n" +
                        "espalda.\n" +
                        "Enfoque: A la izquierda.\n" +
                        "4. Dar un paso atrás con la derecha en relevé.\n" +
                        "Brazos: Ambos brazos comienzan a bajar hacia atrás y abajo.\n" +
                        "5. Bajar el talón. Cruzar la pierna izquierda sobre la derecha al colocar la pantorrilla izquierda\n" +
                        "sobre la espinilla derecha. El pie izquierdo no debe tocar el suelo.\n" +
                        "Brazos: Ambos brazos bajan hacia atrás-abajo para terminar atrás en diagonal abajo.\n" +
                        "Enfoque: Opcional.\n" +
                        "N5 Suelo - 3\n" +
                        "2. MORTAL AGRUPADO AL FRENTE (0.60)\n" +
                        "O (*) INVERSIÓN LIBRE LATERAL (0.60)\n" +
                        "O (*) INVERSIÓN LIBRE AL FRENTE (0.60)\n" +
                        "2a. MORTAL AGRUPADO AL FRENTE (0.60)\n" +
                        "Correr (sin número específico de pasos) y balancear cualquiera de las piernas hacia adelante,\n" +
                        "empujando el suelo con la pierna opuesta para aterrizar con ambos pies al mismo tiempo.\n" +
                        "Empujar inmediatamente con ambos pies y el cuerpo en posición vertical. A medida que el\n" +
                        "cuerpo se eleva, levantar la cadera hacia arriba mientras se invierte el cuerpo, redondeando la\n" +
                        "parte superior de la espalda y flexionando la cadera y las rodillas (mínimo 135° - ideal 90°)\n" +
                        "para lograr una posición agrupada apretada y realizar un MORTAL AGRUPADO AL\n" +
                        "FRENTE. En preparación para el aterrizaje, extender el cuerpo de la posición agrupada.\n" +
                        "Brazos: Opcionales en el despegue (se prefiere la técnica de lanzamiento por encima del\n" +
                        "brazo en el despegue). Opcionales al aterrizar.\n" +
                        "Aterrizar en demi-plié e inmediatamente dar un paso adelante sobre la pierna derecha (girada)\n" +
                        "en demi-plié, pasando por la 4ta posición en demi-plié. Extender ambas piernas para pararse\n" +
                        "con la pierna izquierda extendida hacia atrás y el pie izquierdo apuntando al suelo, ambos\n" +
                        "pies girados hacia afuera.\n" +
                        "Brazos: Levantar en diagonal arriba a los lados.\n" +
                        "Enfoque: En diagonal adelante y arriba.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Alineación: La posición del cuerpo debe ser perfecta y alineada.\n" +
                        "Equilibrio: La pose inicial debe ser estable y transmitir fuerza.\n" +
                        "Expresión: La pose debe reflejar la personalidad y el estilo del gimnasta.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9D__4XNOJXk&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","P_n5_m1");
                intent.putExtra("titulo", "Pose INICIAL");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n5_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n5_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso adelante con la izquierda.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba.\n" +
                        "Enfoque: Al frente.\n" +
                        "Hacer talacha con una de las técnicas aceptables de talachas que se muestran en el Glosario\n" +
                        "y dar un paso adelante (O simplemente dar un paso adelante sin talacha) con el pie derecho\n" +
                        "con una entrada de “tipo escalador”. Balancear la pierna izquierda hacia atrás y arriba para\n" +
                        "iniciar la rotación. Cuando la pierna izquierda se acerque a la vertical, empujar el suelo con el\n" +
                        "pie derecho para realizar una INVERSIÓN LIBRE LATERAL y terminar con la pierna\n" +
                        "izquierda extendida (o ligeramente doblada), cerrar inmediatamente el pie derecho detrás del\n" +
                        "pie izquierdo para terminar con ambas piernas extendidas y los pies en planta (los pies\n" +
                        "pueden estar paralelos o ligeramente girados hacia afuera) (figura 9) O para terminar en un\n" +
                        "desplante izquierdo, presionando la rodilla izquierda y toda la cadera hacia adelante (figura\n" +
                        "10).\n" +
                        "Brazos: Opcionales en el inicio y durante la INVERSIÓN LIBRE LATERAL. Al aterrizar,\n" +
                        "levantar el brazo izquierdo para terminar en diagonal arriba al lado.\n" +
                        "Enfoque: Durante el paso y el inicio, el enfoque está en el suelo. Al final, el enfoque está en\n" +
                        "diagonal adelante y arriba.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Fuerza: Requiere una fuerza excepcional en el core y los hombros.\n" +
                        "Equilibrio: Mantener el cuerpo recto y alineado durante la inversión es crucial.\n" +
                        "Control: La entrada y salida de la inversión deben ser suaves y controladas.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9D__4XNOJXk&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","P_n5_m2");
                intent.putExtra("titulo", "(*) INVERSIÓN LIBRE LATERAL");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n5_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n5_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso adelante con la izquierda.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba.\n" +
                        "Enfoque: Al frente.\n" +
                        "Hacer talacha con una de las técnicas aceptables de talachas que se muestran en el Glosario\n" +
                        "y dar un paso adelante (O simplemente dar un paso adelante sin talacha) con el pie derecho\n" +
                        "con una entrada de “tipo escalador”. Balancear la pierna izquierda hacia atrás y arriba para\n" +
                        "iniciar la rotación. Cuando la pierna izquierda se acerque a la vertical, empujar el suelo con el\n" +
                        "pie derecho para realizar una INVERSIÓN LIBRE AL FRENTE. Terminar con la pierna\n" +
                        "izquierda extendida (o ligeramente doblada) e inmediatamente cerrar el pie derecho delante o\n" +
                        "al lado del (junto al) pie izquierdo para terminar con ambas piernas extendidas y los pies en\n" +
                        "planta (los pies pueden estar paralelos o ligeramente girados hacia afuera) O después de\n" +
                        "aterrizar sobre la pierna izquierda, dar un paso adelante con la derecha y cerrar el pie\n" +
                        "izquierdo detrás o al lado del (junto al) pie derecho.\n" +
                        "Brazos: Opcionales en el inicio y durante la INVERSIÓN LIBRE AL FRENTE. Al aterrizar,\n" +
                        "levantar los brazos hasta arriba y luego abrir a los lados en diagonal arriba.\n" +
                        "Enfoque: Durante el paso y el inicio, el enfoque está en el suelo. Al final, el enfoque está en\n" +
                        "diagonal adelante y arriba.\n" +
                        "(*)\n" +
                        "INVERSIÓN LIBRE AL\n" +
                        "FRENTE\n" +
                        "(0.60)\n" +
                        "Ver Faltas y Penalizaciones generales\n" +
                        "Puntos de énfasis:\n" +
                        "buena altura, piernas extendidas\n" +
                        "2a. Después de completar el MORTAL AL FRENTE\n" +
                        "Levantarse a relevé con el pie derecho y simultáneamente girar 45° a la izquierda mientras se\n" +
                        "cierra el pie izquierdo al lado del pie derecho para terminar en una pose en relevé en 1ra\n" +
                        "posición con ambos pies girados hacia afuera con el torso hacia el lado 1.\n" +
                        "2b. Al terminar la INVERSIÓN LIBRE LATERAL.\n" +
                        "Si se terminó en un desplante, levantarse a relevé con el pie izquierdo y simultáneamente\n" +
                        "girar 135° a la derecha mientras se cierra el pie derecho al lado del pie izquierdo para terminar\n" +
                        "en una pose en relevé en 1ra posición con ambos pies girados hacia afuera con el torso hacia\n" +
                        "el lado 1. Si la INVERSIÓN LIBRE LATERAL se terminó con los pies cerrados, simplemente\n" +
                        "girar 135° en el lugar para terminar en una pose en relevé en 1ra posición con ambos pies\n" +
                        "girados hacia afuera.\n" +
                        "Si se invirtió la INVERSIÓN LIBRE LATERAL, dar un paso atrás con la derecha en relevé y\n" +
                        "levantarse a relevé con el pie izquierdo. Simultáneamente, girar 135° a la derecha, luego\n" +
                        "cerrar el pie izquierdo al lado del pie derecho para terminar en una pose en relevé en 1ra\n" +
                        "posición con ambos pies girados hacia afuera.\n" +
                        "2c. Al terminar la INVERSIÓN LIBRE AL FRENTE.\n" +
                        "Levantarse a relevé con ambos pies y simultáneamente girar 45° a la izquierda para terminar\n" +
                        "en una pose en relevé en 1ra posición con ambos pies girados hacia afuera con el torso hacia\n" +
                        "el lado 1.\n" +
                        "Brazos para las 3 elecciones: Levantar hasta arriba a la coronRae. visado el 6 de junio, 2021\n" +
                        "N5 Suelo - 6\n" +
                        "3. Pose en relevé, Desplante lateral, Posé de contracción de passé al frente, Desplante\n" +
                        "lateral\n" +
                        "Desde la pose en relevé, bajar inmediatamente el talón izquierdo, hacer demi-plié con la\n" +
                        "pierna izquierda y extender la pierna derecha a un desplante lateral, con el pie derecho\n" +
                        "apuntado para tocar el suelo.\n" +
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
                        "Enfoque: A la derecha, hacia la esquina 2." +
                        "<Brazos>: Al finalizar la rodada, colocar la mano derecha en la cadera y levantar el brazo izquierdo hacia adelante y arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Fuerza: Requiere una fuerza aún mayor que la inversión lateral.\n" +
                        "Equilibrio: Mantener el cuerpo recto y alineado durante la inversión es aún más difícil.\n" +
                        "Control: La entrada y salida de la inversión deben ser perfectas.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9D__4XNOJXk&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","P_n5_m3");
                intent.putExtra("titulo", "(*) INVERSIÓN LIBRE AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n5_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n5_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "El giro chainé terminará mirando hacia la esquina 2.\n" +
                        "Empujar el pie izquierdo y transferir el peso (paso) a un pie derecho girado hacia afuera en\n" +
                        "relevé. Realizar ½ (180°) giro hacia la derecha con la pierna izquierda extendida hacia abajo.\n" +
                        "Al finalizar el ½ (180°) giro, colocar el pie izquierdo girado hacia afuera en relevé junto al pie\n" +
                        "derecho para pasar por una 1ra posición ligeramente abierta. Continuar girando ¾ (270°) a la\n" +
                        "derecha con el pie izquierdo en relevé con la pierna derecha extendida y el pie derecho\n" +
                        "apuntado hacia el suelo.\n" +
                        "Brazos: Abrir ambos brazos a los lados-en medio, luego moverlos a curvados adelante-en\n" +
                        "medio al completar el ½ (180°) giro. Por el resto del giro, levantar los brazos hacia adelantearriba\n" +
                        "a la corona.\n" +
                        "Completar el giro chainé al dar un paso adelante con la derecha, luego dar un paso largo\n" +
                        "adelante con la izquierda hacia la esquina 2 para terminar con una pose en desplante\n" +
                        "izquierdo con la pierna izquierda en demi-plié y la pierna derecha extendida hacia atrás, los\n" +
                        "dedos del pie derecho apuntados sobre el suelo, con el pie y la rodilla ligeramente girados\n" +
                        "hacia afuera.\n" +
                        "Brazos: Hacer un círculo con ambos brazos hacia atrás-abajo o hasta completamente abajo.\n" +
                        "Continuar levantando ambos brazos, con las palmas hacia arriba, hacia adelante y arriba para\n" +
                        "terminar amplios en diagonal adelante y arriba. Los brazos deben terminar cuando se hace la\n" +
                        "pose en desplante.\n" +
                        "Enfoque: En diagonal adelante y arriba.\n" +
                        "Hacia la derecha, realizar ½ (180°) giro pivote con los pies separados y terminar con la\n" +
                        "pierna izquierda extendida y el pie izquierdo en planta. El talón derecho se levanta del suelo (arco forzado), hacia afuera para terminar en una pose en desplante derecho, distribuyendo\n" +
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
                        "5. (*) RESORTE A UNA PIERNA (0.60),\n" +
                        "(*) RESORTE A UNA PIERNA (0.60),\n" +
                        "(*) INVERSIÓN LATERAL (0.40),\n" +
                        "RODADA ATRÁS CON BRAZOS EXTENDIDOS A PARADA DE MANOS\n" +
                        "(0.40)\n" +
                        "cambio vista\n" +
                        "Revisado el 12 de junio, 2021\n" +
                        "Fig #2 eliminada (paso izquierdo) en\n" +
                        "la 1ra fila\n" +
                        "N5 Suelo - 10\n" +
                        "(*) RESORTE A UNA PIERNA (0.60)\n" +
                        "(*) RESORTE A UNA PIERNA (0.60)\n" +
                        "Hacer una talacha con potencia o dar un paso con la izquierda y hacer la talacha con una de\n" +
                        "las técnicas aceptables que se muestran en el Glosario.\n" +
                        "Estirar ambas manos hacia adelante y colocarlas en el suelo, una al lado de la otra, a la altura\n" +
                        "de los hombros, mientras se patea la pierna izquierda hacia atrás y hacia arriba por encima de\n" +
                        "la cabeza. Cuando las manos toquen el suelo, extenderse con fuerza a través de los hombros\n" +
                        "creando un movimiento fuerte hacia atrás y hacia arriba. Rotar el cuerpo en una posición\n" +
                        "apretada y extendida para realizar un RESORTE A UNA PIERNA. Dar un paso adelante con\n" +
                        "la derecha y repetir un segundo RESORTE A UNA PIERNA.\n" +
                        "Mientras se realizan los RESORTES A UNA PIERNA, el objetivo del elemento es acelerar y\n" +
                        "rotar rápidamente. Se debe evitar un bloqueo largo y alto. Debe parecerse a un arco al frente\n" +
                        "a una pierna potente con un vuelo y una altura mínimos. Una técnica aceptable es inclinar\n" +
                        "ambos hombros (plancha) sobre las muñecas mientras se activa la patada hacia atrás.\n" +
                        "Brazos: Levantar los brazos hacia adelante y arriba, cubriendo las orejas hasta que se haga\n" +
                        "contacto con el suelo. Los brazos permanecen junto a las orejas en todo momento y el ángulo\n" +
                        "de los hombros se abre en la fase posterior al vuelo del elemento. Si se usa la técnica de\n" +
                        "“plancha”, no se requiere un ángulo de hombros abierto en todo momento, pero debe\n" +
                        "mostrarse al final del elemento.\n" +
                        "Enfoque: Hacia las manos en todo momento, con la cabeza neutra y la barbilla hacia adelante.\n" +
                        "(*) INVERSIÓN LATERAL (0.40)\n" +
                        "Al terminar el segundo RESORTE A UNA PIERNA, continuar hacia adelante para realizar una\n" +
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
                        "RODADA ATRÁS CON BRAZOS EXTENDIDOS A PARADA DE MANOS (0.40)\n" +
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
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una coordinación extremadamente precisa.\n" +
                        "Velocidad: Los giros deben ser rápidos y fluidos.\n" +
                        "Equilibrio: Mantener el equilibrio en el desplante después del giro es crucial.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9D__4XNOJXk&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","P_n5_m4");
                intent.putExtra("titulo", "½ (180°) + ¾ (270°) GIRO chainé, Pose EN DESPLANTE");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n5_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n5_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Desplazándose hacia atrás a lo largo de una línea diagonal hacia el lado 7, girar 45° a la\n" +
                        "derecha y dar un paso atrás sobre la pierna izquierda en demi-plié. Empujar el suelo\n" +
                        "extendiéndose a través de la cadera, rodilla, tobillo y los dedos del pie del lado izquierdo para\n" +
                        "realizar un salto hop en passé atrás. Durante el salto hop en passé atrás, flexionar la\n" +
                        "rodilla derecha hacia adelante y jalar el pie derecho en punta arriba hasta tocar la rodilla\n" +
                        "izquierda (passé al frente). Aterrizar en demi-plié con la pierna izquierda con el pie izquierdo\n" +
                        "girado hacia afuera.\n" +
                        "Brazos: Bajar el brazo derecho hacia abajo a la cadera derecha. Baje el brazo izquierdo al\n" +
                        "lado-abajo hasta completamente abajo y continuar levantándolo hacia adelante-arriba para\n" +
                        "terminar adelante-en medio con la palma hacia abajo.\n" +
                        "Enfoque: Al frente hacia el lado 5.\n" +
                        "Al aterrizar el salto hop en passé atrás, girar 45° a la derecha y dar un paso hacia al lado al\n" +
                        "pie derecho (girado hacia afuera) a través de la 2da posición en demi-plié con los talones en o\n" +
                        "cerca del suelo. Empujar el suelo con ambos pies para realizar un chassé lateral, cerrando el\n" +
                        "pie izquierdo al lado del pie derecho en el aire.\n" +
                        "Brazos: Mover el brazo izquierdo al lado-en medio. Simultáneamente, levantar el brazo\n" +
                        "derecho hacia al lado-arriba o al lado-en medio.\n" +
                        "Aterrizar en demi-plié en la pierna izquierda con el pie izquierdo ligeramente girado. La pierna\n" +
                        "derecha se abre al lado, apuntando el pie derecho hacia el suelo.\n" +
                        "Continuar en diagonal hacia el lado 7, dar un paso adelante con la derecha en demi-plié.\n" +
                        "Brazos: Bajar ambos brazos hacia los lados-abajo o hasta completamente abajo.\n" +
                        "Empujar el suelo extendiéndose a través de la cadera, rodilla, tobillo y dedos de los pies del\n" +
                        "lado derecho para realizar un salto hop en passé con 135° de giro a la derecha para\n" +
                        "Revisado el 6 de junio, 2021\n" +
                        "Oración repetida eliminada al\n" +
                        "final del 1er párrafo\n" +
                        "N5 Suelo - 15\n" +
                        "terminar mirando hacia el lado 3. Durante el salto hop en passé, flexionar la rodilla izquierda\n" +
                        "hacia adelante y jalar el pie izquierdo en punta arriba hasta tocar la rodilla derecha (passé al\n" +
                        "frente). Aterrizar en demi-plié con la pierna derecha.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba a la corona.\n" +
                        "Hacia el lado 3, dar un paso adelante con el pie izquierdo (ligeramente girado) a través de la\n" +
                        "4ta posición en demi-plié. Empujar el suelo con ambos pies para realizar un chassé al frente,\n" +
                        "cerrando el pie derecho detrás del pie izquierdo en el aire (5ta posición apretada). Aterrizar en\n" +
                        "demi-plié en la pierna derecha con el pie derecho ligeramente girado. La pierna izquierda\n" +
                        "permanece al frente, apuntando hacia el suelo.\n" +
                        "Brazos: Mover ambos brazos hacia los lados-abajo o al lado-en medio y permanecer en\n" +
                        "medio-al lado para el chassé al frente.\n" +
                        "8a. SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS (150°) (0.60), Pose de\n" +
                        "pescado (O)\n" +
                        "8b. SALTO LEAP SWITCH (150°) (0.60), Pose de pescado\n" +
                        "SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS (150°) (0.60)\n" +
                        "8a. Dar un paso largo (o carrera baja con la pierna extendida) con el pie izquierdo en demiplié,\n" +
                        "después balancear la pierna derecha extendida hacia adelante y arriba hasta la\n" +
                        "horizontal y empujar el suelo con la pierna izquierda. Balancear la pierna izquierda hacia\n" +
                        "atrás-arriba para realizar un SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS con un\n" +
                        "mínimo 150° de separación uniforme de piernas en el vuelo.\n" +
                        "Aterrizar sobre la pierna derecha en demi-plié con la pierna izquierda extendida hacia atrás y\n" +
                        "ligeramente girada hacia afuera al pasar por una posición de arabesca baja. El enfoque está\n" +
                        "en la alineación del cuerpo y la altura del salto leap split.\n" +
                        "SALTO LEAP SWITCH (150°) (0.60)\n" +
                        "8b. Dar dos pasos largos (o carrera baja con la pierna extendida) con el pie izquierdo,\n" +
                        "derecho, en demi-plié, después balancear la pierna izquierda extendida hacia adelante y\n" +
                        "arriba hasta mínimo 45° y empujar el suelo con la pierna derecha. Mientras está en el vuelo,\n" +
                        "balancear dinámicamente la pierna izquierda hacia atrás mientras simultáneamente se\n" +
                        "balancea la pierna derecha hacia adelante para realizar un SALTO LEAP SWITCH con un\n" +
                        "mínimo de 150° de separación uniforme de las piernas en vuelo.\n" +
                        "Aterrizar sobre la pierna derecha en demi-plié con la pierna izquierda extendida hacia atrás y\n" +
                        "ligeramente girada hacia afuera al pasar por una posición de arabesca baja. El enfoque está\n" +
                        "en la alineación del cuerpo y la altura del salto leap switch.\n" +
                        "en el aterrizaje del salto LEAP, usar una de las tres posiciones de brazos aceptables para los\n" +
                        "saltos leap mostradas en el Glosario.\n" +
                        "Continuar en dirección al lado 3, dar un paso adelante con la izquierda en relevé.\n" +
                        "Brazos: Bajar ambos brazos hasta completamente abajo.\n" +
                        "Enfoque: Abajo.\n" +
                        "Dar un paso adelante con la derecha en relevé y flexionar la pierna izquierda hacia atrás y\n" +
                        "arriba a mínimo 90° para terminar con ambas rodillas juntas para realizar la pose de\n" +
                        "pescado.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba o completamente arriba, palmas hacia\n" +
                        "enfrente.\n" +
                        "Enfoque: Arriba al techo.");
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una coordinación excepcional entre los pies y brazos.\n" +
                        "Ritmo: El movimiento debe ser fluido y rítmico.\n" +
                        "Precisión: La rotación de 135° debe ser precisa y controlada.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9D__4XNOJXk&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","P_n5_m5");
                intent.putExtra("titulo", "SALTO HOP EN PASSÉ ATRÁS, CHASSÉ LATERAL, SALTO HOP CON ¾ (135°)");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n5_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n5_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso adelante (en planta o relevé y con el pie paralelo o girado) a la izquierda. Cerrar\n" +
                        "el pie derecho al lado del pie izquierdo en paralelo O cerrar el pie derecho (adelante o atrás)\n" +
                        "para tocar el pie izquierdo en 1ra, 3ra o 5ta posición girada hacia afuera. Hacer demi-plié con\n" +
                        "ambas piernas.\n" +
                        "Brazos: Bajar ambos brazos a los lados-abajo hasta completamente abajo o atrás en\n" +
                        "diagonal abajo.\n" +
                        "Enfoque: Al frente.\n" +
                        "Empujar el suelo, extendiendo las piernas a través de la cadera, rodillas, tobillos y dedos de\n" +
                        "los pies para realizar un SALTO JUMP SQUAT con un mínimo de 150° de separación\n" +
                        "uniforme de piernas. Durante el SALTO JUMP SQUAT, la gimnasta debe mostrar las piernas\n" +
                        "giradas con las rodillas hacia el techo (el SALTO JUMP SQUAT puede ser un salto de split\n" +
                        "lateral o un salto carpado con las piernas separadas). Aterrizar con ambos pies uno al lado del\n" +
                        "otro en demi-plié.\n" +
                        "Brazos: Levantar ambos brazos para terminar hacia los lados en diagonal arriba en el salto\n" +
                        "(el recorrido es opcional). Mover los brazos a la corona en el aterrizaje.\n" +
                        "Mientras se realiza un arco con la parte superior del cuerpo, dar un paso atrás con la izquierda\n" +
                        "en relevé, luego con la derecha, colocando la espinilla derecha en el suelo mientras se baja el\n" +
                        "cuerpo para terminar en una pose arrodillada/sentada con el metatarso del pie izquierdo\n" +
                        "junto a la rodilla/espinilla derecha. La pierna derecha se encuentra flexionada con la espinilla\n" +
                        "derecha en el suelo y el pie derecho en punta. Los glúteos apoyados sobre el talón derecho.\n" +
                        "Brazos: Abrir ambos brazos en diagonal arriba a los lados en el paso izquierdo. Continuar\n" +
                        "bajando ambos brazos hacia los lados-abajo para apoyar los dedos en el suelo.\n" +
                        "Enfoque: En el paso con la izquierda, el enfoque está arriba. En la pose arrodillada/sentada,\n" +
                        "el enfoque está abajo.\n" +
                        "Levantar los glúteos del talón derecho y girar el torso ¼ (90°) a la izquierda. Levantar y\n" +
                        "extender la pierna izquierda y apuntar el pie izquierdo hacia el lado 7. El torso se encuentra\n" +
                        "hacia el lado 1 para completar la pose ½ arrodillada. El torso y la pierna izquierda deben\n" +
                        "estar en línea recta entre sí.\n" +
                        "Brazos: Estirar la mano derecha hacia adelante a lo largo del suelo hacia el lado 3. Poner todo\n" +
                        "el peso en la mano derecha. Simultáneamente, mover el brazo izquierdo al lado-abajo para\n" +
                        "terminar en diagonal arriba al lado.\n" +
                        "Enfoque: En la mano derecha.\n" +
                        "Mientras el torso da ¾ (135°) de giro hacia la izquierda para mirar hacia la esquina 6, sentarse\n" +
                        "hacia atrás, bajar y rodar hacia la derecha, luego poner la cadera izquierda en el suelo.\n" +
                        "Simultáneamente, flexionar la pierna izquierda un mínimo de 90° en una posición girada\n" +
                        "ligeramente separada del suelo (el lado de la pierna derecha todavía se encuentra en el suelo\n" +
                        "en este punto).\n" +
                        "N5 Suelo - 18\n" +
                        "Brazos: Mientras se mantiene la presión sobre la mano derecha, mover la mano izquierda\n" +
                        "hacia atrás y abajo para terminar con ambas manos colocadas en el suelo detrás de la\n" +
                        "espalda.\n" +
                        "Sin dudarlo, continuar girando el torso ¼ (90°) hacia la izquierda para terminar mirando hacia\n" +
                        "la esquina 4. Durante el ¼ (90°) de giro, bajar la pierna izquierda y cruzar la pierna derecha\n" +
                        "flexionada sobre la pierna izquierda para pasar por una posición de sentado agrupado\n" +
                        "momentánea con la pierna izquierda flexionada debajo de la pierna derecha.");
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere una flexibilidad extrema en las piernas.\n" +
                        "Fuerza: Se necesita una fuerza explosiva en las piernas para realizar el salto.\n" +
                        "Precisión: La rotación de 150° debe ser precisa y controlada.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9D__4XNOJXk&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","P_n5_m6");
                intent.putExtra("titulo", "SALTO JUMP SQUAT (150°)");
                startActivity(intent);
            }
        });

//Boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m7_n5_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n5_m7);  // Recurso de la tabla
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
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere una flexibilidad extrema en las piernas.\n" +
                        "Equilibrio: Mantener el equilibrio en la posición de split es muy difícil.\n" +
                        "Profundidad: El split debe ser profundo y controlado.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9D__4XNOJXk&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","P_n5_m7");
                intent.putExtra("titulo", "Pose ½ arrodillada, SPLIT AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento8
        Movimiento8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m8_n5_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n5_m8);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Al realizar el ½ (180°) giro boca abajo a giro de tronco, el cuerpo hará un giro completo 1/1\n" +
                        "(360°) que comienza con el SPLIT AL FRENTE mirando la esquina 4 para terminar de pie\n" +
                        "frente a la esquina 4.\n" +
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
                        "N5 Suelo - 20\n" +
                        "12. “Bloqueo” de equilibrio en relevé, 1/1 (360°) GIRO EN PASSÉ AL FRENTE (0.40),\n" +
                        "“Bloqueo” de equilibrio en relevé, Parada con piernas separadas,\n" +
                        "Parada recta\n" +
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
                        "que el talón baje al suelo después de marcar esta posición.\n" +
                        "Brazos: Los brazos permanecen en la corona en el giro. El recorrido para mover los brazos\n" +
                        "hacia la corona es opcional.\n" +
                        "Revisado el 16 de agosto, 2021\n" +
                        "N5 Suelo - 21\n" +
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
                        "izquierdo en un “bloqueo” de equilibrio en relevé mirando hacia la esquina 4.\n" +
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
                        "Enfoque: Al frente hacia la esquina 8.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una coordinación excepcional para realizar el giro.\n" +
                        "Control: Es fundamental mantener el control del cuerpo durante el giro.\n" +
                        "Equilibrio: Mantén el equilibrio en la posición final.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9D__4XNOJXk&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","P_n5_m8");
                intent.putExtra("titulo", "½ (180°) GIRO BOCA ABAJO A GIRO DE TRONCO/GIRAR A LEVANTARSE");
                startActivity(intent);
            }

        });

        //Boton Movimiento9
        Movimiento9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m9_n5_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n5_m9);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Correr (sin número específico de pasos) y hacer una talacha con alguna de las tres técnicas\n" +
                        "de talacha aceptables mostradas en el Glosario y realizar una REDONDILLA, FLIC-FLAC.\n" +
                        "MORTAL ATRÁS AGRUPADO (0.6)\n" +
                        "Al aterrizar el FLIC-FLAC en los metatarsos, rebotar inmediatamente (empujar) con el cuerpo\n" +
                        "extendido, la cabeza en posición neutra y los brazos extendidos hacia arriba. A medida que el\n" +
                        "cuerpo se eleva (abandonando el suelo en la vertical), levantar las rodillas hacia adelante y\n" +
                        "arriba, hacia las manos para lograr una posición agrupada de mínimo 90 (ángulo de cadera y\n" +
                        "rodillas). El agarre de las piernas con las manos es opcional. Continuar rotando hacia arriba y\n" +
                        "atrás mientras la cadera gira por encima de la cabeza para realizar un MORTAL ATRÁS\n" +
                        "AGRUPADO. En preparación para el aterrizaje, extender el cuerpo de la posición agrupada.\n" +
                        "Aterrizar en demi-plié en posición controlada y equilibrada (“plantada”). Pausar.\n" +
                        "Brazos: En posición arriba en la talacha y en toda la REDONDILLA, FLIC-FLAC y el\n" +
                        "despegue para el MORTAL ATRÁS AGRUPADO. Los brazos son opcionales durante el\n" +
                        "MORTAL. Al aterrizar el MORTAL, la posición de brazos es opcional.\n" +
                        "Estirar las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Mover hasta arriba, después abrir en diagonal arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere una flexibilidad extrema en la espalda.\n" +
                        "Fuerza: Se necesita una fuerza excepcional en el core para mantener la posición.\n" +
                        "Equilibrio: Mantener el equilibrio en la posición de redondilla es muy difícil.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9D__4XNOJXk&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","P_n5_m9");
                intent.putExtra("titulo", "½ (180°) GIRO BOCA ABAJO A GIRO DE TRONCO/GIRAR A LEVANTARSE");
                startActivity(intent);
            }

        });

        //Boton Movimiento10
        Movimiento10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m10_n5_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n5_m10);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso adelante con la derecha y cerrar el pie izquierdo al lado del pie derecho (los pies\n" +
                        "están en planta). Hacer demi-plié con ambas piernas.\n" +
                        "Brazos: Bajar ambos brazos hacia los lados-abajo o hasta completamente abajo.\n" +
                        "Extender ambas piernas y presionar hacia abajo con los metatarsos para empujar la parte\n" +
                        "superior de ambos pies hacia adelante y apuntar los pies/dedos hacia abajo. Cuando los\n" +
                        "pies/dedos apunten hacia abajo, realizar un arco con la espalda alta.\n" +
                        "Revisado el 12 de junio, 2021\n" +
                        "N5 Suelo - 24\n" +
                        "Brazos: A medida que se extienden las piernas, levantar ambos brazos hacia adelante-arriba\n" +
                        "a la corona. A medida que el cuerpo se arquea, presionar los brazos hacia los lados o a los\n" +
                        "lados en diagonal arriba.\n" +
                        "Enfoque: Cuando el pie/los dedos apunten hacia abajo, llevar la cabeza hacia atrás y mirar\n" +
                        "hacia el techo.\n" +
                        "Con los dedos hacia abajo, hacer demi-plié para comenzar la caída hacia los dedos para\n" +
                        "llegar a una pose arrodillada/sentada con los glúteos apoyados en los talones y el torso\n" +
                        "contraído hacia adelante sobre las rodillas.\n" +
                        "Brazos: Baje ambos brazos hacia los lados y abajo para colocar ambas manos planas en el\n" +
                        "suelo frente a las rodillas, separadas al ancho de los hombros, con los dedos apuntados entre\n" +
                        "sí.\n" +
                        "Enfoque: Abajo.\n" +
                        "Levantar los glúteos de los talones y extender la cadera y el torso. Levantar y extender la\n" +
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
                intent.putExtra("informacion_ayuda", "Control: La caída hacia los dedos debe ser controlada y suave.\n" +
                        "Transiciones: Las transiciones entre las poses deben ser fluidas y coordinadas.\n" +
                        "Expresión: La pose final debe ser impactante y transmitir la energía de la rutina.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9D__4XNOJXk&pp=ygUTcnV0aW5hIHBpc28gbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","P_n5_m10");
                intent.putExtra("titulo", "½ (180°) GIRO BOCA ABAJO A GIRO DE TRONCO/GIRAR A LEVANTARSE");
                startActivity(intent);
            }

        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
