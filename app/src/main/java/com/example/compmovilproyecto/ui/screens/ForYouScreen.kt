package com.example.compmovilproyecto.ui.screens

import androidx.benchmark.traceprocessor.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
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
import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.data.local.LocalReviewProvider
import com.example.compmovilproyecto.ui.utils.BackgroundPlano
import com.example.compmovilproyecto.ui.utils.BotonGeneral
import com.example.compmovilproyecto.ui.utils.LogoSOY
import com.example.compmovilproyecto.ui.utils.ReviewCard
import com.example.compmovilproyecto.ui.utils.TextoSOY
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.layout.fillMaxWidth

@Composable
fun HeaderForYouScreen(
    modifier: Modifier = Modifier
) {
    Box() {
        Image(
            painter = painterResource(R.drawable.backgroundplanosuperior3),
            contentDescription = stringResource(R.string.background_superior)
        )
        Column(
            modifier = modifier.padding(horizontal = 16.dp, vertical = 10.dp)
        ) {
            Spacer(modifier = Modifier.height(15.dp))
            Row() {
                Spacer(modifier = Modifier.width(9.dp))
                TextoSOY(tamano = 45.sp)
                Spacer(modifier = Modifier.width(12.dp))
                LogoSOY(modifier = Modifier.size(57.dp))
            }
            Spacer(modifier = Modifier.height(10.dp))

            Row(
            ) {
                Spacer(modifier = Modifier.width(5.dp))
                BotonGeneral(
                    texto = "Para ti",
                    modifier = Modifier.padding(horizontal = 6.dp),
                    fontSize = 14.sp,
                    color = R.color.azulcal
                )
                BotonGeneral(
                    texto = "Seguidos",
                    modifier = Modifier.padding(horizontal = 6.dp),
                    fontSize = 14.sp,
                    color = R.color.violetaClaro
                )
                BotonGeneral(
                    texto = "Novedades",
                    modifier = Modifier.padding(horizontal = 6.dp),
                    fontSize = 14.sp,
                    color = R.color.violetaClaro
                )
            }
        }
    }
}

@Composable
fun ReviewsList(
    modifier: Modifier = Modifier,
    textoId: Int
) {
    val reviews = LocalReviewProvider.reviews

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {

        item {
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = stringResource(textoId),
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier.padding(bottom = 12.dp),
                fontWeight = FontWeight.Bold
            )
        }


                itemsIndexed(reviews) { index, review ->

                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {

                        ReviewCard(review = review)

                        Spacer(modifier = Modifier.height(10.dp))

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 6.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {


                            // Likes y comentarios dinámicos según posición
                            Image(
                                painter = painterResource(
                                    when (index) {
                                        0 -> R.drawable.primerimagenlikesycomentarios
                                        1 -> R.drawable.segundobotonlikesycomentarios
                                        2 -> R.drawable.tercerbotondelikesycomentarios
                                        else -> R.drawable.primerimagenlikesycomentarios
                                    }
                                ),
                                contentDescription = "Likes y comentarios",
                                modifier = Modifier.height(34.dp)
                            )

                            // Editar / borrar
                            Image(
                                painter = painterResource(R.drawable.editaryborrarbotones),
                                contentDescription = "Editar y borrar",
                                modifier = Modifier.height(34.dp)
                            )
                        }

                        Spacer(modifier = Modifier.height(17.dp))
                    }
                }
    }
}

@Composable
fun BodyForYouScreen(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        BackgroundPlano()
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            ReviewsList(modifier = Modifier.weight(1f), textoId = R.string.rese_as_recomendadas_para_ti)
        }
    }
}

@Composable
fun ForYouScreen() {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            HeaderForYouScreen()
            BodyForYouScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            )
        }
    }


@Preview(showBackground = true)
@Composable
fun ForYouScreenPreview() {
    /*
    CompMovilProyectoTheme {
        ForYouScreen()
    }
    */
     ForYouScreen()
}