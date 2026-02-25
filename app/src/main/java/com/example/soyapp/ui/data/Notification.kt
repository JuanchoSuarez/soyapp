package com.example.soyapp.ui.data

import androidx.annotation.DrawableRes

data class Notification(
    @DrawableRes val imagenPerfilId: Int,
    val nombreUsuario: String,
    val textoAccion: String,
    val tiempo: String,
    @DrawableRes val iconoDerechoId: Int,
)