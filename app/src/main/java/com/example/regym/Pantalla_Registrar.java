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

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        SharedPreferences matriculasDisponibles = getSharedPreferences("matriculas", MODE_PRIVATE);
        // Recuperamos la lista de matrículas disponibles
        Set<String> matriculas = matriculasDisponibles.getStringSet("matriculas_disponibles", new HashSet<>());


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
                    String matricula = matriculaEditText.getText().toString();//matricula
                    SharedPreferences sharedPreferences = getSharedPreferences("matriculas", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();



                    // Recuperamos la lista de matrículas disponibles (si existe)
                    Set<String> matriculas = sharedPreferences.getStringSet("matriculas_disponibles", new HashSet<>());

                    // Guardamos la lista actualizada
                    editor.putStringSet("matriculas_disponibles", matriculas);
                    editor.apply();

                    String password = passwordEditText.getText().toString();

                    ApiClient.Usuario usuario1 = new ApiClient.Usuario(id, nombre, correo, matricula, password);

                    int x;
                    try {
                        x = verificarMatricula(matricula);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    if (x == 1) {
                        if (matriculas.contains(matricula)) {
                            registrarUsuario(usuario1);
                        }else {
                            // La matrícula no está disponible, muestra un mensaje al usuario
                            Toast.makeText(getApplicationContext(), "La matrícula no está disponible.", Toast.LENGTH_SHORT).show();
                        }
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
private void registrarUsuario(ApiClient.Usuario user) {
    // Obtener la matrícula ingresada por el usuario
    EditText etMatricula = findViewById(R.id.Matricula_contenedor);
    String matriculaIngresada = etMatricula.getText().toString().trim();

    // Validar que la matrícula no esté vacía y que tenga un formato válido (por ejemplo, alfanumérico)
    if (matriculaIngresada.isEmpty()) {
        Toast.makeText(this, "Por favor, ingrese una matrícula válida.", Toast.LENGTH_SHORT).show();
        return;
    }

    // Aquí puedes agregar una validación más específica para el formato de la matrícula
    int x;
    try {
        x = verificarMatricula(matriculaIngresada);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    if (x != 1) {
        Toast.makeText(this, "La matrícula ingresada tiene un formato incorrecto.", Toast.LENGTH_SHORT).show();
        return;
    }

    // Recuperar la lista de matrículas disponibles
    SharedPreferences sharedPreferences = getSharedPreferences("matriculas", MODE_PRIVATE);
    obtenerMatriculasDelServidor(sharedPreferences); // Asegúrate de que esta función actualiza las matriculas

    // Obtener las matrículas disponibles de SharedPreferences
    sharedPreferences = getSharedPreferences("matriculas", MODE_PRIVATE);
    Set<String> matriculas = new HashSet<>(sharedPreferences.getStringSet("matriculas_disponibles", new HashSet<>()));

    // Verificar si la matrícula está en la lista de matrículas disponibles
    if (!matriculas.contains(matriculaIngresada)) {
        Toast.makeText(this, "La matrícula ingresada no está disponible.", Toast.LENGTH_SHORT).show();
        Log.e("VALIDACION", "La matrícula " + matriculaIngresada + " no está disponible.");
        return;
    }

    // Llamar a la API para registrar al usuario
    ApiClient.ApiService apiService = ApiClient.getApiService();
    Call<ApiClient.Usuario> call = apiService.crearUsuario(user);
    Log.d("RegistrarUsuario", "Intentando registrar usuario: " + user.getNombre());

    SharedPreferences finalSharedPreferences = sharedPreferences;
    call.enqueue(new Callback<ApiClient.Usuario>() {

        @Override
        public void onResponse(Call<ApiClient.Usuario> call, Response<ApiClient.Usuario> response) {
            if (response.isSuccessful()) {
                ApiClient.Usuario user = response.body();
                if (user != null) {
                    Log.d("RegistrarUsuario", "Usuario registrado: " + user);
                    Toast.makeText(Pantalla_Registrar.this, "Usuario registrado: " + user.getNombre(), Toast.LENGTH_SHORT).show();

                    // Eliminar la matrícula de las disponibles solo si el registro fue exitoso
                    matriculas.remove(matriculaIngresada.trim());

                    // Guardar la lista de matrículas actualizada en SharedPreferences
                    SharedPreferences.Editor editor = finalSharedPreferences.edit();
                    editor.putStringSet("matriculas_disponibles", matriculas);
                    editor.apply();

                    Log.d("MATRICULAS", "Matrícula " + matriculaIngresada + " eliminada de la lista de disponibles.");

                    // Llamar a la API para eliminar la matrícula del servidor
                    Call<Void> eliminarMatriculaCall = apiService.eliminarMatricula(matriculaIngresada);
                    eliminarMatriculaCall.enqueue(new Callback<Void>() {
                        @Override
                        public void onResponse(Call<Void> call, Response<Void> response) {
                            if (response.isSuccessful()) {
                                Log.d("EliminarMatricula", "Matrícula eliminada del servidor: " + matriculaIngresada);
                            } else {
                                Log.e("EliminarMatricula", "Error al eliminar matrícula del servidor: " + response.code());
                            }
                        }

                        @Override
                        public void onFailure(Call<Void> call, Throwable t) {
                            Log.e("EliminarMatricula", "Error en la conexión al eliminar matrícula: " + t.getMessage());
                        }
                    });
                } else {
                    Log.e("RegistrarUsuario", "Error en la respuesta: " + response.code());
                }

                // Redirigir a otra pantalla después del registro
                Intent intent = new Intent(Pantalla_Registrar.this, Pantalla_Iniciar_Sesion.class);
                startActivity(intent);
            } else {
                try {
                    String errorMessage = response.errorBody().string();
                    if (errorMessage.contains("credenciales duplicadas") && (errorMessage.contains("correo") || errorMessage.contains("matricula"))) {
                        Toast.makeText(Pantalla_Registrar.this, "El correo o la matrícula ya está registrado en otro usuario", Toast.LENGTH_SHORT).show();
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

    private void obtenerMatriculasDelServidor(SharedPreferences sharedPreferences) {
        ApiClient.ApiService apiService = ApiClient.getApiService();
        Call<ApiClient.RespuestaMatriculas> call = apiService.obtenerMatriculas();

        Log.d("API_CALL", "Iniciando llamada a la API para obtener matrículas");

        call.enqueue(new Callback<ApiClient.RespuestaMatriculas>() {
            @Override
            public void onResponse(Call<ApiClient.RespuestaMatriculas> call, Response<ApiClient.RespuestaMatriculas> response) {
                if (response.isSuccessful() && response.body() != null) {
                    ApiClient.RespuestaMatriculas respuesta = response.body();
                    List<String> listaDesdeServidor = respuesta.getMatriculas();  // Accede a la lista de matriculas

                    Log.d("API_RESPONSE", "Respuesta exitosa de la API: " + listaDesdeServidor.toString());

                    // Convertir la lista del servidor a un Set para comparar y manejar datos únicos
                    Set<String> matriculasDesdeServidor = new HashSet<>(listaDesdeServidor);

                    // Obtener las matriculas almacenadas en SharedPreferences
                    Set<String> matriculasLocales = sharedPreferences.getStringSet("matriculas_disponibles", new HashSet<>());

                    Log.d("SHARED_PREFS", "Matrículas locales actuales: " + matriculasLocales.toString());
                    Log.d("SHARED_PREFS", "Matrículas desde el servidor: " + matriculasDesdeServidor.toString());

                    // Comparamos las listas locales con las obtenidas desde el servidor
                    if (!matriculasLocales.equals(matriculasDesdeServidor)) {
                        Log.d("SHARED_PREFS", "Diferencia detectada entre las matrículas locales y las del servidor. Actualizando...");

                        // Actualizar SharedPreferences solo si hay cambios
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putStringSet("matriculas_disponibles", matriculasDesdeServidor);  // Guardar las matrículas en SharedPreferences
                        editor.apply();  // Guardar cambios
                        Log.d("SHARED_PREFS", "SharedPreferences actualizados con las nuevas matrículas.");
                    } else {
                        Log.d("SHARED_PREFS", "Las matrículas locales ya están actualizadas. No se realizaron cambios.");
                    }
                } else {
                    Log.w("API_RESPONSE", "Respuesta no exitosa. Código de estado: " + response.code() + ", mensaje: " + response.message());
                    Toast.makeText(Pantalla_Registrar.this, "No se encontraron matrículas", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ApiClient.RespuestaMatriculas> call, Throwable t) {
                Log.e("API_FAILURE", "Fallo en la llamada a la API: " + t.getMessage());
                Toast.makeText(Pantalla_Registrar.this, "Error al obtener las matrículas: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }

        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

