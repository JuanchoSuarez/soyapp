package com.example.soyapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.soyapp.R


@Composable
fun HeaderCreateReviewScreen(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.backgroundplanosuperior2),
            contentDescription = stringResource(R.string.backgroung_plano_superior_tipo_2)
        )

        Column {
            Image(
                painter = painterResource(R.drawable.flechaizquierdaicono),
                contentDescription = stringResource(R.string.flecha_izquierda),
                modifier = Modifier.size(50.dp)
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

@Composable
fun BarraBusquedaReviewScreen(
    onBack: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.backgroundsoysuperior),
            contentDescription = "background superior"
        )

        Column {
            Spacer(modifier = Modifier.height(20.dp))
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
        }
    }
}


@Composable
fun CreateReviewScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        bottomBar = {
        }
    ) { paddingValores ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValores)
        ) {
            HeaderCreateReviewScreen()
            BarraBusquedaReviewScreen()
            BodyExplorerScreen(
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreateReviewScreenPreview() {

        CreateReviewScreen()


}
