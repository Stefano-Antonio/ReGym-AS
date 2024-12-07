package com.example.regym.manual_gimnasia.movimientos_barra_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;
import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;

public class Movimientos_Barra_N5_Mg extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_barra_n5_mg);

// Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

//Botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);

//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Barra_N5_Mg.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);
            }
        });


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}