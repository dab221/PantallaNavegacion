package com.example.pantallanavegacion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pantallanavegacion.screens.ClienteScreen
import com.example.pantallanavegacion.screens.HomeScreen
import com.example.pantallanavegacion.screens.PerfilScreen

@Composable
fun AppNavigation() {                                   // Crea el controlador de navegación
    val navController = rememberNavController()         // Crea variable para el controlador de navegación

    NavHost(                                            // Crea el host de navegación (Contiene todas las pantallas registradas)
        navController = navController,                  // Define el controlador de navegación
        startDestination = Routes.HOME                  // Define la pantalla inicial
    ) {
       composable(Routes.HOME) {                        // Define la ruta de la pantalla
           HomeScreen(navController)                    // Define la pantalla
       }
        composable(Routes.CLIENTES) {
            ClienteScreen(navController)
        }
        composable(Routes.PERFIL) {
            PerfilScreen(navController)
        }
    }
}