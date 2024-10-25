package com.example.regym.manual_gimnasia.movimientos_piso_mg.movimientos_Individuales.movimientos_piso_n1_mg;

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
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.transition.Transition;
import com.example.regym.R;

public class Movimiento_Piso_No1_Mg extends AppCompatActivity {


    //@SuppressLint("ClickableViewAccessibility")
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.movimiento_piso_no1_mg);

//botones

        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        ImageButton Ayuda_btn = findViewById(R.id.boton_ayuda_imagen);
        ImageButton bnt_descripcion = findViewById(R.id.descripcion_btn);
        ImageButton bnt_tabla= findViewById(R.id.tabla_btn);
        ImageButton btn_comentarios = findViewById(R.id.comentarios_btn);
        NestedScrollView descripcion1_seccion = findViewById(R.id.description_seccion);
        NestedScrollView tabla_seccion = findViewById(R.id.tabla_seccion);
        NestedScrollView Comentarios_seccion = findViewById(R.id.commentarios_seccion);


//GIFS

        ImageView imageViewGif = findViewById(R.id.Movimiento_piso_1_1);

// URL del GIF o ruta local del GIF
        String gifUrl = "C:/Users/stimp/AndroidStudioProjects/ReGym1/app/src/main/res/raw/m1_n1_piso";

        Glide.with(this)
                .asGif()
                .load(R.raw.m1_n1_piso) // Asegúrate de que el recurso sea correcto
                .into(new com.bumptech.glide.request.target.CustomTarget<GifDrawable>() {
                    @Override
                    public void onResourceReady(GifDrawable resource, Transition<? super GifDrawable> transition) {
                        imageViewGif.setImageDrawable(resource);

                        // Detener la animación del GIF inicialmente
                        resource.stop();


                        // Iniciar o detener la animación del GIF al hacer clic
                        imageViewGif.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if (resource.isRunning()) {
                                    resource.stop(); // Si está corriendo, lo detiene
                                } else {
                                    resource.start(); // Si está detenido, lo empieza
                                }
                            }
                        });
                    }

                    @Override
                    public void onLoadCleared(android.graphics.drawable.Drawable placeholder) {
                        // Maneja la limpieza del recurso cuando la vista ya no se necesita
                    }
                });


//boton descripcion
        bnt_descripcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (descripcion1_seccion.getVisibility() == View.GONE) {
                    descripcion1_seccion.setVisibility(View.VISIBLE);  // Muestra la sección de comentarios
                    bnt_descripcion.setImageResource(R.drawable.ocultar_descripcion_btn);  // Cambia la imagen del botón
                }else {
                    descripcion1_seccion.setVisibility(View.GONE);  // Oculta la sección de comentarios
                    bnt_descripcion.setImageResource(R.drawable.mostrar_descripcion_btn);  // Cambia la imagen del botón
                }
            }
        });

//boton tabla
        bnt_tabla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tabla_seccion.getVisibility() == View.GONE) {
                    tabla_seccion.setVisibility(View.VISIBLE);  // Muestra la sección de comentarios
                    bnt_tabla.setImageResource(R.drawable.ocultar_tabla_btn);  // Cambia la imagen del botón
                } else {
                    tabla_seccion.setVisibility(View.GONE);  // Oculta la sección de comentarios
                    bnt_tabla.setImageResource(R.drawable.mostrar_tabla_btn);  // Cambia la imagen del botón
                }
            }
        });

//boton comentarios
        btn_comentarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Comentarios_seccion.getVisibility() == View.GONE) {
                    Comentarios_seccion.setVisibility(View.VISIBLE);  // Muestra la sección de comentarios
                    btn_comentarios.setImageResource(R.drawable.ocultar_comentarios_btn);  // Cambia la imagen del botón
                } else {
                    Comentarios_seccion.setVisibility(View.GONE);  // Oculta la sección de comentarios
                    btn_comentarios.setImageResource(R.drawable.mostrar_comentarios_btn);  // Cambia la imagen del botón
                }
            }
        });

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
//boton ayuda

        Ayuda_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarPopup();
            }
        });


//ScrollView funcionamiento

        descripcion1_seccion.setOnTouchListener(new View.OnTouchListener() {
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

    private void mostrarPopup() {


        Dialog dialogo = new Dialog(this);

        // Infla el layout de la pantalla emergente
        View pantalla_emergente = getLayoutInflater().inflate(R.layout.movimiento1_piso_mg_ayuda, null);

        // Obtiene referencias a los elementos
        Button boton1 = pantalla_emergente.findViewById(R.id.Regresar_btn);
        TextView boton2 = pantalla_emergente.findViewById(R.id.hipervinculo);
        ScrollView scrollView = pantalla_emergente.findViewById(R.id.scrollView4);

        // Configura listeners para los botones
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para el botón 1
                dialogo.dismiss();
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
        dialogo.setContentView(pantalla_emergente);
        dialogo.show();
    }
}
