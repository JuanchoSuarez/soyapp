package com.example.compmovilproyecto.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.data.Song
import com.example.compmovilproyecto.ui.data.local.LocalSongsProvider
import com.example.compmovilproyecto.ui.theme.CompMovilProyectoTheme
import com.example.compmovilproyecto.ui.utils.BackgroundPlanoSuperior
import com.example.compmovilproyecto.ui.utils.BackgroundSOY
import com.example.compmovilproyecto.ui.utils.BotonGeneral
import com.example.compmovilproyecto.ui.utils.FooterExplorerScreen
import com.example.compmovilproyecto.ui.utils.TextoArtista
import com.example.compmovilproyecto.ui.utils.TextoCancion

@Composable
fun FiltroGeneros(
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier
    ) {
        item {
            BotonGeneral(
                modifier = Modifier.padding(horizontal = 4.dp),
                texto = stringResource(R.string.todos),
                fontSize = 14.sp
            )
        }
        item {
            BotonGeneral(
                modifier = Modifier.padding(horizontal = 4.dp),
                texto = stringResource(R.string.electropop),
                color = R.color.violetaApagado,
                fontSize = 14.sp
            )
        }
        item {
            BotonGeneral(
                modifier = Modifier.padding(horizontal = 4.dp),
                texto = stringResource(R.string.synth_pop),
                color = R.color.violetaApagado,
                fontSize = 14.sp
            )
        }
        item {
            BotonGeneral(
                modifier = Modifier.padding(horizontal = 4.dp),
                texto = stringResource(R.string.synthwave),
                color = R.color.violetaApagado,
                fontSize = 14.sp
            )
        }
        item {
            BotonGeneral(
                modifier = Modifier.padding(horizontal = 4.dp),
                texto = stringResource(R.string.dream_pop),
                color = R.color.violetaApagado,
                fontSize = 14.sp
            )
        }
        item {
            BotonGeneral(
                modifier = Modifier.padding(horizontal = 4.dp),
                texto = stringResource(R.string.indie_pop),
                color = R.color.violetaApagado,
                fontSize = 14.sp
            )
        }
    }
}

@Composable
fun BarraBusqueda(
    modifier: Modifier = Modifier,
    valorActual: String,
    onValueChange: (String) -> Unit,
    idPlaceholder: Int = R.string.buscar_placeholder,
    forma: Shape = RoundedCornerShape(8.dp)
) {
    TextField(
        value = valorActual, // Ahora el valor es dinámico
        onValueChange = onValueChange,
        modifier = modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(vertical = 8.dp)
            .border(
                width = 1.dp,
                color = colorResource(R.color.violetaClaro),
                shape = forma
            )
            .background(
                color = colorResource(R.color.azul2),
                shape = forma
            ),

        placeholder = {
            Text(
                text = stringResource(idPlaceholder),
                color = Color.White.copy(alpha = 0.5f)
            )
        },

        shape = forma,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            disabledContainerColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            focusedTextColor = Color.White,
            unfocusedTextColor = Color.White
        )
    )
}

@Composable
fun HeaderExplorerScreen(
    modifier: Modifier = Modifier
) {
    Box (modifier = modifier) {
        BackgroundPlanoSuperior()
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Text(
                modifier = Modifier.padding(top = 12.dp),
                text = stringResource(R.string.explorar_electropop),
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row {
                BotonGeneral(
                    modifier = Modifier.weight(1f),
                    texto = stringResource(R.string.canciones),
                    color = R.color.azulcal,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(10.dp))
                BotonGeneral(
                    modifier = Modifier.weight(1f),
                    texto = stringResource(R.string.artistas),
                    color = R.color.azul2,
                    fontSize = 16.sp
                )
            }

            Spacer(modifier = Modifier.height(9.dp))

            BarraBusqueda(
                modifier = Modifier,
                valorActual = "",
                onValueChange = {}
            )

            Spacer(modifier = Modifier.height(9.dp))

            FiltroGeneros(modifier = Modifier)

        }
    }
}


@Composable
fun SongImage(
    modifier: Modifier = Modifier,
    imagenId: Int,
    descripcionId: Int,
) {
    Image(
        painter = painterResource(imagenId),
        contentDescription = stringResource(descripcionId),
        modifier = modifier
            .size(70.dp)
            .clip(RoundedCornerShape(20.dp))
            .border(
                width = 1.dp,
                color = colorResource(R.color.violetaClaro),
                shape = RoundedCornerShape(20.dp)
            )
    )
}

@Composable
fun GenreTag(
    nombreGenero: String,
    modifier: Modifier = Modifier
) {
    Surface(
        color = colorResource(R.color.grisClaro),
        shape = RoundedCornerShape(50.dp),
        modifier = modifier
            .border(
                width = 1.dp,
                color = colorResource(R.color.violetaClaro),
                shape = RoundedCornerShape(50.dp),
            )
    ) {
        Text(
            text = nombreGenero,
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
        )
    }
}

@Composable
fun SongContent(
    modifier: Modifier = Modifier,
    cancion: Song
) {
    Column (
        modifier = modifier
    ){
        TextoCancion(nombreCancion = cancion.nombre)

        Spacer(modifier = Modifier.height(5.dp))

        TextoArtista(nombreArtista = cancion.artista)

        Spacer(modifier = Modifier.height(5.dp))

        Row {
            GenreTag(nombreGenero = cancion.genero)
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = cancion.duracion,
                color = colorResource(R.color.vclaroletra),
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}

@Composable
fun SongCard(
    modifier: Modifier = Modifier,
    cancion: Song
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.vclaro)
        ),
        modifier = modifier
            .height(100.dp)
    ) {
        Row(
            modifier = Modifier.padding(18.dp)
        ) {
            SongImage(
                imagenId = cancion.imagenId,
                descripcionId = R.string.logo_midnight_city
            )
            Spacer(modifier = Modifier.width(14.dp))
            SongContent(modifier = modifier, cancion = cancion)
        }
    }
}

@Composable
fun BodyExplorerScreen(
    modifier: Modifier = Modifier // Ahora recibe el modificador
) {
    val allSongs = LocalSongsProvider.songs

    Box(modifier = modifier) {
        BackgroundSOY()
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(allSongs.size) { index ->
                SongCard(
                    modifier = Modifier.fillMaxWidth(),
                    cancion = allSongs[index]
                )
            }
        }
    }
}


@Composable
fun IconoInferior(
    modifier: Modifier = Modifier,
    imagenId: Int,
    descripcionId: Int,
    nombreIconoId: Int
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(imagenId),
            contentDescription = stringResource(descripcionId),
            modifier = Modifier.size(30.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = stringResource(nombreIconoId),
            color = Color.White,
            fontSize = 13.sp
        )
    }

}

@Composable
fun ExplorerScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier,
        bottomBar = {
            FooterExplorerScreen()
        }
    ) { paddingValores ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValores)
        ) {
            HeaderExplorerScreen()
            BodyExplorerScreen(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )
        }
    }
}


@Composable
@Preview
fun BackgroundSuperior() {
    BackgroundPlanoSuperior()
}

@Composable
@Preview
fun BotonGeneralPreview() {
    BotonGeneral(
        modifier = Modifier, texto = "Artista",
        color = R.color.violetaApagado
    )
}

@Composable
@Preview
fun BarraBusquedaPreview() {
    BarraBusqueda(
        modifier = Modifier,
        valorActual = "",
        onValueChange = {}
    )
}

@Composable
@Preview
fun SongImagePreview() {
    SongImage(
        imagenId = R.drawable.midnight_city,
        descripcionId = R.string.logo_midnight_city
    )
}

@Composable
@Preview
fun GenreTagPreview() {
    GenreTag(nombreGenero = "Synth-pop")
}

@Composable
@Preview
fun SongContentPreview() {
    val example = LocalSongsProvider.songs[0]
    SongContent(
        cancion = example
    )
}

@Composable
@Preview
fun SongCardPreview() {
    val example = LocalSongsProvider.songs[0]
    SongCard(
        cancion = example
    )
}

@Composable
@Preview
fun FiltroGenerosPreview() {
    FiltroGeneros(modifier = Modifier)
}

@Composable
@Preview
fun HeaderExplorerScreenPreview() {
    HeaderExplorerScreen()
}

@Composable
@Preview
fun BodyExplorerScreenPreview() {
    BodyExplorerScreen()
}

@Composable
@Preview
fun IconoInferiorPreview() {

    IconoInferior(
        modifier = Modifier,
        imagenId = R.drawable.casaicono,
        descripcionId = R.string.icono_de_casa,
        nombreIconoId = R.string.icono
    )
}

@Composable
@Preview
fun FooterExplorerScreenPreview() {
    FooterExplorerScreen()
}

@Composable
@Preview
fun ExplorerScreenPreview() {
    CompMovilProyectoTheme {
        ExplorerScreen()
    }
}


