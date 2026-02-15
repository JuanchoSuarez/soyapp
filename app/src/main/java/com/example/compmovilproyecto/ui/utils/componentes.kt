package com.example.compmovilproyecto.ui.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R

// AQUI SE ENCUENTRAN TODOS LOS COMPONENTES QUE SE USARAN EN LA APP
// COMO BOTONES, IMAGENES, TEXTOS, ETC.

//--------------------------------------------------------------------------------------------------
// TEXTO GENERAL -> (HomeScreen, LoginScreen, RegisterScreen)
//--------------------------------------------------------------------------------------------------
@Composable
fun TextoGeneral(
    modifier: Modifier = Modifier,
    texto: String,
    color: Color = Color.White,
    estilo: TextStyle = TextStyle.Default
) {
    Text(
        text = texto,
        color = color,
        style = estilo,
        modifier = modifier
    )
}

//--------------------------------------------------------------------------------------------------
// TEXTO SOY CURSIVO -> (HomeScreen, LoginScreen, RegisterScreen)
//--------------------------------------------------------------------------------------------------
@Composable
fun TextoSOY(
    modifier: Modifier = Modifier,
    tamano: TextUnit
) {
    Text(
        text = stringResource(R.string.soy), // El texto es parte de la identidad
        fontSize = tamano,
        fontFamily = FontFamily.Cursive,
        color = Color.White, // Asumimos blanco por el fondo oscuro
        modifier = modifier
    )
}

//--------------------------------------------------------------------------------------------------
// IMAGEN DEL LOGO (SOY) -> (HomeScreen, LoginScreen, RegisterScreen)
//--------------------------------------------------------------------------------------------------
@Composable
fun LogoSOY(
    modifier: Modifier = Modifier.size(250.dp)
) {
    Image(
        painter = painterResource(R.drawable.iconosoy),
        contentDescription = stringResource(R.string.logo_soy),
        modifier = modifier
    )
}

//--------------------------------------------------------------------------------------------------
// BOTON -> (HomeScreen, LoginScreen, RegisterScreen)
//--------------------------------------------------------------------------------------------------
@Composable
fun BotonGeneral(
    modifier: Modifier = Modifier.fillMaxWidth(0.8f)
    .height(70.dp)
    .padding(vertical = 8.dp),
    texto: String,
    color: Int = R.color.violetaClaro,
    forma: Shape = RoundedCornerShape(8.dp)
) {
    Button(onClick = { /*TODO*/ },
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(color),
        ),
        shape = forma
    ) {
        Text(text = texto,
            fontSize = 20.sp)
    }
}

//--------------------------------------------------------------------------------------------------
// CAMPO DE TEXTO -> (LoginScreen, RegisterScreen)
//--------------------------------------------------------------------------------------------------
@Composable
fun FormularioGeneral(
    modifier: Modifier = Modifier
        .fillMaxWidth(0.8f)
        .height(70.dp)
        .padding(vertical = 8.dp)
        .border(
            width = 3.dp,
            color = colorResource(R.color.violetaApagado),
            shape = RoundedCornerShape(8.dp)
        )
        .background(
            color = colorResource(R.color.grisClaro),
            shape = RoundedCornerShape(8.dp)
        ),
    forma: Shape = RoundedCornerShape(8.dp),
    idLabel: Int,
    idValue: Int
) {
    TextField(
        value = stringResource(id = idValue),
        onValueChange = { /*TODO: Lo dejamos así por ahora*/ },
        label = { Text(text = stringResource(id = idLabel),
            color = colorResource(R.color.violetaClaro)) },
        modifier = modifier,
        shape = forma,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            disabledContainerColor = Color.Transparent,
            unfocusedTextColor = Color.Black,
        )
    )
}

//--------------------------------------------------------------------------------------------------
// BACKGROUND PLANO -> (LoginScreen, RegisterScreen)
//--------------------------------------------------------------------------------------------------
@Composable
fun BackgroundPlano(
    modifier: Modifier = Modifier,
) {
    Image(
        painter = painterResource(R.drawable.backgroundplano),
        contentDescription = stringResource(R.string.fondo_pantalla_principal),
        modifier = modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}

//--------------------------------------------------------------------------------------------------
// BACKGROUND CON FONDO SOY -> (ForYouScreen, ExplorerScreen, ¿¿??, ¿¿??, ¿¿??)
//--------------------------------------------------------------------------------------------------
@Composable
fun BackgroundSOY(
    modifier: Modifier = Modifier,
) {
    Image(
        painter = painterResource(R.drawable.backgroundsoy),
        contentDescription = stringResource(R.string.pantalla_soy_fondo),
        modifier = modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}

//--------------------------------------------------------------------------------------------------
// TEXTO NOMBRE USUARIO -> (Contenedor: CardReseñas, ¿¿??)
//--------------------------------------------------------------------------------------------------
@Composable
fun TextoUsuario(
    modifier: Modifier = Modifier,
    usuario: String,
) {
    Text(
        text = usuario,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}

//--------------------------------------------------------------------------------------------------
// TEXTO FECHA -> (Contenedor: CardReseñas, ¿¿??)
//--------------------------------------------------------------------------------------------------
@Composable
fun TextoFecha(
    modifier: Modifier = Modifier,
    fecha: String
) {
    Text(
        text = fecha,
        color = colorResource(R.color.violetaClaro),
        fontSize = 12.sp,
        modifier = modifier
    )
}

//--------------------------------------------------------------------------------------------------
// TEXTO NOMBRE CANCIÓN -> (Contenedor: CardReseñas, ¿¿??)
//--------------------------------------------------------------------------------------------------
@Composable
fun TextoCancion(
    modifier: Modifier = Modifier,
    cancion: String
) {
    Text(
        text = cancion,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        modifier = modifier
    )
}

//--------------------------------------------------------------------------------------------------
// TEXTO NOMBRE ARTISTA -> (Contenedor: CardReseñas, ¿¿??)
//--------------------------------------------------------------------------------------------------
@Composable
fun TextoArtista(
    modifier: Modifier = Modifier,
    artista: String
) {
    Text(
        text = artista,
        color = colorResource(R.color.violetaClaro),
        modifier = modifier
    )
}

//--------------------------------------------------------------------------------------------------
// TEXTO CALIFICACIÓN -> (Contenedor: CardReseñas, ¿¿??)
//--------------------------------------------------------------------------------------------------
@Composable
fun TextoRating(
    modifier: Modifier = Modifier,
    rating: Int
) {
    Text(
        text = "⭐".repeat(rating) + " $rating/5",
        color = Color.Yellow,
        modifier = modifier
    )
}

//--------------------------------------------------------------------------------------------------
// TEXTO RESEÑA -> (Contenedor: CardReseñas, ¿¿??)
//--------------------------------------------------------------------------------------------------
@Composable
fun TextoResena(
    modifier: Modifier = Modifier,
    review: String
) {
    Text(
        text = review,
        color = Color.White,
        fontSize = 14.sp,
        modifier = modifier
    )
}


