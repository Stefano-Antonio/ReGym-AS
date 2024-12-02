package com.example.regym;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public class ApiClient {
    private static final String BASE_URL = "http://10.0.2.2:4000/"; // Cambia esto a la URL de tu backend
    private static Retrofit retrofit;
    private static ApiService apiService;

    public interface ApiService {
//Usuarios:

        //Registrar un usuario
        @POST("/api/usuarios/registrar")
        Call<User> crearUsuario(@Body User user);

        //Iniciar sesion
        @POST("/api/usuarios/iniciarSesion")
        Call<ResponseBody> iniciarSesion(@Body HashMap<String, String> datosUsuario);

        //Recuperar contraseña
        @POST("/api/usuarios/recuperarContrasena")
        Call<ResponseBody> recuperarContrasena(@Body HashMap<String, String> datosCorreo);

//Comentarios:

        //Hacer comentario
        @POST("/api/comentarios")
        Call<ResponseBody> crearComentario(@Body Comentario comentario);

        //Cargar comentarios "movimiento:dinamico"
        @GET("/api/comentarios/{movimiento}")
        Call<List<ApiClient.Comentario>> obtenerComentariosPorMovimiento(@Path("movimiento") String movimiento);

        //Likes de los comentarios
        @POST("/api/comentarios/likeComentario")
        Call<LikeResponse> likeComentario(@Body LikeRequest likeRequest);

        // Ruta para eliminar un comentario
        @DELETE("/api/comentarios/eliminarComentario/{comentarioId}")
        Call<Void> eliminarComentario(@Path("comentarioId") String comentarioId);

        // Ruta para editar un comentario
        @PUT("/api/comentarios/editarComentario/{comentarioId}")
        Call<Void> editarComentario(@Path("comentarioId") String comentarioId, @Body EditarComentarioRequest request);

        // Responder comentario
        @POST("/api/comentarios/responder")
        Call<Respuesta> responderComentario( @Body ResponderComentarioRequest request);


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

//-------------------------------------------------------Contructores------------------------------------------------------------
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
    private String nombre;
    private String comentario;
    private String comentario_id;
    private String movimiento;
    private int num_likes;
    private String[] liked_by;
    private boolean isLiked;
    private List<ApiClient.Respuesta> respuestas; // Lista de IDs de respuestas
    // Constructor
    public Comentario(String usuario_id,String nombre, String comentario, String movimiento, int num_likes, String comentario_id) {
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.comentario = comentario;
        this.movimiento = movimiento;
        this.comentario_id = comentario_id;
        this.num_likes = num_likes; // Puede inicializarse en 0 si no hay likes
        this.respuestas = new ArrayList<>();
    }

    // Getters y Setters
    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getComentario_id() {
        return comentario_id;
    }

    public void setComentario_id(String comentario_id) {
        this.comentario_id = comentario_id;
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

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getLiked_by() {
        return liked_by;  // Devuelve el array liked_by
    }

    public void setLiked_by(String[] liked_by) {
        this.liked_by = liked_by;  // Asigna el valor del array a la variable liked_by
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }



}
    public static class LikeRequest {
        private String comentarioId;
        private String usuarioId;
        private boolean isLiked;
        private int num_likes;
        // Constructor, getters y setters
        public LikeRequest(String comentarioId, String usuarioId, boolean isLiked, int num_likes) {
            this.comentarioId = comentarioId;
            this.usuarioId = usuarioId;
            this.isLiked = isLiked;
            this.num_likes = num_likes;
        }

        public String getComentarioId() {
            return comentarioId;
        }

        public String getUsuarioId() {
            return usuarioId;
        }

        public boolean isLiked() {
            return isLiked;
        }

        public int getNum_likes() {
            return num_likes;
        }
    }

    public class LikeResponse {
        private int num_likes;
        private boolean isLiked;
        private String[] liked_by;
        // Constructor por defecto
        public LikeResponse() {
        }

        // Constructor con parámetros
        public LikeResponse(int num_likes, boolean isLiked) {
            this.num_likes = num_likes;
            this.isLiked = isLiked;
        }

        // Getters
        public int getNum_likes() {
            return num_likes;
        }

        public boolean isLiked() {
            return isLiked;
        }

        public String[] getLiked_by() {
            return liked_by;  // Devuelve el array liked_by
        }

        // Setters
        public void setNum_likes(int num_likes) {
            this.num_likes = num_likes;
        }

        public void setLiked(boolean liked) {
            isLiked = liked;
        }

        public void setLiked_by(String[] liked_by) {
            this.liked_by = liked_by;  // Asigna el valor del array a la variable liked_by
        }

        // Método toString para depuración
        @Override
        public String toString() {
            return "LikeResponse{" +
                    "num_likes=" + num_likes +
                    ", isLiked=" + isLiked +
                    '}';
        }
    }

        public static class DeleteRequest {
            private String comentarioId;

            public DeleteRequest(String comentarioId) {
                this.comentarioId = comentarioId;
            }

            public String getComentarioId() {
                return comentarioId;
            }

            public void setComentarioId(String comentarioId) {
                this.comentarioId = comentarioId;
            }
        }

        public static class DeleteResponse {
            private String message;

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }
        }

    public static class EditarComentarioRequest {
        private String userId;
        private String nuevoComentario;

        public EditarComentarioRequest(String userId, String nuevoComentario) {
            this.userId = userId;
            this.nuevoComentario = nuevoComentario;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getNuevoComentario() {
            return nuevoComentario;
        }

        public void setNuevoComentario(String nuevoComentario) {
            this.nuevoComentario = nuevoComentario;
        }
    }

    public static class ResponderComentarioRequest {
        private String usuario_id;
        private String respuesta;
        private String comentario_id;

        public ResponderComentarioRequest(String usuario_id, String respuesta, String comentario_id) {
            this.usuario_id = usuario_id;
            this.respuesta = respuesta;
            this.comentario_id = comentario_id;
        }
    }



    public static class Respuesta {
        private String respuesta_id;
        private String usuario_id;   // ID del usuario que responde
        private String nombre;       // Nombre del usuario
        private String respuesta;    // Texto de la respuesta
        private String comentario_id;
        // Constructor
        public Respuesta(String usuario_id, String nombre, String respuesta, String comentario_id) {

            this.usuario_id = usuario_id;
            this.nombre = nombre;
            this.respuesta = respuesta;
            this.comentario_id = comentario_id;
        }

        // Getters y Setters

        public String getUsuario_id() {
            return usuario_id;
        }

        public void setUsuario_id(String usuario_id) {
            this.usuario_id = usuario_id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getRespuesta() {
            return respuesta;
        }

        public void setRespuesta(String respuesta) {
            this.respuesta = respuesta;
        }

        public String getComentario_id() {
            return comentario_id;
        }

        public void setComentario_id(String comentario_id) {
            this.comentario_id = comentario_id;
        }

        @Override
        public String toString() {
            return "Respuesta{" +
                    "respuesta='" + respuesta + '\'' +
                    ", nombre='" + nombre + '\'' +
                    '}';
        }
    }





}



