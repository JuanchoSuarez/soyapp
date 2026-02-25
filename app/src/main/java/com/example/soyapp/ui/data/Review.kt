package com.example.soyapp.ui.data

import androidx.annotation.DrawableRes

data class  Review(
    @DrawableRes val imageId: Int,
    val user: String,
    val fecha: String,
    val song: String,
    val artist: String,
    val review: String,
    val rating: Int
)