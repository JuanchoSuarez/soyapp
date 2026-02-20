package com.example.compmovilproyecto.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.PersonAddAlt1
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.model.Notification
import com.example.compmovilproyecto.ui.utils.BackgroundPlano

@Composable
fun NotificationScreen(
    modifier: Modifier = Modifier
) {
    val violeta = colorResource(R.color.violetaClaro)

    var notifications by remember {
        mutableStateOf(
            listOf(
                Notification("1","sarah_music","FOLLOW","comenzó a seguirte","Hace 745 días",false),
                Notification("2","carlos_beats","LIKE","le gustó tu reseña de \"Midnight City\"","Hace 745 días",false),
                Notification("3","ana_songs","COMMENT","comentó en tu reseña de \"The Mother We Share\"","Hace 745 días",true),
                Notification("4","david_tunes","LIKE","le gustó tu reseña de \"Genesis\"","Hace 746 días",true)
            )
        )
    }

    val nuevas = notifications.count { !it.estaLeida }

    Column(modifier.fillMaxSize()) {

        // HEADER MORADO
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(violeta.copy(alpha = 0.9f))
                .padding(20.dp)
        ) {
            Column {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    Text(
                        stringResource(R.string.notificaciones),
                        color = Color.White,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Box(
                        modifier = Modifier
                            .border(1.dp, Color.White, RoundedCornerShape(20.dp))
                            .padding(horizontal = 14.dp, vertical = 6.dp)
                    ) {
                        Text(
                            "$nuevas nuevas",
                            color = Color.White
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = stringResource(R.string.marcar_todas_como_le_das),
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(top = 6.dp)
                )
            }
        }

        // LISTA NOTIFICACIONES:
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            items(notifications) { notif ->

                Card(
                    shape = RoundedCornerShape(22.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF2A2340).copy(alpha = 0.85f)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            1.dp,
                            violeta.copy(alpha = 0.4f),
                            RoundedCornerShape(22.dp)
                        )
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        // Avatar simple con inicial
                        Box(
                            modifier = Modifier
                                .size(56.dp)
                                .border(3.dp, violeta, CircleShape)
                                .background(Color.White.copy(alpha = 0.1f), CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                notif.idUsuario.first().uppercase(),
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Spacer(modifier = Modifier.width(14.dp))

                        Column(modifier = Modifier.weight(1f)) {

                            Text(
                                text = "${notif.idUsuario} ${notif.mensaje}",
                                color = Color.White,
                                fontSize = 16.sp
                            )

                            Spacer(modifier = Modifier.height(6.dp))

                            Text(
                                text = notif.fechaNotificacion,
                                color = violeta,
                                fontSize = 14.sp
                            )
                        }

                        val icon = when (notif.tipo) {
                            "FOLLOW" -> Icons.Outlined.PersonAddAlt1
                            "COMMENT" -> Icons.Outlined.ChatBubbleOutline
                            else -> Icons.Outlined.FavoriteBorder
                        }

                        Icon(
                            imageVector = icon,
                            contentDescription = notif.tipo,
                            tint = violeta,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NotificationScreenPreview() {
    BackgroundPlano()
    NotificationScreen()
}