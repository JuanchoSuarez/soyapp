package com.example.compmovilproyecto.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.theme.CompMovilProyectoTheme
import com.example.compmovilproyecto.ui.utils.BackgroundPlano
import com.example.compmovilproyecto.ui.utils.BotonGeneral
import com.example.compmovilproyecto.ui.utils.LogoSOY
import com.example.compmovilproyecto.ui.utils.LogoSOY
import com.example.compmovilproyecto.ui.utils.TextoGeneral

@Composable
fun BodyHomeScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 35.dp)
    ){
        Spacer(modifier = Modifier.height(115.dp))

        TextoGeneral(
            texto = stringResource(R.string.soy),
            estilo = TextStyle(fontSize = 90.sp,
                fontFamily = FontFamily.Cursive),
        )

        Spacer(modifier = Modifier.height(6.dp))

        LogoSOY()

        Spacer(modifier = Modifier.height(6.dp))

        TextoGeneral(
            texto = stringResource(R.string.live_a_life_you_will_remember),
            estilo = TextStyle(fontSize = 22.sp,
                fontStyle = FontStyle.Italic),
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextoGeneral(
            texto = stringResource(R.string.avicii_the_nights),
            estilo = TextStyle(fontSize = 18.sp,),
            color = colorResource(R.color.violetaClaro),
        )

        Spacer(modifier = Modifier.height(50.dp))

        BotonGeneral(texto = stringResource(R.string.ingresar))

        Spacer(modifier = Modifier.height(4.dp))

        BotonGeneral(texto = stringResource(R.string.registrar),
            color = R.color.violetaApagado
        )
    }
}

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
){
    Box(modifier = Modifier.fillMaxSize()){
        BackgroundPlano()
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ){
            BodyHomeScreen()
        }
    }
}

@Composable
@Preview
fun HomeScreenPreview(){
    CompMovilProyectoTheme {
        HomeScreen()
    }
}