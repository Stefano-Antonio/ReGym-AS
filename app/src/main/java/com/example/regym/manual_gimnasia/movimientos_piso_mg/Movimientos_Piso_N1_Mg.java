package com.example.regym.manual_gimnasia.movimientos_piso_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimientos_piso_mg.movimientos_Individuales.movimientos_piso_n1_mg.Movimiento_Piso_N1_Mg;

public class Movimientos_Piso_N1_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_piso_n1_mg);

// Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

//botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Movimiento1 = findViewById(R.id.movimiento_1_btn);
        Button Movimiento2 = findViewById(R.id.movimiento_2_btn);
        Button Movimiento3 = findViewById(R.id.movimiento_3_btn);
        Button Movimiento4 = findViewById(R.id.movimiento_4_btn);
        Button Movimiento5 = findViewById(R.id.movimiento_5_btn);
        Button Movimiento6 = findViewById(R.id.movimiento_6_btn);
        Button Movimiento7 = findViewById(R.id.movimiento_7_btn);
        Button Movimiento8 = findViewById(R.id.movimiento_8_btn);

//boton Regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });
//boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Piso_N1_Mg.class);
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
                intent.putExtra("informacion_ayuda", "En este movimiento se recomienda trabajar sobre una linea recta al momento de realizar la vuelta de carro, asi como ayudarse con un colchon al momento de poner las manos, esto para que facilite a la gimnasta la realización del ejercicio correctamente");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","n1_m1");
                startActivity(intent);
            }
        });
//boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Piso_N1_Mg.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n1_salto);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "\"-Primera parte [RODADA ATRÁS AGRUPADA]: Doblar las rodillas para llegar a una posición en cuclillas, manteniendo los pies en el suelo.\n" +
                        "Empezar a rodar hacia atrás con la cabeza metida, la barbilla contra el pecho. Colocar inmediatamente las manos en el suelo cerca de los hombros, las palmas hacia abajo, los dedos apuntando hacia los hombros.\n" +
                        "Mientras se rueda la cadera hacia atrás a través de la vertical, empujar hacia abajo contra el suelo y extender los brazos, quitando el peso de la cabeza y el cuello para realizar la RODADA ATRÁS AGRUPADA.\n" +
                        "Mantener la posición agrupada en toda la rodada para terminar en cuclillas.\n" +
                        "Estirar inmediatamente las piernas para terminar en posición recta de pie.\n" +
                        "<Brazos>: Arriba al principio de la rodada. Terminar la rodada con los brazos arriba; después abrir en diagonal arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "En este movimiento se recomienda trabajar sobre una linea recta al momento de realizar la vuelta de carro, asi como ayudarse con un colchon al momento de poner las manos, esto para que facilite a la gimnasta la realización del ejercicio correctamente");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","n1_m2");
                startActivity(intent);
            }
        });
//boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Piso_N1_Mg.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n1_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "\"-Primera parte [RODADA A VELA]: Doblar las rodillas para llegar a una posición en cuclillas, manteniendo los pies en el suelo.\n" +
                        "Comenzar a rodar hacia atrás para extender el cuerpo a una posición de VELA (arriba sobre los hombros, los dedos de los pies apuntando hacia el techo, el ángulo de la cadera abierto).\n" +
                        "N1 Suelo - 4\n" +
                        "<Brazos>: Bajar hacia adelante y abajo para terminar con las palmas apoyadas en el suelo frente a los glúteos o mantener los brazos arriba en todo momento.\n" +
                        "Salir rodando de la VELA con o sin las manos en las espinillas. Jalar las rodillas cerca del pecho y los talones cerca de los glúteos para pasar a través de cuclillas.\n" +
                        "Estirar inmediatamente las piernas para terminar en posición recta de pie.\n" +
                        "<Brazos>: Al finalizar la rodada, colocar la mano derecha en la cadera y levantar el brazo izquierdo hacia adelante y arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "En este movimiento se recomienda trabajar sobre una linea recta al momento de realizar la vuelta de carro, asi como ayudarse con un colchon al momento de poner las manos, esto para que facilite a la gimnasta la realización del ejercicio correctamente");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","n1_m3");
                startActivity(intent);
            }
        });
//boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Piso_N1_Mg.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n1_salto);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "\"-Primera parte [EQUILIBRIO EN PASSÉ AL FRENTE]: Dar un paso hacia adelante sobre la pierna derecha extendida con el pie derecho ligeramente girado hacia afuera (no en relevé). Flexionar la rodilla izquierda hacia adelante junto con el pie izquierdo en punta hacia adelante para tocar la rodilla derecha y realizar el EQUILIBRIO EN PASSÉ AL FRENTE. Marcar esta posición.\n" +
                        "<Brazos>: Manos en la cadera.\n" +
                        "Empujar el suelo hacia abajo con el pie derecho para extender el tobillo derecho y llegar a una posición de relevé. Inmediatamente bajar el talón derecho de regreso al suelo.\n" +
                        "Dar un paso hacia adelante con la izquierda y cerrar el pie derecho detrás del pie izquierdo en un “bloqueo” de equilibrio en relevé.\n" +
                        "<Brazos>: En el paso adelante con la izquierda, levantar ambos brazos hacia los lados-en medio. A medida que el pie derecho se cierra, mover los brazos hacia adelante, cruzando/envolviéndolos frente al cuerpo para tocar los hombros opuestos con las manos (abrazo).\n" +
                        "Realizar un ½ (180°) giro pivote rápido a la derecha.\n" +
                        "<Brazos>: Permanecen envueltos frente al cuerpo (abrazo).");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "En este movimiento se recomienda trabajar sobre una linea recta al momento de realizar la vuelta de carro, asi como ayudarse con un colchon al momento de poner las manos, esto para que facilite a la gimnasta la realización del ejercicio correctamente");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","n1_m4");
                startActivity(intent);
            }
        });
//boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Piso_N1_Mg.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n1_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "\"-Primera parte [CHASSÉ AL FRENTE]: Bajar el talón derecho al suelo y mover el pie izquierdo hacia adelante a través de una 1ra posición girada para apuntar al suelo.\n" +
                        "<Brazos>: Abrir ambos brazos a los lados-en medio.\n" +
                        "Dar un paso adelante con el pie izquierdo (ligeramente girado) a través de la 4ta posición demi-plié. Empujar el suelo con ambos pies para realizar un CHASSÉ AL FRENTE, cerrando el pie derecho detrás del pie izquierdo en el aire (5ta posición apretada). Aterrizar en demi-plié en la pierna derecha con el pie derecho ligeramente girado. La pierna izquierda permanece al frente, apuntando hacia el suelo.\n" +
                        "<Brazos>: Permanecen a los lados-en medio.\n" +
                        "Dar un paso adelante con la pierna izquierda en demi-plié. Inmediatamente extender la pierna izquierda para pararse con la pierna derecha extendida hacia atrás y ligeramente girada, y el pie derecho apuntado en el suelo para realizar una pose.\n" +
                        "<Brazos>: Bajar hacia los lados-abajo, hacia adelante y arriba para terminar hacia adelante-en medio con los brazos cruzados a la altura de las muñecas.\n" +
                        "Enfoque: Al frente.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "En este movimiento se recomienda trabajar sobre una linea recta al momento de realizar la vuelta de carro, asi como ayudarse con un colchon al momento de poner las manos, esto para que facilite a la gimnasta la realización del ejercicio correctamente");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","n1_m5");
                startActivity(intent);
            }
        });
//boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Piso_N1_Mg.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n1_salto);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "\"-Primera parte [SALTO EXTENDIDO]: Cerrar el pie derecho al lado del izquierdo para terminar con ambos pies uno al lado del otro (pies en planta).\n" +
                        "<Brazos>: Levantar ambos brazos hacia adelante-arriba a la corona.\n" +
                        "Hacer demi-plié con ambas piernas. Empujar el suelo, extender las piernas a través de la cadera, rodillas, tobillos y dedos, con las piernas juntas, para realizar un SALTO EXTENDIDO. Durante el salto, se debe presionar la parte interna de los muslos para juntarlos.\n" +
                        "Aterrizar con ambos pies uno al lado del otro en demi-plié, presionando a través de los metatarsos para bajar los talones al suelo O aterrizar con los talones ligeramente separados del suelo.\n" +
                        "<Brazos>: Durante el plié, bajar ambos brazos hacia los lados-abajo o hasta completamente abajo. Durante el SALTO EXTENDIDO, levantar ambos brazos hacia adelante-arriba a la corona. Los brazos permanecen en la corona en el aterrizaje.\n" +
                        "Estirar las piernas para terminar en posición recta de pie.\n" +
                        "<Brazos>: Abrir fluidamente para terminar en diagonal arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "En este movimiento se recomienda trabajar sobre una linea recta al momento de realizar la vuelta de carro, asi como ayudarse con un colchon al momento de poner las manos, esto para que facilite a la gimnasta la realización del ejercicio correctamente");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","n1_m6");
                startActivity(intent);
            }
        });
//boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Piso_N1_Mg.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n1_piso);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m7);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "\"-Primera parte [RODADA AL FRENTE AGRUPADA]: Flexionar las rodillas y estirarse hacia adelante para colocar las manos en el suelo. Bajar la cabeza al meter la barbilla hacia el pecho y mantener la espalda redondeada. Levantar la cadera para colocar la parte posterior de la cabeza y los hombros en el suelo. Empujar ambos pies para iniciar la RODADA AL FRENTE AGRUPADA.\n" +
                        "Durante la rodada, mantener las piernas agrupadas con o sin las manos en las espinillas, jalar las rodillas al pecho y los talones a los glúteos. Mantener esta posición agrupada apretada durante toda la rodada al frente.\n" +
                        "Colocar los pies en el suelo e inclinarse hacia adelante para llegar a cuclillas. Estirar inmediatamente las piernas para terminar en posición recta de pie.\n" +
                        "<Brazos>: Al terminar la rodada, levantar los brazos arriba, después abrir en diagonal arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "En este movimiento se recomienda trabajar sobre una linea recta al momento de realizar la vuelta de carro, asi como ayudarse con un colchon al momento de poner las manos, esto para que facilite a la gimnasta la realización del ejercicio correctamente");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","n1_m7");
                startActivity(intent);
            }
        });
//boton Movimiento8
        Movimiento8.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Piso_N1_Mg.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n1_salto);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n1_m8);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "\"-Primera parte [¾ DE PARADA DE MANOS]: Apuntar el pie derecho adelante en el suelo.\n" +
                        "<Brazos>: Arriba.\n" +
                        "Transferir el peso al pie derecho para realizar un desplante derecho O “entrada de tipo escalador” con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las orejas cubiertas por los brazos mientras se llega abajo al suelo. Continuar para levantar la pierna izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar las manos una al lado de la otra, a la altura de los hombros, en el suelo mientras se empuja con la pierna derecha para llegar a mínimo de ¾ DE PARADA DE MANOS con las piernas separadas o juntas, los brazos extendidos, los hombros abiertos y extendidos, el ángulo de la cadera abierto y plano, y el enfoque en las manos.\n" +
                        "Bajar la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar con la pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la izquierda al lado del pie derecho para terminar con ambas piernas extendidas (figura 7) O para terminar en un desplante derecho, presionando la rodilla derecha y toda la cadera hacia adelante (figura 8).\n" +
                        "<Brazos>: Terminar el descenso con los brazos arriba.\n\n" +
                        "9. Pose\n" +
                        "Si el ¾ DE PARADA DE MANOS terminó en un desplante, cerrar la pierna izquierda junto a la pierna derecha en demi-plié para llegar a la pose final. Si el ¾ DE PARADA DE MANOS terminó recta de pie, hacer demi-plié con ambas piernas para llegar a la pose final.\n" +
                        "<Brazos>: Bajar el brazo izquierdo hacia al lado y hacia abajo para colocar la mano izquierda sobre la cadera. Bajar fluidamente el brazo derecho hacia al frente-abajo para terminar al frente-en medio con la palma hacia abajo.\n" +
                        "Enfoque: Al frente-arriba.\n\n" +
                        "NIVEL 1 SUELO ~ PUNTOS PARA LA EVALUACIÓN\n" +
                        "1. Mostrar una buena posición recta del cuerpo y los brazos cubriendo las orejas durante la INVERSIÓN LATERAL y el ¾ DE PARADA DE MANOS.\n" +
                        "2. Mantener un agrupado apretado en las RODADAS ATRÁS y AL FRENTE.\n" +
                        "3. Mantener buena alineación del cuerpo y la pierna de apoyo extendida en el EQUILIBRIO DE PASSÉ AL FRENTE.\n" +
                        "4. Mantener buena alineación en el CHASSÉ AL FRENTE y el SALTO EXTENDIDO.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "En este movimiento se recomienda trabajar sobre una linea recta al momento de realizar la vuelta de carro, asi como ayudarse con un colchon al momento de poner las manos, esto para que facilite a la gimnasta la realización del ejercicio correctamente");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","n1_m8");
                startActivity(intent);
            }

    });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
