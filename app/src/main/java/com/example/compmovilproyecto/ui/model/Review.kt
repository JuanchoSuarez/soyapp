package com.example.compmovilproyecto.ui.model

data class Review(
    val user: String,
    val fecha: String,
    val song: String,
    val artist: String,
    val review: String,
    val rating: Int
)