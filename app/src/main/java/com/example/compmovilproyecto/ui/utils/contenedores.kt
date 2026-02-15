package com.example.compmovilproyecto.ui.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.model.Review

// AQUI SE ENCUENTRAN TODOS LOS CONTENEDORES QUE SE USARAN EN LA APP
// COMO ROW, COLUMN, BOX, CARD Y ETC

//--------------------------------------------------------------------------------------------------
// 1. CARD RESEÑAS -> (ForYouScreen)
//--------------------------------------------------------------------------------------------------
@Composable
fun ReviewCard(
    review: Review,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF2A2340)
        ),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            TextoUsuario(usuario = review.user)
            TextoFecha(fecha = review.fecha)


            Spacer(modifier = Modifier.height(8.dp))

            TextoCancion(cancion = review.song)
            TextoArtista(artista = review.artist)
            Spacer(modifier = Modifier.height(6.dp))
            TextoRating(rating = review.rating)
            Spacer(modifier = Modifier.height(8.dp))
            TextoResena(review = review.review)
        }
    }
}


//--------------------------------------------------------------------------------------------------
// TOP SELECT BUTTON -> (ForYouScreen)
//--------------------------------------------------------------------------------------------------
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
