package com.example.compmovilproyecto.ui.utils

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.ui.model.Song

// card para mostrar cada cancion en la lista
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
                text = cancion.titulo,
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

@Preview(showBackground = true)
@Composable
fun SongCardPreview() {
    SongCard(cancion = Song("Midnight City", "M83"))
}