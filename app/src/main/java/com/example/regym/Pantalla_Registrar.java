package com.example.regym;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Pantalla_Registrar extends AppCompatActivity {

    private EditText nombreEditText, correoEditText, matriculaEditText, passwordEditText,passwordEditText2;
    private String id;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_registrar);
        Log.d("Pantalla_Registrar", "onCreate: Iniciando actividad");

//Botones
        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Registrarse_btn = findViewById(R.id.Registrarse_btn);



        nombreEditText = findViewById(R.id.Nombre_contenedor);
        correoEditText = findViewById(R.id.Correo_contenedor);
        matriculaEditText = findViewById(R.id.Matricula_contenedor);
        passwordEditText = findViewById(R.id.Constraseña_contenedor);
        passwordEditText2 = findViewById(R.id.Constraseña2_contenedor);


        //Funcion de icono ojo en contenedor contraseña
        passwordEditText.setOnTouchListener((v, event) -> {
            boolean isPasswordVisible = false;
            if (event.getAction() == MotionEvent.ACTION_UP) {
                int drawableEndPosition = passwordEditText.getRight() - passwordEditText.getCompoundDrawables()[2].getBounds().width();

                if (event.getRawX() >= drawableEndPosition) {
                    if (passwordEditText.getInputType() == (InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD)) {
                        // Ocultar contraseña
                        passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                        passwordEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ojo_con_slash, 0); // Cambia a ojo con slash
                    }
                    else {
                        // Mostrar contraseña
                        passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        passwordEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ojo_sin_slash, 0); // Cambia a ojo sin slash
                    }
                    // Colocar el cursor al final del texto
                    passwordEditText.setSelection(passwordEditText.getText().length());
                    return true;
                }
            }
            return false;
        });
        //Funcion de icono ojo en contenedor de confirmacion contraseña
        passwordEditText2.setOnTouchListener((v, event) -> {
            boolean isPasswordVisible = false;
            if (event.getAction() == MotionEvent.ACTION_UP) {
                int drawableEndPosition = passwordEditText2.getRight() - passwordEditText2.getCompoundDrawables()[2].getBounds().width();

                if (event.getRawX() >= drawableEndPosition) {
                    if (passwordEditText2.getInputType() == (InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD)) {
                        // Ocultar contraseña
                        passwordEditText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                        passwordEditText2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ojo_con_slash, 0); // Cambia a ojo con slash
                    }
                    else {
                        // Mostrar contraseña
                        passwordEditText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        passwordEditText2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ojo_sin_slash, 0); // Cambia a ojo sin slash
                    }
                    // Colocar el cursor al final del texto
                    passwordEditText2.setSelection(passwordEditText2.getText().length());
                    return true;
                }
            }
            return false;
        });
//Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Registrar.this, MainActivity.class);
                startActivity(intent);
            }
        });
//Boton registrarse
        Registrarse_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (passwordEditText.getText().toString().equals(passwordEditText2.getText().toString())) {


                    String nombre = nombreEditText.getText().toString();
                    String correo = correoEditText.getText().toString();
                    String matricula = matriculaEditText.getText().toString();
                    String password = passwordEditText.getText().toString();

                    ApiClient.Usuario usuario1 = new ApiClient.Usuario(id, nombre, correo, matricula, password);

                    int x;
                    try {
                        x = verificarMatricula(matricula);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    if (x == 1) {
                        registrarUsuario(usuario1);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "La matricula tienen un formato incorrecto", Toast.LENGTH_LONG).show();
                        }

                }
                else{

                    Throwable e = new Throwable();
                    Log.e("Error", "Error al leer la respuesta: " + e.getMessage());
                    Toast.makeText(getApplicationContext(), "La confirmación de la contraseña no coincide", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

//Funcion Registrar usuario
    private void registrarUsuario(ApiClient.Usuario user){

        ApiClient.ApiService apiService = ApiClient.getApiService();
        Call<ApiClient.Usuario> call = apiService.crearUsuario(user);
        Log.d("RegistrarUsuario", "Intentando registrar usuario: " + user.getNombre());

        call.enqueue(new Callback<ApiClient.Usuario>() {

            public void onResponse(Call<ApiClient.Usuario> call, Response<ApiClient.Usuario> response) {

                if (response.isSuccessful()) {

                    ApiClient.Usuario user = response.body();
                    if (user != null) {
                        Log.d("RegistrarUsuario", "Usuario registrado: " + user);
                        Toast.makeText(Pantalla_Registrar.this, "Usuario registrado: " + user.getNombre(), Toast.LENGTH_SHORT).show();
                    } else {
                        Log.e("RegistrarUsuario", "Error en la respuesta: " + response.code());
                    }


                    // Redirigir a otra pantalla después del registro
                Intent intent = new Intent(Pantalla_Registrar.this, Pantalla_Iniciar_Sesion.class);
                startActivity(intent);
                }
                else {

                    try {

                        String errorMessage = response.errorBody().string();

                        if (errorMessage.contains("duplicate key error") && errorMessage.contains("correo") || errorMessage.contains("matricula")) {
                            Toast.makeText(Pantalla_Registrar.this, "El correo o matricula ya está registrado en otro usuario", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Log.e("Error", "Error en el registro: " + errorMessage);
                            Toast.makeText(Pantalla_Registrar.this, "Error en el registro", Toast.LENGTH_SHORT).show();
                        }
                    } catch (IOException e) {
                        Log.e("Error", "Error al leer la respuesta: " + e.getMessage());
                        Toast.makeText(Pantalla_Registrar.this, "Error al leer la respuesta", Toast.LENGTH_SHORT).show();
                    }
               }
            }


            @Override
            public void onFailure(Call<ApiClient.Usuario> call, Throwable t) {
                Log.e("RegistrarUsuario", "Error en la conexión: " + t.getMessage());
                Toast.makeText(Pantalla_Registrar.this, "Error en la conexión", Toast.LENGTH_SHORT).show();
            }
        });

    }
//Funcion verificacion correo y matricula
    public int verificarMatricula(String matricula) throws Exception {
        ApiClient.Usuario user;
        int x;

        if (matricula.startsWith("U") && matricula.length() == 4) {
            x=1;
        }
        else if (matricula.startsWith("E") && matricula.length() == 4) {
            x=1;
        }
        else if (matricula.startsWith("A") && matricula.length() == 4) {
            x=1;
        }
        else {
            x=0;
        }

        return x;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

