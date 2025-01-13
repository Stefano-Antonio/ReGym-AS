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
    private static final String BASE_URL = "https://respositorio-de-gimnasia-digital-regym-hv6l.onrender.com"; // Cambiar a la URL del backend
    //private static final String BASE_URL = "http://192.168.100.66:4000/";
    //private static final String BASE_URL = "http://10.0.2.2:4000/";
    private static Retrofit retrofit;
    private static ApiService apiService;
    public interface ApiService {

//Usuarios:

        // Registrar un usuario
        @POST("/api/usuarios/registrar")
        Call<Usuario> crearUsuario(@Body Usuario user);

        // Iniciar sesion
        @POST("/api/usuarios/iniciarSesion")
        Call<ResponseBody> iniciarSesion(@Body HashMap<String, String> datosUsuario);

        // Recuperar contraseña
        @POST("/api/usuarios/recuperarContrasena")
        Call<ResponseBody> recuperarContrasena(@Body HashMap<String, String> datosCorreo);

//Comentarios:

        // Hacer comentario
        @POST("/api/comentarios")
        Call<ResponseBody> crearComentario(@Body Comentario comentario);

        // Cargar comentarios "movimiento:dinamico"
        @GET("/api/comentarios/{movimiento}")
        Call<List<ApiClient.Comentario>> obtenerComentariosPorMovimiento(@Path("movimiento") String movimiento);

        // Likes de los comentarios
        @POST("/api/comentarios/likeComentario")
        Call<LikeResponse> likeComentario(@Body LikeRequest likeRequest);

        // Ruta para eliminar un comentario
        @DELETE("/api/comentarios/eliminarComentario/{comentarioId}")
        Call<Void> eliminarComentario(@Path("comentarioId") String comentarioId);

        // Ruta para editar un comentario
        @PUT("/api/comentarios/editarComentario/{comentarioId}")
        Call<Void> editarComentario(@Path("comentarioId") String comentarioId, @Body EditarComentarioRequest request);

        //Respuestas:

        // Responder comentario
        @POST("/api/comentarios/responder")
        Call<Respuesta> responderComentario( @Body ResponderComentarioRequest request);

        // Ruta para eliminar una respuesta
        @DELETE("/api/comentarios/eliminarRespuesta/{comentarioId}/{respuestaId}")
        Call<Void> eliminarRespuesta(@Path("comentarioId") String comentarioId, @Path("respuestaId") String respuestaId);

//Administrador:

        // Ruta para cargar usuarios
        @GET("/api/administrador/usuarios") // Ruta del backend
        Call<List<Usuario>> getUsuarios();

        // Ruta para eliminar un usuario
        @DELETE("/api/administrador/usuarios/eliminar/{matricula}/{usuarioId}")
        Call<Void> eliminarUsuario(@Path("matricula") String matricula,  @Path("usuarioId") String usuarioId);

        // Ruta para editar usuarios dede el administrador:
        @PUT("/api/administrador/usuarios/editar/{matriculaAux}/{matricula}/{nombre}")
        Call<Void> actualizarUsuario(@Path("matriculaAux") String matriculaAux,@Path("matricula") String matricula, @Path("nombre") String nombre);

        // Cargar comentarios "movimiento:dinamico"
        @GET("/api/administrador/comentarios/{movimiento}/{usuarioId}")
        Call<List<ApiClient.Comentario>> obtenerComentariosPorId(@Path("movimiento") String movimiento,@Path("usuarioId") String usuarioId);

        //0btener de matriculas:
        @GET("/api/administrador/matriculas")
        Call<RespuestaMatriculas> obtenerMatriculas();

        //Guardar matricula
        @POST("/api/administrador/matriculas/{matricula}")
        Call<RespuestaMatriculas> agregarMatricula(@Path("matricula") String matricula);

        //Eiminar matricula
        @DELETE("eliminarMatricula/{matricula}")
        Call<Void> eliminarMatricula(@Path("matricula") String matricula);

        // Ruta para obtener comentarios eliminados
        @GET("/api/administrador/comentarioseliminados")
        Call<List<ApiClient.Comentario>> obtenerComentariosEliminados();
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

//------------------------Contructores------------------------//

// Constructor de usuario
    public static class Usuario {
        private String id;
        private String nombre;
        private String correo;
        private String matricula;
        private String contraseña;

        public Usuario(String id, String nombre,String correo, String matricula , String contraseña) {

            this.id = id;
            this.nombre = nombre;
            this.correo = correo;
            this.matricula = matricula;
            this.contraseña = contraseña;
        }


        public String getId() {return id;}

        public void setId(String id) {this.id = id;}

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
            return contraseña;
        }

        public void setPassword(String contraseña) {
            this.contraseña = contraseña;
        }

        @Override
        public String toString() {
            return "Usuario{" +
                    "id='" + id + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", correo='" + correo + '\'' +
                    ", matricula='" + matricula + '\'' +
                    ", contraseña='" + contraseña + '\'' +
                    '}';
        }
    }


    //Constructor de Comentario
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

        public Comentario(String usuario_id,String nombre, String comentario, String movimiento, int num_likes, String comentario_id) {
            this.usuario_id = usuario_id;
            this.nombre = nombre;
            this.comentario = comentario;
            this.movimiento = movimiento;
            this.comentario_id = comentario_id;
            this.num_likes = num_likes;
            this.respuestas = (respuestas != null) ? respuestas : new ArrayList<>();
        }

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
//Constructor de LikeRequest
    public static class LikeRequest {
        private String comentarioId;
        private String usuarioId;
        private boolean isLiked;
        private int num_likes;

        public LikeRequest(String comentarioId, String usuarioId, boolean isLiked, int num_likes) {
            this.comentarioId = comentarioId;
            this.usuarioId = usuarioId;
            this.isLiked = isLiked;
            this.num_likes = num_likes;
        }

        public String getComentarioId() {return comentarioId;}

        public String getUsuarioId() {return usuarioId;}

        public boolean isLiked() {return isLiked;}

        public int getNum_likes() {return num_likes;}
    }
//Constructor de LikeResponse
    public class LikeResponse {
        private int num_likes;
        private boolean isLiked;
        private String[] liked_by;


        public LikeResponse(int num_likes, boolean isLiked) {
            this.num_likes = num_likes;
            this.isLiked = isLiked;
        }

        public int getNum_likes() {
            return num_likes;
        }

        public boolean isLiked() {
            return isLiked;
        }

        public String[] getLiked_by() {
            return liked_by;  // Devuelve el array liked_by
        }

        public void setNum_likes(int num_likes) {
            this.num_likes = num_likes;
        }

        public void setLiked(boolean liked) {
            isLiked = liked;
        }

        public void setLiked_by(String[] liked_by) {this.liked_by = liked_by;}

        // Método toString para depuración
        @Override
        public String toString() {
            return "LikeResponse{" +
                    "num_likes=" + num_likes +
                    ", isLiked=" + isLiked +
                    '}';
        }
    }
//Constructor de EditarComentarioRequest
    public static class EditarComentarioRequest {
        private String userId;
        private String nuevoComentario;

        public EditarComentarioRequest(String userId, String nuevoComentario) {
            this.userId = userId;
            this.nuevoComentario = nuevoComentario;
        }

    }
//Constructor de ResponderComentarioRequest
    public static class ResponderComentarioRequest {

        private String respuesta_id;
        private String usuario_id;
        private String nombre;
        private String respuesta;
        private String comentario_id;

        public ResponderComentarioRequest(String respuesta_id, String usuario_id, String nombre, String respuesta, String comentario_id) {
            this.respuesta_id = respuesta_id;
            this.usuario_id = usuario_id;
            this.nombre = nombre;
            this.respuesta = respuesta;
            this.comentario_id = comentario_id;
        }

    }
//Constructor de Respuesta
    public static class Respuesta {
        private String respuesta_id;
        private String usuario_id;   // ID del usuario que responde
        private String nombre;       // Nombre del usuario
        private String respuesta;    // Texto de la respuesta
        private String comentario_id;

        public Respuesta(String respuesta_id, String usuario_id, String nombre, String respuesta, String comentario_id) {
            this.respuesta_id = respuesta_id;
            this.usuario_id = usuario_id;
            this.nombre = nombre;
            this.respuesta = respuesta;
            this.comentario_id = comentario_id;
        }

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

        public void setComentario_id(String comentario_id) {this.comentario_id = comentario_id;}

        public String getRespuesta_id() {return respuesta_id;}

        public void setRespuesta_id(String respuesta_id) {this.respuesta_id = respuesta_id;}

        @Override
        public String toString() {
            return "Respuesta{" +
                    "resouestasid:" + respuesta_id + '\'' +
                    "usuarioId:" + usuario_id + '\'' +
                    "nombre='" + nombre + '\'' +
                    "respuesta='" + respuesta + '\'' +
                    "comentarioId:" + comentario_id + '\'' +
                    '}';
        }
    }

    public class RespuestaMatriculas {
        private String mensaje;
        private List<String> matriculas;

        public String getMensaje() {
            return mensaje;
        }

        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }

        public List<String> getMatriculas() {
            return matriculas;
        }

        public void setMatriculas(List<String> matriculas) {
            this.matriculas = matriculas;
        }
    }

}



