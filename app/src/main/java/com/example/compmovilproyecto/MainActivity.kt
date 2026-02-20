package com.example.compmovilproyecto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compmovilproyecto.ui.screens.CreateReviewScreen
import com.example.compmovilproyecto.ui.screens.ExplorerScreen
import com.example.compmovilproyecto.ui.screens.ForYouScreen
import com.example.compmovilproyecto.ui.screens.HomeScreen
import com.example.compmovilproyecto.ui.screens.IconoInferior
import com.example.compmovilproyecto.ui.screens.LoginScreen
import com.example.compmovilproyecto.ui.screens.NotificationScreen
import com.example.compmovilproyecto.ui.screens.ProfileImage
import com.example.compmovilproyecto.ui.screens.ProfileScreen
import com.example.compmovilproyecto.ui.screens.RegisterScreen
import com.example.compmovilproyecto.ui.theme.CompMovilProyectoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Scaffold(
                bottomBar = {
                    FooterScreen()
                }
            ){
                ExplorerScreen(Modifier.padding(it))
            }

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)


@Composable
fun FooterScreen(){
    Box(
        modifier = Modifier
    ){
        Image(
            painter = painterResource(R.drawable.backgroundplanoinferior),
            contentDescription = stringResource(R.string.fondoinferior),
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop
        )
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 15.dp, horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ){
            IconoInferior(
                modifier = Modifier,
                imagenId = R.drawable.casaicono,
                descripcionId = R.string.icono_de_casa,
                nombreIconoId = R.string.icono
            )
            Spacer(modifier = Modifier.width(10.dp))

            IconoInferior(
                modifier = Modifier,
                imagenId = R.drawable.busquedaicono,
                descripcionId = R.string.icono_de_busqueda,
                nombreIconoId = R.string.explorar
            )
            Spacer(modifier = Modifier.width(10.dp))

            IconoInferior(
                modifier = Modifier,
                imagenId = R.drawable.crearicono,
                descripcionId = R.string.icono_de_crear,
                nombreIconoId = R.string.crear
            )
            Spacer(modifier = Modifier.width(10.dp))

            IconoInferior(
                modifier = Modifier,
                imagenId = R.drawable.notificacionicono,
                descripcionId = R.string.icono_de_notificacion,
                nombreIconoId = R.string.notificaciones
            )
            Spacer(modifier = Modifier.width(10.dp))

            IconoInferior(
                modifier = Modifier,
                imagenId = R.drawable.usuarioicono,
                descripcionId = R.string.icono_de_perfil,
                nombreIconoId = R.string.perfil
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
        FooterScreen()
}

