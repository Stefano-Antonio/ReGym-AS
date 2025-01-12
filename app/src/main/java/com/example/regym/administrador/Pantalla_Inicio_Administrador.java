package com.example.regym.administrador;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.regym.ApiClient;
import com.example.regym.Pantalla_Iniciar_Sesion;
import com.example.regym.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Pantalla_Inicio_Administrador extends AppCompatActivity {
    private TableLayout tablaUsuarios;
    private String matriculaAUX;
    private String nombreAUX;
    private String matriculaA;
    private RecyclerView rvListaMatriculas;
    private EditText etNuevaMatricula;
    private Button btnAgregarMatricula, btnCerrarPopup;
    private ArrayList<String> listaMatriculas;
    private MatriculaAdapter matriculaAdapter;
    private boolean isEditing = false;

    @SuppressLint({"MissingInflatedId", "MissingSuperCall"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_inicio_administrador);

        tablaUsuarios = findViewById(R.id.tabla_usuarios);

        // Agregar encabezado una vez al inicio
        agregarEncabezado();

        // Cargar los usuarios
        cargarUsuarios();

        // Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");
        matriculaA = "A";

        // Lista inicial de matrículas disponibles
        Set<String> matriculasIniciales = new HashSet<>(Arrays.asList(
                "A010"
        ));

        // Acceder a SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("matriculas", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Set<String> matriculasDisponibles = sharedPreferences.getStringSet("matriculas_disponibles", null);

        if (matriculasDisponibles == null) {
            // La primera vez que se ejecuta, inicializamos la lista de matrículas disponibles
            editor.putStringSet("matriculas_disponibles", matriculasIniciales);
            editor.apply();
            Log.d("MATRICULAS", "Lista inicial de matrículas configurada correctamente.");
        } else {
            Log.d("MATRICULAS", "Lista de matrículas ya estaba configurada.");
        }

        // Recuperar la lista de matrículas para comprobarla
        matriculasDisponibles = new HashSet<>(sharedPreferences.getStringSet("matriculas_disponibles", new HashSet<>()));
        Log.d("MATRICULAS", "Matrículas disponibles actuales: " + matriculasDisponibles);

        // Agregar nuevas matrículas a la lista de disponibles
        matriculasDisponibles.addAll(matriculasIniciales);

        // Guardar la lista actualizada de matrículas
        editor.putStringSet("matriculas_disponibles", matriculasDisponibles);
        editor.apply();
        Log.d("MATRICULAS", "Lista de matrículas actualizada: " + matriculasDisponibles);


        //Botones
        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        ImageButton eliminar_usuario_btn = findViewById(R.id.eliminar_usuario_btn);
        ImageButton administrar_comentarios_btn = findViewById(R.id.administrar_comentarios_btn);
        ImageButton editar_usuario_btn = findViewById(R.id.editar_usuario_btn);
        ImageButton administrar_matriculas_btn = findViewById(R.id.administrar_matriculas_btn);

        EditText etBuscarMatricula = findViewById(R.id.buscar_usuario_input);
        ImageButton btnBuscar = findViewById(R.id.buscar_usuario_btn);
        ImageButton btnMatricula = findViewById(R.id.administrar_matriculas_btn);


        //Boton buscar por matricula
        btnBuscar.setOnClickListener(v -> {

            String matriculaBusqueda = etBuscarMatricula.getText().toString().trim();
            String nombreBusqueda = etBuscarMatricula.getText().toString().trim();
            buscarUsuarioPorMatricula(matriculaBusqueda,nombreBusqueda);
            btnBuscar.setImageResource(R.drawable.responder); // Cambia la imagen del botón
            etBuscarMatricula.setText("");
        });


        // Evento para mostrar la ventana emergente
        btnMatricula.setOnClickListener(v -> {
            mostrarPopupMatriculas();
        });


        //Boton regresar
        Regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pantalla_Inicio_Administrador.this, Pantalla_Iniciar_Sesion.class);
                startActivity(intent);
            }
        });
    }

    private void agregarEncabezado() {
        // Crear una fila para el encabezado
        TableRow encabezado = new TableRow(this);
        encabezado.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));

        // Crear TextView para el encabezado de "Matrícula"
        TextView matriculaHeader = new TextView(this);
        matriculaHeader.setText("Matrícula");
        matriculaHeader.setPadding(8, 8, 8, 8);
        matriculaHeader.setBackgroundColor(Color.parseColor("#781005"));
        matriculaHeader.setTextColor(Color.WHITE);
        encabezado.addView(matriculaHeader);

        // Crear TextView para el encabezado de "Nombre"
        TextView nombreHeader = new TextView(this);
        nombreHeader.setText("Nombre");
        nombreHeader.setPadding(8, 8, 8, 8);
        nombreHeader.setBackgroundColor(Color.parseColor("#781005"));
        nombreHeader.setTextColor(Color.WHITE);
        encabezado.addView(nombreHeader);

        // Crear TextView para el encabezado de "Seleccion"
        TextView seleccionHeader = new TextView(this);
        seleccionHeader.setText("Seleccion");
        seleccionHeader.setPadding(8, 8, 8, 8);
        seleccionHeader.setBackgroundColor(Color.parseColor("#781005"));
        seleccionHeader.setTextColor(Color.WHITE);
        encabezado.addView(seleccionHeader);

        // Añadir la fila del encabezado a la tabla
        tablaUsuarios.addView(encabezado);
    }

    private void cargarUsuarios() {
        ApiClient.ApiService apiService = ApiClient.getApiService();
        Call<List<ApiClient.Usuario>> call = apiService.getUsuarios();

        call.enqueue(new Callback<List<ApiClient.Usuario>>() {
            @Override
            public void onResponse(Call<List<ApiClient.Usuario>> call, Response<List<ApiClient.Usuario>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    // Poblamos la tabla con los usuarios obtenidos
                    mostrarUsuariosEnTabla(response.body());
                } else {
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "Error al cargar usuarios", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<ApiClient.Usuario>> call, Throwable t) {
                Toast.makeText(Pantalla_Inicio_Administrador.this, "Error de red: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void mostrarUsuariosEnTabla(List<ApiClient.Usuario> usuarios) {
        // Limpiar la tabla solo de las filas de usuarios, no el encabezado
        tablaUsuarios.removeViewsInLayout(1, tablaUsuarios.getChildCount() - 1);  // Esto elimina solo las filas y mantiene el encabezado.

        Log.d("Usuarios", "Datos" + usuarios.toString());
        for (ApiClient.Usuario usuario : usuarios) {
            // Crear una nueva fila de la tabla
            TableRow fila = new TableRow(this);
            fila.setLayoutParams(new TableRow.LayoutParams(
                    TableRow.LayoutParams.MATCH_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT
            ));


            // Crear TextView para la matrícula
            TextView matricula = new TextView(this);
            matricula.setText(usuario.getMatricula());
            matricula.setPadding(8, 8, 8, 8);
            fila.addView(matricula);

            // Crear TextView para el nombre
            TextView nombre = new TextView(this);
            nombre.setText(usuario.getNombre());
            nombre.setPadding(8, 8, 8, 8);
            fila.addView(nombre);

            // Crear Layout para los botones
            TableRow.LayoutParams botonesParams = new TableRow.LayoutParams(
                    TableRow.LayoutParams.WRAP_CONTENT,
                    TableRow.LayoutParams.WRAP_CONTENT
            );
            botonesParams.setMargins(8, 0, 8, 0);

            LinearLayout botonesLayout = new LinearLayout(this);
            botonesLayout.setOrientation(LinearLayout.HORIZONTAL);

            // Botón para eliminar
            ImageButton eliminarBtn = new ImageButton(this);
            eliminarBtn.setImageResource(R.drawable.borrar);
            eliminarBtn.setLayoutParams(botonesParams);
            eliminarBtn.setOnClickListener(v -> eliminarUsuario(usuario.getMatricula(), usuario.getId()));
            botonesLayout.addView(eliminarBtn);


            // Botón para administrar comentarios
            ImageButton administrarComentariosBtn = new ImageButton(this);
            administrarComentariosBtn.setImageResource(R.drawable.editar_comentario);
            administrarComentariosBtn.setLayoutParams(botonesParams);
            administrarComentariosBtn.setOnClickListener(v -> {
                Intent intent;
                intent = new Intent(Pantalla_Inicio_Administrador.this, Manual_Gimansia_Comentarios.class);
                intent.putExtra("usuarioId", usuario.getId()); // Pasar el ID del usuario
                intent.putExtra("matricula", (CharSequence) matriculaA);
                Log.d("usuarioId", usuario.getId());
                startActivity(intent);
            });
            botonesLayout.addView(administrarComentariosBtn);

            // Botón para editar
            ImageButton editarBtn = new ImageButton(this);
            editarBtn.setImageResource(R.drawable.editar);
            editarBtn.setLayoutParams(botonesParams);

            // Configurar el primer OnClickListener para editar
            editarBtn.setOnClickListener(v -> {
                nombre.setVisibility(View.GONE);

                fila.removeView(nombre);


                EditText nombreEdit = new EditText(this);
                nombreEdit.setText(usuario.getNombre());
                nombreEdit.setPadding(8, 8, 8, 8);
                fila.addView(nombreEdit, 1);
                editarBtn.setImageResource(R.drawable.enviar);
                eliminarBtn.setVisibility(View.GONE);
                administrarComentariosBtn.setVisibility(View.GONE);

                editarBtn.setOnClickListener(v1 -> {
                    matriculaAUX =usuario.getMatricula();
                    nombreAUX = nombreEdit.getText().toString();

                    fila.removeView(nombreEdit);

                    TextView matricula2 = new TextView(this);
                    matricula2.setText(matriculaAUX);
                    fila.addView(matricula2);

                    TextView nombre2 = new TextView(this);
                    nombre2.setText(nombreAUX);
                    fila.addView(nombre2);



                    int x;
                    try {
                        x = verificarMatricula(matriculaAUX);  // Asumiendo que verificarMatricula devuelve un int.
                    } catch (Exception e) {
                        // Manejo específico del error
                        Toast.makeText(Pantalla_Inicio_Administrador.this, "Error al verificar matrícula: " + e.getMessage(), Toast.LENGTH_LONG).show();
                        return;  // Salimos del método si ocurre un error
                    }

                    if (x == 1) {
                        if (matriculaAUX.charAt(0) != usuario.getMatricula().charAt(0) || matriculaAUX.equals(usuario.getMatricula())) {

                            if(matriculaAUX.charAt(0) != usuario.getMatricula().charAt(0)){
                            Toast.makeText(Pantalla_Inicio_Administrador.this, "fornato incorrecto", Toast.LENGTH_SHORT).show();
                            cargarUsuarios();
                            }

                            if(matriculaAUX.equals(usuario.getMatricula())||!nombreAUX.equals(usuario.getNombre())){

                                if(!nombreAUX.equals(usuario.getNombre())){
                                    Toast.makeText(Pantalla_Inicio_Administrador.this, "cambio de nombre", Toast.LENGTH_SHORT).show();
                                    cargarUsuarios();
                                }
                                    usuario.setNombre(nombreAUX);
                                    guardarCambios(matriculaAUX, usuario.getMatricula(), usuario.getNombre());
                                    usuario.setMatricula(matriculaAUX);
                                    editarBtn.setImageResource(R.drawable.editar);
                                    cargarUsuarios();
                            }
                        } else {
                            usuario.setNombre(nombreAUX);
                            guardarCambios(matriculaAUX, usuario.getMatricula(), usuario.getNombre());
                            usuario.setMatricula(matriculaAUX);
                            editarBtn.setImageResource(R.drawable.editar);
                            cargarUsuarios();
                        }
                    } else {
                        Toast.makeText(Pantalla_Inicio_Administrador.this, "Formato incorrecto", Toast.LENGTH_SHORT).show();
                        cargarUsuarios();
                    }


                });
            });


            // Agregar el botón al layout
            botonesLayout.addView(editarBtn);

            // Añadir el layout de botones a la fila
            fila.addView(botonesLayout);

            // Añadir la fila a la tabla
            tablaUsuarios.addView(fila);

        }
    }
    private void mostrarPopupMatriculas() {
        // Inflar la vista de la ventana emergente
        View popupView = LayoutInflater.from(this).inflate(R.layout.lista_matriculas, null);

        // Crear el PopupWindow
        PopupWindow popupWindow = new PopupWindow(
                popupView,
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                true
        );

        // Configuraciones adicionales para el PopupWindow
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        // Mostrar la ventana emergente
        popupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);

        // Enlazar los elementos de la ventana emergente
        rvListaMatriculas = popupView.findViewById(R.id.rvListaMatriculas);
        etNuevaMatricula = popupView.findViewById(R.id.etNuevaMatricula);
        btnAgregarMatricula = popupView.findViewById(R.id.btnAgregarMatricula);
        btnCerrarPopup = popupView.findViewById(R.id.btnCerrarPopup);

        // **Inicializar SharedPreferences**
        SharedPreferences sharedPreferences = getSharedPreferences("matriculas", MODE_PRIVATE);
        Set<String> matriculasGuardadas = sharedPreferences.getStringSet("matriculas_disponibles", new HashSet<>());
        listaMatriculas = new ArrayList<>(matriculasGuardadas);

        // Configurar el RecyclerView
        rvListaMatriculas.setLayoutManager(new LinearLayoutManager(this));
        matriculaAdapter = new MatriculaAdapter(listaMatriculas);
        rvListaMatriculas.setAdapter(matriculaAdapter);

        // **Obtener las matrículas desde el servidor**
        obtenerMatriculasDelServidor(sharedPreferences);

        // Botón para agregar una nueva matrícula
        btnAgregarMatricula.setOnClickListener(v -> {
            String nuevaMatricula = etNuevaMatricula.getText().toString().trim();
            Log.d("MATRICULA", "Valor de la nueva matrícula: " + nuevaMatricula);

            if (!nuevaMatricula.isEmpty() && !listaMatriculas.contains(nuevaMatricula)) {

                //verificar el formato de la matricula
                int x;
                try {
                    x = verificarMatricula(nuevaMatricula);
                } catch (Exception e) {
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "Error al verificar matrícula: " + e.getMessage(), Toast.LENGTH_LONG).show();
                    return;
                }

                if (x == 1) {
                    // Enviar matrícula al servidor y actualizar la lista
                    agregarMatriculaAlServidor(nuevaMatricula, sharedPreferences);
                    etNuevaMatricula.setText(""); // Limpiar el campo de entrada
                }else{
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "Formato incorrecto", Toast.LENGTH_SHORT).show();
                    etNuevaMatricula.setText(""); // Limpiar el campo de entrada
                }
            } else {
                Toast.makeText(this, "Matrícula ya existe o está vacía", Toast.LENGTH_SHORT).show();
                etNuevaMatricula.setText(""); // Limpiar el campo de entrada
            }
        });

        // Botón para cerrar la ventana emergente
        btnCerrarPopup.setOnClickListener(v -> {
            popupWindow.dismiss(); // Cierra la ventana emergente
        });
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

                        // Si hay diferencias, actualizamos el RecyclerView con las nuevas matrículas
                        listaMatriculas.clear();
                        listaMatriculas.addAll(listaDesdeServidor);
                        matriculaAdapter.notifyDataSetChanged();
                        Log.d("RECYCLER_VIEW", "Adaptador de la lista de matrículas actualizado con " + listaMatriculas.size() + " elementos.");

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
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "No se encontraron matrículas", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ApiClient.RespuestaMatriculas> call, Throwable t) {
                Log.e("API_FAILURE", "Fallo en la llamada a la API: " + t.getMessage());
                Toast.makeText(Pantalla_Inicio_Administrador.this, "Error al obtener las matrículas: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void agregarMatriculaAlServidor(String nuevaMatricula, SharedPreferences sharedPreferences) {

        if (nuevaMatricula == null || nuevaMatricula.isEmpty()) {
            Log.e("ERROR", "Matrícula vacía o inválida.");
            return;
        }

        ApiClient.ApiService apiService = ApiClient.getApiService();
        Log.d("API_CALL", "Iniciando llamada para agregar matrícula: " + nuevaMatricula);
        Call<ApiClient.RespuestaMatriculas> call = apiService.agregarMatricula(nuevaMatricula);

        call.enqueue(new Callback<ApiClient.RespuestaMatriculas>() {
            @Override
            public void onResponse(Call<ApiClient.RespuestaMatriculas> call, Response<ApiClient.RespuestaMatriculas> response) {
                if (response.isSuccessful() && response.body() != null) {
                    ApiClient.RespuestaMatriculas respuesta = response.body();
                    List<String> listaDesdeServidor = respuesta.getMatriculas();  // Accede a la lista de matriculas

                    // Actualizar la lista de matrículas local y el adaptador
                    listaMatriculas.clear();
                    listaMatriculas.addAll(listaDesdeServidor);
                    matriculaAdapter.notifyDataSetChanged();

                    // Actualizar SharedPreferences
                    actualizarSharedPreferences(sharedPreferences);
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "Matrícula agregada correctamente", Toast.LENGTH_SHORT).show();

                    obtenerMatriculasDelServidor(sharedPreferences);
                } else {
                    Log.w("API_RESPONSE", "Respuesta no exitosa al agregar matrícula. Código de estado: " + response.code());
                    Log.w("API_RESPONSE", "Mensaje: " + response.message());
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "La matricula ya esta en uso", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ApiClient.RespuestaMatriculas> call, Throwable t) {
                Log.e("API_FAILURE", "Fallo al agregar matrícula: " + t.getMessage());
                Log.e("API_FAILURE", "Stack Trace: ", t);
                Toast.makeText(Pantalla_Inicio_Administrador.this, "Error al agregar matrícula: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void actualizarSharedPreferences(SharedPreferences sharedPreferences) {
        Set<String> nuevasMatriculas = new HashSet<>(listaMatriculas);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putStringSet("matriculas_disponibles", nuevasMatriculas);
        editor.apply();
    }


    private void buscarUsuarioPorMatricula(String matriculaBusqueda, String nombreBusqueda) {
        ApiClient.ApiService apiService = ApiClient.getApiService();
        Call<List<ApiClient.Usuario>> call = apiService.getUsuarios();

        call.enqueue(new Callback<List<ApiClient.Usuario>>() {
            @Override
            public void onResponse(Call<List<ApiClient.Usuario>> call, Response<List<ApiClient.Usuario>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    // Filtrar la lista de usuarios por matrícula
                    List<ApiClient.Usuario> usuariosFiltrados = new ArrayList<>();
                    for (ApiClient.Usuario usuario : response.body()) {

                        if (usuario.getMatricula().equalsIgnoreCase(matriculaBusqueda)) {
                            usuariosFiltrados.add(usuario);
                        }else if(usuario.getNombre().equalsIgnoreCase(nombreBusqueda)){
                            usuariosFiltrados.add(usuario);
                        }
                    }

                    if (usuariosFiltrados.isEmpty()) {

                        EditText etBuscarMatricula = findViewById(R.id.buscar_usuario_input);
                        ImageButton btnBuscar = findViewById(R.id.buscar_usuario_btn);
                        btnBuscar.setImageResource(R.drawable.responder); // Cambia la imagen del botón
                        List<ApiClient.Usuario> usuarios = response.body();
                        mostrarUsuariosEnTabla(usuarios);
                        btnBuscar.setImageResource(R.drawable.buscar); // Cambia la imagen del botón

                        if (etBuscarMatricula.getText().toString().trim().isEmpty()) {
                            Toast.makeText(
                                    Pantalla_Inicio_Administrador.this,
                                    "Recarga/Incorrecto",
                                    Toast.LENGTH_SHORT
                            ).show();
                        }
                    } else {
                        // Mostrar los usuarios encontrados en la tabla
                        mostrarUsuariosEnTabla(usuariosFiltrados);
                    }
                } else {
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "Error al cargar usuarios", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<ApiClient.Usuario>> call, Throwable t) {
                Toast.makeText(Pantalla_Inicio_Administrador.this, "Error de red: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void eliminarUsuario(String matricula, String usuarioId) {
        ApiClient.ApiService apiService = ApiClient.getApiService();
        Call<Void> call = apiService.eliminarUsuario(matricula, usuarioId);

        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "Usuario eliminado correctamente", Toast.LENGTH_SHORT).show();
                    cargarUsuarios(); // Recargar usuarios
                } else {
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "No se puede eliminar al administrador principal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Toast.makeText(Pantalla_Inicio_Administrador.this, "Error de red: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }



    private void guardarCambios(String matriculaAux, String matricula, String nombre) {
        if (matriculaAux == null || matricula == null || nombre == null) {
            Toast.makeText(this, "Datos inválidos", Toast.LENGTH_SHORT).show();
            return;
        }

        AlertDialog progressDialog = new AlertDialog.Builder(this)
                .setMessage("Guardando cambios...")
                .setCancelable(false)
                .create();
        progressDialog.show();

        Log.e(" matriculaAux:",matriculaAux);
        Log.e(" getMatricula:",matricula);
        Log.e(" getNombre:",nombre);
        ApiClient.ApiService apiService = ApiClient.getApiService();
        Call<Void> call = apiService.actualizarUsuario(matricula,matriculaAux,nombre);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                progressDialog.dismiss();
                if (response.isSuccessful()) {
                    cargarUsuarios();
                } else {
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "Formato incorrecto / Repetido", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(Pantalla_Inicio_Administrador.this, "Error de conexión", Toast.LENGTH_SHORT).show();
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


