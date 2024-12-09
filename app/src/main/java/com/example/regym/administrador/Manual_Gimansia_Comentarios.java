package com.example.regym.administrador;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;

public class Manual_Gimansia_Comentarios extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_gimansia_comentarios);
        String usuarioId = getIntent().getStringExtra("usuarioId");
        String matricula = getIntent().getStringExtra("matricula");

//Botones
        Button Salto_btn = findViewById(R.id.Salto_btn);
        Button Piso_btn = findViewById(R.id.Piso_btn);
        Button Barra_btn = findViewById(R.id.Barra_btn);
        Button Viga_btn = findViewById(R.id.Viga_btn);
        Button Regresar_btn = findViewById(R.id.Regresar_btn);


//Boton salto
        Salto_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Manual_Gimansia_Comentarios.this, Comentarios_Usuario.class);
                String ComId = "S";
                intent.putExtra("ComId",ComId);
                intent.putExtra("usuarioId", usuarioId);
                intent.putExtra("matricula", matricula);
                startActivity(intent);
            }
        });
//Boton piso
        Piso_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Manual_Gimansia_Comentarios.this, Comentarios_Usuario.class);
                String ComId = "P";
                intent.putExtra("ComId",ComId);
                intent.putExtra("usuarioId", usuarioId);
                intent.putExtra("matricula", matricula);
                startActivity(intent);
            }
        });
//Boton barra
        Barra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Manual_Gimansia_Comentarios.this, Comentarios_Usuario.class);
                String ComId = "B";
                intent.putExtra("ComId",ComId);
                intent.putExtra("usuarioId", usuarioId);
                intent.putExtra("matricula", matricula);
                startActivity(intent);
            }
        });
//Boton viga
        Viga_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Manual_Gimansia_Comentarios.this, Comentarios_Usuario.class);
                String ComId = "V";
                intent.putExtra("ComId",ComId);
                intent.putExtra("usuarioId", usuarioId);
                intent.putExtra("matricula", matricula);
                startActivity(intent);
            }
        });
//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Manual_Gimansia_Comentarios.this, Pantalla_Inicio_Administrador.class);
                startActivity(intent);
            }
        });



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
