package com.example.regym.manual_gimnasia.movimientos_piso_mg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;

public class Movimientos_Piso_N2_Mg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimientos_piso_n2_mg);

// Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");

//botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);

//boton Regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {
            /*
                Intent intent = new Intent(Movimientos_Piso_N2_MG.this, Mostrar_Niveles_Piso_Mg.class);
                startActivity(intent);*/
            }
        });


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
