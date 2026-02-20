package com.example.compmovilproyecto.ui.data.local

import com.example.compmovilproyecto.R
import com.example.compmovilproyecto.ui.data.Review

object LocalReviewProvider {
    val reviews = listOf(
        Review(
            imageId = R.drawable.personaunoimagen,
            user = "MusicLover",
            fecha = "2023-08-01",
            song = "Midnight City",
            artist = "M83",
            review = "Esta canción es un himno del electropop moderno.",
            rating = 5
        ),
        Review(
            imageId = R.drawable.personadosimagen,
            user = "Sarah_Music",
            fecha = "2023-08-01",
            song = "The Mother We Share",
            artist = "CHVRCHES",
            review = "Increíble, esta canción nunca pasa de moda.",
            rating = 5
        ),
        Review(
            imageId = R.drawable.personaseisimagen,
            user = "Joselito Records",
            fecha = "2025-11-23",
            song = "Sunset",
            artist = "The Midnight",
            review = "Esta canción la rompe mal.",
            rating = 5
        ),
        Review(
            imageId = R.drawable.personacuatroimagen,
            user = "SynthFan99",
            fecha = "2025-12-05",
            song = "Oblivion",
            artist = "Grimes",
            review = "Una joya del electropop oscuro, la línea de bajo es espectacular.",
            rating = 4
        ),
        Review(
            imageId = R.drawable.personacincoimagen,
            user = "AuroraBorealis",
            fecha = "2026-01-10",
            song = "Runaway",
            artist = "AURORA",
            review = "Me transmite demasiada paz. La voz es verdaderamente angelical.",
            rating = 5
        ),
        Review(
            imageId = R.drawable.personaunoimagen,
            user = "NightDriver",
            fecha = "2026-02-14",
            song = "Electricity",
            artist = "The Midnight",
            review = "Perfecta para manejar de noche. El solo de saxofón es inolvidable.",
            rating = 5
        ),
        Review(
            imageId = R.drawable.personadosimagen,
            user = "PopCritic",
            fecha = "2026-02-19",
            song = "Clearest Blue",
            artist = "CHVRCHES",
            review = "El momento en el que la canción explota al final es una locura total.",
            rating = 4
        )
    )
}