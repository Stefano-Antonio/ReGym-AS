package com.example.regym.generacion_rutina.movimientos_piso_gr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;


public class Rutina_Generada_Piso extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.rutina_generada_piso);

//botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        ImageButton Guardar_btn = findViewById(R.id.buttonGuardar);
//Textview
        TextView fortaalecimiento_txt = findViewById(R.id.fortalecimiento_txt);


//boton Regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Rutina_Generada_Piso.this, Movimientos_Piso_N1_Gr.class);
                startActivity(intent);
            }

        });

//boton Guardar
        Guardar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Rutina_Generada_Piso.this, Rutina_Generada_Piso_Guardar.class);
                startActivity(intent);
            }

        });

//informacion del switch
        boolean mostrarInformacion = getIntent().getBooleanExtra("mostrarInformacion", false);
        boolean mostrarInformacion2 = getIntent().getBooleanExtra("mostrarInformacion2", false);
        boolean mostrarInformacion3 = getIntent().getBooleanExtra("mostrarInformacion3", false);
        boolean mostrarInformacion4 = getIntent().getBooleanExtra("mostrarInformacion4", false);
        boolean mostrarInformacion5 = getIntent().getBooleanExtra("mostrarInformacion5", false);
        boolean mostrarInformacion6 = getIntent().getBooleanExtra("mostrarInformacion6", false);
        boolean mostrarInformacion7 = getIntent().getBooleanExtra("mostrarInformacion7", false);
        boolean mostrarInformacion8 = getIntent().getBooleanExtra("mostrarInformacion8", false);
        boolean mostrarInformacion9 = getIntent().getBooleanExtra("mostrarInformacion9", false);


        if (mostrarInformacion) {
            TextView informacionTextView = findViewById(R.id.fortalecimiento_txt);
            informacionTextView.setText("(1)Parado de manos completa en barda o a 90° en superficie elevada[30 segundos, 3 veces]");
            TextView informacionTextView2 = findViewById(R.id.Aparato_txt);
            informacionTextView2.setText("(2)Intento vuelta de carro normal en linea[ida y regreso en linea de podio]");
            TextView informacionTextView3 = findViewById(R.id.Acondicionamiento_txt);
            informacionTextView3.setText("(3)Lagartijas(20 lagartijas)");
        }if (mostrarInformacion2) {
            TextView informacionTextView = findViewById(R.id.fortalecimiento2_txt);
            informacionTextView.setText("(4)Postura cuchara rodillas dobladaa[30 segundos]");
            TextView informacionTextView2 = findViewById(R.id.Aparato2_txt);
            informacionTextView2.setText("(5)(Intento rodada atras en plano inclinado[10 intentos])");
            TextView informacionTextView3 = findViewById(R.id.Acondicionamiento2_txt);
            informacionTextView3.setText("(6)Abdominales agrupadas acostado boca arriba[20 veces]");
        }if (mostrarInformacion3) {
            TextView informacionTextView = findViewById(R.id.fortalecimiento3_txt);
            informacionTextView.setText("(7)Postura de velita, con apoyo de manos abajo[10 veces]");
            TextView informacionTextView2 = findViewById(R.id.Aparato3_txt);
            informacionTextView2.setText("(8)intento de velita, sentada o de pie[10 veces]");
            TextView informacionTextView3 = findViewById(R.id.Acondicionamiento3_txt);
            informacionTextView3.setText("(9)Abdominales a postura de velita(25 veces)");
        }if (mostrarInformacion4) {
            TextView informacionTextView = findViewById(R.id.fortalecimiento4_txt);
            informacionTextView.setText("(10)Mantener equilibrio un pie y el otro a 90°(30 segundos)");
            TextView informacionTextView2 = findViewById(R.id.Aparato4_txt);
            informacionTextView2.setText("(11)Practica del movimiento completo[10 veces]");
            TextView informacionTextView3 = findViewById(R.id.Acondicionamiento4_txt);
            informacionTextView3.setText("(12)Ejercicio elevar puntas \"pantorrillas\" y mantener[10 veces]");
        }if (mostrarInformacion5) {
            TextView informacionTextView = findViewById(R.id.fortalecimiento5_txt);
            informacionTextView.setText("(--)[---]");
            TextView informacionTextView2 = findViewById(R.id.Aparato5_txt);
            informacionTextView2.setText("(13)caballitos, salto manos extendidas a los lados paso salto[ida y vuelta al podio]");
            TextView informacionTextView3 = findViewById(R.id.Acondicionamiento5_txt);
            informacionTextView3.setText("(12)Ejercicio elevar puntas \"pantorrillas\" y mantener[10 veces]");
        }if (mostrarInformacion6) {
            TextView informacionTextView = findViewById(R.id.fortalecimiento6_txt);
            informacionTextView.setText("(--)[---]");
            TextView informacionTextView2 = findViewById(R.id.Aparato6_txt);
            informacionTextView2.setText("(salto extendido, a subir en vertical)[ida y vuelta al podio]");
            TextView informacionTextView3 = findViewById(R.id.Acondicionamiento6_txt);
            informacionTextView3.setText("(12)Ejercicio elevar puntas \"pantorrillas\" y mantener[10 veces]");
        }if (mostrarInformacion7) {
            TextView informacionTextView = findViewById(R.id.fortalecimiento7_txt);
            informacionTextView.setText("(4)Postura cuchara rodillas dobladaa[30 segundos]");
            TextView informacionTextView2 = findViewById(R.id.Aparato7_txt);
            informacionTextView2.setText("(14)(Intento rodada atras en plano inclinado[10 intentos]");
            TextView informacionTextView3 = findViewById(R.id.Acondicionamiento7_txt);
            informacionTextView3.setText("(6)Abdominales agrupadas acostado boca arriba[20 veces]");
        }if (mostrarInformacion8) {
            TextView informacionTextView = findViewById(R.id.fortalecimiento8_txt);
            informacionTextView.setText("(15)Palanca nivel 1 y nivel 2[10 veces cada una]");
            TextView informacionTextView2 = findViewById(R.id.Aparato8_txt);
            informacionTextView2.setText("(16)Intento escorpion[ida y vuelta al podio]");
            TextView informacionTextView3 = findViewById(R.id.Acondicionamiento8_txt);
            informacionTextView3.setText("(17)Postura de plancha, espalda recta a manetner[30 segundos, 3 veces]");
        }if (mostrarInformacion9) {
            TextView informacionTextView = findViewById(R.id.fortalecimiento9_txt);
            informacionTextView.setText("(--)[---]");
            TextView informacionTextView2 = findViewById(R.id.Aparato9_txt);
            informacionTextView2.setText("(18)Intento del movuimiento a mantener la postura 10 segundos[10 veces]");
            TextView informacionTextView3 = findViewById(R.id.Acondicionamiento9_txt);
            informacionTextView3.setText("(--)[---]");
        }



    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }}
