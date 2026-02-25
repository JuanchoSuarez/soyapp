package com.example.compmovilproyecto.ui.data

import androidx.annotation.DrawableRes

data class  Review(
    @DrawableRes val imageId: Int,
    @DrawableRes val editId: Int,
    @DrawableRes val deleteId: Int,
    @DrawableRes val likesId: Int,
    @DrawableRes val comments: Int,
    val user: String,
    val fecha: String,
    val song: String,
    val artist: String,
    val review: String,
    val rating: Int
)