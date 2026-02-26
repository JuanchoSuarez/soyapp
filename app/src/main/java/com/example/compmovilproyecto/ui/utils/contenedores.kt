package com.example.compmovilproyecto.ui.utils

import androidx.compose.foundation.Image
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
import androidx.glance.preview.Preview
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
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(review.imageId),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    TextoUsuario(usuario = review.user)
                    TextoFecha(fecha = review.fecha)
                }
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(review.editId),
                    contentDescription = null,
                    modifier = Modifier
                        .size(25.dp)
                        .clip(CircleShape)

                )

                Spacer(modifier = Modifier.width(14.dp))

                Image(
                    painter = painterResource(review.deleteId),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)

                )
            }
        }
        Column(
            modifier = Modifier
        ) {
            TextoCancion(nombreCancion = review.song)
            TextoArtista(nombreArtista = review.artist)
            Spacer(modifier = Modifier.height(6.dp))
            TextoRating(rating = review.rating)
            Spacer(modifier = Modifier.height(8.dp))
            TextoResena(review = review.review)
            Spacer(modifier = Modifier.height(15.dp))
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
                Image(
                    painter = painterResource(review.likesId),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)

                )

                Image(
                    painter = painterResource(review.comments),
                    contentDescription = null,
                    modifier = Modifier
                        .size(25.dp)
                        .clip(CircleShape)
                )
                    Text(
                        text = "Comentar",
                        color = Color.White,
                        fontSize = 12.sp,)
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

@Composable
fun SettingsActionCard(
    title: String,
    subtitle: String,
    iconRes: Int,
    backgroundColor: Color,
    iconBoxColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val shape = RoundedCornerShape(22.dp)

    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape)
            .background(backgroundColor.copy(alpha = 0.80f))
            .clickable { onClick() }
            .padding(18.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Caja del icono
        Box(
            modifier = Modifier
                .size(54.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(iconBoxColor.copy(alpha = 0.75f)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(iconRes),
                contentDescription = null,
                modifier = Modifier.size(28.dp),
                contentScale = ContentScale.Fit
            )
        }

        Spacer(Modifier.width(16.dp))

        Column {
            androidx.compose.material3.Text(
                text = title,
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.height(2.dp))
            androidx.compose.material3.Text(
                text = subtitle,
                color = Color.White.copy(alpha = 0.75f),
                fontSize = 14.sp
            )
        }
    }
}


//--------------------------------------------------------------------------------------------------
// FOOTER GENERAL -> (Todas las principales)
//--------------------------------------------------------------------------------------------------
