package com.example.regym;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.administrador.Pantalla_Inicio_Administrador;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Pantalla_Iniciar_Sesion extends AppCompatActivity {

    private EditText correoEditText, passwordEditText;
    private String correo,password;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_iniciar_sesion);

//Botones
        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        Button Continuar_btn = findViewById(R.id.Continuar_btn);
        Button recuperarContraseñaBtn = findViewById(R.id.Recuperar_contraseña_btn);

//Instancia de ApiClient
        ApiClient apiClient = new ApiClient();

//Credenciales del usuario
        correoEditText = findViewById(R.id.Correo_contenedor);
        passwordEditText = findViewById(R.id.Contraseña_contenedor);

//Icono ojo en contenedor contraseña
        passwordEditText.setOnTouchListener((v, event) -> {
            boolean isPasswordVisible = false;
            if (event.getAction() == MotionEvent.ACTION_UP) {

                int drawableEndPosition = passwordEditText.getRight() - passwordEditText.getCompoundDrawables()[2].getBounds().width();
                if (event.getRawX() >= drawableEndPosition) {

                    if (passwordEditText.getInputType() == (InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD)) {
                        // Ocultar contraseña
                        passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                        passwordEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ojo_con_slash, 0);
                    }
                    else {
                        // Mostrar contraseña
                        passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        passwordEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ojo_sin_slash, 0);
                    }
                    // Colocar el cursor al final del texto
                    passwordEditText.setSelection(passwordEditText.getText().length());
                    return true;
                }
            }
            return false;
        });
//boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Pantalla_Iniciar_Sesion.this, MainActivity.class);
                startActivity(intent);
            }
        });
//Boton continuar
        Continuar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                correo = correoEditText.getText().toString();
                password = passwordEditText.getText().toString();
                iniciarSesion(correo, password);
            }
        });
//Boton recuperar contraseña
        recuperarContraseñaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correo = correoEditText.getText().toString();
                if (correo.isEmpty()) {
                    Toast.makeText(Pantalla_Iniciar_Sesion.this, "Por favor, ingresa tu correo", Toast.LENGTH_SHORT).show();
                    return;
                }
                recuperarContrasena(correo);
            }
        });
    }
//Inicio de sesión
    private void iniciarSesion(String correo, String password) {
        HashMap<String, String> datosUsuario = new HashMap<>();
        datosUsuario.put("correo", correo);
        datosUsuario.put("password", password);

        ApiClient.getApiService().iniciarSesion(datosUsuario).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful() && response.body() != null) {

                    String responseBodyString = null;
                    try {

                        responseBodyString = response.body().string();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    try {

                        JSONObject jsonResponse = new JSONObject(responseBodyString);
                        String tipoUsuario = jsonResponse.optString("tipoUsuario", "desconocido");
                        JSONObject usuarioObj = jsonResponse.optJSONObject("usuario");

                        if (usuarioObj != null) {

                            String userId = usuarioObj.optString("_id", "");
                            String nombre = usuarioObj.optString("nombre", "");

                            Intent intent;
                            switch (tipoUsuario) {
                                case "atleta":
                                    intent = new Intent(Pantalla_Iniciar_Sesion.this, Pantalla_Inicio_Atletas.class);
                                    break;
                                case "entrenador":
                                    intent = new Intent(Pantalla_Iniciar_Sesion.this, Pantalla_Inicio_Entrenador.class);
                                    break;
                                case "administrador":
                                    intent = new Intent(Pantalla_Iniciar_Sesion.this, Pantalla_Inicio_Administrador.class);
                                    break;
                                default:
                                    Toast.makeText(Pantalla_Iniciar_Sesion.this, "No se encontró ningún usuario con ese correo", Toast.LENGTH_SHORT).show();
                                    return;
                            }
                            intent.putExtra("tipoUsuario", tipoUsuario);
                            intent.putExtra("userId", userId);
                            intent.putExtra("nombre", nombre);

                            //Guardar los datos en SharedPreferences
                            SharedPreferences usuarioDatos = getSharedPreferences("DatosUsuario", MODE_PRIVATE);
                            SharedPreferences.Editor editor = usuarioDatos.edit();
                            editor.putString("userId", userId);
                            intent.putExtra("userId",userId);
                            editor.putString("nombre", nombre);
                            editor.apply();
                            startActivity(intent);

                        }
                        else {
                            Toast.makeText(Pantalla_Iniciar_Sesion.this, "Formato de respuesta incorrecto", Toast.LENGTH_SHORT).show();
                        }

                    } catch (JSONException e) {
                        Log.e("JSON_PARSE_ERROR", "Error al procesar el JSON: " + e.getMessage());
                        Toast.makeText(Pantalla_Iniciar_Sesion.this, "Error al procesar la respuesta", Toast.LENGTH_SHORT).show();
                    }


                }
                else {
                    Toast.makeText(Pantalla_Iniciar_Sesion.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(Pantalla_Iniciar_Sesion.this, "Bienvenido*", Toast.LENGTH_SHORT).show();
                Intent intent;
                intent = new Intent(Pantalla_Iniciar_Sesion.this, Pantalla_Inicio_Entrenador.class);
                startActivity(intent);
            }
        });
    }

//Metodo recuperar contraseña
    private void recuperarContrasena(String correo) {
        HashMap<String, String> datosCorreo = new HashMap<>();
        datosCorreo.put("correo", correo);

        Throwable e = new Throwable();
        Log.e("Error", "Error al leer la respuesta: " + e.getMessage());
        ApiClient.getApiService().recuperarContrasena(datosCorreo).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    try {
                        String responseBody = response.body().string();
                        Log.d("API_RESPONSE", responseBody);
                        Toast.makeText(Pantalla_Iniciar_Sesion.this, "Se ha enviado un correo de recuperación", Toast.LENGTH_SHORT).show();
                    } catch (IOException e) {
                        e.printStackTrace();
                        Log.e("ERROR", "Error al leer la respuesta: " + e.getMessage());
                        Toast.makeText(Pantalla_Iniciar_Sesion.this, "Error al leer la respuesta", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Log.e("ERROR", "Correo no encontrado o respuesta nula");
                    Toast.makeText(Pantalla_Iniciar_Sesion.this, "Correo no encontrado", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.e("ERROR", "Error en la conexión", t);
                Toast.makeText(Pantalla_Iniciar_Sesion.this, "Error en la conexión", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

