package com.example.regym.manual_gimnasia.movimientos_barra_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Barra_N2_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_barra_n2_mg);

//Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

//Botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Movimiento1 = findViewById(R.id.movimiento_1_btn);
        Button Movimiento2 = findViewById(R.id.movimiento_2_btn);
        Button Movimiento3 = findViewById(R.id.movimiento_3_btn);
        Button Movimiento4 = findViewById(R.id.movimiento_4_btn);
        Button Movimiento5 = findViewById(R.id.movimiento_5_btn);

//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N2_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n2_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n2_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Desde la posición inicial recta de pie, hacer demi-plié con ambas piernas. Contraer ligeramente\n" +
                        "los abdominales e inclinar el torso ligeramente hacia adelante.\n" +
                        "Brazos: Mover ambos brazos hacia adelante y arriba para terminar con ambos brazos\n" +
                        "flexionados hacia adelante y en medio con las palmas hacia afuera.\n" +
                        "Enfoque: Abajo.\n" +
                        "Estirar el torso y las piernas hasta una posición recta de pie.\n" +
                        "Brazos: Abrir ambos brazos a los lados-en medio.\n" +
                        "Enfoque: Al frente.\n" +
                        "Si se invierte la (*) INVERSIÓN LATERAL, apuntar el pie izquierdo adelante.\n" +
                        "izquierda\n" +
                        "Apuntar el pie derecho adelante en el suelo.\n" +
                        "Brazos: Levantar ambos brazos hacia los lados-arriba hasta completamente arriba.\n" +
                        "Transferir el peso al pie derecho para realizar un desplante derecho (figura 2) O “entrada de\n" +
                        "tipo escalador” (figura 3) con la pierna derecha.\n" +
                        "Levantar la pierna izquierda hacia atrás y hacia arriba por encima de la cabeza y mantener las\n" +
                        "orejas cubiertas por los brazos mientras se llega abajo para colocar la mano derecha de lado\n" +
                        "sobre el suelo mientras el cuerpo gira 90° a la izquierda. Continuar para levantar la pierna\n" +
                        "izquierda hacia atrás y hacia arriba a medida que el torso desciende.\n" +
                        "Colocar la mano izquierda en el suelo de lado o ligeramente hacia adentro (las manos\n" +
                        "separadas al ancho de los hombros) mientras la pierna derecha empuja fuera del suelo para\n" +
                        "realizar una INVERSIÓN LATERAL a la derecha.\n" +
                        "La cabeza permanece alineada, con el ángulo de los hombros y el de la cadera abiertos, y el\n" +
                        "enfoque por debajo del brazo izquierdo para ver el suelo en el descenso.\n" +
                        "Girar 90° hacia adentro para descender con la izquierda mientras mantiene los brazos\n" +
                        "cubriendo las orejas para terminar con la pierna izquierda extendida (o ligeramente flexionada)\n" +
                        "y cerrar inmediatamente el pie derecho al lado del pie izquierdo para terminar recta de pie (en\n" +
                        "planta o en relevé).\n" +
                        "Brazos: Permanecen arriba en todo momento y cuando se hace el descenso.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Equilibrio: Requiere un gran equilibrio y control corporal.\n" +
                        "Fuerza: Es necesario tener suficiente fuerza en brazos, hombros y core para mantener la posición.\n" +
                        "Flexibilidad: La flexibilidad en los hombros y cadera facilita la transición.\n" +
                        "Altura: La altura de la barra debe ser adecuada para evitar lesiones al descender.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hVUdxwpCUAk&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDI%3D\n");
                intent.putExtra("mov","B_n1_m1");
                intent.putExtra("titulo", "Pose, (*) INVERSIÓN LATERAL");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n2_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n2_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Doblar las rodillas para llegar a una posición en cuclillas, manteniendo los pies en el suelo.\n" +
                        "Empezar a rodar hacia atrás con la cabeza metida, la barbilla contra el pecho. Con los brazos\n" +
                        "extendidos y las manos hacia adentro, estirarse hacia atrás para colocar los lados de los\n" +
                        "dedos meñiques en el suelo detrás de la cabeza a un ancho no mayor que el ancho de los\n" +
                        "hombros y realizar una RODADA ATRÁS A POSICIÓN DE LAGARTIJA (mantener una\n" +
                        "posición recta y ahuecada del cuerpo) con las piernas juntas y los metatarsos en el suelo.\n" +
                        "Brazos: Permanecen arriba. No se permite entrelazar los dedos.\n" +
                        "Deslizar los pies hacia adelante mientras se flexionan simultáneamente las rodillas para llegar\n" +
                        "a una posición sentada-arrodillada con los glúteos apoyados en los talones.\n" +
                        "Brazos: Levantar ambos brazos hacia adelante-arriba a la corona.\n" +
                        "Inmediatamente levantar los glúteos de los talones, extender la cadera y levantar la pierna\n" +
                        "derecha hacia adelante para colocar el pie derecho en el suelo girado hacia afuera en una\n" +
                        "pose ½ arrodillada con el tobillo derecho alineado frente a la rodilla derecha con toda la\n" +
                        "cadera cuadrada hacia adelante.\n" +
                        "Estirar ambas piernas y cerrar el pie izquierdo junto al pie derecho para llegar a parada.\n" +
                        "N2 Suelo - 4\n" +
                        "Brazos: Hacer un círculo con ambos brazos hacia los lados o hacia atrás y abajo. En la parte\n" +
                        "inferior del círculo, colocar la mano derecha en la cadera. Continuar el círculo con el brazo\n" +
                        "izquierdo hacia al frente-arriba a la corona.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Coordinación: Requiere una coordinación precisa entre brazos y piernas.\n" +
                        "Control: Es fundamental mantener el control del cuerpo durante toda la rotación.\n" +
                        "Impacto: Al llegar a la posición de lagartija, amortigua el impacto para evitar lesiones en las muñecas.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hVUdxwpCUAk&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDI%3D\n");
                intent.putExtra("mov","B_n1_m2");
                intent.putExtra("titulo", "RODADA ATRÁS A POSICIÓN DE LAGARTIJA");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n2_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n2_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Con los hombros ligeramente delante de la barra, balancear las piernas hacia adelante y\n" +
                        "luego hacia atrás y hacia arriba. Empujar hacia abajo la barra, extendiéndose a través de los\n" +
                        "hombros, para levantar el cuerpo de la barra y realizar un IMPULSO con las piernas juntas.\n" +
                        "Mantener una posición del cuerpo recta y ahuecada con los glúteos y los abdominales\n" +
                        "apretados, los brazos y las piernas extendidos y la cabeza neutra.\n" +
                        "Con los hombros todavía ligeramente delante de la barra, regresar al apoyo frontal e\n" +
                        "inmediatamente balancear las piernas hacia adelante y luego hacia atrás y hacia arriba.\n" +
                        "Empujar hacia abajo la barra, extendiéndose a través de los hombros, para levantar el cuerpo\n" +
                        "de la barra y realizar un SEGUNDO IMPULSO con las piernas juntas.\n" +
                        "Mantener una posición del cuerpo recta y ahuecada con los glúteos y los abdominales\n" +
                        "apretados, los brazos y las piernas extendidos y la cabeza neutra.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Altura: El impulso en este nivel suele ser más potente, por lo que la altura de la barra debe ser adecuada.\n" +
                        "Fuerza: Requiere mayor fuerza explosiva en brazos y hombros.\n" +
                        "Coordinación: La coordinación entre brazos y piernas es crucial para un impulso eficiente.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hVUdxwpCUAk&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDI%3D\n");
                intent.putExtra("mov","B_n1_m3");
                intent.putExtra("titulo", "IMPULSO");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n2_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n2_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Antes de que la cadera o los muslos regresen a la barra, inclinar los hombros hacia atrás y\n" +
                        "hacer que el cuerpo haga un círculo hacia atrás alrededor de la barra con una posición del\n" +
                        "cuerpo recta y ahuecada para realizar una VUELTA ATRÁS.\n" +
                        "Mientras se mantiene los brazos y piernas extendidos en todo momento, mover las manos\n" +
                        "hacia la parte superior de la barra para pasar por un apoyo frontal extendido. Mantener la\n" +
                        "posición neutra de la cabeza en todo momento.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Velocidad: La vuelta atrás en este nivel suele ser más rápida, lo que aumenta el riesgo de desequilibrio.\n" +
                        "Altura: La altura de la barra puede influir en la dificultad de la vuelta.\n" +
                        "Rotación: Asegúrate de completar la rotación de manera controlada y evitar movimientos bruscos.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hVUdxwpCUAk&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDI%3D\n");
                intent.putExtra("mov","B_n1_m4");
                intent.putExtra("titulo", "VUELTA ATRÁS");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N2_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n2_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n2_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Presionar inmediatamente la barra hacia abajo para hacer contacto de la parte media a la\n" +
                        "parte inferior de los muslos, mantener la cabeza neutra, el pecho y el torso ahuecados y los\n" +
                        "brazos extendidos. Mantener esta posición mientras se inclina los hombros hacia atrás y se\n" +
                        "hace un círculo en la barra con la cadera alejada de la misma.\n" +
                        "A medida que la cadera se eleva, abrir completamente el ángulo de los hombros mientras se\n" +
                        "empuja la barra hacia atrás. Mantener una posición del cuerpo recta y ahuecada con los\n" +
                        "brazos y las piernas extendidos en todo momento y la cabeza neutra. Soltar las manos para\n" +
                        "realizar una SALIDA DE SUB BALANCEO.\n" +
                        "Mantener una posición del cuerpo apretada en el vuelo y aterrizar en demi-plié en una\n" +
                        "posición equilibrada y controlada (“plantada”).\n" +
                        "Brazos: La posición de los brazos en el aterrizaje es opcional.\n" +
                        "Estirar las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Mover hacia la posición arriba.");
                intent.putExtra("informacion_ayuda", "Equilibrio: Requiere un gran equilibrio para mantener el cuerpo en posición de balanceo.\n" +
                        "Fuerza: La fuerza en brazos y core es fundamental para salir del balanceo.\n" +
                        "Coordinación: La coordinación entre brazos y piernas debe ser precisa.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=hVUdxwpCUAk&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDI%3D\n");
                intent.putExtra("mov","B_n1_m5");
                intent.putExtra("titulo", "SALIDA DE SUB BALANCEO");
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
