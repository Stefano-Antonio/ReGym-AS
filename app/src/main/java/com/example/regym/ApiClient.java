package com.example.regym;


import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;

public class ApiClient {
    private static final String BASE_URL = "http://10.0.2.2:4000/"; // Cambia esto a la URL de tu backend
    private static Retrofit retrofit;
    private static ApiService apiService;

    //Metodos para crear usuarios
    public interface ApiService {
        @POST("/api/usuarios")
        Call<User> crearUsuario(@Body User user);

        @POST("/api/iniciarSesion")
        Call<ResponseBody> iniciarSesion(@Body HashMap<String, String> datosUsuario);

        @POST("/api/recuperarContrasena")
        Call<ResponseBody> recuperarContrasena(@Body HashMap<String, String> datosCorreo);

    }

    // Método estático para obtener el cliente Retrofit
    public ApiClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL) // Usa BASE_URL aquí
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            apiService = retrofit.create(ApiService.class);
        }
    }
    // Constructor de ApiClient que inicializa Retrofit
    public static ApiService getApiService() {
        if (apiService == null) {
            // Inicializar retrofit
            new ApiClient();
        }
        return apiService;
    }
//----------------------------------------------------------------------------


    // Clase usuario
    public static class User {
        private String nombre;
        private String correo;
        private String matricula;
        private String password;

        // Constructor
        public User(String nombre,String correo, String matricula , String password) {
            this.nombre = nombre;
            this.correo = correo;
            this.matricula = matricula;
            this.password = password;
        }

        // Getters y Setters
        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }




}



