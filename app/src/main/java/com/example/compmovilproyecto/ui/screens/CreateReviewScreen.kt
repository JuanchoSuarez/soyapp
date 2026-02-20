package com.example.compmovilproyecto.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.utils.BackgroundPlano
import com.example.compmovilproyecto.ui.utils.BackgroundSOY
import com.example.compmovilproyecto.ui.utils.FooterExplorerScreen
import com.example.compmovilproyecto.ui.utils.SongCard


@Composable
fun HeaderCreateReviewScreen(
    modifier: Modifier = Modifier
) {
    Box(){
        Image(
            painter = painterResource(R.drawable.backgroundplanosuperior2),
            contentDescription = stringResource(R.string.backgroung_plano_superior_tipo_2)
        )
        
        Column() {
            Image(
                painter = painterResource(R.drawable.flechaizquierdaicono),
                contentDescription = stringResource(R.string.flecha_izquierda),
                modifier = Modifier
                    .size(50.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = stringResource(R.string.crear_rese_a),
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)
            )
        }
    }
}

/*

// pantalla principal con el fondo
@Composable
fun CreateReviewScreen(
    onBack: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {

        Column {
            HeaderCreateReviewScreen()
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = stringResource(R.string.buscar_cancion2),
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 17.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            BarraBusqueda(
                modifier = Modifier.padding(horizontal = 16.dp),
                valorActual = "",
                onValueChange = {}
            )
            Spacer(modifier = Modifier.height(2.dp))
            BodyExplorerScreen()

        }
    }
}
*/

@Composable
fun CreateReviewScreen() {
    Scaffold(
        bottomBar = {
        }
    ) { paddingValores ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValores)
        ) {
            HeaderCreateReviewScreen()
            BodyExplorerScreen(
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreateReviewScreenPreview() {
    CreateReviewScreen()
}