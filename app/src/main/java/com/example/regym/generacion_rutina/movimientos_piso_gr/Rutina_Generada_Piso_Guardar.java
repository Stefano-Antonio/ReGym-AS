package com.example.regym.generacion_rutina.movimientos_piso_gr;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;


public class Rutina_Generada_Piso_Guardar extends AppCompatActivity {

    private void mostrarPopupGuardar() {


        Dialog dialog = new Dialog(this);

        // Infla el layout de la pantalla emergente
        View popupView = getLayoutInflater().inflate(R.layout.rutina_generada_piso_guardar_ventana_emergente1, null);

        // Obtiene referencias a los elementos
        Button boton1 = popupView.findViewById(R.id.Regresar_btn);

        ImageButton remplazar_btn = popupView.findViewById(R.id.buttonRemplaza);

        ImageButton guardar_btn = popupView.findViewById(R.id.buttonGuardar);

        // Configura listeners para los botones
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para el botón 1
                dialog.dismiss();
            }

        });
        remplazar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        guardar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        // Crea el Dialog
        dialog.setContentView(popupView);
        dialog.show();
    }
    private void mostrarPopupBorrar() {


        Dialog dialog = new Dialog(this);

        // Infla el layout de la pantalla emergente
        View popupView = getLayoutInflater().inflate(R.layout.rutina_generada_piso_n1_gr_guardar_ventana_emergente2, null);

        // Obtiene referencias a los elementos
        Button boton1 = popupView.findViewById(R.id.Regresar_btn);

        Button si_btn = popupView.findViewById(R.id.si_btn);

        Button no_btn = popupView.findViewById(R.id.no_btn);

        // Configura listeners para los botones
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para el botón 1
                dialog.dismiss();
            }

        });
        si_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        no_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        // Crea el Dialog
        dialog.setContentView(popupView);
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.rutina_generada_piso_guardar);

//botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        ImageButton buttonBorrar = findViewById(R.id.buttonDelete);
        Button buttonGuardar = findViewById(R.id.Guardar1_btn);

//boton Regresar

        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Rutina_Generada_Piso_Guardar.this, Rutina_Generada_Piso.class);
                startActivity(intent);
            }
        });
//Borrar

        buttonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarPopupBorrar();
            }
        });


//Guardar

        buttonGuardar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                mostrarPopupGuardar();

            }
        });


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();


    }}


