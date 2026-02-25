package com.example.compmovilproyecto.ui.data

import androidx.annotation.DrawableRes

data class Song(
    @DrawableRes val imagenId: Int,
    val nombre: String,
    val artista: String,
    val genero: String,
    val duracion: String
)
