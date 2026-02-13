package com.example.compmovilproyecto.ui

import android.R.color.black
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
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
fun Mensaje(
    frase: String
){
    Text(
        "${frase}",
        fontSize = 20.sp
    )
}
@Composable
@Preview(showBackground = true)
fun MensajePreview(){
    Mensaje("SOY")
}


@Composable
fun LogoApp(){
    Image(
        painter = painterResource(R.drawable.iconosoy),
        contentDescription = "Logo de la app",
        modifier = Modifier.size(48.dp)
    )
}

@Composable
@Preview(showBackground = true, backgroundColor =black)
fun LogoAppPreview(){
    LogoApp()
}
@Composable
fun AppButton(
    textoBoton: String
) {
    Button(
        onClick = { /*TODO*/ }
    ) {
    Text(textoBoton)
    }
}

@Composable
@Preview(showBackground = true)
fun AppButtonPreview(){
    AppButton(" Ingresar")
}

@Composable
fun BodyLoginScreen(){
    Row{
        LogoApp()
        Mensaje("SOY")
    }
    Column {
        AppButton("Ingresar")

    }

}
