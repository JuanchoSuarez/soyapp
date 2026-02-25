package com.example.soyapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.soyapp.R
import com.example.soyapp.ui.utils.BackgroundPlanoSuperior

@Composable
fun HeaderProfileScreen(){
    Box(
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
            Row(){
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
            Column(){
                Row(){
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
fun ProfileScreen() {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            HeaderProfileScreen()
            BodyForYouScreen(
                modifier = Modifier
                    .fillMaxSize()
            )

    }
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

@Composable
@Preview
fun ProfileScreenPreview() {
        ProfileScreen()

}