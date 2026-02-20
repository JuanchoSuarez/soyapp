package com.example.compmovilproyecto.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.model.Review
import com.example.compmovilproyecto.ui.utils.BackgroundPlano
import com.example.compmovilproyecto.ui.utils.ReviewCard
import com.example.compmovilproyecto.ui.utils.TextoGeneral
import com.example.compmovilproyecto.ui.utils.TopSelectorButtons

@Composable
fun ReviewsList(
    modifier: Modifier = Modifier
) {

    val reviews = listOf(
        Review(
            
            stringResource(R.string.musiclover),
            "2023-08-01",
            stringResource(R.string.midnight_city),
            stringResource(R.string.m83),
            stringResource(R.string.esta_canci_n_es_un_himno_del_electropop_moderno),
            5
        ),

        Review(
            stringResource(R.string.sarah_music),
            "2023-08-01",
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
                modifier = Modifier.padding(vertical = 12.dp)
            )
        }

        items(reviews) { review ->
            Spacer(modifier = Modifier.height(20.dp))
            ReviewCard(review)
        }

    }
}


@Composable
fun BodyForYouScreen(
    modifier: Modifier = Modifier
) {

    Column {
        TopSelectorButtons()
        ReviewsList()
    }
}


@Composable
fun ForYouScreen(
    modifier: Modifier = Modifier
) {

    Box {
        BackgroundPlano()
        Column(
        ) {
            TextoGeneral(
                texto = "SOY",
                estilo = TextStyle(
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
            "2023-08-01",
            "Midnight City",
            "M83",
            "Review ejemplo...",
            5
        )
    )
}