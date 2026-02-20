package com.example.compmovilproyecto.ui.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.data.Review
import com.example.compmovilproyecto.ui.data.Song
import com.example.compmovilproyecto.ui.screens.IconoInferior

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
            containerColor = MaterialTheme.colorScheme.primary
        ),
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {

            Image(
                painter = painterResource(review.imageId),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column {
                TextoUsuario(usuario = review.user)
                TextoFecha(fecha = review.fecha)
            }
        }

        Column (
            modifier = Modifier.padding(horizontal = 14.dp)
        ) {
            TextoCancion(nombreCancion = review.song)
            TextoArtista(nombreArtista = review.artist)
            Spacer(modifier = Modifier.height(6.dp))
            TextoRating(rating = review.rating)
            Spacer(modifier = Modifier.height(8.dp))
            TextoResena(review = review.review)
            Spacer(modifier = Modifier.height(15.dp))
        }
    }
}

//--------------------------------------------------------------------------------------------------
// CARD PARA MOSTRAR CANCION -> (CreateReviewScreen)
//--------------------------------------------------------------------------------------------------
@Composable
fun SongCard(cancion: Song) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1C2A)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            // nombre de la cancion
            Text(
                text = cancion.nombre,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            // artista
            Text(
                text = cancion.artista,
                color = Color.Gray,
                fontSize = 13.sp
            )
        }
    }
}


//--------------------------------------------------------------------------------------------------
// FOOTER GENERAL -> (Todas las principales)
//--------------------------------------------------------------------------------------------------
