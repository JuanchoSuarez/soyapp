package com.example.compmovilproyecto.ui.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
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
        text = stringResource(R.string.soy),
        fontSize = tamano,
        fontFamily = FontFamily.Cursive,
        color = Color.White,
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
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .height(70.dp)
        .padding(vertical = 8.dp),
    texto: String,
    fontSize: TextUnit = 20.sp,
    color: Int = R.color.violetaClaro,
    forma: Shape = RoundedCornerShape(8.dp)
) {
    Button(
        onClick = { /*TODO*/ },
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(color),
        ),
        shape = forma
    ) {
        Text(
            text = texto,
            fontSize = fontSize
        )
    }
}

//--------------------------------------------------------------------------------------------------
// CAMPO DE TEXTO -> (LoginScreen, RegisterScreen)
//--------------------------------------------------------------------------------------------------
@Composable
fun FormularioGeneral(
    idLabel: Int,
    valorTexto: String,
    onValorCambiado: (String) -> Unit,
    modifier: Modifier = Modifier,
    forma: Shape = RoundedCornerShape(8.dp),
    esContrasena: Boolean = false
) {

    val transformacionVisual = if (esContrasena) {
        PasswordVisualTransformation()
    } else {
        VisualTransformation.None
    }

    TextField(
        value = valorTexto,
        onValueChange = onValorCambiado,
        label = { Text(text = stringResource(id = idLabel), color = Color.White) },
        visualTransformation = transformacionVisual,
        modifier = modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(vertical = 8.dp)
            .border(
                width = 2.dp,
                color = colorResource(R.color.violetaApagado),
                shape = forma
            )
            .background(
                color = colorResource(R.color.azul2),
                shape = forma
            ),
        shape = forma,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            disabledContainerColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            focusedTextColor = colorResource(R.color.vclaroletra),
            unfocusedTextColor = colorResource(R.color.vclaroletra),
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
// BACKGROUND PLANO SUPERIOR -> (ExplorerScreen, ¿¿??)
//--------------------------------------------------------------------------------------------------
@Composable
fun BackgroundPlanoSuperior(
    modifier: Modifier = Modifier,
) {
    Image(
        painter = painterResource(R.drawable.backgroundplanosuperior),
        contentDescription = stringResource(R.string.fondo_plano_superior),
        modifier = modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth
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
    nombreCancion: String
) {
    Text(
        text = nombreCancion,
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
    nombreArtista: String
) {
    Text(
        text = nombreArtista,
        color = colorResource(R.color.violetaClaro),
        modifier = modifier
    )
}

//--------------------------------------------------------------------------------------------------
// EXTO CALIFICACIÓN -> (Contenedor: CardReseñas, ¿¿??)
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
