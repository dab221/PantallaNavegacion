package com.example.pantallanavegacion.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.pantallanavegacion.navigation.Routes

@Composable
fun ClienteScreen(
    navController: NavController
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().padding()
    ) {
        Text(
            text = "Pantalla Clientes\nBienvenido",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
        Button(onClick = {
            navController.navigate(Routes.PERFIL)
        }
        ) {
            Text("Ir a Perfil")
        }
        Button(onClick = {
            navController.popBackStack()
        })
        {
            Text("Volver")
        }
    }
}