package com.example.regym.manual_gimnasia.movimientos_salto_mg.movimientos_individuales.movimientos_salto_n1_mg;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import com.bumptech.glide.Glide;
import com.example.regym.R;

public class Movimiento_Salto_N1_No1_Mg extends AppCompatActivity {
    private void mostrarPopup() {


        Dialog dialog = new Dialog(this);

        // Infla el layout de la pantalla emergente
        View popupView = getLayoutInflater().inflate(R.layout.movimiento_salto_n1_no1_mg, null);

        // Obtiene referencias a los elementos
        Button boton1 = popupView.findViewById(R.id.Regresar_btn);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView boton2 = popupView.findViewById(R.id.hipervinculo);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ScrollView scrollView = popupView.findViewById(R.id.scrollView4);

        // Configura listeners para los botones
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para el botón 1
                dialog.dismiss();
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/watch?v=OGfX_n_Hu0U&ab_channel=PROFE-WILSON"; // Reemplaza con la URL real
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        // Crea el Dialog
        dialog.setContentView(popupView);
        dialog.show();
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimiento_salto_n1_no1_mg);

//botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        ImageButton Help_btn = findViewById(R.id.boton_help_imagen);

//GIFS

        ImageView imageViewGif = findViewById(R.id.Movimiento_salto_1_1);

// URL del GIF o ruta local del GIF
        String gifUrl = "C:/Users/stimp/AndroidStudioProjects/ReGym1/app/src/main/res/raw/gif_m1_n1_salto";

        Glide.with(this)
                .asGif()
                // .load(R.raw.gif_movimiento1_1_piso)
                .into(imageViewGif);



//ScrollView

        NestedScrollView scrollView = findViewById(R.id.scrollView); // Asegúrate de usar NestedScrollView

//boton Regresar

        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {
            /*
                Intent intent = new Intent(Movimiento_Piso_no1_MG.this, Movimientos_Piso_N1_MG.class);
                startActivity(intent);*/
            }
        });
//boton help


        Help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarPopup();
            }
        });


//ScrollView funcionamiento

        scrollView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });



    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}