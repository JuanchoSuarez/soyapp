package com.example.compmovilproyecto.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.utils.BackgroundSOY
import com.example.compmovilproyecto.ui.utils.SettingsActionCard

@Composable
fun DeleteProfileScreen(
    onBack: () -> Unit = {},
    onLogout: () -> Unit = {},
    onDeleteConfirmed: (deleteReviews: Boolean) -> Unit = {}
) {
    var showDeleteDialog by remember { mutableStateOf(false) }
    var deleteReviews by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize()) {
        BackgroundSOY()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 18.dp, vertical = 22.dp)
        ) {
            // Header simple
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(R.drawable.flechaizquierdaicono),
                    contentDescription = "Volver",
                    modifier = Modifier
                        .size(34.dp)
                        .clickable { onBack() },
                    contentScale = ContentScale.Fit
                )

                Spacer(Modifier.width(12.dp))

                Text(
                    text = "Configuración",
                    color = Color.White,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(Modifier.height(26.dp))

            // Card: Cerrar Sesión
            SettingsActionCard(
                title = "Cerrar Sesión",
                subtitle = "Salir de tu cuenta",
                iconRes = R.drawable.cerrarsesionmorado,
                backgroundColor = Color(0xFF3A325A),
                iconBoxColor = Color(0xFF4C3C76),
                onClick = onLogout
            )

            Spacer(Modifier.height(18.dp))

            // Card: Eliminar Cuenta
            SettingsActionCard(
                title = "Eliminar Cuenta",
                subtitle = "Eliminar permanentemente tu cuenta",
                iconRes = R.drawable.papeleraroja,
                backgroundColor = Color(0xFF6A1E1E),
                iconBoxColor = Color(0xFF7B2A2A),
                onClick = {
                    deleteReviews = false
                    showDeleteDialog = true
                }
            )
        }

        if (showDeleteDialog) {
            AlertDialog(
                onDismissRequest = { showDeleteDialog = false },
                title = { Text("Eliminar cuenta") },
                text = {
                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        Text("Esta acción es irreversible. ¿Seguro que deseas eliminar tu cuenta?")

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Checkbox(
                                checked = deleteReviews,
                                onCheckedChange = { deleteReviews = it }
                            )
                            Spacer(Modifier.width(8.dp))
                            Text("Eliminar también todas mis reseñas")
                        }
                    }
                },
                confirmButton = {
                    TextButton(
                        onClick = {
                            showDeleteDialog = false
                            onDeleteConfirmed(deleteReviews)
                        }
                    ) { Text("Sí, eliminar") }
                },
                dismissButton = {
                    TextButton(onClick = { showDeleteDialog = false }) {
                        Text("Cancelar")
                    }
                }
            )
        }
    }
}

/* -------- PREVIEWS -------- */

@Preview(showBackground = true)
@Composable
fun DeleteProfileScreenPreview() {
    DeleteProfileScreen()
}