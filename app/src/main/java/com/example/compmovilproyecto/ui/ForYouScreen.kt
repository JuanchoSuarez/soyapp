package com.example.compmovilproyecto.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R

data class Review(
    val user: String,
    val song: String,
    val artist: String,
    val review: String,
    val rating: Int
)


@Composable
fun TopSelectorButtons() {

    var selected by remember { mutableStateOf(0) }

    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        listOf("Para Ti", "Seguidos", "Novedades").forEachIndexed { index, title ->

            val isSelected = selected == index

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(
                        if (isSelected)
                            colorResource(R.color.violetaClaro)
                        else
                            Color.White.copy(alpha = 0.1f)
                    )
                    .clickable { selected = index }
                    .padding(horizontal = 18.dp, vertical = 10.dp)
            ) {
                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }
    }
}


@Composable
fun ReviewCard(review: Review) {

    Card(
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF2A2340)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(
                text = review.user,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = review.song,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            Text(
                text = review.artist,
                color = colorResource(R.color.violetaClaro)
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "⭐".repeat(review.rating) + " ${review.rating}/5",
                color = Color.Yellow
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = review.review,
                color = Color.White,
                fontSize = 14.sp
            )
        }
    }
}


@Composable
fun ReviewsList() {

    val reviews = listOf(
        Review(
            stringResource(R.string.musiclover),
            stringResource(R.string.midnight_city),
            stringResource(R.string.m83),
            stringResource(R.string.esta_canci_n_es_un_himno_del_electropop_moderno),
            5
        ),
        Review(
            stringResource(R.string.sarah_music),
            stringResource(R.string.the_mother_we_share),
            stringResource(R.string.chvrches),
            stringResource(R.string.incre_ble_esta_canci_n_nunca_pasa_de_moda),
            5
        )
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {

        item {
            Text(
                text = stringResource(R.string.rese_as_recomendadas_para_ti),
                color = Color.White,
                fontSize = 14.sp,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }

        items(reviews) { review ->
            ReviewCard(review)
        }

        item {
            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}


@Composable
fun BodyForYouScreen() {

    Column {

        TopSelectorButtons()

        ReviewsList()
    }
}


@Composable
fun ForYouScreen() {

    Box {

        ImagenGeneral(
            idImagen = R.drawable.fondodeforyouscreen,
            descripcion = stringResource(R.string.fondo_for_you),
            modifier = Modifier.fillMaxSize(),
            escala = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            TextoGeneral(
                mensaje = "SOY",
                estilo = androidx.compose.ui.text.TextStyle(
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(start = 16.dp, top = 40.dp)
            )

            BodyForYouScreen()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun ForYouScreenPreview() {
    ForYouScreen()
}

@Preview(showBackground = true)
@Composable
fun ReviewCardPreview() {
    ReviewCard(
        Review(
            "musiclover",
            "Midnight City",
            "M83",
            "Review ejemplo...",
            5
        )
    )
}

