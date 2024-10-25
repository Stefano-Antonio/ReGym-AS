package com.example.regym.manual_gimnasia.movimientos_piso_mg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.manual_gimnasia.Mostrar_Niveles_Piso_Mg;
import com.example.regym.R;
import com.example.regym.manual_gimnasia.movimientos_piso_mg.movimientos_Individuales.movimientos_piso_n1_mg.Movimiento_Piso_No1_Mg;
import com.example.regym.manual_gimnasia.movimientos_piso_mg.movimientos_Individuales.movimientos_piso_n1_mg.Movimiento_Piso_No2_Mg;

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

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Piso_No1_Mg.class);
                startActivity(intent);
            }
        });
//boton Movimiento2
        Movimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Movimientos_Piso_N1_Mg.this, Movimiento_Piso_No2_Mg.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
