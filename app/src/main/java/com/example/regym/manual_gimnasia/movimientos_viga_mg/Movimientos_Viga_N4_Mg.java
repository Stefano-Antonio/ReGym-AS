package com.example.regym.manual_gimnasia.movimientos_viga_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Viga_N4_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_viga_n4_mg);

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

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N4_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n5_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n5_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Colocar ambas manos a la altura de los hombros en la viga (la mano izquierda puede estar\n" +
                        "recta o hacia al lado) y saltar a un APOYO FRONTAL con los brazos y el cuerpo extendidos.\n" +
                        "A medida que los pies abandonen el suelo, flexionar inmediatamente la pierna izquierda hacia\n" +
                        "atrás y arriba a mínimo 90° para terminar con ambas rodillas juntas para completar la\n" +
                        "ENTRADA DE POSE DE PESCADO (figura 2). Se acepta que la parte superior del cuerpo\n" +
                        "esté ligeramente arqueada, ahuecada o recta.\n" +
                        "Presionar hacia abajo contra la viga y estirar la pierna izquierda. Levantar la pierna izquierda\n" +
                        "extendida colocando el arco del pie izquierdo arriba de la viga y el talón quedará al lado de la\n" +
                        "viga. Flexionar la pierna derecha hacia arriba y colocar el lado del pie derecho arriba de la\n" +
                        "viga para llegar a una posición de sentado de gacela con la cadera paralela a la viga y el\n" +
                        "torso recto.\n" +
                        "Brazos: La mano derecha permanece en la viga. A medida que la pierna derecha se\n" +
                        "flexiona para el sentado de gacela, levantar el brazo izquierdo hacia adelante y arriba\n" +
                        "a la corona.\n" +
                        "Enfoque: A la izquierda cuando el pie izquierdo se coloca en la viga. Al frente cuando el brazo\n" +
                        "izquierdo se mueve a la corona.\n" +
                        "Ajustar o girar la mano izquierda para tomar el lado de la viga.\n" +
                        "Brazos: Bajar el brazo izquierdo fluidamente hacia al lado-abajo o hacia al lado-en medio (el\n" +
                        "brazo izquierdo se encuentra en línea con la pierna izquierda).\n" +
                        "Enfoque: A la izquierda.\n" +
                        "Presionar hacia abajo con el brazo derecho para levantar la cadera de la viga y girar el torso\n" +
                        "90° hacia la derecha mientras se coloca la mano izquierda en la viga al lado de la mano\n" +
                        "derecha. El pie izquierdo permanece en contacto con la viga. Colocar la rodilla derecha sobre\n" +
                        "la viga, con la cadera extendida. Inmediatamente y de manera precisa, bajar la pierna\n" +
                        "izquierda extendida hacia abajo al lado de la viga mientras simultáneamente se baja la cadera\n" +
                        "para sentarse sobre el talón derecho. El torso debe estar erguido.\n" +
                        "Brazos: Levantar ambos brazos hacia arriba o hacia los lados en medio.\n" +
                        "N4 Viga - 3\n" +
                        "Enfoque: Al frente.\n" +
                        "Levantar los glúteos del talón y extender la cadera. Levantar la pierna izquierda hacia\n" +
                        "adelante y flexionar la rodilla para colocar el pie izquierdo en la viga frente a la rodilla derecha.\n" +
                        "El momento en que se flexiona la pierna izquierda es opcional. La pierna no debe patear por\n" +
                        "encima de la viga antes de colocar el pie.\n" +
                        "Extender ambas piernas para levantarse sobre la pierna izquierda (pie girado ligeramente\n" +
                        "hacia afuera), con la pierna derecha extendida hacia atrás, el pie derecho apuntando hacia\n" +
                        "atrás sobre la viga. Al terminar de levantarse, girar el torso ligeramente hacia la izquierda.\n" +
                        "Brazos: Bajar el brazo derecho hacia al lado y hacia abajo para colocar la mano derecha\n" +
                        "sobre la cadera derecha. Con un movimiento circular continuo, bajar el brazo izquierdo hacia\n" +
                        "al lado-abajo hasta completamente abajo y continuar levantándolo hacia adelante y arriba a\n" +
                        "través de la corona. Sin detenerse, continuar el movimiento presionando para abrir el brazo\n" +
                        "izquierdo para terminar en diagonal arriba al lado. Palma hacia afuera.\n" +
                        "Enfoque: A la izquierda al terminar de levantarse.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Caída hacia atrás o hacia un lado al intentar la posición de pescado.\n" +
                        "Prevención: Fortalecer el core y la espalda, practicar la posición de pescado en el suelo y mantener el cuerpo tenso durante la entrada.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hd23MehmVu8&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","V_n4_m1");
                intent.putExtra("titulo", "ENTRADA DE APOYO DE POSE DE PESCADO AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n4_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n4_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Hacer demi-plié con la pierna izquierda y balancear simultáneamente la pierna derecha\n" +
                        "extendida adelante a la horizontal.\n" +
                        "Brazos: Levantar el brazo derecho hacia al frente-arriba o al frente-en medio.\n" +
                        "Simultáneamente, flexionarlos y extenderlos para bajar el brazo izquierdo hacia adelante-en\n" +
                        "medio. Las palmas hacia abajo.\n" +
                        "Flexionar la pierna derecha para tocar el pie derecho con la rodilla izquierda en passé al\n" +
                        "frente (juntar de golpe).\n" +
                        "Inmediatamente, sin mover la rodilla derecha, mover el pie derecho ligeramente hacia\n" +
                        "adelante fuera de la rodilla y rápidamente regresarlo a passé al frente (de golpe).\n" +
                        "Se permite (no es obligatorio) una ligera contracción durante el passé.\n" +
                        "N4 Viga - 4\n" +
                        "Brazos: Cuando la pierna derecha llegue a passé al frente, flexionar el brazo derecho para\n" +
                        "tocar el dedo medio dentro del brazo izquierdo con el codo derecho hacia afuera, con la palma\n" +
                        "hacia afuera en dirección opuesta al cuerpo. El brazo izquierdo permanece al frente-en medio.\n" +
                        "Extender ambas piernas y apuntar el pie derecho sobre la viga.\n" +
                        "Brazos: Abrir ambos brazos hacia los lados cuando se apunta el pie, luego levantarlos hacia\n" +
                        "los lados y arriba hasta arriba por completo para la preparación de la INVERSIÓN LATERAL.\n" +
                        "Enfoque: Al frente.\n" +
                        "El ritmo es patada rápida, golpe, golpe, punta.\n" +
                        "INVERSIÓN LATERAL (0.60)\n" +
                        "izquierda\n" +
                        "Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada de\n" +
                        "tipo escalador” (figura 3) con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo para colocar la mano derecha de lado\n" +
                        "sobre la viga mientras el cuerpo gira 90° a la izquierda. Continuar para levantar la pierna\n" +
                        "izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar la mano izquierda en la viga de lado o ligeramente hacia adentro (las manos\n" +
                        "separadas al ancho de los hombros) mientras la pierna derecha empuja fuera de la viga para\n" +
                        "realizar una INVERSIÓN LATERAL a la derecha.\n" +
                        "La cabeza permanece alineada, con el ángulo de los hombros y el de la cadera abiertos, y el\n" +
                        "enfoque por debajo del brazo izquierdo para ver la viga en el descenso.\n" +
                        "Girar 90° hacia adentro para bajar la pierna izquierda mientras mantiene los brazos cubriendo\n" +
                        "las orejas para terminar con la pierna izquierda extendida (o ligeramente doblada), cerrar\n" +
                        "inmediatamente la derecha detrás del pie izquierdo para terminar con ambas piernas\n" +
                        "extendidas y los pies en planta apoyados en la viga (figura 9) O para terminar en un desplante\n" +
                        "izquierdo, presionando la rodilla izquierda y toda la cadera hacia adelante (figura 10).\n" +
                        "Brazos: Permanecen arriba en todo momento y cuando se hace el descenso. Abrir en\n" +
                        "diagonal arriba a los lados al final.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Caída durante la inversión, lesiones en las muñecas o hombros si la posición no es correcta.\n" +
                        "Prevención: Fortalecer los brazos, muñecas y core, practicar la inversión en el suelo y mantener el cuerpo recto durante la ejecución.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hd23MehmVu8&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","V_n4_m2");
                intent.putExtra("titulo", "Pose de passé al frente, (*) INVERSIÓN LATERAL");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n4_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n4_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Mientras se gira 90° a la derecha, dar un pequeño paso o deslizarse hacia adelante (hacia el\n" +
                        "pie izquierdo) colocando el pie derecho de lado sobre el metatarso (no se requiere relevé) en\n" +
                        "la viga en demi-plié mientras se extiende la pierna izquierda al lado (ligeramente girada),\n" +
                        "apuntando el pie izquierdo sobre la parte superior de la viga para terminar en un desplante\n" +
                        "lateral. Si la salida de la INVERSIÓN LATERAL es cerrada, hacer relevé con el pie derecho\n" +
                        "en lugar de dar un paso o deslizarse y continuar con el texto como se indica.\n" +
                        "Brazos: Bajar ambos brazos fluidamente hacia los lados abajo o hacia los lados en medio.\n" +
                        "Mientras se mantiene la pierna derecha en demi-plié, flexionar la pierna izquierda y apuntar el\n" +
                        "pie izquierdo hacia adelante para tocar la rodilla derecha (pose de passé al frente). La parte\n" +
                        "superior del cuerpo permanece recta. Se permite que la rodilla izquierda se gire ligeramente\n" +
                        "hacia adentro en la pose de passé.\n" +
                        "Brazos: Mover ambos brazos hacia adelante para terminar con ambos brazos al frente-en\n" +
                        "medio, flexionados de manera precisa a 90°, con un brazo encima del otro (manos en línea\n" +
                        "directa con el codo opuesto, cualquier brazo puede estar arriba) ligeramente separados. Las\n" +
                        "palmas hacia afuera.\n" +
                        "Enfoque: Opcional.\n" +
                        "Mientras se mantiene la pierna derecha en demi-plié, extender la pierna izquierda al lado\n" +
                        "(ligeramente girada) para regresar al desplante lateral.\n" +
                        "Brazos: Abrir ambos brazos de manera precisa hacia los lados-en medio.\n" +
                        "Mientras gira 90° a la izquierda, extender la pierna derecha y jalar la pierna izquierda\n" +
                        "extendida hacia atrás para terminar con el pie izquierdo delante del pie derecho en un\n" +
                        "“bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Bajar el brazo izquierdo hacia al lado y hacia abajo para colocar la mano izquierda\n" +
                        "sobre la cadera izquierda. Hacer una ola fluidamente con el brazo derecho para terminar al\n" +
                        "frente-en medio con la palma hacia abajo.\n" +
                        "Enfoque: Opcional.\n" +
                        "Si invierte el ½ (180°) GIRO EN PASSÉ AL FRENTE, bajar el talón derecho a la viga, luego\n" +
                        "apuntar el pie izquierdo hacia adelante en la viga ligeramente girado hacia afuera. Además,\n" +
                        "invertir el recorrido de los brazos en preparación para el giro.\n" +
                        "4. (*) ½ (180°) GIRO EN PASSÉ AL FRENTE (0.40), “Bloqueo” de equilibrio en relevé\n" +
                        "derecha\n" +
                        "cambio vista cambio vista\n" +
                        "N4 Viga - 6\n" +
                        "Bajar el talón izquierdo a la viga; luego apuntar el pie derecho hacia adelante en la viga\n" +
                        "ligeramente girado.\n" +
                        "+Brazos: Mover el brazo izquierdo hacia adelante y arriba a la corona y continuar este\n" +
                        "movimiento circular bajando/abriendo el brazo izquierdo hacia al lado-abajo o hacia al lado-en\n" +
                        "medio. Durante el círculo del brazo izquierdo, el brazo derecho se curva para terminar\n" +
                        "adelante curvado en medio O se abre hacia al lado para terminar al lado-en medio. Ambos\n" +
                        "brazos deben completar el movimiento al mismo tiempo.\n" +
                        "Transferir el peso al pie derecho, por medio de una de las preparaciones de giros aceptables\n" +
                        "que se muestran en el Glosario. Realizar un 1/2 (180°) GIRO a la derecha en relevé, al\n" +
                        "flexionar la rodilla izquierda al frente y jalar el pie izquierdo en punta al frente hasta tocar la\n" +
                        "rodilla derecha (PASSÉ AL FRENTE). Marcar esta posición en relevé al completar el 1/2\n" +
                        "(180°) GIRO. Se permite que el talón baje a la viga después de marcar la posición.\n" +
                        "Brazos: Durante el 1/2 (180°) GIRO los brazos están en la corona. El recorrido para mover los\n" +
                        "brazos desde la preparación hasta la corona es opcional.\n" +
                        "Dar un paso hacia adelante con la izquierda, luego cerrar el pie derecho detrás del pie\n" +
                        "izquierdo en un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Los brazos hacen un círculo hacia atrás y abajo O hacia los lados y abajo hasta\n" +
                        "completamente abajo o atrás en diagonal hacia abajo." +
                        "<Brazos>: Al finalizar la rodada, colocar la mano derecha en la cadera y levantar el brazo izquierdo hacia adelante y arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Desequilibrio y caída si el desplante no se realiza con la profundidad y estabilidad adecuadas.\n" +
                        "Prevención: Fortalecer los músculos de las piernas y el core, mantener la espalda recta y controlar la profundidad del desplante.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hd23MehmVu8&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","V_n4_m3");
                intent.putExtra("titulo", "DESPLANTE LATERAL");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n4_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n4_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Hacer demi-plié con la pierna derecha mientras simultáneamente se patea la pierna izquierda\n" +
                        "hacia atrás y arriba hasta a mínimo la horizontal para realizar una patada atrás. Se permite\n" +
                        "que el torso se incline hacia adelante siempre que se muestre un arco en la parte superior de\n" +
                        "la espalda.\n" +
                        "Brazos: Levantar el brazo izquierdo hacia al frente-arriba o al frente-en medio.\n" +
                        "Simultáneamente, levantar el brazo derecho hacia al lado-arriba o al lado-en medio (brazos en\n" +
                        "oposición).\n" +
                        "Dar un paso atrás con la izquierda en relevé y flexionar la rodilla derecha hacia adelante y\n" +
                        "jalar el pie derecho en punta al frente hasta tocar la rodilla izquierda en la pose de passé al\n" +
                        "frente.\n" +
                        "Brazos: Levantar el brazo izquierdo hacia al frente-arriba a la corona. Simultáneamente,\n" +
                        "levantar el brazo derecho hacia al lado-arriba a la corona.\n" +
                        "Bajar el talón izquierdo y hacer demi-plié con la pierna izquierda. Extender la pierna derecha\n" +
                        "hacia abajo cruzando el pie derecho detrás del pie izquierdo y deslizando el pie derecho a lo\n" +
                        "largo del lado opuesto de la viga al lado del pie izquierdo para realizar la pose en bajada\n" +
                        "(figura 3).\n" +
                        "Brazos: Bajar el brazo izquierdo fluidamente hacia al lado-abajo o en diagonal abajo al lado.\n" +
                        "El brazo derecho se abre al lado en diagonal arriba, con la palma hacia afuera.\n" +
                        "Enfoque: A la izquierda.\n" +
                        "Inmediatamente extender la pierna izquierda para pararse con la pierna derecha extendida\n" +
                        "hacia atrás con el pie derecho en punta atrás sobre la viga.\n" +
                        "Brazos: Levantar el brazo izquierdo hacia al lado-arriba o al lado-en medio. Bajar el brazo\n" +
                        "izquierdo hacia al lado-abajo o hacia al lado-en medio.\n" +
                        "6. SALTO EXTENDIDO (0.20),\n" +
                        "SALTO JUMP SPLIT (120°)\n" +
                        "cambio vista\n" +
                        "Dar inmediatamente un paso al frente con la derecha. Cerrar el pie izquierdo detrás del pie\n" +
                        "derecho con ambos talones abajo y los pies ligeramente girados hacia afuera. Hacer demi-plié\n" +
                        "con ambas piernas.\n" +
                        "\n" +
                        "Brazos: Bajar a los lados-abajo o hacia atrás-abajo o atrás en diagonal hacia abajo.\n" +
                        "Empujar la viga, extender ambas piernas a través de la cadera, rodillas, tobillos y dedos, con\n" +
                        "las piernas juntas, para realizar un SALTO EXTENDIDO. Durante el salto, se debe presionar\n" +
                        "la parte interna de los muslos para juntarlos y resultar en que el talón del pie derecho presione\n" +
                        "contra la parte delantera del pie izquierdo.\n" +
                        "Aterrizar con ambos pies al mismo tiempo en demi-plié, y presionar a través de los metatarsos\n" +
                        "para bajar los talones hacia la viga, el pie derecho delante del pie izquierdo con ambos pies\n" +
                        "ligeramente hacia afuera.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba a la corona durante el SALTO\n" +
                        "EXTENDIDO. Bajar ambos brazos a los lados-abajo o hacia atrás-abajo o atrás en diagonal\n" +
                        "hacia abajo durante el aterrizaje del salto. (Los brazos pueden bajar a cualquier parte entre los\n" +
                        "lados-en medio hasta abajo).\n" +
                        "SALTO JUMP SPLIT (120°)\n" +
                        "Saltar o empujar la viga inmediatamente, extendiendo ambas piernas a través de la cadera,\n" +
                        "rodillas, tobillos y dedos de los pies para realizar un SALTO JUMP SPLIT con una separación\n" +
                        "uniforme de piernas a mínimo 120° con la pierna derecha adelante y la pierna izquierda atrás.\n" +
                        "Aterrizar con ambos pies al mismo tiempo en demi-plié, y presionar a través de los metatarsos\n" +
                        "para bajar los talones a la viga, el pie derecho delante del pie izquierdo con los pies\n" +
                        "ligeramente hacia afuera. El enfoque está en una buena altura y postura en ambos saltos.\n" +
                        "Brazos: A los lados-en medio durante el SALTO JUMP SPLIT. Los brazos permanecen a los\n" +
                        "lados-en medio o bajan a los lado-abajo hasta completamente abajo o hacia atrás-abajo o\n" +
                        "atrás en diagonal hacia abajo durante el aterrizaje del salto.\n" +
                        "Estirar ambas piernas para terminar en posición recta de pie (no en relevé).\n" +
                        "Brazos: Levantar a los lados-arriba hasta completamente arriba, después abrir en diagonal\n" +
                        "arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", " Desequilibrio y caída si la pierna no se eleva lo suficiente o si la cadera no está estable.\n" +
                        "Prevención: Fortalecer los músculos de la cadera y los abdominales, mantener la espalda recta y practicar el movimiento lentamente.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hd23MehmVu8&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","V_n4_m4");
                intent.putExtra("titulo", "PATADA ATRÁS");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n4_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n4_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Apuntar el pie derecho al frente en la viga.\n" +
                        "Brazos: Arriba.\n" +
                        "Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada de\n" +
                        "tipo escalador” (figura 3) con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo a la viga. Continuar para levantar la\n" +
                        "pierna izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Estirarse hacia adelante para tomar la viga, colocando las manos una al lado de la otra con\n" +
                        "los pulgares en la parte superior de la viga. Empujar la viga con la pierna derecha para llegar\n" +
                        "a una PARADA DE MANOS TRANSVERSAL con las piernas juntas, los brazos extendidos,\n" +
                        "los hombros abiertos y extendidos, el ángulo de la cadera abierto y plano, y el enfoque en las\n" +
                        "manos mostrando una línea recta desde las muñecas hasta los tobillos. Mantener un\n" +
                        "segundo.\n" +
                        "Bajar la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar con\n" +
                        "la pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la izquierda\n" +
                        "detrás del pie derecho para terminar con ambas piernas extendidas y los pies en planta\n" +
                        "apoyados en la viga (figura 8) O para terminar en un desplante derecho, presionando la rodilla\n" +
                        "derecha y toda la cadera hacia adelante (figura 9).\n" +
                        "Brazos: Permanecen arriba en todo momento y cuando se hace el descenso. Abrir en\n" +
                        "diagonal arriba a los lados al final.\n" +
                        "Nota: Al momento de considerar si se completa la PARADA DE MANOS TRANSVERSAL, el\n" +
                        "elemento está “completo” cuando la gimnasta ya ha bajado a una posición cerrada o de\n" +
                        "desplante.");
                intent.putExtra("informacion_ayuda", " Desequilibrio y caída si la pierna no se eleva lo suficiente o si la cadera no está estable.\n" +
                        "Prevención: Fortalecer los músculos de la cadera y los abdominales, mantener la espalda recta y practicar el movimiento lentamente.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hd23MehmVu8&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","V_n4_m5");
                intent.putExtra("titulo", "(*) PARADA DE MANOS TRANSVERSAL");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n4_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n4_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso hacia adelante con la izquierda, luego cerrar el pie derecho detrás del pie\n" +
                        "izquierdo en un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Bajar ambos brazos hacia los lados-abajo o hasta completamente abajo. Continuar\n" +
                        "levantando ambos brazos hacia adelante-arriba hasta completamente arriba, después abrir\n" +
                        "ambos brazos para terminar a los lados en diagonal arriba.\n" +
                        "Inmediatamente bajar a cuclillas profundas con los glúteos cerca de los talones; el torso\n" +
                        "permanece erguido.\n" +
                        "Brazos: Flexionar ambos brazos a 90° y tomar los codos por arriba de la cabeza.\n" +
                        "Realizar un 180° de giro en cuclillas a la derecha.\n" +
                        "Brazos: Permanecen por arriba de la cabeza con ambos brazos flexionados a 90°, tomando\n" +
                        "los codos.\n" +
                        "Extender rápidamente ambas piernas hasta un apoyo en relevé con los pies ligeramente\n" +
                        "separados.\n" +
                        "Brazos: Hacer un círculo con ambos brazos hacia atrás, abajo, adelante y arriba para\n" +
                        "terminar con el brazo izquierdo hacia adelante-en medio, el brazo derecho ligeramente más\n" +
                        "alto que el izquierdo. Ambas manos tienen las palmas hacia adentro con los dedos abiertos y\n" +
                        "separados (esto debe ser un movimiento de manos dinámico y preciso/directo).\n" +
                        "Enfoque: Ligeramente a la izquierda.\n" +
                        "Bajar el talón derecho a la viga. Mientras se mantiene el torso erguido, levantar la pierna\n" +
                        "izquierda extendida y girada hacia atrás y arriba; la parte superior del cuerpo se inclina\n" +
                        "ligeramente hacia adelante para terminar en PALANCA con la pierna izquierda (trasera) en\n" +
                        "mantención a mínimo la horizontal. Se permite que la cadera izquierda se descuadre o rote\n" +
                        "ligeramente para mostrar la pierna girada en la PALANCA. Mantener un segundo.\n" +
                        "Brazos: Bajar ambos brazos hacia abajo o hacia los lados-en medio.\n" +
                        "Enfoque: Al frente.\n" +
                        "Levantar el torso y apuntar el pie izquierdo detrás del derecho.\n" +
                        "Brazos: Permanecen a los lados-en medio.");
                intent.putExtra("informacion_ayuda", " Caída si la posición no se mantiene correctamente o si la fuerza no es suficiente.\n" +
                        "Prevención: Fortalecer los músculos del core y de la espalda, practicar la palanca en el suelo y mantener el cuerpo recto durante la ejecución.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hd23MehmVu8&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","V_n4_m6");
                intent.putExtra("titulo", "PALANCA(HORIZONTAL)");
                startActivity(intent);
            }
        });

//Boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m7_n4_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n4_m7);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso largo y dinámico (o carrera con la pierna baja y extendida) hacia adelante con la\n" +
                        "izquierda y balancear la pierna derecha extendida hacia adelante y hacia arriba, empujando la\n" +
                        "viga con la pierna izquierda.\n" +
                        "Balancear la pierna izquierda hacia atrás-arriba para realizar un SALTO LEAP SPLIT CON\n" +
                        "PIERNAS EXTENDIDAS con un mínimo 120° de separación uniforme de piernas en el vuelo.\n" +
                        "Aterrizar sobre la pierna derecha en demi-plié con la pierna izquierda extendida hacia atrás y\n" +
                        "girada hacia afuera en una posición de arabesca baja. Pausar. El enfoque está en la\n" +
                        "alineación del cuerpo y la altura del salto leap split.\n" +
                        "Brazos: Durante el paso, bajar ambos brazos hacia los lados y abajo para terminar abajo a\n" +
                        "los lados del cuerpo. Durante y en el aterrizaje del salto leap split, usar una de las tres\n" +
                        "posiciones de brazos aceptables para los saltos leap split mostradas en el Glosario.\n" +
                        "Cerrar inmediatamente el pie izquierdo detrás del pie derecho y hacer demi-plié con ambas\n" +
                        "piernas.\n" +
                        "Brazos: Mover hacia abajo.\n" +
                        "Estirar ambas piernas, tobillos y dedos de los pies hasta un “bloqueo” de equilibrio en\n" +
                        "relevé.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba a la corona.");
                intent.putExtra("informacion_ayuda", "Falta de flexibilidad, desequilibrio y caída si las piernas no se abren lo suficiente o si el aterrizaje no es controlado.\n" +
                        "Prevención: Trabajar la flexibilidad de las piernas, practicar el salto en el suelo y controlar la altura del salto.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hd23MehmVu8&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","V_n4_m7");
                intent.putExtra("titulo", "SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS (120º)");
                startActivity(intent);
            }
        });

//Boton Movimiento8
        Movimiento8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N4_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m8_n4_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n4_m8);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso hacia atrás con la pierna derecha para terminar en una pose en desplante\n" +
                        "izquierdo con el pie izquierdo en arco forzado, empujando la rodilla izquierda y toda la cadera\n" +
                        "hacia adelante.\n" +
                        "Brazos: Flexionándolos y extendiéndolos, bajar ambos brazos a adelante-abajo o adelante-en\n" +
                        "medio, palmas hacia abajo\n" +
                        "Dar un paso hacia atrás con la pierna izquierda para terminar en una pose en desplante\n" +
                        "derecho con el pie derecho en arco forzado, empujando la rodilla derecha y toda la cadera\n" +
                        "hacia adelante. Girar el torso ligeramente hacia la derecha.\n" +
                        "Brazos: Mientras se flexionan los brazos hacia el pecho con los codos hacia afuera y los\n" +
                        "antebrazos paralelos al suelo, acercar las palmas de las manos con la mano derecha más\n" +
                        "cercana al pecho. El dorso de la mano derecha se encuentra hacia el pecho y la palma de la\n" +
                        "mano izquierda hacia el pecho. Enganchar los dedos (ver la figura 2) con las palmas de las\n" +
                        "manos una hacia a otra.\n" +
                        "Enfoque: Al frente.\n" +
                        "Si se invierte la SALIDA DE INVERSIÓN LATERAL A PARADA DE MANOS LATERAL, ¼\n" +
                        "(90º) DE GIRO, dar un paso adelante con la derecha y apuntar el pie izquierdo sobre la viga.\n" +
                        "Extender la pierna derecha y apuntar el pie derecho sobre la viga.\n" +
                        "Brazos: Levantar ambos brazos completamente arriba.\n" +
                        "Transferir el peso al pie derecho para realizar un desplante derecho (figura 4) O “entrada de\n" +
                        "tipo escalador” (figura 5) con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo para colocar la mano derecha de lado\n" +
                        "N4 Viga - 13\n" +
                        "sobre la viga mientras el cuerpo gira 90° a la izquierda. Continuar para levantar la pierna\n" +
                        "izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar la mano izquierda de lado en la viga (con las manos separadas al ancho de los\n" +
                        "hombros) mientras la pierna derecha empuja la viga para realizar una PARADA DE MANOS\n" +
                        "LATERAL con las piernas juntas, los hombros extendidos, el ángulo de la cadera abierto y el\n" +
                        "enfoque en las manos. Mantener un segundo.\n" +
                        "Equilibrar ligeramente la parada de manos mientras se cambia el peso al brazo derecho.\n" +
                        "Levantar la mano izquierda de la viga y realizar ¼ (90°) DE GIRO a la derecha con el brazo\n" +
                        "derecho. Levantar la parte superior del cuerpo, manteniendo una posición recta mientras las\n" +
                        "piernas bajan en preparación para el aterrizaje.\n" +
                        "Hacer demi-plié cuando los pies contactan el colchón en una posición equilibrada y controlada\n" +
                        "(“plantada”) y presionar a través de los metatarsos para bajar los talones al colchón.\n" +
                        "Brazos: La mano derecha debe permanecer en la viga al menos hasta que el cuerpo pase\n" +
                        "por el plano horizontal de la viga.\n" +
                        "Estirar las piernas para terminar en posición recta de pie, con el lado derecho del cuerpo al\n" +
                        "lado de la viga.\n" +
                        "Brazos: Levantar entre adelante-arriba o en diagonal arriba a los lados.\n" +
                        "Inversión lateral, salto extendido en el extremo de la viga baja a salir a parada sobre\n" +
                        "una pila de colchones\n" +
                        "Transferir el peso al pie derecho para realizar un desplante derecho O “entrada de tipo\n" +
                        "escalador” con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener\n" +
                        "las orejas cubiertas por los brazos mientras se llega abajo para colocar la mano derecha\n" +
                        "de lado sobre la viga mientras el cuerpo gira 90° a la izquierda. Continuar para levantar la\n" +
                        "pierna izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar la mano izquierda en la viga de lado o ligeramente hacia adentro (las manos\n" +
                        "separadas al ancho de los hombros) mientras la pierna derecha empuja fuera de la viga\n" +
                        "para realizar una inversión lateral a la derecha.\n" +
                        "La cabeza permanece alineada, con el ángulo de los hombros y el de la cadera abiertos, y\n" +
                        "el enfoque por debajo del brazo izquierdo para ver la viga en el descenso.\n" +
                        "Girar 90° hacia adentro para descender con la izquierda mientras mantiene los brazos\n" +
                        "cubriendo las orejas para terminar con la pierna izquierda extendida (o ligeramente\n" +
                        "flexionada) y cerrar inmediatamente la derecha detrás del pie izquierdo.\n" +
                        "Inmediatamente empujar con el pie derecho para realizar un salto extendido (a empujar)\n" +
                        "desde el extremo de la viga para aterrizar en una pila de colchones al nivel de la viga.\n" +
                        "Brazos: Permanecen arriba en todo momento.\n" +
                        "2. Tres series de mantenciones de relevé en passé, ½ (180°) giro de presión de talón\n" +
                        "Apuntar el pie derecho al frente en la viga. Comenzar el paso adelante empujando el pie\n" +
                        "izquierdo mientras simultáneamente se estira hacia adelante sobre el pie derecho (relevé a\n" +
                        "planta). Apuntar el pie izquierdo hacia atrás LIGERAMENTE fuera de la viga mientras el\n" +
                        "peso se transfiere al pie derecho.\n" +
                        "Flexionar inmediatamente la rodilla izquierda hacia adelante y en seguida juntar con el pie\n" +
                        "izquierdo en punta hacia adelante para tocar la rodilla derecha (passé al frente).\n" +
                        "Brazos: Comenzar con el brazo izquierdo al lado-en medio y el brazo derecho curvado\n" +
                        "adelante en medio.\n" +
                        "Empujar hacia abajo la viga con el pie derecho y realizar un relevé, levantando el talón de\n" +
                        "la viga lo más alto posible. Al terminar el relevé, inmediatamente bajar el talón derecho a\n" +
                        "la viga.\n" +
                        "Brazos: Al presionar hacia el relevé, cerrar el brazo izquierdo hacia adelante-en medio\n" +
                        "pero curvado. Mantener el curvado adelante-en medio hasta que baje el talón. Abrir el\n" +
                        "brazo izquierdo hacia el lado-en medio en preparación para repetir la mantención de\n" +
                        "relevé en passé adicional.\n" +
                        "Repetir la mantención de relevé en passé dos veces más antes de realizar el ½ (180°)\n" +
                        "giro de presión de talón.\n" +
                        "Empujar la viga hacia abajo con el pie derecho y comenzar a “presionar” el talón alrededor\n" +
                        "para realizar un ½ (180°) giro de presión de talón hacia la derecha. Incrementar el relevé\n" +
                        "a lo largo de la vuelta para terminar el giro en relevé completo. Al terminar el giro,\n" +
                        "inmediatamente bajar el talón derecho a la viga.\n" +
                        "N4 Viga - 15\n" +
                        "Brazos: Inician el giro al cerrar el brazo izquierdo hacia adelante-en medio pero curvado.\n" +
                        "Mantener el curvado adelante-en medio en todo el giro.\n" +
                        "Repetir con la otra pierna.\n" +
                        "3. Arco desde acostada, pasar a una pierna en una viga baja\n" +
                        "Comenzar en una posición acostada boca arriba con las rodillas flexionadas y ambos pies\n" +
                        "en planta en la viga.\n" +
                        "Brazos: Colocar las manos en la viga, tomando los lados de la viga.\n" +
                        "Empujar hacia abajo contra la viga y extender los brazos y piernas para llegar a una\n" +
                        "posición de arco. Las piernas extendidas o flexionadas.\n" +
                        "Enfoque: Mantener la cabeza en una posición neutra y mantener el enfoque en las manos.\n" +
                        "Levantar la pierna derecha y empujar la viga con la pierna izquierda para la patada a\n" +
                        "pasar a una pierna (el ajuste de las piernas es aceptable antes de la patada). Pasar a\n" +
                        "través de la vertical con las piernas separadas y extendidas (es aceptable mover/ajustar el\n" +
                        "pie izquierdo hacia adentro cuando la pierna derecha inicia la patada).\n" +
                        "Bajar la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar\n" +
                        "con la pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la\n" +
                        "izquierda detrás del pie derecho para terminar con ambas piernas extendidas y los pies en\n" +
                        "planta apoyados en la viga O para terminar en un desplante derecho, presionando la\n" +
                        "rodilla derecha y toda la cadera hacia adelante.\n" +
                        "Brazos: Permanecen arriba en todo momento y cuando se hace el descenso. Abrir en\n" +
                        "diagonal arriba a los lados al final.\n" +
                        "4. Flic-flac a una pierna en la viga baja\n" +
                        "Colocación del pie en el flic-flac a una pierna: Opcional.\n" +
                        "Pararse con los pies uno al lado del otro o uno enfrente del otro.\n" +
                        "Para realizar el flic-flac a una pierna, inclinarse hacia atrás, flexionando y extendiendo las\n" +
                        "rodillas para saltar hacia atrás desde la viga hacia las manos a una posición extendida e\n" +
                        "invertida del cuerpo. Empujar la viga con los brazos y los hombros; separar las piernas y\n" +
                        "bajar la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar\n" +
                        "con la pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la\n" +
                        "izquierda detrás del pie derecho para terminar con ambas piernas extendidas y los pies en\n" +
                        "planta apoyados en la viga O para terminar en un desplante derecho, presionando la\n" +
                        "rodilla derecha y toda la cadera hacia adelante.\n" +
                        "Posición de las manos en la viga: Opcional.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Caída, lesiones en las muñecas o hombros si la parada de manos no se ejecuta correctamente.\n" +
                        "Prevención: Fortalecer los brazos, muñecas y core, practicar la parada de manos en el suelo y mantener el cuerpo recto durante la inversión.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hd23MehmVu8&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNA%3D%3D\n");
                intent.putExtra("mov","V_n4_m8");
                intent.putExtra("titulo", "(*) SALIDA DE INVERSIÓN LATERAL A PARADA DE MANOS");
                startActivity(intent);
            }

        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
