package com.example.regym.manual_gimnasia.movimientos_viga_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Viga_N1_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_viga_n1_mg);

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

//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N1_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n1_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n1_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Colocar ambas manos a la altura de los hombros en la viga y saltar a un APOYO FRONTAL\n" +
                        "con los brazos y el cuerpo extendidos.\n" +
                        "Levantar la pierna derecha extendida sobre la viga con un giro de 90º a la izquierda, para\n" +
                        "terminar sentada con las piernas separadas mirando hacia el largo de la viga.\n" +
                        "N1 Viga - 2\n" +
                        "Brazos: Mover la mano izquierda hacia atrás junto a la mano derecha mientras se realiza el\n" +
                        "giro de 90°. Levantar ambos brazos hacia adelante y arriba a una posición alta al finalizar la\n" +
                        "entrada. Llevarlos hacia atrás para tomar la viga detrás de los glúteos con los brazos\n" +
                        "extendidos o flexionados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Impacto: Al aterrizar, se debe amortiguar el impacto para evitar lesiones.\n" +
                        "Equilibrio: Mantener el equilibrio sobre un pie es importante.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=pGRqlPLDaDg&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMQ%3D%3D\n");
                intent.putExtra("mov","V_n1_m1");
                intent.putExtra("titulo", "(*) ENTRADA DE SALTO AL APOYO FRONTAL");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n1_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n1_m2);  // Recurso de la tabla
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
                        "Patear la pierna izquierda hacia atrás y hacia arriba a mínimo la altura de la horizontal para\n" +
                        "realizar una PATADA DE AGUJA. (Se acepta flexionar la pierna derecha para iniciar la\n" +
                        "patada). Dar un paso hacia abajo para regresar a cuclillas.\n" +
                        "Brazos: Permanecen arriba en toda la PATADA DE AGUJA. Mover hacia la corona en las\n" +
                        "cuclillas.\n" +
                        "“BLOQUEO” DE EQUILIBRIO EN RELEVÉ (0.20)\n" +
                        "Extender ambas piernas hasta un “BLOQUEO” DE EQUILIBRIO EN RELEVÉ. Mantener\n" +
                        "dos segundos.\n" +
                        "Brazos: Permanecen en corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere cierta flexibilidad en la pierna que se eleva.\n" +
                        "Fuerza: Se necesita fuerza en la pierna de apoyo.\n" +
                        "Equilibrio: Mantener el equilibrio mientras se eleva la pierna es fundamental.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=pGRqlPLDaDg&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMQ%3D%3D\n");
                intent.putExtra("mov","V_n1_m2");
                intent.putExtra("titulo", "(*) PATADA DE AGUJA");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n1_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n1_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso hacia adelante sobre la pierna derecha extendida con el pie derecho ligeramente\n" +
                        "girado hacia afuera (no en relevé). Flexionar la rodilla izquierda hacia adelante junto con el pie\n" +
                        "izquierdo en punta hacia adelante para tocar la rodilla derecha y realizar el EQUILIBRIO EN\n" +
                        "PASSÉ AL FRENTE. Marcar esta posición.\n" +
                        "Brazos: Manos en la cadera." +
                        "<Brazos>: Al finalizar la rodada, colocar la mano derecha en la cadera y levantar el brazo izquierdo hacia adelante y arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Equilibrio: Mantener el equilibrio sobre una pierna es fundamental.\n" +
                        "Flexibilidad: Se requiere cierta flexibilidad en la pierna de apoyo.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=pGRqlPLDaDg&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMQ%3D%3D\n");
                intent.putExtra("mov","V_n1_m3");
                intent.putExtra("titulo", "EQUILIBRIO EN PASSÉ AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n1_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n1_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Cerrar el pie izquierdo detrás del pie derecho y hacer demi-plié con ambas piernas con los\n" +
                        "talones abajo hacia la viga.\n" +
                        "Brazos: Bajar ambos brazos totalmente abajo o hacia atrás-abajo o atrás en diagonal hacia\n" +
                        "abajo.\n" +
                        "Empujar la viga, extender ambas piernas a través de la cadera, rodillas, tobillos y dedos, con\n" +
                        "las piernas juntas, para realizar un SALTO EXTENDIDO. Durante el salto, se debe presionar\n" +
                        "la parte interna de los muslos para juntarlos y resultar en que el talón del pie derecho presione\n" +
                        "contra la parte delantera del pie izquierdo.\n" +
                        "Aterrizar con ambos pies al mismo tiempo en demi-plié, y presionar a través de los metatarsos\n" +
                        "para bajar los talones hacia la viga, el pie derecho delante del pie izquierdo con ambos pies\n" +
                        "ligeramente hacia afuera.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante y hacia arriba a la corona y permanecer en\n" +
                        "corona en el salto extendido y el aterrizaje.\n" +
                        "Estirar ambas piernas para terminar en un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Abiertos en diagonal arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Fuerza: Se necesita fuerza en las piernas para realizar el salto.\n" +
                        "Altura: La altura del salto puede variar según el nivel de cada gimnasta.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=pGRqlPLDaDg&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMQ%3D%3D\n");
                intent.putExtra("mov","V_n1_m4");
                intent.putExtra("titulo", "SALTO EXTENDIDO");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n1_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n1_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Bajar el talón del pie derecho y simultáneamente mover la pierna izquierda extendida hacia\n" +
                        "atrás y apuntar el pie izquierdo sobre la viga.\n" +
                        "Brazos: Bajar ambos brazos hacia los lados abajo o hacia los lados en medio.\n" +
                        "Mantener el torso erguido, levantar la pierna izquierda girada hacia afuera y extendida hacia\n" +
                        "atrás y hacia arriba a un mínimo de 30° de la viga. Se permite que la cadera izquierda se\n" +
                        "“descuadre” ligeramente para mostrar la pierna girada en la ARABESCA.\n" +
                        "Marcar esta posición. (No se requiere mantención).\n" +
                        "Bajar la pierna izquierda para apuntar el pie izquierdo hacia atrás en la viga.\n" +
                        "Brazos: Permanecen a los lados-en medio.");
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere cierta flexibilidad en la pierna que se eleva.\n" +
                        "Fuerza: Se necesita fuerza en la pierna de apoyo.\n" +
                        "Equilibrio: Mantener el equilibrio mientras se eleva la pierna es fundamental.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=pGRqlPLDaDg&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMQ%3D%3D\n");
                intent.putExtra("mov","V_n1_m5");
                intent.putExtra("titulo", "ARABESCA");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n1_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n1_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso hacia adelante sobre la pierna izquierda extendida con el pie izquierdo\n" +
                        "ligeramente girado hacia afuera (no en relevé).\n" +
                        "Brazos: Permanecen a los lados-en medio.\n" +
                        "Balancear con fuerza la pierna derecha ligeramente girada hacia afuera a la horizontal o más\n" +
                        "arriba. Cuando el BALANCEO DE PIERNA DERECHA alcance su punto más alto, jalar\n" +
                        "rápidamente la pierna hacia abajo y dar un paso hacia adelante sobre la pierna derecha\n" +
                        "extendida con el pie derecho ligeramente girado hacia afuera (no en relevé).\n" +
                        "Repetir con un BALANCEO DE PIERNA IZQUIERDA. Ambas piernas permanecen\n" +
                        "extendidas con la cadera cuadrada.\n" +
                        "Brazos: Permanecen a los lados-en medio.\n" +
                        "Dar un paso hacia adelante con el izquierdo, luego el derecho en relevé.\n" +
                        "Brazos: Permanecen a los lados-en medio.\n" +
                        "Cerrar la pierna izquierda detrás del pie derecho en un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Levantar a los lados-arriba a la corona.");
                intent.putExtra("informacion_ayuda", "Equilibrio: Mantener el equilibrio mientras se balancea la pierna es importante.\n" +
                        "Control: El movimiento debe ser controlado y suave.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=pGRqlPLDaDg&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMQ%3D%3D\n");
                intent.putExtra("mov","V_n1_m6");
                intent.putExtra("titulo", "BALANCEO DE PIERNA DERECHA");
                startActivity(intent);
            }
        });

//Boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m7_n1_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n1_m7);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Dar un paso hacia atrás con la pierna derecha para terminar en una pose en desplante\n" +
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
                        "mano izquierda hacia el pecho. Enganchar los dedos (ver la figura 2) con las palmas de las\n" +
                        "manos una hacia a otra.\n" +
                        "Extender la pierna derecha hacia adelante y apuntar el pie derecho sobre la viga.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba.\n" +
                        "Dar un paso adelante con el pie derecho y flexionar la rodilla izquierda para llegar a una\n" +
                        "posición arrodillada sobre la rodilla izquierda con el pie derecho al frente. (El pie izquierdo\n" +
                        "puede terminar apuntado sobre la viga O con el pie flexionado con el metatarso sobre la viga).\n" +
                        "Brazos: Permanecen arriba.\n" +
                        "Desde la posición arrodillada, extender ambas piernas.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo para colocar la mano derecha de lado\n" +
                        "N1 Viga - 7\n" +
                        "sobre la viga mientras el cuerpo gira 90° a la izquierda. Continuar para levantar la pierna\n" +
                        "izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar la mano izquierda de lado en la viga (con las manos separadas al ancho de los\n" +
                        "hombros) mientras la pierna derecha empuja la viga para realizar un 3/4 (22.5°) DE PARADA\n" +
                        "DE MANOS LATERAL con las piernas juntas, los hombros extendidos, el ángulo de la cadera\n" +
                        "abierto y el enfoque en las manos.\n" +
                        "Mantener una posición recta del cuerpo mientras desciende hasta aterrizar mirando hacia la\n" +
                        "viga. Hacer demi-plié cuando los pies contactan el colchón en una posición equilibrada y\n" +
                        "controlada (“plantada”) y presionar a través de los metatarsos para bajar los talones al\n" +
                        "colchón.\n" +
                        "Brazos: Ambas manos permanecen en la viga hasta que la gimnasta aterriza en demi-plié.\n" +
                        "Estirar las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Levantar entre adelante-arriba o en diagonal arriba a los lados.\n" +
                        "NIVEL 1 VIGA DE EQUILIBRIO ~ PUNTOS PARA LA EVALUACIÓN\n" +
                        "1. Brazos extendidos, cuerpo extendido en la ENTRADA DE APOYO FRONTAL, mostrando\n" +
                        "buena continuidad en toda la entrada hasta ponerse de pie.\n" +
                        "2. Cuerpo extendido con tobillos y rodillas extendidos tanto en el “BLOQUEO” DE\n" +
                        "EQUILIBRIO EN RELEVÉ como en la ARABESCA.\n" +
                        "3. Mostrar un buen control y postura en los BALANCEOS DE PIERNAS y el EQUILIBRIO\n" +
                        "EN PASSÉ AL FRENTE.\n" +
                        "4. Alineación recta tanto en el SALTO EXTENDIDO como en la SALIDA DE INVERSIÓN\n" +
                        "LATERAL A ¾ (22.5°) DE PARADA DE MANOS.");
                intent.putExtra("informacion_ayuda", "Fuerza: Requiere fuerza en los brazos y el core.\n" +
                        "Equilibrio: Mantener el equilibrio durante la inversión es difícil.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=pGRqlPLDaDg&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgMQ%3D%3D\n");
                intent.putExtra("mov","V_n1_m7");
                intent.putExtra("titulo", "BALANCEO DE PIERNA DERECHA");
                startActivity(intent);
            }
        });


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
