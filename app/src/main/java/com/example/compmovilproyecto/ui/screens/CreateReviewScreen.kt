package com.example.compmovilproyecto.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.model.Song
import com.example.compmovilproyecto.ui.utils.BackgroundPlano
import com.example.compmovilproyecto.ui.utils.SongCard

// canciones de ejemplo
val canciones = listOf(
    Song("The Mother We Share", "CHVRCHES"),
    Song("Oblivion", "Grimes"),
    Song("Sunset", "The Midnight"),
    Song("Runaway", "AURORA"),
    Song("Something Comforting", "Porter Robinson"),
    Song("Midnight City", "M83")
)

// lista con buscador arriba
@Composable
fun SongsList(
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {

    var busqueda by remember { mutableStateOf("") }

    // filtra por titulo o artista
    val filtradas = canciones.filter {
        it.titulo.contains(busqueda, ignoreCase = true) ||
                it.artista.contains(busqueda, ignoreCase = true)
    }

    Column(modifier = modifier.fillMaxSize()) {

        // boton atras y titulo de la pantalla
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 8.dp, top = 8.dp, bottom = 4.dp)
        ) {
            IconButton(onClick = { onBack() }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "volver",
                    tint = Color.White
                )
            }
            Text(
                text = stringResource(R.string.crear_resena),
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        // label del buscador
        Text(
            text = stringResource(R.string.buscar_cancion),
            color = Color.White,
            fontSize = 13.sp,
            modifier = Modifier.padding(start = 16.dp, bottom = 4.dp)
        )

        // campo de texto para buscar
        OutlinedTextField(
            value = busqueda,
            onValueChange = { busqueda = it },
            placeholder = {
                Text(
                    text = stringResource(R.string.buscar_cancion_o_artista),
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = Color.Gray
                )
            },
            singleLine = true,
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Gray,
                focusedBorderColor = Color.White,
                unfocusedTextColor = Color.White,
                focusedTextColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // lista de canciones
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            items(filtradas) { cancion ->
                Spacer(modifier = Modifier.height(10.dp))
                SongCard(cancion = cancion)
            }
        }
    }
}

// pantalla principal con el fondo
@Composable
fun CreateReviewScreen(
    onBack: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        BackgroundPlano()
        SongsList(onBack = onBack)
    }
}

@Preview(showBackground = true)
@Composable
fun CreateReviewScreenPreview() {
    CreateReviewScreen()
}