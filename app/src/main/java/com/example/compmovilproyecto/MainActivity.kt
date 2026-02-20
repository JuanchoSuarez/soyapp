package com.example.compmovilproyecto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.compmovilproyecto.ui.screens.CreateReviewScreen
import com.example.compmovilproyecto.ui.screens.ExplorerScreen
import com.example.compmovilproyecto.ui.screens.ForYouScreen
import com.example.compmovilproyecto.ui.screens.HomeScreen
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
            CompMovilProyectoTheme()   {
                HomeScreen()
                ForYouScreen()
                RegisterScreen()
                NotificationScreen()
                LoginScreen()
                ExplorerScreen()
                CreateReviewScreen()
                ProfileScreen()
            }
        }
    }
}

