package com.example.compmovilproyecto.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.data.local.LocalReviewProvider
import com.example.compmovilproyecto.ui.utils.BackgroundPlano
import com.example.compmovilproyecto.ui.utils.BackgroundPlanoSuperior
import com.example.compmovilproyecto.ui.utils.FooterExplorerScreen
import com.example.compmovilproyecto.ui.utils.ReviewCard

@Composable
fun HeaderProfileScreen(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        BackgroundPlanoSuperior()

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            ProfileImage(
                imagenId = R.drawable.pinguino,
                descripcionId = R.string.foto_de_perfil
            )
            Text(
                modifier = Modifier.padding(top = 12.dp),
                text =" Music Lover",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier.padding(top = 12.dp),
                text =" @MusicLover",
                color = Color.White,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold
            )
            Row{
                Text(
                    modifier = Modifier.padding(top = 12.dp),
                    text =" 2",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(55.dp))
                Text(
                    modifier = Modifier.padding(top = 12.dp),
                    text =" 234",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(50.dp))
                Text(
                    modifier = Modifier.padding(top = 12.dp),
                    text =" 189",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

            }
            Column{
                Row{
                    Text(
                        modifier = Modifier.padding(top = 12.dp),
                        text ="Resenas",
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.width(40.dp))
                    Text(
                        modifier = Modifier.padding(top = 12.dp),
                        text ="Seguidores",
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.width(40.dp))
                    Text(
                        modifier = Modifier.padding(top = 12.dp),
                        text ="Siguiendo",
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Scaffold(
        bottomBar = {
            FooterExplorerScreen()
        }
    ) { paddingValores ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValores)
        ) {
            HeaderProfileScreen()
            BodyProfileScreen(
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    }
}
@Composable
fun BodyProfileScreen(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        BackgroundPlanoSuperior()
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            ReviewList(modifier = Modifier.weight(1f), textoId = R.string.mis_reseñas)
        }
    }
}
@Preview (showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}

@Composable
fun ReviewList(
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

        items(reviews) { review ->
            ReviewCard(review = review)
            Spacer(modifier = Modifier.height(17.dp))
        }
    }
}
@Composable
fun ProfileImage(
    modifier: Modifier = Modifier,
    imagenId: Int,
    descripcionId: Int,
) {
    Image(
        painter = painterResource(imagenId),
        contentDescription = stringResource(descripcionId),
        modifier = modifier
            .size(125.dp)
            .clip(RoundedCornerShape(20.dp))
            .border(
                width = 1.dp,
                color = colorResource(R.color.violetaClaro),
                shape = RoundedCornerShape(20.dp)
            )
    )
}



@Composable
@Preview
fun ProfileImagePreview() {
    ProfileImage(
        imagenId = R.drawable.pinguino,
        descripcionId = R.string.foto_de_perfil
    )
}

@Composable
@Preview
fun HeaderProfileScreenPreview() {
    HeaderProfileScreen()
}
