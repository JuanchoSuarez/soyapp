package com.example.compmovilproyecto.ui.data.local

import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.data.Review

object LocalReviewProvider {
    val reviews = listOf(
        Review(
            imageId = R.drawable.personaunoimagen,
            editId = R.drawable.edit,
            deleteId = R.drawable.delete,
            user = "MusicLover",
            fecha = "2023-08-01",
            song = "Midnight City",
            artist = "M83",
            review = "Esta canción es un himno del electropop moderno.Beats potentes, sintetizadores vibrantes y una vibra futurista.Perfecta para subir el volumen y dejarse llevar.Una explosión de ritmo que define toda una generación.",
            rating = 5,
            likesId = R.drawable.likes,
            comments = R.drawable.comments
        ),
        Review(
            imageId = R.drawable.personadosimagen,
            editId = R.drawable.edit,
            deleteId = R.drawable.delete,
            user = "Sarah_Music",
            fecha = "2023-08-01",
            song = "The Mother We Share",
            artist = "CHVRCHES",
            review = "¡Increíble! Esta canción nunca pasa de moda. Desde el primer segundo te atrapa con su energía.Es de esas que puedes escuchar mil veces y siempre se siente nueva.Un clásico eterno que vive en cualquier playlist.",
            rating = 5,
            likesId = R.drawable.likes,
            comments = R.drawable.comments
        ),
        Review(
            imageId = R.drawable.personaseisimagen,
            editId = R.drawable.edit,
            deleteId = R.drawable.delete,
            user = "Joselito Records",
            fecha = "2025-11-23",
            song = "Sunset",
            artist = "The Midnight",
            review = "Esta canción la rompe mal.Tiene una actitud brutal y un flow que no perdona.Desde el coro hasta el último drop, pura adrenalina. Imposible escucharla y quedarse quieto.",
            rating = 5,
            likesId = R.drawable.likes,
            comments = R.drawable.comments
        ),
        Review(
            imageId = R.drawable.personacuatroimagen,
            editId = R.drawable.edit,
            deleteId = R.drawable.delete,
            user = "SynthFan99",
            fecha = "2025-12-05",
            song = "Oblivion",
            artist = "Grimes",
            review = "Una joya del electropop oscuro, la línea de bajo es espectacular. Los sintetizadores crean una atmósfera envolvente que te atrapa desde el primer segundo. Tiene ese equilibrio perfecto entre misterio y energía que la hace imposible de ignorar. Cada escucha revela nuevos detalles que la vuelven aún más especial..",
            rating = 4,
            likesId = R.drawable.likes,
            comments = R.drawable.comments
        ),
        Review(
            imageId = R.drawable.personacincoimagen,
            editId = R.drawable.edit,
            deleteId = R.drawable.delete,
            user = "AuroraBorealis",
            fecha = "2026-01-10",
            song = "Runaway",
            artist = "AURORA",
            review = "Me transmite demasiada paz. La voz es verdaderamente angelical. Cada nota se siente suave y profunda al mismo tiempo, como si abrazara el alma. La instrumental acompaña con delicadeza, creando una atmósfera íntima y envolvente.Es de esas canciones que escuchas con los ojos cerrados y simplemente respiras..",
            rating = 5,
            likesId = R.drawable.likes,
            comments = R.drawable.comments
        ),
        Review(
            imageId = R.drawable.personaunoimagen,
            editId = R.drawable.edit,
            deleteId = R.drawable.delete,
            user = "NightDriver",
            fecha = "2026-02-14",
            song = "Electricity",
            artist = "The Midnight",
            review = "Perfecta para manejar de noche. El solo de saxofón es inolvidable. Tiene esa energía retro que combina perfectamente con las luces de la ciudad y la carretera vacía. Cada beat acompaña el trayecto como si fuera la banda sonora de una película. Es imposible no subir el volumen y dejarse llevar por la atmósfera que crea.",
            rating = 5,
            likesId = R.drawable.likes,
            comments = R.drawable.comments

        ),
        Review(
            imageId = R.drawable.personadosimagen,
            editId = R.drawable.edit,
            deleteId = R.drawable.delete,
            user = "PopCritic",
            fecha = "2026-02-19",
            song = "Clearest Blue",
            artist = "CHVRCHES",
            review = "El momento en el que la canción explota al final es una locura total. Todo va construyéndose poco a poco hasta que llega ese clímax que te eriza la piel. La energía se dispara y sientes que la canción te envuelve por completo. Es de esos finales que obligan a repetirla una y otra vez.",
            rating = 4,
            likesId = R.drawable.likes,
            comments = R.drawable.comments
        )
    )
}