package com.example.regym.manual_gimnasia.movimientos_viga_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Viga_N3_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_viga_n3_mg);

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

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N3_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n3_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n3_m1);  // Recurso de la tabla
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
                        "Brazos: La mano derecha permanece en la viga. A medida que la pierna derecha se flexiona\n" +
                        "para el sentado de gacela, levantar el brazo izquierdo hacia adelante y arriba a la corona.\n" +
                        "Enfoque: A la izquierda cuando el pie izquierdo se coloca en la viga. Al frente cuando el brazo\n" +
                        "izquierdo se mueve a la corona.\n" +
                        "Ajustar o girar la mano izquierda para tomar el lado de la viga.\n" +
                        "Brazos: Bajar el brazo izquierdo fluidamente hacia al lado abajo o hacia al lado en medio. (El\n" +
                        "brazo izquierdo se encuentra en línea con la pierna izquierda).\n" +
                        "Enfoque: A la izquierda.\n" +
                        "Presionar hacia abajo con el brazo derecho para levantar la cadera de la viga y girar el torso\n" +
                        "90° hacia la derecha mientras se coloca la mano izquierda en la viga al lado de la mano\n" +
                        "derecha. El pie izquierdo permanece en contacto con la viga. Colocar la rodilla derecha sobre\n" +
                        "la viga, con la cadera extendida. Inmediatamente y de manera precisa, bajar la pierna\n" +
                        "izquierda extendida hacia abajo al lado de la viga mientras simultáneamente se baja la cadera\n" +
                        "para sentarse sobre el talón derecho. El torso debe estar erguido.\n" +
                        "Brazos: Levantar ambos brazos hacia arriba o hacia los lados en medio.\n" +
                        "N3 Viga - 3\n" +
                        "Enfoque: Al frente.\n" +
                        "Levantar los glúteos del talón y extender la cadera. Levantar la pierna izquierda hacia\n" +
                        "adelante y flexionar la rodilla para colocar el pie izquierdo en la viga frente a la rodilla derecha.\n" +
                        "El momento en que se flexiona la pierna izquierda es opcional. La pierna no debe patear por\n" +
                        "encima de la viga antes de colocar el pie.\n" +
                        "Extender ambas piernas para levantarse sobre la pierna izquierda (pie girado ligeramente\n" +
                        "hacia afuera), con la pierna derecha extendida hacia atrás, el pie derecho apuntando hacia\n" +
                        "atrás sobre la viga.\n" +
                        "Brazos: Bajar ambos brazos hacia los lados-abajo hasta abajo por completo y continuar\n" +
                        "levantándolos hacia adelante y arriba a través de la corona, luego presionar para terminar en\n" +
                        "diagonal arriba a los lados. Palmas hacia afuera.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Caída hacia atrás o hacia un lado al intentar la posición de pescado.\n" +
                        "Prevención: Fortalecer los músculos del core y la espalda, practicar la posición de pescado en el suelo y mantener el cuerpo tenso durante la entrada.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=cnEU8yxsGWk&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","V_n3_m1");
                intent.putExtra("titulo", "ENTRADA DE APOYO DE POSE DE PESCADO AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n3_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n3_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Hacer demi-plié con la pierna izquierda y balancear simultáneamente la pierna derecha\n" +
                        "extendida adelante a la horizontal.\n" +
                        "Brazos: Flexionándolos y extendiéndolos, bajar ambos brazos hacia adelante-en medio. Las\n" +
                        "palmas hacia abajo.\n" +
                        "Flexionar la pierna derecha para tocar el pie derecho con la rodilla izquierda en passé al\n" +
                        "frente (juntar de golpe).\n" +
                        "Inmediatamente, sin mover la rodilla derecha, mover el pie derecho ligeramente hacia\n" +
                        "adelante fuera de la rodilla y rápidamente regresarlo a passé al frente (de golpe).\n" +
                        "Se permite (no es obligatorio) una ligera contracción durante el passé.\n" +
                        "Brazos: Permanecen al frente-en medio.\n" +
                        "Extender ambas piernas y apuntar el pie derecho sobre la viga.\n" +
                        "N3 Viga - 4\n" +
                        "Brazos: Abrir ambos brazos hacia los lados cuando se apunta el pie, luego levantarlos hacia\n" +
                        "los lados y arriba hasta arriba por completo para la preparación de la PARADA DE MANOS\n" +
                        "TRANSVERSAL.\n" +
                        "Enfoque: Al frente.\n" +
                        "El ritmo es patada rápida, golpe, golpe, punta.\n" +
                        "PARADA DE MANOS TRANSVERSAL (0.60)\n" +
                        "Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada de\n" +
                        "tipo escalador” (figura 3) con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo a la viga Continuar para levantar la\n" +
                        "pierna izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Estirarse hacia adelante para tomar la viga, colocando las manos una al lado de la otra con\n" +
                        "los pulgares en la parte superior de la viga. Empujar la viga con la pierna derecha para llegar\n" +
                        "a una PARADA DE MANOS TRANSVERSAL con las piernas juntas, los brazos extendidos,\n" +
                        "los hombros abiertos y extendidos, el ángulo de la cadera abierto y plano, y el enfoque en las\n" +
                        "manos mostrando una línea recta desde las muñecas hasta los tobillos.\n" +
                        "Marcar esta posición (no se requiere mantención).\n" +
                        "Bajar la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar con\n" +
                        "la pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la izquierda\n" +
                        "detrás del pie derecho para terminar con ambas piernas extendidas y los pies en planta\n" +
                        "apoyados en la viga (figura 8) O para terminar en un desplante derecho, presionando la rodilla\n" +
                        "derecha y toda la cadera hacia adelante (figura 9).\n" +
                        "Brazos: Permanecen arriba en todo momento y cuando se hace el descenso. Abrir en\n" +
                        "diagonal arriba a los lados al final.\n" +
                        "Nota: Al momento de considerar si se completa la PARADA DE MANOS TRANSVERSAL, el\n" +
                        "elemento está “completo” cuando la gimnasta ya ha bajado a una posición cerrada o de\n" +
                        "desplante.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Caída hacia adelante o hacia atrás, lesiones en las muñecas o hombros si la posición no es correcta.\n" +
                        "Prevención: Fortalecer los brazos, muñecas y core, practicar la parada de manos transversal en el suelo y mantener el cuerpo recto durante la ejecución.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=cnEU8yxsGWk&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","V_n3_m2");
                intent.putExtra("titulo", "(*) PARADA DE MANOS TRANSVERSAL");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n3_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n3_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Hacer demi-plié con la pierna derecha (si se elige salir de desplante, simplemente comience\n" +
                        "en el texto con “apuntar con el pie izquierdo”). Simultáneamente, apuntar con el pie izquierdo\n" +
                        "hacia adelante hasta tocar la viga con la pierna izquierda extendida y ligeramente girada hacia\n" +
                        "afuera para terminar en un desplante atrás.\n" +
                        "Brazos: Bajar ambos brazos fluidamente hacia al frente-abajo o al frente-en medio.\n" +
                        "Mientras se mantiene la pierna derecha en demi-plié, flexionar la pierna izquierda y apuntar el\n" +
                        "pie izquierdo hacia adelante para tocar la rodilla derecha (pose de passé al frente). La parte\n" +
                        "superior del cuerpo permanece recta.\n" +
                        "Brazos: Mover ambos brazos hacia adelante para terminar con ambos brazos al frente-en\n" +
                        "medio, flexionados de manera precisa a 90°, con un brazo encima del otro (manos en línea\n" +
                        "directa con el codo opuesto, cualquier brazo puede estar arriba) ligeramente separados. Las\n" +
                        "palmas hacia afuera.\n" +
                        "Enfoque: Al frente.\n" +
                        "Mientras se mantiene la pierna derecha en demi-plié, extender la pierna izquierda para\n" +
                        "regresar al desplante atrás.\n" +
                        "Brazos: Abrir ambos brazos de manera precisa hacia los lados-en medio.\n" +
                        "Jalar la pierna izquierda extendida hacia atrás para terminar con el pie izquierdo delante del\n" +
                        "pie derecho en un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Bajar el brazo izquierdo hacia al lado y hacia abajo para colocar la mano izquierda\n" +
                        "sobre la cadera izquierda. Hacer una ola fluidamente con el brazo derecho para terminar al\n" +
                        "frente-en medio con la palma hacia abajo.\n" +
                        "Enfoque: Al frente.\n" +
                        "Si invierte el ½ (180°) GIRO EN PASSÉ AL FRENTE, bajar el talón derecho a la viga, luego\n" +
                        "apuntar el pie izquierdo hacia adelante en la viga ligeramente girado hacia afuera. Además,\n" +
                        "invertir el recorrido de los brazos en preparación para el giro.\n" +
                        "N3 Viga - 6\n" +
                        "4. (*) ½ (180°) GIRO EN PASSÉ AL FRENTE (GIRO DE PRESIÓN DE\n" +
                        "TALÓN) (0.40), “Bloqueo” de equilibrio en relevé\n" +
                        "derecha\n" +
                        "cambio vista cambio vista\n" +
                        "Bajar el talón izquierdo a la viga; luego apuntar el pie derecho hacia adelante en la viga\n" +
                        "ligeramente girado hacia afuera y dar un paso adelante con la derecha (no en relevé).\n" +
                        "Flexionar la rodilla izquierda hacia adelante junto con el pie izquierdo en punta hacia adelante\n" +
                        "para tocar la rodilla derecha (passé al frente).\n" +
                        "Brazos: Mover el brazo izquierdo hacia el lado abajo o hacia el lado en medio.\n" +
                        "Simultáneamente, curvar el brazo derecho para terminar en curvado adelante en medio.\n" +
                        "Empujar la viga hacia abajo (comenzar a hacer un relevé en el metatarso del pie derecho) y\n" +
                        "comenzar a “presionar” el talón alrededor para realizar un ½ (180°) GIRO EN PASSÉ AL\n" +
                        "FRENTE (GIRO DE PRESIÓN DE TALÓN) hacia la derecha. Incrementar el relevé a lo largo\n" +
                        "de la vuelta para terminar el giro en relevé completo.\n" +
                        "Al terminar el giro, inmediatamente bajar el talón derecho de regreso a la viga. Marcar esta\n" +
                        "posición.\n" +
                        "Brazos: Inician el giro al cerrar el brazo izquierdo hacia adelante-en medio pero curvado.\n" +
                        "Mantener el curvado adelante-en medio en todo el giro.\n" +
                        "Dar un paso hacia adelante con la izquierda, luego cerrar el pie derecho detrás del pie\n" +
                        "izquierdo en un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: En una acción circular, levantarlos hacia adelante a través de la corona y continuar\n" +
                        "girando hacia atrás-abajo o hacia los lados-abajo hasta completamente abajo en diagonalabajo\n" +
                        "hasta completamente abajo." +
                        "<Brazos>: Al finalizar la rodada, colocar la mano derecha en la cadera y levantar el brazo izquierdo hacia adelante y arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Pérdida de equilibrio y caída, especialmente si el tiempo de equilibrio es prolongado.\n" +
                        "Prevención: Fortalecer los tobillos y los músculos estabilizadores, mantener el cuerpo tenso y centrar la mirada en un punto fijo.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=cnEU8yxsGWk&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","V_n3_m3");
                intent.putExtra("titulo", "EQUIULIBRIO EN relevé");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n3_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n3_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar inmediatamente un paso al frente con la derecha. Cerrar el pie izquierdo detrás del pie\n" +
                        "derecho con ambos talones abajo y los pies ligeramente girados hacia afuera. Hacer demi-plié\n" +
                        "con ambas piernas.\n" +
                        "Brazos: Permanecen abajo o atrás en diagonal hacia abajo.\n" +
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
                        "Saltar o empujar la viga inmediatamente, extender ambas piernas a través de la cadera,\n" +
                        "rodillas, tobillos y dedos, con las piernas juntas, para realizar un segundo SALTO\n" +
                        "EXTENDIDO.\n" +
                        "Aterrizar con ambos pies al mismo tiempo en demi-plié, y presionar a través de los metatarsos\n" +
                        "para bajar los talones hacia la viga, el pie derecho delante del pie izquierdo con ambos pies\n" +
                        "ligeramente hacia afuera. El enfoque está en una buena altura y postura en ambos saltos.\n" +
                        "Brazos: Levantar hacia adelante y hacia arriba a la corona y permanecer en corona para el\n" +
                        "SALTO EXTENDIDO y el aterrizaje.\n" +
                        "Estirar ambas piernas para terminar en un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Hacer un círculo con ambos brazos hacia atrás, abajo, adelante y arriba para\n" +
                        "terminar con el brazo izquierdo hacia adelante-en medio, el brazo derecho ligeramente más\n" +
                        "alto que el izquierdo. Ambas manos tienen las palmas hacia adentro con los dedos abiertos y\n" +
                        "separados (esto debe ser un movimiento de manos dinámico y preciso/directo).\n" +
                        "Enfoque: Al frente.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", " Aterrizaje incorrecto, lo que puede provocar lesiones en los tobillos o rodillas.\n" +
                        "Prevención: Amortiguar el impacto con la flexión de rodillas, mantener los pies en paralelo y controlar la altura del salto.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=cnEU8yxsGWk&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","V_n3_m4");
                intent.putExtra("titulo", "SALTO EXTENDIDO");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n3_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n3_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Bajar el talón derecho y simultáneamente mover la pierna izquierda extendida hacia atrás y\n" +
                        "apuntar el pie izquierdo sobre la viga.\n" +
                        "Brazos: Bajar ambos brazos hacia los lados-abajo o hacia los lados-en medio.\n" +
                        "Mantener el torso erguido, levantar la pierna izquierda girada hacia afuera y extendida hacia\n" +
                        "atrás y hacia arriba a un mínimo de 45°de la viga. Se permite que la cadera izquierda se\n" +
                        "descuadre o rote ligeramente para mostrar la pierna girada en la ARABESCA. Mantener un\n" +
                        "(1) segundo.\n" +
                        "Bajar la pierna izquierda para apuntar el pie izquierdo hacia atrás en la viga.\n" +
                        "Brazos: Permanecen a los lados-en medio.");
                intent.putExtra("informacion_ayuda", " Desequilibrio y caída si la pierna no se eleva lo suficiente o si la cadera no está estable.\n" +
                        "Prevención: Fortalecer los músculos de la cadera y los abdominales, mantener la espalda recta y practicar el movimiento lentamente.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=cnEU8yxsGWk&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","V_n3_m5");
                intent.putExtra("titulo", "ARABESCA (45°)");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n3_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n3_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso largo y dinámico (o carrera con la pierna baja y extendida) hacia adelante con la\n" +
                        "izquierda y balancear la pierna derecha extendida hacia adelante y hacia arriba, empujando la\n" +
                        "viga con la pierna izquierda.\n" +
                        "Balancear la pierna izquierda hacia atrás-arriba para realizar un SALTO LEAP SPLIT CON\n" +
                        "PIERNAS EXTENDIDAS con un mínimo 90° de separación uniforme de piernas en el vuelo.\n" +
                        "Aterrizar sobre la pierna derecha en demi-plié con la pierna izquierda extendida hacia atrás y\n" +
                        "girada hacia afuera en una posición de arabesca baja. Pausa. El enfoque está en la\n" +
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
                intent.putExtra("link","https://www.youtube.com/watch?v=cnEU8yxsGWk&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","V_n3_m6");
                intent.putExtra("titulo", "SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS (90º)");
                startActivity(intent);
            }
        });

//Boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m7_n3_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n3_m7);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso hacia adelante con la izquierda y cerrar el pie derecho detrás del pie izquierdo en\n" +
                        "un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Permanecen en corona.\n" +
                        "Realizar un ½ (180°) GIRO PIVOTE rápido a la derecha.\n" +
                        "Brazos: Permanecen en corona.\n" +
                        "Dar un paso adelante con la pierna izquierda para cerrarla en frente del pie derecho en un\n" +
                        "“bloqueo” de equilibrio en relevé y repetir el ½ (180°) GIRO PIVOTE hacia la derecha.\n" +
                        "Mantener una alineación recta del cuerpo y relevé alto en los giros.\n" +
                        "Brazos: Permanecen en corona durante los dos giros.\n" +
                        "Dar un paso hacia atrás con la pierna derecha para terminar en una pose en desplante\n" +
                        "izquierdo con el pie izquierdo en arco forzado, empujando la rodilla izquierda y toda la cadera\n" +
                        "hacia adelante. El torso permanece cuadrado al frente en relación con la viga.\n" +
                        "Brazos: Flexionándolos y extendiéndolos, bajar fluidamente ambos brazos a adelante-abajo o\n" +
                        "adelante-en medio, palmas hacia abajo\n" +
                        "Dar un paso hacia atrás con la pierna izquierda para terminar en una pose en desplante\n" +
                        "derecho con el pie derecho en arco forzado, empujando la rodilla derecha y toda la cadera\n" +
                        "hacia adelante. El torso permanece cuadrado al frente en relación con la viga.\n" +
                        "Brazos: Mientras se flexionan los brazos hacia el pecho con los codos hacia afuera y los\n" +
                        "antebrazos paralelos al suelo, acercar las palmas de las manos con la mano derecha más\n" +
                        "cercana al pecho. El dorso de la mano derecha se encuentra hacia el pecho y la palma de la\n" +
                        "mano izquierda hacia el pecho. Enganchar los dedos (ver la figura 7) con las palmas de las\n" +
                        "manos una hacia a otra.\n" +
                        "Enfoque: Al frente.\n" +
                        "Extender la pierna derecha hacia adelante y apuntar el pie derecho sobre la viga.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba.");
                intent.putExtra("informacion_ayuda", "Vértigo, mareos, pérdida de equilibrio y caída si los giros no se realizan de manera controlada.\n" +
                        "Prevención: Practicar giros con cabeza erguida, mantener los brazos extendidos para ayudar al equilibrio y realizar los giros de manera suave y controlada.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=cnEU8yxsGWk&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","V_n3_m7");
                intent.putExtra("titulo", "DOS (2) ½ (180º) GIROS PIVOTE");
                startActivity(intent);
            }
        });

//Boton Movimiento8
        Movimiento8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m8_n3_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n3_m8);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada de\n" +
                        "tipo escalador” (figura 3) con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo para colocar la mano derecha de lado\n" +
                        "sobre la viga mientras el cuerpo gira 90° a la izquierda. Continuar para levantar la pierna\n" +
                        "izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar la mano izquierda de lado en la viga (con las manos separadas al ancho de los\n" +
                        "hombros) mientras la pierna derecha empuja la viga para realizar una PARADA DE MANOS\n" +
                        "LATERAL con las piernas juntas, los hombros extendidos, el ángulo de la cadera abierto y el\n" +
                        "enfoque en las manos. Marcar esta posición. No se requiere mantención.\n" +
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
                        "Brazos: Levantar entre adelante-arriba o en diagonal arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Caída, lesiones en las muñecas o hombros si la parada de manos no se ejecuta correctamente.\n" +
                        "Prevención: Fortalecer los brazos, muñecas y core, practicar la parada de manos lateral en el suelo y mantener el cuerpo recto durante la inversión.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=cnEU8yxsGWk&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMw%3D%3D\n");
                intent.putExtra("mov","V_n3_m8");
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
