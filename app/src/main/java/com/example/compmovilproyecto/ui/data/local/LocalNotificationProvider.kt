package com.example.compmovilproyecto.ui.data.local

import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.data.Notificacion

object LocalNotificationProvider {
    val notificaciones = listOf(
        Notificacion(
            imagenPerfilId = R.drawable.personaunoimagen,
            nombreUsuario = "sarah_music",
            textoAccion = "comenzo a seguirte",
            tiempo = "Hace 745 dias",
            iconoDerechoId = R.drawable.usuarioicono,
        ),
        Notificacion(
            imagenPerfilId = R.drawable.personadosimagen,
            nombreUsuario = "carlos_beats",
            textoAccion = "le gusto tu resena de \"Midnight City\"",
            tiempo = "Hace 745 dias",
            iconoDerechoId = R.drawable.corazonicono,
        ),
        Notificacion(
            imagenPerfilId = R.drawable.personatresimagen,
            nombreUsuario = "ana_songs",
            textoAccion = "comento en tu resena de \"The Mother We Share\"",
            tiempo = "Hace 745 dias",
            iconoDerechoId = R.drawable.usuarioicono,
        ),
        Notificacion(
            imagenPerfilId = R.drawable.personacuatroimagen,
            nombreUsuario = "david_tunes",
            textoAccion = "le gustó tu reseña de \"Genesis\"",
            tiempo = "Hace 746 dias",
            iconoDerechoId = R.drawable.corazonicono,
        )
    )
}