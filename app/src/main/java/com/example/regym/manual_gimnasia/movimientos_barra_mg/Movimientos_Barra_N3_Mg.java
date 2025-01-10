package com.example.regym.manual_gimnasia.movimientos_barra_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.manual_gimnasia.movimiento_Individual.Movimiento_Pantalla;

public class Movimientos_Barra_N3_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_barra_n3_mg);

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

                Intent intent = new Intent(Movimientos_Barra_N3_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });

//Boton Movimiento1
        Movimiento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m1_n3_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n3_m1);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Posición inicial (PI): Parada con los pies juntos, por fuera de las barras, mirando hacia la\n" +
                        "barra inferior. Se puede usar un botador o una superficie elevada (como un colchón plegable\n" +
                        "fabricado o un bloque de elementos/asistencia acolchonado) como superficie para entradas,\n" +
                        "pero debe retirarse lo antes posible después de que la gimnasta haya brincado hacia el\n" +
                        "balanceo.\n" +
                        "Al realizar la ENTRADA DE BALANCEO DE KIP Y REGRESO, los pies no pueden regresar\n" +
                        "al botador o la superficie elevada.\n" +
                        "1A. ENTRADA: BALANCEO DE KIP Y REGRESO (0.20)\n" +
                        "SUBIDA DE ESTÓMAGO (0.40)\n" +
                        "Brincar con ambos pies y levantar la cadera hacia atrás y hacia arriba para sujetar la barra\n" +
                        "inferior con una toma dorsal, con las manos separadas a la altura de los hombros. Mantener\n" +
                        "una posición del cuerpo carpada y ahuecada con las piernas extendidas y la cabeza neutra.\n" +
                        "Balancear el cuerpo hacia adelante con las piernas juntas (carpada) o separadas. Al finalizar\n" +
                        "el BALANCEO DE KIP hacia adelante, las piernas están juntas y la cadera completamente\n" +
                        "extendida.\n" +
                        "Retroceder el BALANCEO y columpiarse hacia atrás con las piernas estiradas y juntas, con\n" +
                        "los pies fuera del piso. Al finalizar el balanceo hacia atrás, los pies pueden tocar el colchón\n" +
                        "para terminar en una posición recta de pie, o el cuerpo puede continuar a balancearse hacia\n" +
                        "adelante y colocar los pies sobre el colchón más cerca del aparato.\n" +
                        "La gimnasta puede ponerse de pie momentáneamente o usar una acción de “empuje” para\n" +
                        "iniciar la SUBIDA DE ESTÓMAGO. Las manos permanecen en la barra en toma dorsal.\n" +
                        "Mantener los brazos y las piernas extendidos en todo momento.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Dificultad: Las barras asimétricas requieren una mayor coordinación y fuerza debido a la diferencia de altura entre las barras.\n" +
                        "Equilibrio: Mantener el equilibrio entre ambas barras es fundamental para evitar caídas.\n" +
                        "Transiciones: Las transiciones entre las barras deben ser suaves y controladas.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=fzBgqRX_B6E&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDM%3D\n");
                intent.putExtra("mov","B_n3_m1");
                intent.putExtra("titulo", "BARRAS ASIMÉTRICAS\n");
                startActivity(intent);
            }
        });

//Boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m2_n3_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n3_m2);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Levantar inmediatamente ambas piernas hacia arriba y sobre la barra inferior mientras jala\n" +
                        "con los brazos flexionados. Continuar levantando la cadera sobre la barra para realizar la\n" +
                        "SUBIDA DE ESTÓMAGO.\n" +
                        "Mover las manos hacia la parte superior de la barra y estirar los brazos para llegar a un apoyo\n" +
                        "frontal extendido. Mantener las piernas extendidas y una posición neutra de la cabeza en todo\n" +
                        "momento.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Altura: La altura de las barras asimétricas puede dificultar la subida de estómago.\n" +
                        "Fuerza: Se requiere una mayor fuerza en brazos y abdominales.\n" +
                        "Flexibilidad: La flexibilidad en los hombros es esencial para realizar este movimiento.\n");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=fzBgqRX_B6E&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDM%3D\n");
                intent.putExtra("mov","B_n3_m2");
                intent.putExtra("titulo", "SUBIDA DE ESTÓMAGO\n");
                startActivity(intent);
            }
        });

//Boton Movimiento3
        Movimiento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m3_n3_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n3_m3);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Brincar con ambos pies y levantar la cadera hacia atrás y hacia arriba para sujetar la barra\n" +
                        "inferior con una toma dorsal, con las manos separadas a la altura de los hombros.\n" +
                        "Mantener una posición del cuerpo ahuecada con las piernas extendidas y la cabeza neutra.\n" +
                        "Balancear el cuerpo hacia adelante con las piernas juntas (carpada) o separadas. Al finalizar\n" +
                        "el balanceo de kip hacia adelante, las piernas están juntas y la cadera completamente\n" +
                        "extendida. Levantar rápidamente los pies a la barra y jalar la barra hacia abajo, subiendo las\n" +
                        "piernas hasta la cadera para realizar un KIP.\n" +
                        "Mientras jala hacia abajo, mover las manos hacia la parte superior de la barra para llegar a un\n" +
                        "soporte frontal con las piernas/pies delante de la barra (cuerpo ligeramente carpado), los\n" +
                        "hombros hacia adelante y la cabeza neutra. Mantener los brazos y las piernas extendidos en\n" +
                        "todo momento.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Variedad: Existen diferentes tipos de entradas en las barras asimétricas, cada una con sus propias dificultades.\n" +
                        "Coordinación: La coordinación entre brazos y piernas es fundamental.\n" +
                        "Impulso: El impulso inicial debe ser suficiente para alcanzar la posición deseada.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=fzBgqRX_B6E&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDM%3D\n");
                intent.putExtra("mov","B_n3_m3");
                intent.putExtra("titulo", "ENTRADA");
                startActivity(intent);
            }
        });

//Boton Movimiento4
        Movimiento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m4_n3_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n3_m4);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Si se elige la ENTRADA DE SUBIDA DE ESTÓMAGO, con los hombros ligeramente delante\n" +
                        "de la barra, balancear las piernas hacia adelante y luego hacia atrás y hacia arriba.\n" +
                        "Si se elige la ENTRADA DE KIP, con los hombros ligeramente delante de la barra,\n" +
                        "inmediatamente balancear las piernas hacia atrás y hacia arriba.\n" +
                        "Revisado el 12 de junio,\n" +
                        "2021\n" +
                        "N3 Barras - 4\n" +
                        "Empujar hacia abajo la barra, extendiéndose a través de los hombros, para levantar el cuerpo\n" +
                        "de la barra y realizar un IMPULSO con las piernas juntas. Mantener una posición del cuerpo\n" +
                        "recta y ahuecada con los glúteos y los abdominales apretados, los brazos y las piernas\n" +
                        "extendidos y la cabeza neutra.");  // Texto de descripción
                intent.putExtra("informacion_ayuda", "Potencia: Los impulsos en las barras asimétricas suelen ser más potentes y requieren mayor fuerza.\n" +
                        "Altura: La altura del impulso dependerá del movimiento que se quiera realizar a continuación.\n" +
                        "Coordinación: La coordinación entre brazos y piernas es esencial para un impulso eficiente.\n");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=fzBgqRX_B6E&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDM%3D\n");
                intent.putExtra("mov","B_n3_m4");
                intent.putExtra("titulo", "IMPULSO");
                startActivity(intent);
            }
        });

//Boton Movimiento5
        Movimiento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m5_n3_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n3_m5);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Antes de que la cadera o los muslos regresen a la barra, inclinar los hombros hacia atrás y\n" +
                        "hacer que el cuerpo haga un círculo hacia atrás alrededor de la barra con una posición del\n" +
                        "cuerpo recta y ahuecada para realizar una VUELTA ATRÁS.\n" +
                        "Mientras se mantiene los brazos y piernas extendidos en todo momento, mover las manos\n" +
                        "hacia la parte superior de la barra para pasar por un apoyo frontal extendido.\n" +
                        "Continuar inclinando los hombros hacia atrás y realizar una segunda VUELTA ATRÁS para\n" +
                        "terminar en un apoyo frontal con los hombros delante de la barra.\n" +
                        "Mantener una posición neutra de la cabeza en todo momento de ambas VUELTAS ATRÁS.");
                intent.putExtra("informacion_ayuda", "Dificultad: Las vueltas atrás en las barras asimétricas son más desafiantes debido a la diferencia de altura entre las barras.\n" +
                        "Rotación: La rotación debe ser completa y controlada para evitar lesiones.\n" +
                        "Equilibrio: Mantener el equilibrio durante la rotación es fundamental.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=fzBgqRX_B6E&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDM%3D\n");
                intent.putExtra("mov","B_n3_m5");
                intent.putExtra("titulo", "VUELTA ATRÁS\n");
                startActivity(intent);
            }
        });

//Boton Movimiento6
        Movimiento6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m6_n3_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n3_m6);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Empujar hacia abajo la barra, extendiendo el cuerpo hasta que los muslos toquen la barra.\n" +
                        "Levantar los talones para iniciar la caída hacia adelante, manteniendo una posición del cuerpo\n" +
                        "recta y ahuecada (sin arco). Continuar levantando los talones mientras el cuerpo se carpa\n" +
                        "rápidamente para hacer un círculo en la barra, y así realizar una VUELTA AL FRENTE. Se\n" +
                        "acepta una ligera flexión de brazos durante el círculo. A medida que el círculo está a punto de\n" +
                        "completarse, mover las manos hacia la parte superior de la barra y estirar los brazos, para\n" +
                        "terminar en un soporte frontal con las piernas/pies delante de la barra (cuerpo ligeramente\n" +
                        "carpado). Mantener las piernas extendidas y una posición neutra de la cabeza en todo\n" +
                        "momento.\n" +
                        "Con los hombros ligeramente delante de la barra, inmediatamente balancear las piernas hacia\n" +
                        "atrás y hacia arriba. Empujar hacia abajo la barra, extendiéndose a través de los hombros,\n" +
                        "para levantar el cuerpo de la barra e inmediatamente realizar un PEQUEÑO IMPULSO con\n" +
                        "las piernas juntas.\n" +
                        "Mantener una posición del cuerpo recta y ahuecada con los glúteos y los abdominales\n" +
                        "apretados, los brazos y las piernas extendidos y la cabeza neutra. Una vez completado el\n" +
                        "pequeño impulso, mantener la inclinación de los hombros adelante mientras se realiza un\n" +
                        "regreso controlado de la cadera a la barra.");
                intent.putExtra("informacion_ayuda", "Coordinación: La vuelta al frente requiere una coordinación precisa.\n" +
                        "Equilibrio: Mantener el equilibrio durante la rotación es fundamental.\n" +
                        "Posición de las manos: La posición de las manos en las barras influye en la dificultad del movimiento.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=fzBgqRX_B6E&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDM%3D\n");
                intent.putExtra("mov","B_n3_m6");
                intent.putExtra("titulo", "VUELTA AL FRENTE\n");
                startActivity(intent);
            }
        });

//Boton Movimiento7
        Movimiento7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N3_Mg.this, Movimiento_Pantalla.class);
                intent.putExtra("movimiento_gift", R.raw.m7_n3_barra);  // Recurso del GIF
                intent.putExtra("tabla_imagen", R.drawable.tabla_barra_n3_m7);  // Recurso de la tabla
                intent.putExtra("descripcion_texto_a_mostrar", "Realizar inmediatamente otro IMPULSO con los brazos extendidos y las piernas juntas.\n" +
                        "Flexionar las piernas (no se requiere algún grado de flexión específico) y colocar los\n" +
                        "metatarsos en la barra entre las manos en una posición agrupada para realizar la\n" +
                        "COLOCACIÓN DE CUCLILLAS.\n" +
                        "Desde la posición agrupada en la barra inferior, extender las piernas e inmediatamente\n" +
                        "SALTAR hacia arriba en relación con la barra superior para realizar un SALTO EXTENDIDO\n" +
                        "para salir de la barra. No se permite hacer contacto con la barra superior. Mantener una\n" +
                        "posición del cuerpo apretada en el aire y aterrizar en demi-plié en una posición equilibrada y\n" +
                        "controlada (“plantada”).\n" +
                        "Brazos: Rectos al lado de las orejas durante el salto y opcionales al aterrizar.\n" +
                        "Estirar las piernas para terminar en posición recta de pie.\n" +
                        "Brazos: Mover hacia la posición arriba.");
                intent.putExtra("informacion_ayuda", "Complejidad: Este elemento combina varios movimientos y requiere una gran habilidad.\n" +
                        "Fuerza: Se necesita una gran fuerza en piernas, brazos y core.\n" +
                        "Coordinación: La coordinación entre todos los movimientos es esencial.");  // Texto de descripción
                intent.putExtra("link","https://www.youtube.com/watch?v=fzBgqRX_B6E&pp=ygUUcnV0aW5hIGJhcnJhIG5pdmVsIDM%3D\n");
                intent.putExtra("mov","B_n3_m7");
                intent.putExtra("titulo", "IMPULSO A CUCLILLAS");
                startActivity(intent);
            }
        });


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
