package com.example.regym.administrador;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.ApiClient;
import com.example.regym.Pantalla_Iniciar_Sesion;
import com.example.regym.R;

import java.util.ArrayList;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_inicio_administrador);

        tablaUsuarios = findViewById(R.id.tabla_usuarios);

        // Agregar encabezado una vez al inicio
        agregarEncabezado();

        cargarUsuarios();

        // Recuperar el tipo de usuario del Intent
        String tipoUsuario = getIntent().getStringExtra("tipoUsuario");
        matriculaA = "A";


        //matricula
        SharedPreferences sharedPreferences = getSharedPreferences("matriculas", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        // Suponiendo que matriculaDisponible es la matrícula que quieres guardar
        String matriculaDisponible = "A100";

        // Recuperamos la lista de matrículas disponibles (si existe)
        Set<String> matriculas = sharedPreferences.getStringSet("matriculas_disponibles", new HashSet<>());
        matriculas.add(matriculaDisponible);

        // Guardamos la lista actualizada
        editor.putStringSet("matriculas_disponibles", matriculas);
        editor.apply();


        //Botones
        Button Regresar_btn = findViewById(R.id.Regresar_btn);
        ImageButton eliminar_usuario_btn = findViewById(R.id.eliminar_usuario_btn);
        ImageButton administrar_comentarios_btn = findViewById(R.id.administrar_comentarios_btn);
        ImageButton editar_usuario_btn = findViewById(R.id.editar_usuario_btn);
        ImageButton administrar_matriculas_btn = findViewById(R.id.administrar_matriculas_btn);

        EditText etBuscarMatricula = findViewById(R.id.buscar_usuario_input);
        ImageButton btnBuscar = findViewById(R.id.buscar_usuario_btn);



        //Boton buscar por matricula
        btnBuscar.setOnClickListener(v -> {

            String matriculaBusqueda = etBuscarMatricula.getText().toString().trim();
            buscarUsuarioPorMatricula(matriculaBusqueda);
            btnBuscar.setImageResource(R.drawable.responder); // Cambia la imagen del botón
            etBuscarMatricula.setText("");
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

            // Botón para editar
            ImageButton editarBtn = new ImageButton(this);
            editarBtn.setImageResource(R.drawable.editar);
            editarBtn.setLayoutParams(botonesParams);

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

            // Configurar el primer OnClickListener para editar
            editarBtn.setOnClickListener(v -> {
                // Ocultar los TextView de la matrícula y nombre
                matricula.setVisibility(View.GONE);
                nombre.setVisibility(View.GONE);
                // Quitar los EditText de la fila
                fila.removeView(matricula);
                fila.removeView(nombre);

                // Crear EditText solo cuando se necesiten
                EditText matriculaEdit = new EditText(this);
                matriculaEdit.setText(usuario.getMatricula());
                matriculaEdit.setPadding(8, 8, 8, 8);
                matriculaEdit.setEnabled(true);

                fila.addView(matriculaEdit, 0); // Agregarlo al inicio de la fila

                EditText nombreEdit = new EditText(this);
                nombreEdit.setText(usuario.getNombre());
                nombreEdit.setPadding(8, 8, 8, 8);
                nombreEdit.setEnabled(true);
                fila.addView(nombreEdit, 1); // Agregarlo después de matrícula

                // Mostrar los EditText
                matriculaEdit.setVisibility(View.VISIBLE);
                nombreEdit.setVisibility(View.VISIBLE);

                // Hacer los EditText editables
                matriculaEdit.setEnabled(true);
                nombreEdit.setEnabled(true);

                // Cambiar el icono de editar a enviar (guardar)
                editarBtn.setImageResource(R.drawable.enviar);
                eliminarBtn.setVisibility(View.GONE);
                administrarComentariosBtn.setVisibility(View.GONE);

                // Configurar el segundo OnClickListener para guardar los cambios
                editarBtn.setOnClickListener(v1 -> {

                    matriculaAUX = matriculaEdit.getText().toString(); // Guardar la matrícula original
                    nombreAUX = nombreEdit.getText().toString();

                    // Quitar los EditText de la fila
                    fila.removeView(matriculaEdit);
                    fila.removeView(nombreEdit);

                    // Crear TextView para la matrícula
                    TextView matricula2 = new TextView(this);
                    matricula2.setText(usuario.getMatricula()); // Esto sigue siendo la matrícula original
                    matricula2.setPadding(8, 8, 8, 8);
                    fila.addView(matricula2);

                    // Crear TextView para el nombre
                    TextView nombre2 = new TextView(this);
                    nombre2.setText(usuario.getNombre());
                    nombre2.setPadding(8, 8, 8, 8);
                    fila.addView(nombre2);


                    // Enviar al servidor con la matrícula original (matriculaAUX)
                    usuario.setMatricula(matricula2.getText().toString()); // Se mantiene la matrícula original
                    guardarCambios(usuario);

                    // Deshabilitar los EditText después de guardar
                    matriculaEdit.setEnabled(false);
                    nombreEdit.setEnabled(false);

                    // Restaurar el icono de editar
                    editarBtn.setImageResource(R.drawable.editar);

                    // Volver a mostrar los TextView
                    matricula2.setVisibility(View.VISIBLE);
                    nombre2.setVisibility(View.VISIBLE);

                    // Actualizar la tabla de usuarios (o la interfaz correspondiente)
                    cargarUsuarios();
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

    private void buscarUsuarioPorMatricula(String matriculaBusqueda) {
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
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "Error al eliminar el usuario", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Toast.makeText(Pantalla_Inicio_Administrador.this, "Error de red: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }



    private void guardarCambios(ApiClient.Usuario usuario) {
;
        // Ahora enviamos el usuario actualizado al backend
        ApiClient.ApiService apiService = ApiClient.getApiService();
        Log.d("matriculaAUX", matriculaAUX); // Mostrar la matrícula original
        Log.d("usuario", usuario.toString());
        usuario.setNombre(nombreAUX);
        Call<Void> call = apiService.actualizarUsuario(usuario.getMatricula(), usuario); // Usar la matrícula original
        usuario.setMatricula(matriculaAUX);




        // Método en tu ApiService para actualizar el usuario
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "Usuario actualizado correctamente", Toast.LENGTH_SHORT).show();
                    cargarUsuarios();
                } else {
                    Toast.makeText(Pantalla_Inicio_Administrador.this, "Error al actualizar el usuario", Toast.LENGTH_SHORT).show();
                    Log.e("Error de actualización", "Error de actualización: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Toast.makeText(Pantalla_Inicio_Administrador.this, "Error de red: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.e("Error de red", "Error de red: " + t.getMessage());
            }
        });

    }




    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
