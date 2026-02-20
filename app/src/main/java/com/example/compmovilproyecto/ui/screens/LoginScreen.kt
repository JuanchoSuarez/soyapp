package com.example.compmovilproyecto.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.theme.CompMovilProyectoTheme
import com.example.compmovilproyecto.ui.utils.BackgroundPlano
import com.example.compmovilproyecto.ui.utils.BotonGeneral
import com.example.compmovilproyecto.ui.utils.FormularioGeneral
import com.example.compmovilproyecto.ui.utils.LogoSOY
import com.example.compmovilproyecto.ui.utils.TextoGeneral
import com.example.compmovilproyecto.ui.utils.TextoSOY
import com.example.compmovilproyecto.ui.utils.ReviewCard

@Composable
fun BodyLoginScreen(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.padding(horizontal = 35.dp)
    ){
        Spacer(modifier = Modifier.height(140.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            LogoSOY(modifier = Modifier.size(200.dp))

            Spacer(modifier = Modifier.width(14.dp))

            TextoSOY(tamano = 50.sp, modifier = Modifier.padding(top = 75.dp))
        }
        Spacer(modifier = Modifier.height(60.dp))

        TextoGeneral(
            texto = stringResource(R.string.usuario),
            estilo = TextStyle(fontSize = 15.sp,
                fontWeight = FontWeight.Bold)
        )

        FormularioGeneral(
            idLabel = (R.string.usuario),
            idValue = (R.string.john_doe)
        )

        Spacer(modifier = Modifier.height(16.dp))


        TextoGeneral(
            texto = stringResource(R.string.contrasena),
            estilo = TextStyle(fontSize = 15.sp,
                fontWeight = FontWeight.Bold)
        )

        FormularioGeneral(
            idLabel = (R.string.contrasena),
            idValue = (R.string.contrasena3)
        )

        Spacer(modifier = Modifier.height(50.dp))

        BotonGeneral(texto=stringResource(R.string.crear_cuenta))

    }
}

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
){
    Box(modifier = modifier){
        BackgroundPlano()
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
    CompMovilProyectoTheme {
        LoginScreen()
    }
}

@Composable
@Preview
fun BodyLoginScreenPreview(){
    CompMovilProyectoTheme{
    BodyLoginScreen()
        }
}

@Composable
fun FormularioRegistroUsuario(
    modifier: Modifier = Modifier
    ){
        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = {Text(text = stringResource(R.string.usuario))},
        )

}


@Composable
fun FormularioRegistroContraseña(
    modifier: Modifier = Modifier
){
    OutlinedTextField(
        value = "",
        onValueChange = { /*TODO*/ },
        label = {Text(text = stringResource(R.string.contrasena))},
    )
}
@Preview()
@Composable
fun FormularioRegistroContraseñaPreview(
    modifier: Modifier = Modifier
){
    CompMovilProyectoTheme{
    FormularioRegistroContraseña()
    }
}

@Preview()
@Composable
fun FormularioRegistroUsuarioPreview(
    modifier: Modifier = Modifier
){
    CompMovilProyectoTheme {
        FormularioRegistroUsuario()
    }

}
