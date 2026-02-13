package com.example.compmovilproyecto.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
fun Mensaje(
    mensaje: String,
    color: Color = colorResource(R.color.white),
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
fun MensajePreview() {
    Mensaje(
        mensaje = "Hola")
}


@Composable
fun AppBoton(
    textoBoton: String,
    modifier: Modifier = Modifier
        .fillMaxWidth(0.8f)
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
        Text(text = textoBoton,
            fontSize = 20.sp)
    }
}

@Composable
@Preview
fun AppBotonPreview(){
    AppButton(stringResource(R.string.ingresar))
}

@Composable
fun Logo(
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
@Preview
fun LogoPreview() {
    LogoApp(
        idImagen = R.drawable.iconosoy,
        descripcion = "Logo Soy"
    )
}

@Composable
fun BodyRegistrarScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Mensaje(
            stringResource(R.string.soy),
            estilo = TextStyle(fontSize = 90.sp,
                fontFamily = FontFamily.Cursive),
            modifier = Modifier.padding(top = 100.dp, bottom = 10.dp))
        Logo(
            idImagen = R.drawable.iconosoy,
            descripcion = stringResource(R.string.logo_soy)
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        FormularioRegistro()
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        AppButton(stringResource(R.string.ingresar),
            color = R.color.violetaApagado
        )
    }
}

@Composable
fun RegistrarScreen(){
    Box{

        Logo(
            idImagen = R.drawable.fondopantallaprincipal,
            descripcion = stringResource(R.string.fondo_pantalla_principal),
            modifier = Modifier.fillMaxSize(),
            escala = ContentScale.Crop
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ){
            BodyRegistrarScreen()
        }

    }
}

@Composable
@Preview
fun RegistrarScreenPreview(){
    RegistrarScreen()
}

@Composable
@Preview
fun BodyRegistrarScreenPreview(){
    BodyRegistrarScreen()
}



@Composable
fun FormularioRegistro(
    modifier: Modifier = Modifier
){
    OutlinedTextField(
        value = "",
        onValueChange = { /*TODO*/ },
        label = {Text(text = "Nombre")},
    )
    OutlinedTextField(
        value = "",
        onValueChange = { /*TODO*/ },
        label = {Text(text = "Usuario")},
    )
    OutlinedTextField(
        value = "",
        onValueChange = { /*TODO*/ },
        label = {Text(text = "Email")},
    )
    OutlinedTextField(
        value = "",
        onValueChange = { /*TODO*/ },
        label = {Text(text = "CONTRASEÑA")},
    )
}
@Preview()
@Composable
fun FormularioRegistroPreview(
    modifier: Modifier = Modifier
){
    FormularioRegistro()
}


