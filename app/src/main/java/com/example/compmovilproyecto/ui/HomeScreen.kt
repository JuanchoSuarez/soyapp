package com.example.compmovilproyecto.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R

@Composable
fun TextoGeneral(
    mensaje: String,
    color: Color = Color.White,
    estilo: TextStyle = TextStyle.Default,
    modifier: Modifier = Modifier
) {
    Text(
        text = mensaje,
        color = color,
        style = estilo,
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
fun ImagenGeneral(
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
fun ImagenGeneralPreview() {
    ImagenGeneral(
        idImagen = R.drawable.iconosoy,
        descripcion = "Logo CompMovil"
    )
}

@Composable
fun BodyHomeScreen(){
    Column{
        TextoGeneral("SOY",
            estilo = TextStyle(fontSize = 50.sp,
                fontFamily = FontFamily.Cursive),
            modifier = Modifier)
        ImagenGeneral(
            idImagen = R.drawable.iconosoy,
            descripcion = "Logo CompMovil"
        )
        TextoGeneral("\"Live a life you will remember\"",
            estilo = TextStyle(fontSize = 15.sp,
                fontStyle = FontStyle.Italic)
            )
        TextoGeneral("- Avicii, The Nights",
            estilo = TextStyle(fontSize = 10.sp)
        )
        BotonGeneral("Sing Up")
        BotonGeneral("Log in")
    }
}

@Composable
@Preview()
fun BodyHomeScreenPreview(){
    BodyHomeScreen()
}

