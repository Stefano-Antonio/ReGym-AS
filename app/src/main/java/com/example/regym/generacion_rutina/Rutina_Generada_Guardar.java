package com.example.regym.generacion_rutina;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.regym.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Rutina_Generada_Guardar extends AppCompatActivity {

    private static final String PREFS_NAME = "RutinasPrefs";
    private static final String SLOT_PREFIX = "SLOT_";

    private String fortalecimiento;
    private String aparato;
    private String acondicionamiento;
    private String tipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rutina_generada_guardar);

        Button regresar_btn = findViewById(R.id.Regresar_btn);

        regresar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();  // Cierra la actividad actual y regresa a la anterior
            }
        });
        // Obtener datos del Intent
        fortalecimiento = getIntent().getStringExtra("fortalecimiento");
        aparato = getIntent().getStringExtra("aparato");
        acondicionamiento = getIntent().getStringExtra("acondicionamiento");
        tipo = getIntent().getStringExtra("tipo");

        // Configurar botones de los slots
        configurarBoton(R.id.Guardar1_btn, 1);
        configurarBoton(R.id.Guardar2_btn, 2);
        configurarBoton(R.id.Guardar3_btn, 3);
        configurarBoton(R.id.Guardar4_btn, 4);
        configurarBoton(R.id.Guardar5_btn, 5);
        configurarBoton(R.id.Guardar6_btn, 6);
        configurarBoton(R.id.Guardar7_btn, 7);
        configurarBoton(R.id.Guardar8_btn, 8);

        // Botón para eliminar la rutina actual
        ImageButton buttonDelete = findViewById(R.id.buttonDelete);
        buttonDelete.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Selecciona el slot para eliminar");

            // Opciones de slots
            String[] slots = {"1", "2", "3", "4", "5", "6", "7", "8"};

            builder.setItems(slots, (dialog, which) -> {
                int slot = which + 1; // El índice empieza en 0
                borrarRutina(slot);
            });

            builder.setNegativeButton("Cancelar", (dialog, which) -> dialog.dismiss());
            builder.show();
        });

    }

    private void configurarBoton(int buttonId, int slot) {
        Button guardar = findViewById(buttonId);
        actualizarEstadoBoton(guardar, slot);

        guardar.setOnClickListener(v -> {
            SharedPreferences prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
            boolean rutinaGuardada = prefs.contains(SLOT_PREFIX + slot);

            if (rutinaGuardada) {
                // Si ya hay una rutina guardada, visualizar la rutina (redirigir a Rutina_Generada)
                visualizarRutina(slot);
            } else {
                // Si no hay rutina, guardar una nueva
                guardarRutina(slot);
                actualizarEstadoBoton(guardar, slot);
            }
        });

        guardar.setOnLongClickListener(v -> {
            // Alternativa: Visualizar la rutina con una pulsación larga
            visualizarRutina(slot);
            return true; // Indica que el evento fue manejado
        });
    }


    private void guardarRutina(int slot) {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String rutinasJson = prefs.getString(SLOT_PREFIX + slot, "[]");

        // Convertir el JSON existente a una lista de rutinas
        try {
            JSONArray rutinasArray = new JSONArray(rutinasJson);

            // Crear la nueva rutina en formato JSON
            JSONObject nuevaRutina = new JSONObject();
            nuevaRutina.put("fortalecimiento", fortalecimiento != null ? fortalecimiento : "N/A");
            nuevaRutina.put("aparato", aparato != null ? aparato : "N/A");
            nuevaRutina.put("acondicionamiento", acondicionamiento != null ? acondicionamiento : "N/A");
            nuevaRutina.put("tipo", tipo != null ? tipo : "N/A");

            // Agregar la nueva rutina a la lista
            rutinasArray.put(nuevaRutina);

            // Guardar la lista actualizada en SharedPreferences
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString(SLOT_PREFIX + slot, rutinasArray.toString());
            editor.apply();

            Toast.makeText(this, "Rutina agregada en el slot " + slot, Toast.LENGTH_SHORT).show();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error al guardar la rutina", Toast.LENGTH_SHORT).show();
        }
    }


    private void borrarRutinaActual() {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        // Elimina todas las rutinas
        editor.clear();
        editor.apply();

        Toast.makeText(this, "Todas las rutinas han sido eliminadas", Toast.LENGTH_SHORT).show();

        // Actualiza el estado de todos los botones
        actualizarTodosLosBotones();
    }

    private void actualizarEstadoBoton(Button button, int slot) {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        boolean rutinaGuardada = prefs.contains(SLOT_PREFIX + slot);

        if (rutinaGuardada) {
            button.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.rutina_guardada, 0, 0);
        } else {
            button.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.guardar_rutina, 0, 0);
        }
    }

    private void actualizarTodosLosBotones() {
        for (int i = 1; i <= 8; i++) {
            int buttonId = getResources().getIdentifier("Guardar" + i + "_btn", "id", getPackageName());
            Button button = findViewById(buttonId);
            actualizarEstadoBoton(button, i);
        }
    }

    private void visualizarRutina(int slot) {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String rutinasJson = prefs.getString(SLOT_PREFIX + slot, "[]");

        try {
            JSONArray rutinasArray = new JSONArray(rutinasJson);

            if (rutinasArray.length() > 0) {
                // Crear una lista de rutinas como texto para mostrar en un cuadro de diálogo
                String[] opcionesRutinas = new String[rutinasArray.length()];
                for (int i = 0; i < rutinasArray.length(); i++) {
                    JSONObject rutina = rutinasArray.getJSONObject(i);
                    opcionesRutinas[i] = "Rutina :\n"
                            + "Fortalecimiento: " + rutina.getString("fortalecimiento") + "\n"
                            + "Aparato: " + rutina.getString("aparato") + "\n"
                            + "Acondicionamiento: " + rutina.getString("acondicionamiento") + "\n"
                            + "Tipo: " + rutina.getString("tipo");
                }

                // Mostrar un cuadro de diálogo para que el usuario seleccione una rutina
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Rutina a visualizar:")
                        .setItems(opcionesRutinas, (dialog, which) -> {
                            try {
                                // Recuperar la rutina seleccionada
                                JSONObject rutinaSeleccionada = rutinasArray.getJSONObject(which);

                                // Extraer los valores de la rutina seleccionada
                                String fortalecimiento = rutinaSeleccionada.getString("fortalecimiento");
                                String aparato = rutinaSeleccionada.getString("aparato");
                                String acondicionamiento = rutinaSeleccionada.getString("acondicionamiento");
                                String tipo = rutinaSeleccionada.getString("tipo");

                                // Crear el Intent para redirigir a la actividad Rutina_Generada
                                Intent intent = new Intent(this, Rutina_Generada.class);
                                intent.putExtra("fortalecimiento", fortalecimiento);
                                intent.putExtra("aparato", aparato);
                                intent.putExtra("acondicionamiento", acondicionamiento);
                                intent.putExtra("tipo", tipo);
                                startActivity(intent);

                            } catch (JSONException e) {
                                e.printStackTrace();
                                Toast.makeText(this, "Error al procesar la rutina seleccionada", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Cancelar", null)
                        .show();

            } else {
                Toast.makeText(this, "No hay rutinas guardadas en el slot " + slot, Toast.LENGTH_SHORT).show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error al cargar las rutinas", Toast.LENGTH_SHORT).show();
        }
    }

    private void borrarRutina(int slot) {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String rutinasJson = prefs.getString(SLOT_PREFIX + slot, "[]");

        try {
            JSONArray rutinasArray = new JSONArray(rutinasJson);

            if (rutinasArray.length() > 0) {
                // Eliminar la última rutina del array
                rutinasArray.remove(rutinasArray.length() - 1);

                // Guardar el array actualizado en SharedPreferences
                SharedPreferences.Editor editor = prefs.edit();
                if (rutinasArray.length() == 0) {
                    editor.remove(SLOT_PREFIX + slot); // Elimina la clave si no hay rutinas
                } else {
                    editor.putString(SLOT_PREFIX + slot, rutinasArray.toString());
                }
                editor.apply();

                Toast.makeText(this, "Rutina eliminada del slot " + slot, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "No hay rutinas para eliminar en el slot " + slot, Toast.LENGTH_SHORT).show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error al eliminar la rutina", Toast.LENGTH_SHORT).show();
        }

        // Actualiza el estado del botón correspondiente
        actualizarEstadoBoton(findViewById(getButtonIdBySlot(slot)), slot);
    }

    private int getButtonIdBySlot(int slot) {
        switch (slot) {
            case 1: return R.id.Guardar1_btn;
            case 2: return R.id.Guardar2_btn;
            case 3: return R.id.Guardar3_btn;
            case 4: return R.id.Guardar4_btn;
            case 5: return R.id.Guardar5_btn;
            case 6: return R.id.Guardar6_btn;
            case 7: return R.id.Guardar7_btn;
            case 8: return R.id.Guardar8_btn;
            default: throw new IllegalArgumentException("Slot inválido: " + slot);
        }
    }

}