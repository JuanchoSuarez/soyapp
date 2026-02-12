package com.example.compmovilproyecto.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R

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
@Composable
fun BotonGeneral(
    texto: String,
    modifier: Modifier = Modifier
) {
    Button(onClick = { /*TODO*/ },
        modifier = modifier
    ) {
        Text(text = texto)
    }
}

@Composable
@Preview()
fun BotonGeneralPreview(){
    BotonGeneral("Iniciar Sesión")
}

@Composable
fun ImagenGenerica(
    idImagen: Int, // (R.drawable.nombreImagen)
    descripcion: String,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = idImagen),
        contentDescription = descripcion,
        modifier = modifier
    )
}

@Composable
@Preview()
fun ImagenGenericaPreview() {
    ImagenGenerica(
        idImagen = R.drawable.iconosoy,
        descripcion = "Logo CompMovil"
    )
}