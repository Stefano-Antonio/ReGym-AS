package com.example.regym;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public class ApiClient {
    private static final String BASE_URL = "http://10.0.2.2:4000/"; // Cambia esto a la URL de tu backend
    private static Retrofit retrofit;
    private static ApiService apiService;




    //Metodos para crear usuarios
    public interface ApiService {
//Usuarios:

        //Registrar un usuario
        @POST("/api/usuarios/registrar")
        Call<User> crearUsuario(@Body User user);

        //Iniciar sesion
        @POST("/api/usuarios/iniciarSesion")
        Call<ResponseBody> iniciarSesion(@Body HashMap<String, String> datosUsuario);

        @POST("/api/usuarios/recuperarContrasena")
        Call<ResponseBody> recuperarContrasena(@Body HashMap<String, String> datosCorreo);

//Comentarios:

        //Hacer comentario
        @POST("/api/comentarios")
        Call<ResponseBody> crearComentario(@Body Comentario comentario);

        //Cargar comentarios "movimiento:dinamico"
        @GET("/api/comentarios/{movimiento}")
        Call<List<ApiClient.Comentario>> obtenerComentariosPorMovimiento(@Path("movimiento") String movimiento);

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

//Comentario
public static class Comentario {
    private String usuario_id;
    private String comentario;
    private String movimiento;
    private int num_likes;
    private List<String> respuestas; // Lista de IDs de respuestas

    // Constructor
    public Comentario(String usuario_id, String comentario, String movimiento) {
        this.usuario_id = usuario_id;
        this.comentario = comentario;
        this.movimiento = movimiento;
        this.num_likes = 0; // Puede inicializarse en 0 si no hay likes
        this.respuestas = new ArrayList<>();
    }

    // Getters y Setters
    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public int getNum_likes() {
        return num_likes;
    }

    public void setNum_likes(int num_likes) {
        this.num_likes = num_likes;
    }

    public List<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }
}


/*Respuesta
    public static class Respuesta {
        private String respuesta_id;
        private String comentario_id;
        private String usuario;
        private static String respuesta; // Cambiado a "respuesta"

        // Constructor
        public Respuesta(String respuesta_id, String comentario_id, String usuario_id, String respuesta) {
            this.respuesta_id = respuesta_id;
            this.comentario_id = comentario_id;
            this.usuario = usuario_id;
            this.respuesta = respuesta;
        }

        // Getters y Setters
        public String getRespuesta_id() {
            return respuesta_id;
        }

        public void setRespuesta_id(String respuesta_id) {
            this.respuesta_id = respuesta_id;
        }
        public static void getRespuesta() {
            return respuesta;
        }
        public static void setRespuesta(String respuesta) {
            this.respuesta = respuesta;
        }

        public String getComentario_id() {
            return comentario_id;
        }

        public void setComentario_id(String comentario_id) {
            this.comentario_id = comentario_id;
        }

        public String getUsuario_id() {
            return usuario;
        }

        public String setRespuesta() {
            return usuario;
        }


       }*/
    }



