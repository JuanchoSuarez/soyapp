package com.example.compmovilproyecto.ui

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextoGeneral(
    mensaje: String,
    modifier: Modifier = Modifier // Parametro opcional siguiendo el patron
) {
    Text(
        text = mensaje,
        modifier = modifier
    )
}

@Composable
@Preview
fun TextoGeneralPreview() {
    TextoGeneral(
        mensaje = "Hola")
}