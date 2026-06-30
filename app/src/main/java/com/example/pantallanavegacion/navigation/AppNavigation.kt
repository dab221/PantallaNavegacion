package com.example.pantallanavegacion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pantallanavegacion.screens.ClienteScreen
import com.example.pantallanavegacion.screens.HomeScreen
import com.example.pantallanavegacion.screens.PerfilScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {
       composable(Routes.HOME) {
           HomeScreen(navController)
       }
        composable(Routes.CLIENTES) {
            ClienteScreen(navController)
        }
        composable(Routes.PERFIL) {
            PerfilScreen(navController)
        }
    }
}