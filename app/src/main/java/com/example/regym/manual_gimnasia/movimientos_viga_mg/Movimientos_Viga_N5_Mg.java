package com.example.regym.manual_gimnasia.movimientos_viga_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Viga_N5_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_viga_n5_mg);

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
        Button Movimiento11= findViewById(R.id.movimiento_11_btn);


//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N5_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n5_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n5_m1);  // Recurso de la tabla
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
                        "\n" +
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
                intent.putExtra("informacion_ayuda", "Caída, lesiones en la cabeza o el cuello si el flic-flac no se ejecuta correctamente.\n" +
                        "Prevención: Practicar el flic-flac en el suelo, mantener el cuerpo encogido durante la ejecución y controlar el impulso.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9gupKGTzmfw&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","V_n1_m1");
                intent.putExtra("titulo", "ENTRADA DE APOYO DE POSE DE PESCADO AL FRENTE");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n5_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_piso_n5_m2);  // Recurso de la tabla
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
                        "\n" +
                        "Brazos: Cuando la pierna derecha llegue a passé al frente, flexionar el brazo derecho para\n" +
                        "tocar el dedo medio dentro del brazo izquierdo con el codo derecho hacia afuera, con la palma\n" +
                        "hacia afuera en dirección opuesta al cuerpo. El brazo izquierdo permanece al frente-en medio.\n" +
                        "Extender ambas piernas y apuntar el pie derecho sobre la viga.\n" +
                        "Brazos: Abrir ambos brazos hacia los lados cuando se apunta el pie, luego levantarlos hacia\n" +
                        "los lados y arriba hasta arriba por completo para la preparación del elemento acrobático.\n" +
                        "Enfoque: Al frente.\n" +
                        "El ritmo es patada rápida, golpe, golpe, punta.\n" +
                        "Si se invierte el ARCO ATRÁS A UNA PIERNA, después de la pose de passé al frente, dar\n" +
                        "el paso adelante con la derecha y apuntar el pie izquierdo al frente.\n" +
                        "2a. (*) ARCO ATRÁS A UNA PIERNA (150°) (0.60)\n" +
                        "cambio vista\n" +
                        "Levantar la pierna derecha hacia adelante y arriba (es aceptable una pequeña pausa con la\n" +
                        "pierna levantada antes de arquear la espalda hacia atrás). En cualquier momento durante el\n" +
                        "levantamiento de pierna, arquear la parte superior de la espalda para llegar hacia atrás,\n" +
                        "tomando la viga con las manos una al lado de la otra, los pulgares en la parte superior de la\n" +
                        "viga. A medida que el pie izquierdo empuja fuera de la viga, empujar los hombros sobre las\n" +
                        "manos para realizar un ARCO ATRÁS A UNA PIERNA, pasando por una posición de parada\n" +
                        "de manos con una separación de piernas mínimo de 150°, hombros extendidos.\n" +
                        "Enfoque: En las manos.\n" +
                        "Bajar la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar con\n" +
                        "la pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la izquierda\n" +
                        "detrás del pie derecho para terminar con ambas piernas extendidas y los pies en planta\n" +
                        "apoyados en la viga (figura 6) O para terminar en un desplante derecho, presionando la rodilla\n" +
                        "derecha y toda la cadera hacia adelante (figura 7).\n" +
                        "Brazos: Permanecen arriba en todo momento y cuando se hace el descenso. Abrir en\n" +
                        "diagonal arriba a los lados al final.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Caída si el arco no se ejecuta con la amplitud y control necesarios.\n" +
                        "Prevención: Fortalecer los músculos de la espalda y los hombros, practicar el arco en el suelo y controlar la altura del arco.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9gupKGTzmfw&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","V_n1_m2");
                intent.putExtra("titulo", "Pose de passé al frente, (*) ARCO ATRÁS A UNA PIERNA (150°)");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n5_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n5_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "COLOCACIÓN DE PIES PARA LA RODADA ATRÁS: Opcional.\n" +
                        "Cerrar los pies a pararse con los pies uno al lado del otro O uno enfrente del otro. Flexionar\n" +
                        "las rodillas para llegar a una posición sentada agrupada con los pies en la viga O flexionar la\n" +
                        "rodilla izquierda para llegar a una posición sentada agrupada con la pierna derecha extendida.\n" +
                        "Empezar a rodar hacia atrás con la cabeza metida, la barbilla contra el pecho. Colocar\n" +
                        "inmediatamente las manos en la viga tomándola con las manos una al lado de la otra, los\n" +
                        "pulgares en la parte superior de la viga. A medida que la cadera rueda hacia atrás, empujar\n" +
                        "hacia abajo contra la viga y extender los brazos para quitar el peso de la cabeza y el cuello.\n" +
                        "Extender los brazos y el cuerpo para realizar una RODADA ATRÁS A MÍNIMO ¾ DE\n" +
                        "PARADA DE MANOS, terminando con las piernas juntas o en split.\n" +
                        "Bajar la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar con\n" +
                        "la pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la izquierda\n" +
                        "detrás del pie derecho para terminar con ambas piernas extendidas y los pies en planta\n" +
                        "apoyados en la viga (figura 8) O para terminar en un desplante derecho, presionando la rodilla\n" +
                        "derecha y toda la cadera hacia adelante (figura 9).\n" +
                        "Brazos: Permanecen arriba en todo momento y cuando se hace el descenso. Abrir en\n" +
                        "diagonal arriba a los lados al final." +
                        "<Brazos>: Al finalizar la rodada, colocar la mano derecha en la cadera y levantar el brazo izquierdo hacia adelante y arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Caída, lesiones en la cabeza o el cuello si el flic-flac no se ejecuta correctamente.\n" +
                        "Prevención: Practicar el flic-flac en el suelo, mantener el cuerpo encogido durante la ejecución y controlar el impulso.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9gupKGTzmfw&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","V_n5_m3");
                intent.putExtra("titulo", "(*) RODADA ATRÁS A MÍNIMO ¾ DE PARADA DE MANOS");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n5_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n5_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "COLOCACIÓN DEL PIE EN EL FLIC-FLAC A UNA PIERNA: Opcional. Cerrar los pies a\n" +
                        "pararse con los pies uno al lado del otro O uno enfrente del otro.\n" +
                        "Para realizar el FLIC- FLAC A UNA PIERNA, inclinarse hacia atrás, flexionando y extendiendo\n" +
                        "las rodillas para saltar hacia atrás desde la viga hacia las manos a una posición extendida e\n" +
                        "invertida del cuerpo. Empujar la viga con los brazos y los hombros; separar las piernas y bajar\n" +
                        "la pierna derecha mientras mantiene los brazos cubriendo las orejas para terminar con la\n" +
                        "pierna derecha extendida (o ligeramente doblada), cerrar inmediatamente la izquierda detrás\n" +
                        "del pie derecho para terminar con ambas piernas extendidas y los pies en planta apoyados en\n" +
                        "la viga (figura 7) O para terminar en un desplante derecho, presionando la rodilla derecha y\n" +
                        "toda la cadera hacia adelante (figura 8).\n" +
                        "POSICIÓN DE LAS MANOS EN LA VIGA: Opcional.\n" +
                        "Brazos: El patrón de movimiento del balanceo de brazos para iniciar el FLIC- FLAC A UNA\n" +
                        "PIERNA es opcional. Permanecen arriba en todo momento y cuando se hace el descenso.\n" +
                        "Abrir en diagonal arriba a los lados al final.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Caída, lesiones en la cabeza o el cuello si el flic-flac no se ejecuta correctamente.\n" +
                        "Prevención: Practicar el flic-flac en el suelo, mantener el cuerpo encogido durante la ejecución y controlar el impulso.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9gupKGTzmfw&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","V_n5_m4");
                intent.putExtra("titulo", "(*) FLIC-FLAC A UNA PIERNA");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n5_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n5_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "COLOCACIÓN PIES EN EL FLIC-FLAC A DOS PIERNAS: Opcional. Cerrar los pies a pararse\n" +
                        "con los pies uno al lado del otro O uno enfrente del otro.\n" +
                        "Para realizar el FLIC FLAC A DOS PIERNAS, inclinarse hacia atrás, flexionando y\n" +
                        "extendiendo las rodillas para saltar hacia atrás desde la viga hacia las manos a una posición\n" +
                        "extendida e invertida del cuerpo. Empujar la viga con los brazos y los hombros. Con las\n" +
                        "piernas juntas y extendidas, levantar el cuerpo mientras se mantiene los brazos cubriendo las\n" +
                        "orejas para terminar en una posición de pie recta o en un leve demi-plié. La posición del pie\n" +
                        "en el aterrizaje es opcional. Las piernas se extienden al finalizar el elemento.\n" +
                        "N5 Viga - 7\n" +
                        "POSICIÓN DE LAS MANOS EN LA VIGA: Opcional.\n" +
                        "Brazos: El patrón de movimiento del balanceo de brazos para iniciar el FLIC FLAC A DOS\n" +
                        "PIERNAS es opcional. Permanecen arriba en todo momento. Abrir en diagonal arriba a los\n" +
                        "lados al final.");
                intent.putExtra("informacion_ayuda", "Caída, lesiones en la cabeza o el cuello si la rodada no se ejecuta correctamente.\n" +
                        "Prevención: Practicar la rodada en el suelo, proteger la cabeza con los brazos y mantener el cuerpo encogido durante la ejecución.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9gupKGTzmfw&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","V_n1_m5");
                intent.putExtra("titulo", "FLIC-FLAC A DOS PIERNAS");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n5_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n5_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada de\n" +
                        "tipo escalador” (figura 3) con la pierna derecha.\n" +
                        "Para realizar el ARCO AL FRENTE A UNA PIERNA, levantar la pierna izquierda hacia atrás y\n" +
                        "hacia arriba por encima de la cabeza y mantener las orejas cubiertas por los brazos mientras\n" +
                        "se llega abajo a la viga. Continuar para levantar la pierna izquierda hacia atrás y hacia arriba a\n" +
                        "medida que el torso desciende.\n" +
                        "Estirarse hacia adelante para tomar la viga, colocando las manos una al lado de la otra con\n" +
                        "los pulgares en la parte superior de la viga. Empujar la viga con la pierna derecha para pasar\n" +
                        "a través de una parada de manos en split con una separación de piernas mínimo de 150°,\n" +
                        "hombros extendidos, con enfoque en las manos. Continuar abriendo el ángulo de los hombros\n" +
                        "más allá de las manos y arquear la espalda alta, bajando la pierna izquierda hacia la viga para\n" +
                        "pasar a través de una posición de arco sobre el pie izquierdo con los brazos extendidos.\n" +
                        "Presionar la cadera y el muslo izquierdos hacia adelante, empujar las manos y pararse para\n" +
                        "cerrar el pie derecho frente al pie izquierdo con ambos pies paralelos.\n" +
                        "Brazos: Mantener arriba en todo el elemento. Abrir en diagonal arriba a los lados al final.\n" +
                        "Enfoque: Mantener el enfoque en las manos hasta que el segundo pie haga contacto con la\n" +
                        "viga, después poner el enfoque al frente.");
                intent.putExtra("informacion_ayuda", "Caída, lesiones en la cabeza o el cuello si el flic-flac no se ejecuta correctamente.\n" +
                        "Prevención: Practicar el flic-flac en el suelo, mantener el cuerpo encogido durante la ejecución y controlar el impulso.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9gupKGTzmfw&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","V_n5_m6");
                intent.putExtra("titulo", "SALTO EXTENDIDO");
                startActivity(intent);
            }
        });

//Boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m7_n5_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n5_m7);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Mientras se gira 90° a la derecha, dar un pequeño paso o deslizarse hacia atrás (hacia el pie\n" +
                        "izquierdo) colocando el pie derecho de lado sobre el metatarso (no se requiere relevé) en la\n" +
                        "viga en demi-plié mientras se extiende la pierna izquierda al lado (ligeramente girada),\n" +
                        "apuntando el pie izquierdo sobre la parte superior de la viga para terminar en un desplante\n" +
                        "lateral. Si la salida del elemento acrobático es cerrada, hacer relevé con el pie derecho en\n" +
                        "lugar de dar un paso o deslizarse y continuar con el texto como se indica.\n" +
                        "Brazos: Bajar ambos brazos fluidamente hacia los lados abajo o hacia los lados en medio.\n" +
                        "Mientras se mantiene la pierna derecha en demi-plié, flexionar la pierna izquierda y apuntar el\n" +
                        "pie izquierdo hacia adelante para tocar la rodilla derecha (pose de passé al frente). La parte\n" +
                        "superior del cuerpo permanece recta. Se permite que la rodilla izquierda se gire ligeramente\n" +
                        "hacia adentro en la pose de passé al frente.\n" +
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
                        "N5 Viga - 9\n" +
                        "Si invierte el 1/1 (360°) GIRO EN PASSÉ AL FRENTE, bajar el talón derecho a la viga,\n" +
                        "luego apuntar el pie izquierdo hacia adelante en la viga ligeramente girado hacia afuera.\n" +
                        "Además, invertir el recorrido de los brazos en preparación para el giro.\n" +
                        "4. (*) 1/1 (360°) GIRO EN PASSÉ AL FRENTE (0.40), “Bloqueo” de equilibrio\n" +
                        "en relevé\n" +
                        "derecha\n" +
                        "cambio vista\n" +
                        "Bajar el talón izquierdo a la viga; luego apuntar el pie derecho hacia adelante en la viga\n" +
                        "ligeramente girado.\n" +
                        "Brazos: Mover el brazo izquierdo hacia adelante y arriba a la corona y continuar este\n" +
                        "movimiento circular bajando/abriendo el brazo izquierdo hacia al lado-abajo o hacia al lado-en\n" +
                        "medio. Durante el círculo del brazo izquierdo, el brazo derecho se curva para terminar\n" +
                        "adelante curvado en medio O se abre hacia al lado para terminar al lado-en medio. Ambos\n" +
                        "brazos deben completar el movimiento al mismo tiempo.\n" +
                        "Transferir el peso al pie derecho, por medio de una de las preparaciones de giros aceptables\n" +
                        "que se muestran en el Glosario. Realizar un 1/1 (360°) GIRO a la derecha en relevé, al\n" +
                        "flexionar la rodilla izquierda al frente y jalar el pie izquierdo en punta al frente hasta tocar la\n" +
                        "rodilla derecha (PASSÉ AL FRENTE). Marcar esta posición en relevé al completar el giro.\n" +
                        "Se permite que el talón baje a la viga después de marcar la posición.\n" +
                        "Brazos: Durante el 1/1 (360°) GIRO los brazos están en la corona. El recorrido para mover los\n" +
                        "brazos desde la preparación hasta la corona es opcional.\n" +
                        "Dar un paso hacia adelante con la izquierda, luego cerrar el pie derecho detrás del pie\n" +
                        "izquierdo en un “bloqueo” de equilibrio en relevé.\n" +
                        "Brazos: Los brazos hacen un círculo hacia atrás y abajo O hacia los lados y abajo hasta\n" +
                        "completamente abajo o atrás en diagonal hacia abajo.");
                intent.putExtra("informacion_ayuda", "Caída, lesiones en la cabeza o el cuello si el flic-flac no se ejecuta correctamente.\n" +
                        "Prevención: Practicar el flic-flac en el suelo, mantener el cuerpo encogido durante la ejecución y controlar el impulso.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9gupKGTzmfw&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","V_n5_m7");
                intent.putExtra("titulo", "");
                startActivity(intent);
            }
        });

//Boton Movimiento8
        Movimiento8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m8_n5_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n5_m8);  // Recurso de la tabla
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
                        "hacia atrás con el pie derecho en ligeramente fuera de la viga.\n" +
                        "Brazos: Levantar el brazo izquierdo hacia al lado-arriba o al lado-en medio. Bajar el brazo\n" +
                        "izquierdo hacia al lado-abajo o hacia al lado-en medio.\n" +
                        "6. SALTO JUMP SPLIT (150°) (0.40),\n" +
                        "SISSONNE (0.20), “Bloqueo” de equilibrio en relevé, 180° de giro en\n" +
                        "cuclillas\n" +
                        "cambio vista\n" +
                        "pausa\n" +
                        "cambio vista derecha\n" +
                        "Dar inmediatamente un paso al frente con la derecha. Cerrar el pie izquierdo detrás del pie\n" +
                        "derecho con ambos talones abajo y los pies ligeramente girados hacia afuera. Hacer demi-plié\n" +
                        "con ambas piernas.\n" +
                        "Brazos: Bajar a los lados-abajo o hacia atrás-abajo o atrás en diagonal hacia abajo.\n" +
                        "N5 Viga - 11\n" +
                        "Empujar la viga, extendiendo ambas piernas a través de la cadera, rodillas, tobillos y dedos de\n" +
                        "los pies para realizar un SALTO JUMP SPLIT con una separación uniforme de piernas a\n" +
                        "mínimo 150° con la pierna derecha adelante y la pierna izquierda atrás.\n" +
                        "Aterrizar con ambos pies al mismo tiempo en demi-plié, y presionar a través de los metatarsos\n" +
                        "para bajar los talones hacia la viga, el pie derecho delante del pie izquierdo con ambos pies\n" +
                        "ligeramente hacia afuera.\n" +
                        "Brazos: Levantar a los lados-arriba hasta a los lados-en medio durante el salto jump split.\n" +
                        "Bajar ambos brazos hacia los lados y abajo durante el aterrizaje del salto jump (los brazos\n" +
                        "pueden bajar a cualquier parte entre los lados-en medio hasta abajo).\n" +
                        "SISSONNE (0.20)\n" +
                        "Inmediatamente saltar o empujar fuera de la viga, extendiendo ambas piernas a través de la\n" +
                        "cadera, rodillas, tobillos y dedos de los pies para realizar un SISSONNE, mostrando una\n" +
                        "separación de piernas con la pierna derecha extendida hacia adelante a 45° y la pierna\n" +
                        "izquierda extendida hacia atrás fuera de la viga a mínimo la horizontal.\n" +
                        "Aterrizar sobre la pierna derecha en demi-plié con la pierna izquierda extendida hacia atrás y\n" +
                        "girada hacia afuera en una posición de arabesca baja. Pausa. El enfoque está en una buena\n" +
                        "altura y postura en ambos saltos.\n" +
                        "Brazos: Hay dos opciones: Levantar el brazo izquierdo hacia al frente-arriba o al frente-en\n" +
                        "medio. Levantar el brazo derecho al lado-arriba hasta al lado-en medio (en oposición), O\n" +
                        "levantar ambos brazos hacia los lados-arriba hasta los lados-en medio.\n" +
                        "Dar un paso hacia adelante con la izquierda, luego cerrar el pie derecho detrás del pie\n" +
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
                        "N5 Viga - 12\n" +
                        "Extender rápidamente ambas piernas hasta un apoyo en relevé con los pies ligeramente\n" +
                        "separados.\n" +
                        "Brazos: Hacer un círculo con ambos brazos hacia atrás, abajo, adelante y arriba para\n" +
                        "terminar con el brazo izquierdo hacia adelante-en medio, el brazo derecho ligeramente más\n" +
                        "alto que el izquierdo. Ambas manos tienen las palmas hacia adentro con los dedos abiertos y\n" +
                        "separados (esto debe ser un movimiento de manos dinámico y preciso/directo).\n" +
                        "Enfoque: Ligeramente a la izquierda");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Caída, lesiones en la cabeza o el cuello si el flic-flac no se ejecuta correctamente.\n" +
                        "Prevención: Practicar el flic-flac en el suelo, mantener el cuerpo encogido durante la ejecución y controlar el impulso.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","V_n9_m8");
                intent.putExtra("titulo", "https://www.youtube.com/watch?v=9gupKGTzmfw&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNQ%3D%3D");
                startActivity(intent);
            }

        });

//Boton Movimiento9
        Movimiento9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m9_n5_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n5_m9);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Bajar el talón derecho a la viga. Mientras se mantiene el torso erguido, levantar la pierna\n" +
                        "izquierda extendida y girada hacia atrás y arriba; la parte superior del cuerpo se inclina\n" +
                        "ligeramente hacia adelante para terminar en PALANCA con la pierna izquierda (trasera) en\n" +
                        "mantención por arriba de la horizontal. Se permite que la cadera izquierda se descuadre o\n" +
                        "rote ligeramente para mostrar la pierna girada en la PALANCA. Mantener un segundo.\n" +
                        "Brazos: Bajar ambos brazos hacia abajo o hacia los lados-en medio.\n" +
                        "Enfoque: Al frente.\n" +
                        "SALTO LEAP SPLIT CON PIERNAS EXTENDIDAS (150°) (0.60)\n" +
                        "Levantar el torso y dar un paso largo y dinámico (o carrera con la pierna baja y extendida)\n" +
                        "hacia adelante con la izquierda y balancear la pierna derecha extendida hacia adelante y\n" +
                        "hacia arriba, empujando la viga con la pierna izquierda.\n" +
                        "Balancear la pierna izquierda hacia atrás-arriba para realizar un SALTO LEAP SPLIT CON\n" +
                        "PIERNAS EXTENDIDAS con un mínimo 150° de separación uniforme de piernas en el vuelo.\n" +
                        "N5 Viga - 13\n" +
                        "Aterrizar sobre la pierna derecha en demi-plié con la pierna izquierda extendida hacia atrás y\n" +
                        "girada hacia afuera en una posición de arabesca baja. El enfoque está en la alineación del\n" +
                        "cuerpo y la altura del salto leap split.\n" +
                        "Brazos: Durante el paso, bajar ambos brazos hacia los lados y abajo para terminar abajo a\n" +
                        "los lados del cuerpo. Durante y en el aterrizaje del salto leap split, usar una de las tres\n" +
                        "posiciones de brazos aceptables para los saltos leap split mostradas en el Glosario.\n" +
                        "SALTO EXTENDIDO (0.20)\n" +
                        "Cerrar inmediatamente el pie izquierdo detrás del derecho en demi-plié. Empujar la viga,\n" +
                        "extender ambas piernas a través de la cadera, rodillas, tobillos y dedos, con las piernas\n" +
                        "juntas, para realizar un SALTO EXTENDIDO. Durante el salto, se debe presionar la parte\n" +
                        "interna de los muslos para juntarlos y resultar en que el talón del pie derecho presione contra\n" +
                        "la parte delantera del pie izquierdo.\n" +
                        "Brazos: Levantar los brazos hacia la corona en el salto. El recorrido hacia la corona es\n" +
                        "opcional.\n" +
                        "Aterrizar con ambos pies al mismo tiempo en demi-plié, y presionar a través de los metatarsos\n" +
                        "para bajar los talones hacia la viga, el pie derecho delante del pie izquierdo con ambos pies\n" +
                        "ligeramente hacia afuera.\n" +
                        "Brazos: Los brazos permanecen en la corona en el aterrizaje.\n" +
                        "Estirar las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Abiertos en diagonal arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Caída si la palanca no se mantiene o si el salto no se ejecuta correctamente.\n" +
                        "Prevención: Fortalecer los músculos del core y de la espalda, practicar la palanca y el salto por separado antes de combinarlos.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON");
                intent.putExtra("mov","V_n5_m9");
                intent.putExtra("titulo", "https://www.youtube.com/watch?v=9gupKGTzmfw&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNQ%3D%3D");
                startActivity(intent);
            }

        });

//Boton Movimiento10
        Movimiento10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m10_n5_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n5_m10);  // Recurso de la tabla
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
                        "Extender la pierna derecha y apuntar el pie derecho sobre la viga.\n" +
                        "Brazos: Levantar ambos brazos completamente arriba.\n" +
                        "Si se invierte la INVERSIÓN LATERAL, después de extender la pierna derecha, dar el\n" +
                        "paso adelante con la derecha y apuntar el pie izquierdo al frente.\n" +
                        "Transferir el peso al pie derecho para realizar un desplante derecho (figura 4) O “entrada de\n" +
                        "tipo escalador” (figura 5) con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo para colocar la mano derecha de lado\n" +
                        "sobre la viga mientras el cuerpo gira 90° a la izquierda. Continuar para levantar la pierna\n" +
                        "izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar la mano izquierda en la viga de lado o ligeramente hacia adentro (las manos\n" +
                        "separadas al ancho de los hombros) mientras la pierna derecha empuja fuera de la viga para\n" +
                        "realizar una INVERSIÓN LATERAL a la derecha.\n" +
                        "N5 Viga - 15\n" +
                        "La cabeza permanece alineada, con el ángulo de los hombros y el de la cadera abiertos, y el\n" +
                        "enfoque por debajo del brazo izquierdo para ver la viga en el descenso.\n" +
                        "SALTO EXTENDIDO (A EMPUJAR) (0.20)\n" +
                        "Girar 90° hacia adentro para descender con la izquierda mientras mantiene los brazos\n" +
                        "cubriendo las orejas para terminar con la pierna izquierda extendida (o ligeramente flexionada)\n" +
                        "y cerrar inmediatamente la derecha detrás del pie izquierdo. Inmediatamente empujar el pie\n" +
                        "derecho para realizar un SALTO EXTENDIDO (A EMPUJAR). Aterrizar en demi-plié.\n" +
                        "Brazos: Permanecen arriba en todo momento.\n" +
                        "Extender ambas piernas.\n" +
                        "Brazos: Abrir en diagonal arriba a los lados al final.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "(Similar a niveles anteriores, pero con mayor dificultad)");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9gupKGTzmfw&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNQ%3D%3D");
                intent.putExtra("mov","V_n5_m10");
                intent.putExtra("titulo", "(*) INVERSIÓN LATERAL");
                startActivity(intent);
            }

        });

//Boton Movimiento11
        Movimiento11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(com.example.regym.manual_gimnasia.movimientos_viga_mg.Movimientos_Viga_N5_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m11_n5_viga);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_viga_n5_m11);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Mientras se gira 90° a la izquierda, dar un paso atrás con la izquierda en relevé y cerrar el pie\n" +
                        "derecho al lado del pie izquierdo para terminar en un apoyo en relevé lateral. Los pies\n" +
                        "pueden estar paralelos o ligeramente girados hacia afuera.\n" +
                        "Brazos: Levantar a la corona.\n" +
                        "Hacer demi-plié con la pierna derecha mientras se extiende la pierna izquierda hacia un lado\n" +
                        "(ligeramente girada hacia afuera), apuntando el pie izquierdo sobre la parte superior de la viga\n" +
                        "para realizar una pose de desplante lateral.\n" +
                        "Brazos: Bajar el brazo izquierdo hacia al lado-abajo o en diagonal abajo al lado.\n" +
                        "Simultáneamente, bajar el brazo derecho hacia al lado y hacia abajo para colocar la mano\n" +
                        "derecha sobre la cadera derecha.\n" +
                        "Enfoque: Al finalizar el desplante lateral, enfocarse en la mano izquierda.\n" +
                        "Dar un paso hacia la izquierda (pie en planta) para moverse hacia el extremo de la viga.\n" +
                        "Cerrar el pie derecho junto al pie izquierdo en planta con el metatarso del pie derecho en la\n" +
                        "viga para realizar la pose de arco forzado con el pie derecho.\n" +
                        "Brazos: Levantar el brazo izquierdo hacia al lado-arriba hasta completamente arriba. La mano\n" +
                        "derecha permanece en la cadera.\n" +
                        "Enfoque: A la derecha.\n" +
                        "Bajar el talón derecho a la viga y al mismo tiempo levantar el talón izquierdo de la viga para\n" +
                        "terminar en una segunda pose de arco forzado con el pie izquierdo.\n" +
                        "Brazos: El brazo izquierdo permanece arriba. El brazo derecho permanece en la cadera.\n" +
                        "Enfoque: Permanece por debajo de la viga (a la derecha).\n" +
                        "Mientras se gira 90° a la derecha, empujar hacia abajo sobre el pie izquierdo y hacer presión\n" +
                        "con el talón izquierdo alrededor para terminar con el pie izquierdo paralelo, con el talón cerca\n" +
                        "o en el extremo de la viga. A medida que ocurre el giro, deslizar el pie derecho ligeramente\n" +
                        "hacia adelante para terminar con el talón derecho fuera de la viga hasta un desplante derecho\n" +
                        "con el pie derecho en arco forzado y la rodilla derecha y toda la cadera hacia adelante.\n" +
                        "Brazos: Bajar el brazo izquierdo hacia adelante y abajo y flexionar el brazo izquierdo para\n" +
                        "tocar el hombro derecho con las puntas de los dedos índice y medio, con la palma hacia\n" +
                        "afuera. La mano derecha permanece en la cadera.\n" +
                        "Enfoque: A la izquierda, por arriba del hombro izquierdo.\n" +
                        "Cerrar el pie derecho hacia el pie izquierdo. La colocación real del pie es opcional.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba.\n" +
                        "N5 Viga - 17\n" +
                        "SALIDA DE MORTAL ATRÁS AGRUPADO (0.60)\n" +
                        "Hacer demi-plié con ambas piernas y bajar ligeramente el torso. Extender el torso y extender\n" +
                        "dinámicamente las rodillas mientras se levantan las rodillas hacia adelante y arriba para lograr\n" +
                        "una posición agrupada de mínimo de 90° (ángulo de cadera y rodillas). El agarre de las\n" +
                        "piernas con las manos es opcional.\n" +
                        "Continuar rotando hacia arriba y atrás mientras la cadera gira por encima de la cabeza para\n" +
                        "realizar un MORTAL ATRÁS AGRUPADO.\n" +
                        "En preparación para el aterrizaje, extender el cuerpo de la posición agrupada.\n" +
                        "Aterrizar en demi-plié en posición controlada y equilibrada (“plantada”).\n" +
                        "Brazos: En la preparación y el aterrizaje de la salida, los brazos son opcionales\n" +
                        "Estirar las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Mover hasta arriba, después abrir en diagonal arriba a los lados.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Caída, lesiones en la cabeza o el cuello si el mortal no se ejecuta correctamente.\n" +
                        "Prevención: Practicar el mortal en el suelo, mantener el cuerpo encogido durante la ejecución y controlar el impulso.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=9gupKGTzmfw&pp=ygUTcnV0aW5hIHZpZ2Egbml2ZWwgNQ%3D%3Dh");
                intent.putExtra("mov","V_n5_m11");
                intent.putExtra("titulo", "SALIDA DE MORTAL ATRÁS AGRUPADO");
                startActivity(intent);
            }

        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
