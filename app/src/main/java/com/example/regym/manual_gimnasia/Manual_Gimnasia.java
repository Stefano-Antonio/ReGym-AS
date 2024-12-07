package com.example.regym.manual_gimnasia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.Pantalla_Inicio_Entrenador;
import com.example.regym.R;

public class Manual_Gimnasia extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_gimnasia);

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

                Intent intent = new Intent(Manual_Gimnasia.this, Mostrar_Niveles_Salto_Mg.class);
                String userId = getIntent().getStringExtra("userId");
                intent.putExtra("userId",userId);
                startActivity(intent);
            }
        });
//Boton piso
        Piso_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Manual_Gimnasia.this, Mostrar_Niveles_Piso_Mg.class);
                String userId = getIntent().getStringExtra("userId");
                intent.putExtra("userId",userId);
                startActivity(intent);
            }
        });
//Boton barra
        Barra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Manual_Gimnasia.this, Mostrar_Niveles_Barra_Mg.class);
                startActivity(intent);
            }
        });
//Boton viga
        Viga_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Manual_Gimnasia.this, Mostrar_Niveles_Viga_Mg.class);
                startActivity(intent);
            }
        });
//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Manual_Gimnasia.this, Pantalla_Inicio_Entrenador.class);
                startActivity(intent);
            }
        });



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
