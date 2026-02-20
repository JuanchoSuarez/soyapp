package com.example.compmovilproyecto.ui.screens

import android.util.Log
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
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

@Composable
fun BodyRegisterScreen(modifier: Modifier = Modifier) {
    
    var textoNombre by remember { mutableStateOf("") }
    var textoUsuario by remember { mutableStateOf("") }
    var textoEmail by remember { mutableStateOf("") }
    var textoContrasena by remember { mutableStateOf("") }

    Column (
        modifier = modifier.padding(horizontal = 35.dp)
    ){
        Spacer(modifier = Modifier.height(60.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            LogoSOY(modifier = Modifier.size(200.dp))

            Spacer(modifier = Modifier.width(14.dp))

            TextoSOY(tamano = 50.sp, modifier = Modifier.padding(top = 75.dp))
        }
        Spacer(modifier = Modifier.height(16.dp))

        TextoGeneral(
            texto = stringResource(R.string.nombre_completo),
            estilo = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold)
        )

        FormularioGeneral(
            idLabel = R.string.nombre2,
            valorTexto = textoNombre,
            onValorCambiado = { nuevoTexto -> textoNombre = nuevoTexto }
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextoGeneral(
            texto = stringResource(R.string.usuario),
            estilo = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold)
        )

        FormularioGeneral(
            idLabel = R.string.usuario2,
            valorTexto = textoUsuario,
            onValorCambiado = { nuevoTexto -> textoUsuario = nuevoTexto }
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextoGeneral(
            texto = stringResource(R.string.email3),
            estilo = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold)
        )

        FormularioGeneral(
            idLabel = R.string.email2,
            valorTexto = textoEmail,
            onValorCambiado = { nuevoTexto -> textoEmail = nuevoTexto }
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextoGeneral(
            texto = stringResource(R.string.contrasena),
            estilo = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold)
        )

        FormularioGeneral(
            idLabel = R.string.contrase_a2,
            valorTexto = textoContrasena,
            onValorCambiado = { nuevoTexto -> textoContrasena = nuevoTexto },
            esContrasena = true // Se activa la seguridad visual únicamente en este campo
        )

        Spacer(modifier = Modifier.height(30.dp))

        BotonGeneral(
            texto = stringResource(R.string.crear_cuenta),
            onClick = {
                Log.d("RegisterScreen", "Nombre: $textoNombre")
                Log.d("RegisterScreen", "Usuario: $textoUsuario")
                Log.d("RegisterScreen", "Usuario: $textoUsuario")
                Log.d("RegisterScreen", "Contraseña: $textoContrasena")
            }
        )


    }
}

@Composable
fun RegisterScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        BackgroundPlano()
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ){
            BodyRegisterScreen()
        }
    }
}

@Composable
@Preview
fun RegisterScreenPreview(){
    CompMovilProyectoTheme {
        RegisterScreen()
    }
}