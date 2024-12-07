package com.example.regym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Creditos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.creditos);

//Botones
        Button Regresar_btn = findViewById(R.id.Regresar_btn);

//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Creditos.this, MainActivity   .class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}