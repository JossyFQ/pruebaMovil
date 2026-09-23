package com.clase1.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clase1.myapplication.catalogo.Libro
import com.clase1.myapplication.data.libros
import com.clase1.myapplication.ui.theme.MyApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LibroDetalleScreen(
    onBack: () -> Unit,
    libro: Libro
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Detalle")
                },
                navigationIcon = {
                    TextButton(
                        onClick = onBack
                    ) {
                        Text("Atrás")
                    }
                }
            )
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(24.dp)
        ) {

            Text(
                text = libro.nombre,
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(modifier = Modifier.height(12.dp))
            Text("Imagen: ${libro.imageResourceId}")

            Spacer(modifier = Modifier.height(16.dp))
            Text("Descripción: ${libro.descripcion}")

            Spacer(modifier = Modifier.height(12.dp))
            Text("Precio: $${libro.precio}")


        }
    }
}

@Preview(showBackground = true)
@Composable
fun LibroDetallePreview() {

    MyApplicationTheme {
        LibroDetalleScreen(
            libro = libros[0],
            onBack = {}
        )
    }
}