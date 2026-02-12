package com.example.compmovilproyecto.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
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
    modifier: Modifier = Modifier.fillMaxWidth(0.8f)
        .height(70.dp)
        .padding(vertical = 8.dp),
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

@Composable
@Preview()
fun BotonGeneralPreview(){
    BotonGeneral("Iniciar Sesión")
}

@Composable
fun ImagenGeneral(
    idImagen: Int, // (R.drawable.nombreImagen)
    descripcion: String,
    modifier: Modifier = Modifier.size(250.dp),
    escala: ContentScale = ContentScale.Fit
) {
    Image(
        painter = painterResource(id = idImagen),
        contentDescription = descripcion,
        modifier = modifier,
        contentScale = escala
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
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TextoGeneral(
            stringResource(R.string.soy),
            estilo = TextStyle(fontSize = 90.sp,
                fontFamily = FontFamily.Cursive),
            modifier = Modifier.padding(top = 100.dp, bottom = 10.dp))
        ImagenGeneral(
            idImagen = R.drawable.iconosoy,
            descripcion = stringResource(R.string.logo_soy)
        )
        TextoGeneral(
            stringResource(R.string.live_a_life_you_will_remember),
            estilo = TextStyle(fontSize = 22.sp,
                fontStyle = FontStyle.Italic),
            modifier = Modifier.padding(top = 15.dp, bottom = 10.dp)
            )
        TextoGeneral(
            stringResource(R.string.avicii_the_nights),
            estilo = TextStyle(fontSize = 16.sp,),
            color = colorResource(R.color.violetaClaro),
            modifier = Modifier.padding(top = 5.dp, bottom = 55.dp)
        )
        BotonGeneral(stringResource(R.string.sing_up))
        BotonGeneral(stringResource(R.string.log_in),
            color = R.color.violetaApagado
        )
    }
}

@Composable
fun HomeScreen(){
    Box(){
        ImagenGeneral(
            idImagen = R.drawable.fondopantallaprincipal,
            descripcion = stringResource(R.string.fondo_pantalla_principal),
            modifier = Modifier.fillMaxSize(),
            escala = ContentScale.Crop
        )
        Column(

            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ){
            BodyHomeScreen()
        }

    }
}

@Composable
@Preview()
fun HomeScreenPreview(){
    HomeScreen()
}

@Composable
@Preview()
fun BodyHomeScreenPreview(){
    BodyHomeScreen()
}

