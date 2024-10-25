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

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_registrar);
        Log.d("Pantalla_Registrar", "onCreate: Iniciando actividad");

        //botones
        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Registrarse_btn = findViewById(R.id.Registrarse_btn);


        // Instancia de ApiClient
        ApiClient apiClient = new ApiClient();

        //Credenciales del usuario
        nombreEditText = findViewById(R.id.Nombre_contenedor);
        correoEditText = findViewById(R.id.Correo_contenedor);
        matriculaEditText = findViewById(R.id.Matricula_contenedor);
        passwordEditText = findViewById(R.id.Constraseña_contenedor);
        passwordEditText2 = findViewById(R.id.Constraseña2_contenedor);
        //boton regresar

        //icono ojo en contenedor contraseña
        passwordEditText.setOnTouchListener((v, event) -> {
            boolean isPasswordVisible = false;
            if (event.getAction() == MotionEvent.ACTION_UP) {
                int drawableEndPosition = passwordEditText.getRight() - passwordEditText.getCompoundDrawables()[2].getBounds().width();

                if (event.getRawX() >= drawableEndPosition) {
                    if (passwordEditText.getInputType() == (InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD)) {
                        // Ocultar contraseña
                        passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                        passwordEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ojo_con_slash, 0); // Cambia a ojo con slash
                    } else {
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
        //icono ojo en contenedor de confirmación de contraseña
        passwordEditText2.setOnTouchListener((v, event) -> {
            boolean isPasswordVisible = false;
            if (event.getAction() == MotionEvent.ACTION_UP) {
                int drawableEndPosition = passwordEditText2.getRight() - passwordEditText2.getCompoundDrawables()[2].getBounds().width();

                if (event.getRawX() >= drawableEndPosition) {
                    if (passwordEditText2.getInputType() == (InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD)) {
                        // Ocultar contraseña
                        passwordEditText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                        passwordEditText2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ojo_con_slash, 0); // Cambia a ojo con slash
                    } else {
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

        //boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //View v;
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Registrar.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //boton registrarse
        Registrarse_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (passwordEditText.getText().toString().equals(passwordEditText2.getText().toString())) {
                    //captura de datos del usuario
                    String nombre = nombreEditText.getText().toString();
                    String correo = correoEditText.getText().toString();
                    String matricula = matriculaEditText.getText().toString();
                    String password = passwordEditText.getText().toString();

                    // Asignar credenciales a clase usuario
                    ApiClient.User usuario1 = new ApiClient.User(nombre, correo, matricula, password);
                    int x;
                    try {
                        x = verificarMatricula(matricula);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    if (x == 1) {
                        registrarUsuario(usuario1);
                    }else{
                        Toast.makeText(getApplicationContext(), "La matricula tienen un formato incorrecto", Toast.LENGTH_LONG).show();

                        }

                }else{
                    Throwable e = new Throwable();
                    Log.e("Error", "Error al leer la respuesta: " + e.getMessage());
                    Toast.makeText(getApplicationContext(), "La confirmación de la contraseña no coincide", Toast.LENGTH_LONG).show();
                }
            }


        });
    }

    //Funcion Registrar usuario
    private void registrarUsuario(ApiClient.User user){
        ApiClient.ApiService apiService = ApiClient.getApiService();
        Call<ApiClient.User> call = apiService.crearUsuario(user);
        Log.d("RegistrarUsuario", "Intentando registrar usuario: " + user.getNombre());

        call.enqueue(new Callback<ApiClient.User>() {
            //@Override
            public void onResponse(Call<ApiClient.User> call, Response<ApiClient.User> response) {
                if (response.isSuccessful()) {
                    ApiClient.User user = response.body();
                    Toast.makeText(Pantalla_Registrar.this, "Usuario registrado", Toast.LENGTH_SHORT).show();
                // Redirigir a otra pantalla después del registro
                Intent intent = new Intent(Pantalla_Registrar.this, Pantalla_Iniciar_Sesion.class);
                startActivity(intent);
                } else {
                    try {
                        String errorMessage = response.errorBody().string(); // Extraer el mensaje de error
                        // Verificar si el error es de duplicado de correo o matricula
                        if (errorMessage.contains("duplicate key error") && errorMessage.contains("correo") || errorMessage.contains("matricula")) {
                            Toast.makeText(Pantalla_Registrar.this, "El correo o matricula ya está registrado en otro usuario", Toast.LENGTH_SHORT).show();
                        } else {
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
            public void onFailure(Call<ApiClient.User> call, Throwable t) {
                Log.e("RegistrarUsuario", "Error en la conexión: " + t.getMessage());
                Toast.makeText(Pantalla_Registrar.this, "Error en la conexión", Toast.LENGTH_SHORT).show();
            }
        });

    }
    //Funcion verificacion correo y matricula
    public int verificarMatricula(String matricula) throws Exception {
        ApiClient.User user;
        int x;

        if (matricula.startsWith("U") && matricula.length() == 4) {
            x=1;
        } else if (matricula.startsWith("E") && matricula.length() == 4) {
            x=1;
        } else if (matricula.startsWith("A") && matricula.length() == 4) {
            x=1;
        } else {
            x=0;
        }

        return x;
    }

    public interface UsuarioCallback {
        void onSuccess();
        void onFailure(String errorMessage);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

