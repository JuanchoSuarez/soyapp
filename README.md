# SOY ( Song Of The Year)

## 📊 Diagrama de Clases

```mermaid
classDiagram

class Usuario {
    -String idUsuario
    -String nombreUsuario
    -String correo
    -String contrasena
    -String fotoPerfil
    -List<Usuario> listaSeguidores
    -List<Usuario> listaSeguidos
    +registrar()
    +iniciarSesion()
    +cerrarSesion()
    +editarPerfil()
    +eliminarCuenta()
    +seguirUsuario(usuario: Usuario)
    +dejarSeguir(usuario: Usuario)
}

class Resena {
    -String idResena
    -String contenido
    -Date fechaPublicacion
    -int calificacion
    +crearResena()
    +editarResena()
    +eliminarResena()
}

class Comentario {
    -String idComentario
    -String contenido
    -Date fechaComentario
    +crearComentario()
    +editarComentario()
    +eliminarComentario()
}

class Cancion {
    -String idCancion
    -String nombreCancion
    -String subgenero
    -Date fechaPublicacion
    -String duracion
    +mostrarInfo()
}

class Artista {
    -String idArtista
    -String nombreArtista
    +obtenerCanciones()
}

class Notificacion {
    -String idNotificacion
    -String tipo
    -String mensaje
    -Date fechaNotificacion
    -boolean estaLeida
    +enviarNotificacion()
    +marcarLeida()
}

Usuario "1" --> "*" Resena : realiza
Resena "1" *-- "*" Comentario : contiene
Usuario "1" --> "*" Usuario : sigue
Usuario "1" --> "*" Notificacion : recibe
Resena "*" --> "1" Cancion : califica
Cancion "*" --> "1" Artista : pertenece



```
###  Relaciones principales

- Un Usuario puede realizar múltiples Reseñas.
- Una Reseña puede contener múltiples Comentarios.
- Una Reseña califica una Canción.
- Una Canción pertenece a un Artista.
- Un Usuario puede seguir a otros Usuarios.
- Un Usuario puede recibir múltiples Notificaciones.

## 🗄️ Diagrama Entidad - Relación

```mermaid
erDiagram

USUARIO {
    string idUsuario PK
    string nombreUsuario
    string correo
    string contrasena
    string fotoPerfil
}

RESENA {
    string idResena PK
    string contenido
    date fechaPublicacion
    int calificacion
    string idUsuario FK
    string idCancion FK
}

COMENTARIO {
    string idComentario PK
    string contenido
    date fechaComentario
    string idUsuario FK
    string idResena FK
}

CANCION {
    string idCancion PK
    string nombreCancion
    string subgenero
    date fechaPublicacion
    string duracion
    string idArtista FK
}

ARTISTA {
    string idArtista PK
    string nombreArtista
}

NOTIFICACION {
    string idNotificacion PK
    string tipo
    string mensaje
    date fechaNotificacion
    boolean estaLeida
    string idUsuario FK
}

USUARIO ||--o{ RESENA : escribe
RESENA ||--o{ COMENTARIO : genera
CANCION ||--o{ RESENA : recibe
ARTISTA ||--o{ CANCION : produce
USUARIO ||--o{ NOTIFICACION : recibe
```
### 📌 Diferencia entre el Modelo ER y el Diagrama de Clases

El diagrama Entidad–Relación representa la estructura lógica de la base de datos,
incluyendo claves primarias y foráneas necesarias para la persistencia de los datos.

Por otro lado, el diagrama de clases modela la lógica del sistema desde un enfoque
orientado a objetos, representando las entidades del dominio como clases con sus
atributos y métodos, así como sus relaciones.

El modelo ER sirve como base para la implementación del esquema relacional,
mientras que el diagrama de clases es utilizado para el desarrollo del backend
y el mapeo objeto-relacional mediante JPA en Spring Boot.
