package com.example.regym.manual_gimnasia.movimientos_piso_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Piso_N1_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_piso_n1_mg);

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

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n1_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "\"-Primera parte [POSE(*)]:Hacer demi-plié con ambas piernas. Contraer ligeramente los abdominales e inclinar el torso ligeramente hacia adelante.\n" +
                        "<Brazos>: Mover ambos brazos hacia adelante y arriba para terminar con ambos brazosflexionados hacia adelante y en medio con las palmas hacia afuera. Enfoque: Abajo(Extender el torso y las piernas).\n" +
                        "<Brazos>: Abrir ambos brazos a los lados en medio. ~Enfoque: 'Al frente', Si se invierte la (*) INVERSIÓN LATERAL, apuntar el pie izquierdo adelante.\n" +
                        "-Segunda parte [VUELTA DE CARRO]:Apuntar el pie derecho adelante en el suelo.\n" +
                        "<Brazos>: Permanecen arriba en todo momento y cuando se hace el descenso. Levantamos ambos brazos hacia los lados-arriba hasta completamente arriba. Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada detipo escalador” (figura 3) con la pierna derecha.\n Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las orejas cubiertas por los brazos mientras se llega abajo para colocar la mano derecha de lado sobre el suelo mientras el cuerpo gira 90° a la izquierda.\n" +
                        "Continuar para levantar la pierna izquierda hacia atrás y hacia arriba a medida que el torso desciende. Colocar la mano izquierda en el suelo de lado o ligeramente hacia adentro (las manosseparadas al ancho de los hombros) mientras la pierna derecha empuja fuera del suelo para realizar una 'INVERSIÓN LATERAL' a la derecha.\n La cabeza permanece alineada, con el ángulo de los hombros y el de la cadera abiertos, y el enfoque por debajo del brazo izquierdo para ver el suelo en el descenso.\n" +
                        "Girar 90° hacia adentro para descender con la izquierda mientras mantiene los brazos cubriendo las orejas para terminar con la pierna izquierda extendida (o ligeramente flexionada) y cerrar inmediatamente el pie derecho al lado del pie izquierdo para terminar recta de pie (en planta o en relevé).\n" +
                        "<Brazos>: Permanecen arriba en todo momento y cuando se hace el descenso. Si se invirtió la (*) INVERSIÓN LATERAL, simplemente regresar al texto.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Equilibrio: Mantener el equilibrio en la pose inicial es importante.\n" +
                        "Coordinación: La vuelta de carro requiere una coordinación adecuada de brazos y piernas.\n" +
                        "Protección: Al caer, se debe amortiguar el impacto para evitar lesiones.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","P_n1_m1");
                intent.putExtra("titulo", "POSE(*). VUELTA DE CARRO");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n1_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Doblar las rodillas para llegar a una posición en cuclillas, manteniendo los pies en el suelo.\n" +
                        "Empezar a rodar hacia atrás con la cabeza metida, la barbilla contra el pecho. Colocar\n" +
                        "inmediatamente las manos en el suelo cerca de los hombros, las palmas hacia abajo, los\n" +
                        "dedos apuntando hacia los hombros. Mientras se rueda la cadera hacia atrás a través de la\n" +
                        "vertical, empujar hacia abajo contra el suelo y extender los brazos, quitando el peso de la\n" +
                        "cabeza y el cuello para realizar la RODADA ATRÁS AGRUPADA.\n" +
                        "Mantener la posición agrupada en toda la rodada para terminar en cuclillas.\n" +
                        "Estirar inmediatamente las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Arriba al principio de la rodada. Terminar la rodada con los brazos arriba; después\n" +
                        "abrir en diagonal arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Protección: Al agruparse, protege la cabeza con los brazos.\n" +
                        "Coordinación: La coordinación entre brazos y piernas es esencial para una rotación fluida.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","P_n1_m2");
                intent.putExtra("titulo", "RODADA ATRAS AGRUPADA");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n1_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Doblar las rodillas para llegar a una posición en cuclillas, manteniendo los pies en el suelo.\n" +
                        "Comenzar a rodar hacia atrás para extender el cuerpo a una posición de VELA (arriba sobre\n" +
                        "los hombros, los dedos de los pies apuntando hacia el techo, el ángulo de la cadera abierto).\n" +
                        "N1 Suelo - 4\n" +
                        "Brazos: Bajar hacia adelante y abajo para terminar con las palmas apoyadas en el suelo\n" +
                        "frente a los glúteos O mantener los brazos arriba en todo momento.\n" +
                        "Salir rodando de la VELA con o sin las manos en las espinillas. Jalar las rodillas cerca del\n" +
                        "pecho y los talones cerca de los glúteos para pasar a través de cuclillas. Estirar\n" +
                        "inmediatamente las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Al finalizar la rodada, colocar la mano derecha en la cadera y levantar el brazo\n" +
                        "izquierdo hacia adelante y arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Flexibilidad: Requiere cierta flexibilidad en la espalda.\n" +
                        "Equilibrio: Mantener el equilibrio en la posición de vela es importante.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","P_n1_m3");
                intent.putExtra("titulo", "RODADA A VELA");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n1_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "“Bloqueo” de equilibrio en relevé, ½ (180°) giro pivote\n" +
                        "derecha\n" +
                        "Dar un paso hacia adelante sobre la pierna derecha extendida con el pie derecho ligeramente\n" +
                        "girado hacia afuera (no en relevé). Flexionar la rodilla izquierda hacia adelante junto con el pie\n" +
                        "izquierdo en punta hacia adelante para tocar la rodilla derecha y realizar el EQUILIBRIO EN\n" +
                        "PASSÉ AL FRENTE. Marcar esta posición.\n" +
                        "Brazos: Manos en la cadera.\n" +
                        "Empujar el suelo hacia abajo con el pie derecho para extender el tobillo derecho y llegar a una\n" +
                        "posición de relevé. Inmediatamente bajar el talón derecho de regreso al suelo.\n" +
                        "Dar un paso hacia adelante con la izquierda y cerrar el pie derecho detrás del pie izquierdo en\n" +
                        "un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: En el paso adelante con la izquierda, levantar ambos brazos hacia los lados-en\n" +
                        "medio. A medida que el pie derecho se cierra, mover los brazos hacia adelante,\n" +
                        "cruzando/envolviéndolos frente al cuerpo para tocar los hombros opuestos con las manos\n" +
                        "(abrazo).\n" +
                        "Realizar un ½ (180°) giro pivote rápido a la derecha.\n" +
                        "Brazos: Permanecen envueltos frente al cuerpo (abrazo).");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Equilibrio: Mantener el equilibrio sobre una pierna es fundamental.\n" +
                        "Flexibilidad: Se requiere cierta flexibilidad en la pierna de apoyo.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","P_n1_m4");
                intent.putExtra("titulo", "EQUILIBRIO EN PASSÉ AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n1_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Bajar el talón derecho al suelo y mover el pie izquierdo hacia adelante a través de una 1ra\n" +
                        "posición girada para apuntar al suelo.\n" +
                        "Brazos: Abrir ambos brazos a los lados-en medio.\n" +
                        "Dar un paso adelante con el pie izquierdo (ligeramente girado) a través de la 4ta posición\n" +
                        "demi-plié. Empujar el suelo con ambos pies para realizar un CHASSÉ AL FRENTE, cerrando\n" +
                        "el pie derecho detrás del pie izquierdo en el aire (5ta posición apretada). Aterrizar en demi-plié\n" +
                        "en la pierna derecha con el pie derecho ligeramente girado. La pierna izquierda permanece al\n" +
                        "frente, apuntando hacia el suelo.\n" +
                        "Brazos: Permanecen a los lados-en medio.\n" +
                        "Dar un paso adelante con la pierna izquierda en demi-plié. Inmediatamente extender la pierna\n" +
                        "izquierda para pararse con la pierna derecha extendida hacia atrás y ligeramente girada, y el\n" +
                        "pie derecho apuntado en el suelo para realizar una pose.\n" +
                        "Brazos: Bajar hacia los lados-abajo, hacia adelante y arriba para terminar hacia adelante-en\n" +
                        "medio con los brazos cruzados a la altura de las muñecas.\n" +
                        "Enfoque: Al frente.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Coordinación: Los pies deben moverse de manera coordinada.\n" +
                        "Ritmo: El chassé debe realizarse con un ritmo constante.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","P_n1_m5");
                intent.putExtra("titulo", "CHASSE AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n1_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Cerrar el pie derecho al lado del izquierdo para terminar con ambos pies uno al lado del otro\n" +
                        "(pies en planta).\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba a la corona.\n" +
                        "Hacer demi-plié con ambas piernas. Empujar el suelo, extender las piernas a través de la\n" +
                        "cadera, rodillas, tobillos y dedos, con las piernas juntas, para realizar un SALTO\n" +
                        "EXTENDIDO. Durante el salto, se debe presionar la parte interna de los muslos para juntarlos.\n" +
                        "N1 Suelo - 6\n" +
                        "Aterrizar con ambos pies uno al lado del otro en demi-plié, presionando a través de los\n" +
                        "metatarsos para bajar los talones al suelo O aterrizar con los talones ligeramente separados\n" +
                        "del suelo.\n" +
                        "Brazos: Durante el plié, bajar ambos brazos hacia los lados-abajo o hasta completamente\n" +
                        "abajo. Durante el SALTO EXTENDIDO, levantar ambos brazos hacia adelante-arriba a la\n" +
                        "corona. Los brazos permanecen en la corona en el aterrizaje.\n" +
                        "Estirar las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Abrir fluidamente para terminar en diagonal arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Fuerza: Se necesita fuerza en las piernas para realizar el salto.\n" +
                        "Altura: La altura del salto puede variar según el nivel de cada gimnasta.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","P_n1_m6");
                intent.putExtra("titulo", "SALTO EXTENDIDO");
                startActivity(intent);
            }
        });

//Boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m7_n1_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m7);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Flexionar las rodillas y estirarse hacia adelante para colocar las manos en el suelo. Bajar la\n" +
                        "cabeza al meter la barbilla hacia el pecho y mantener la espalda redondeada. Levantar la\n" +
                        "cadera para colocar la parte posterior de la cabeza y los hombros en el suelo. Empujar ambos\n" +
                        "pies para iniciar la RODADA AL FRENTE AGRUPADA.\n" +
                        "Durante la rodada, mantener las piernas agrupadas con o sin las manos en las espinillas, jalar\n" +
                        "las rodillas al pecho y los talones a los glúteos. Mantener esta posición agrupada apretada\n" +
                        "durante toda la rodada al frente.\n" +
                        "Colocar los pies en el suelo e inclinarse hacia adelante para llegar a cuclillas. Estirar\n" +
                        "inmediatamente las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Al terminar la rodada, levantar los brazos arriba, después abrir en diagonal arriba a\n" +
                        "los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Práctica constante: La práctica regular te ayudará a perfeccionar la técnica.\n" +
                        "Colchonetas: Utiliza colchonetas para amortiguar la caída y evitar lesiones.\n" +
                        "Visualización: Imagina el movimiento completo antes de ejecutarlo.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","P_n1_m7");
                intent.putExtra("titulo", "RODADA AL FRENTE AGRUPADA");
                startActivity(intent);
            }
        });

//Boton Movimiento8
        Movimiento8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m8_n1_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m8);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Apuntar el pie derecho adelante en el suelo.\n" +
                        "Brazos: Arriba.\n" +
                        "Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada de\n" +
                        "tipo escalador” (figura 3) con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo al suelo. Continuar para levantar la\n" +
                        "pierna izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar las manos una al lado de la otra, a la altura de los hombros, en el suelo mientras se\n" +
                        "empuja con la pierna derecha para llegar a mínimo de ¾ DE PARADA DE MANOS con las\n" +
                        "piernas separadas o juntas, los brazos extendidos, los hombros abiertos y extendidos, el\n" +
                        "ángulo de la cadera abierto y plano, y el enfoque en las manos.\n" +
                        "Bajar la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar con\n" +
                        "la pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la izquierda al\n" +
                        "lado del pie derecho para terminar con ambas piernas extendidas (figura 7) O para terminar\n" +
                        "en un desplante derecho, presionando la rodilla derecha y toda la cadera hacia adelante\n" +
                        "(figura 8).\n" +
                        "Brazos: Terminar el descenso con los brazos arriba.\n");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Fuerza: Requiere fuerza en los brazos y el core.\n" +
                        "Equilibrio: Mantener el equilibrio sobre las manos es difícil.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","P_n1_m8");
                intent.putExtra("titulo", "(*)3/4 DE PARADA DE MANOS, Pose");
                startActivity(intent);
            }

    });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
