package com.example.compmovilproyecto.ui.model

data class Notification(
    val idNotificacion: String,
    val idUsuario: String,
    val tipo: String,               // "FOLLOW" | "LIKE" | "COMMENT"
    val mensaje: String,
    val fechaNotificacion: String,  // "Hace 745 días"
    val estaLeida: Boolean
)