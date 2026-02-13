package com.example.compmovilproyecto.ui

import android.R.color.black
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
fun TextoInicial(
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
fun TextoInicialPreview() {
    TextoInicial(
        mensaje = "Hola")
}


@Composable
fun AppButton(
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
fun AppButtonPreview(){
    AppButton(stringResource(R.string.ingresar))
}

@Composable
fun LogoApp(
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
fun LogoAppPreview() {
    LogoApp(
        idImagen = R.drawable.iconosoy,
        descripcion = "Logo Soy"
    )
}

@Composable
fun BodyLoginScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TextoInicial(
            stringResource(R.string.soy),
            estilo = TextStyle(fontSize = 90.sp,
                fontFamily = FontFamily.Cursive),
            modifier = Modifier.padding(top = 100.dp, bottom = 10.dp))
        LogoApp(
            idImagen = R.drawable.iconosoy,
            descripcion = stringResource(R.string.logo_soy)
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        TextoInicial(
            stringResource((R.string.usuario)),
            estilo = TextStyle(fontSize = 22.sp,
                fontStyle = FontStyle.Italic),
            modifier = Modifier.padding(top = 15.dp, bottom = 10.dp)
        )
        FormularioRegistroUsuario()
        Spacer(
            modifier = Modifier.height(16.dp)
        )

        TextoInicial(
            stringResource((R.string.contrasena)),
            estilo = TextStyle(fontSize = 22.sp,
                fontStyle = FontStyle.Italic),
            modifier = Modifier.padding(top = 15.dp, bottom = 10.dp)
        )
        FormularioRegistroContraseña()
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        AppButton(stringResource(R.string.ingresar),
            color = R.color.violetaApagado
        )
    }
}

@Composable
fun LoginScreen(){
    Box{

        LogoApp(
            idImagen = R.drawable.fondopantallaprincipal,
            descripcion = stringResource(R.string.fondo_pantalla_principal),
            modifier = Modifier.fillMaxSize(),
            escala = ContentScale.Crop
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ){
            BodyLoginScreen()
        }

    }
}

@Composable
@Preview
fun LogicScreenPreview(){
    LoginScreen()
}

@Composable
@Preview
fun BodyLoginScreenPreview(){
    BodyLoginScreen()
}

@Composable
fun FormularioRegistroUsuario(
    modifier: Modifier = Modifier
    ){
        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = {Text(text = "USUARIO")},
        )

}


@Composable
fun FormularioRegistroContraseña(
    modifier: Modifier = Modifier
){
    OutlinedTextField(
        value = "",
        onValueChange = { /*TODO*/ },
        label = {Text(text = "CONTRASEÑA")},
    )
}
@Preview()
@Composable
fun FormularioRegistroContraseñaPreview(
    modifier: Modifier = Modifier
){
    FormularioRegistroContraseña()
}

@Preview()
@Composable
fun FormularioRegistroUsuarioPreview(
    modifier: Modifier = Modifier
){
    FormularioRegistroUsuario()

}
