package com.example.regym.manual_gimnasia.movimientos_viga_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Viga_N2_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_viga_n2_mg);

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

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N2_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n2_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n2_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Colocar ambas manos a la altura de los hombros en la viga y saltar a un APOYO FRONTAL\n" +
                        "con los brazos y el cuerpo extendidos.\n" +
                        "Levantar la pierna derecha extendida sobre la viga con un giro de 90º a la izquierda, para\n" +
                        "terminar sentada con las piernas separadas mirando hacia el largo de la viga.\n" +
                        "Brazos: Mover la mano izquierda hacia atrás junto a la mano derecha mientras se realiza el\n" +
                        "giro de 90°. Levantar ambos brazos hacia adelante y arriba a una posición alta al finalizar la\n" +
                        "entrada. Llevarlos hacia atrás para tomar la viga detrás de los glúteos con los brazos\n" +
                        "extendidos o flexionados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Riesgo: Caídas de la viga, especialmente al realizar giros, cambios de dirección o elementos que requieren un alto nivel de equilibrio.\n" +
                        "Prevención: Fortalecer el core y los músculos estabilizadores, practicar ejercicios de equilibrio regularmente y utilizar colchoneta debajo de la viga.\n");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=ZVwvWDsc5Q4&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMg%3D%3D");
                intent.putExtra("mov","V_n2_m1");
                intent.putExtra("titulo", "(*) ENTRADA DE SALTO AL APOYO FRONTAL");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n2_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n2_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Levantar y flexionar simultáneamente ambas piernas para terminar en cuclillas en la viga con\n" +
                        "los dedos de los pies apuntando en la parte superior de la viga.\n" +
                        "Brazos: Permanecer tomada de la viga por detrás de los glúteos.\n" +
                        "Extender la pierna derecha para pasar por una sentada en “V” con una pierna momentánea.\n" +
                        "Dar un paso arriba con la izquierda, luego la derecha, para llegar a las cuclillas.\n" +
                        "Brazos: Empujar la viga y mover ambos brazos hacia adelante y hacia arriba a una corona.\n" +
                        "Extender ambas piernas y colocar ambos talones planos sobre la viga para terminar en un\n" +
                        "apoyo carpado.\n" +
                        "Brazos: Mientras se mantiene un ángulo de hombros abierto, bajar ambos brazos hacia\n" +
                        "adelante y hacia abajo para tomar la viga.\n" +
                        "N2 Viga - 3\n" +
                        "Patear la pierna izquierda hacia atrás y hacia arriba fuera de la viga, luego empujar la viga con\n" +
                        "el pie derecho para realizar la PATADA DE UNA PIERNA. No hay ningún requisito de\n" +
                        "amplitud para ninguna de las piernas.\n" +
                        "Bajar la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar con\n" +
                        "la pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la izquierda\n" +
                        "detrás del pie derecho para terminar con ambas piernas extendidas y los pies en planta\n" +
                        "apoyados en la viga (figura 9) O para terminar en un desplante derecho, presionando la rodilla\n" +
                        "derecha y toda la cadera hacia adelante (figura 10).\n" +
                        "Brazos: Permanecen arriba en todo momento y cuando se hace el descenso. Abrir en\n" +
                        "diagonal arriba a los lados al final.\n" +
                        "Nota: Al momento de considerar si se completa la PATADA DE UNA PIERNA A\n" +
                        "LEVANTARSE, el elemento está “completo” cuando la gimnasta ya ha bajado a una posición\n" +
                        "cerrada o de desplante.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Desequilibrio y caída, especialmente si la pierna no se eleva lo suficiente o si se pierde el equilibrio al bajar.\n" +
                        "Prevención: Fortalecer los músculos del core y de las piernas, mantener una buena alineación y practicar el movimiento lentamente al principio.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=ZVwvWDsc5Q4&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMg%3D%3D");
                intent.putExtra("mov","V_n2_m1");
                intent.putExtra("titulo", "(*) PATADA DE UNA PIERNA A LEVANTARSE");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n2_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n2_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso hacia adelante sobre la pierna derecha extendida con el pie derecho ligeramente\n" +
                        "girado hacia afuera (no en relevé). Flexionar la rodilla izquierda hacia adelante junto con el pie\n" +
                        "izquierdo en punta hacia adelante para tocar la rodilla derecha y realizar el EQUILIBRIO EN\n" +
                        "PASSÉ AL FRENTE. Marcar esta posición.\n" +
                        "Brazos: Manos en la cadera.\n" +
                        "Empujar la viga hacia abajo con el pie derecho para extender el tobillo derecho y llegar a una\n" +
                        "posición de relevé. Inmediatamente bajar el talón derecho de regreso a la viga.\n" +
                        "Brazos: Manos en la cadera." +
                        "<Brazos>: Al finalizar la rodada, colocar la mano derecha en la cadera y levantar el brazo izquierdo hacia adelante y arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Pérdida de equilibrio y caída, especialmente si la postura no es correcta o si la atención se distrae.\n" +
                        "Prevención: Mantener una postura erguida, centrar la mirada en un punto fijo y practicar el equilibrio en diferentes posiciones.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","V_n2_m3");
                intent.putExtra("titulo", "EQUILIBRIO EN PASSÉ AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n2_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n2_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Cerrar el pie izquierdo detrás del pie derecho en un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba a la corona.\n" +
                        "Hacer demi-plié con ambas piernas.\n" +
                        "Brazos: Bajar ambos brazos a los lados-abajo o hacia atrás-abajo o atrás en diagonal hacia\n" +
                        "abajo.\n" +
                        "Estirar ambas piernas para regresar a un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba a la corona.\n" +
                        "Hacer demi-plié con ambas piernas.\n" +
                        "Brazos: Bajar ambos brazos a los lados-abajo o hacia atrás-abajo o atrás en diagonal hacia\n" +
                        "abajo.\n" +
                        "Empujar la viga, extender ambas piernas a través de la cadera, rodillas, tobillos y dedos, con\n" +
                        "las piernas juntas, para realizar un SALTO EXTENDIDO. Durante el salto, se debe presionar\n" +
                        "la parte interna de los muslos para juntarlos y resultar en que el talón del pie derecho presione\n" +
                        "contra la parte delantera del pie izquierdo.\n" +
                        "Aterrizar con ambos pies al mismo tiempo en demi-plié, y presionar a través de los metatarsos\n" +
                        "para bajar los talones hacia la viga, el pie derecho delante del pie izquierdo con ambos pies\n" +
                        "ligeramente hacia afuera.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante y hacia arriba a la corona y permanecer en\n" +
                        "corona para el SALTO EXTENDIDO y el aterrizaje.\n" +
                        "Estirar ambas piernas para terminar en un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Hacer un círculo con ambos brazos hacia atrás, abajo, adelante y arriba para\n" +
                        "terminar con el brazo izquierdo hacia adelante-en medio, el brazo derecho ligeramente más\n" +
                        "alto que el izquierdo. Ambas manos tienen las palmas hacia adentro con los dedos abiertos y\n" +
                        "separados (esto debe ser un movimiento de manos dinámico y preciso/directo).");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Aterrizaje incorrecto, lo que puede provocar lesiones en los tobillos o rodillas.\n" +
                        "Prevención: Amortiguar el impacto con la flexión de rodillas, mantener los pies en paralelo y controlar la altura del salto.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","V_n2_m4");
                intent.putExtra("titulo", "en relevé, Plié, Relevé, Plié, SALTO\n" +
                        "EXTENDIDO");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n2_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n2_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Bajar el talón del pie derecho y simultáneamente mover la pierna izquierda extendida hacia\n" +
                        "atrás y apuntar el pie izquierdo sobre la viga.\n" +
                        "Brazos: Bajar ambos brazos hacia los lados-abajo o hacia los lados-en medio.\n" +
                        "Mantener el torso erguido, levantar la pierna izquierda girada hacia afuera y extendida hacia\n" +
                        "atrás y hacia arriba a un mínimo de 30° de la viga. Se permite que la cadera izquierda se\n" +
                        "“descuadre” ligeramente para mostrar la pierna girada en la ARABESCA. Mantener un\n" +
                        "segundo.\n" +
                        "Bajar la pierna izquierda para apuntar el pie izquierdo hacia atrás en la viga.\n" +
                        "Brazos: Permanecen a los lados-en medio.");
                intent.putExtra("informacion_ayuda", "Desequilibrio y caída si la pierna no se eleva lo suficiente o si la cadera no está estable.\n" +
                        "Prevención: Fortalecer los músculos de la cadera y los abdominales, mantener la espalda recta y practicar el movimiento lentamente.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","V_n2_m5");
                intent.putExtra("titulo", "ARABESCA (30º)");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n2_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n2_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "BALANCEO DE PIERNA ATRÁS (0.20) “Bloqueo” de equilibrio en\n" +
                        "relevé\n" +
                        "Dar un paso hacia adelante sobre la pierna izquierda extendida con el pie izquierdo ligeramente\n" +
                        "girado hacia afuera (no en relevé).\n" +
                        "Brazos: Permanecen a los lados-en medio.\n" +
                        "Balancear con fuerza la pierna derecha ligeramente girada hacia afuera a la horizontal o más\n" +
                        "arriba. Cuando el BALANCEO DE PIERNA AL FRENTE alcance su punto más alto, jalar la\n" +
                        "pierna hacia abajo rápidamente para cerrarla frente del pie izquierdo, con ambos talones hacia\n" +
                        "abajo y los pies girados ligeramente hacia afuera.\n" +
                        "Levantar la pierna izquierda con fuerza hacia atrás y hacia arriba hasta un mínimo de 45°\n" +
                        "por debajo de la horizontal (BALANCEO DE PIERNA ATRÁS). Jalar la pierna hacia abajo\n" +
                        "rápidamente para cerrarla detrás del pie derecho y terminar con ambos pies en planta\n" +
                        "apoyados en la viga y girados ligeramente hacia afuera.\n" +
                        "Brazos: Permanecen a los lados-en medio.\n" +
                        "N2 Viga - 6\n" +
                        "“Bloqueo” de equilibrio en relevé\n" +
                        "Hacer demi-plié con ambas piernas.\n" +
                        "Brazos: Bajar hacia los lados y abajo hasta llegar abajo.\n" +
                        "Extender inmediatamente ambas piernas y deslizar el pie derecho hacia atrás para terminar en\n" +
                        "un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Levantar al frente-arriba a la corona.");
                intent.putExtra("informacion_ayuda", "Pérdida de equilibrio y caída si el balanceo es demasiado amplio o si la pierna no se controla correctamente.\n" +
                        "Prevención: Mantener el cuerpo tenso, controlar la amplitud del balanceo y practicar el movimiento lentamente.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","V_n2_m6");
                intent.putExtra("titulo", "BALANCEO DE PIERNA AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m7_n2_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n2_m7);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso hacia adelante con la izquierda y cerrar el pie derecho detrás del pie izquierdo en\n" +
                        "un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Permanecen en corona.\n" +
                        "Realizar un ½ (180°) GIRO PIVOTE rápido a la derecha.\n" +
                        "Brazos: Permanecen en corona.\n" +
                        "Dar un paso hacia atrás con la pierna derecha para terminar en una pose en desplante\n" +
                        "izquierdo con el pie izquierdo en arco forzado, empujando la rodilla izquierda y toda la\n" +
                        "cadera hacia adelante. El torso permanece cuadrado al frente en relación con la viga.\n" +
                        "Brazos: Flexionándolos y extendiéndolos, bajar fluidamente ambos brazos a adelante-abajo\n" +
                        "o adelante-en medio, palmas hacia abajo\n" +
                        "Dar un paso hacia atrás con la pierna izquierda para terminar en una pose en desplante\n" +
                        "derecho con el pie derecho en arco forzado, empujando la rodilla derecha y toda la cadera\n" +
                        "hacia adelante. El torso permanece cuadrado al frente en relación con la viga.\n" +
                        "Brazos: Mientras se flexionan los brazos hacia el pecho con los codos hacia afuera y los\n" +
                        "antebrazos paralelos al suelo, acercar las palmas de las manos con la mano derecha más\n" +
                        "cercana al pecho. El dorso de la mano derecha se encuentra hacia el pecho y la palma de la\n" +
                        "mano izquierda hacia el pecho. Enganchar los dedos (ver la figura 5) con las palmas de las\n" +
                        "manos una hacia a otra.\n" +
                        "Enfoque: Al frente.\n" +
                        "Extender la pierna derecha hacia adelante y apuntar el pie derecho sobre la viga.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba.");
                intent.putExtra("informacion_ayuda", "Pérdida de equilibrio y caída, vértigo o mareos, lesión en el cuello si la cabeza no está alineada.\n" +
                        "Prevención: Practicar giros con cabeza erguida, mantener los brazos extendidos para ayudar al equilibrio y realizar el giro de manera suave y controlada.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","V_n2_m7");
                intent.putExtra("titulo", "½ (180º) GIRO PIVOTE");
                startActivity(intent);
            }
        });

//Boton Movimiento8
        Movimiento8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m8_n2_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n2_m8);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada de\n" +
                        "tipo escalador” (figura 3) con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo para colocar la mano derecha de lado\n" +
                        "sobre la viga mientras el cuerpo gira 90° a la izquierda. Continuar para levantar la pierna\n" +
                        "izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar la mano izquierda de lado en la viga (con las manos separadas al ancho de los\n" +
                        "hombros) mientras la pierna derecha empuja la viga para realizar una PARADA DE MANOS\n" +
                        "LATERAL con las piernas juntas, los hombros extendidos, el ángulo de la cadera abierto y el\n" +
                        "enfoque en las manos.\n" +
                        "Mantener una posición recta del cuerpo mientras desciende hasta aterrizar mirando hacia la\n" +
                        "viga. Hacer demi-plié cuando los pies contactan el colchón en una posición equilibrada y\n" +
                        "controlada (“plantada”) y presionar a través de los metatarsos para bajar los talones al\n" +
                        "colchón.\n" +
                        "Brazos: Ambas manos permanecen en la viga hasta que la gimnasta aterriza en demi-plié.\n" +
                        "Estirar las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Levantar entre adelante-arriba o en diagonal arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", " Caída, lesiones en las muñecas o hombros si la parada de manos no se ejecuta correctamente.\n" +
                        "Prevención: Fortalecer los brazos, muñecas y core, practicar la parada de manos en el suelo antes de intentar en la viga y mantener el cuerpo recto durante la inversión.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","V_n2_m8");
                intent.putExtra("titulo", "(*) SALIDA DE INVERSIÓN LATERAL A PARADA DE MANOS LATERAL");
                startActivity(intent);
            }

        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
