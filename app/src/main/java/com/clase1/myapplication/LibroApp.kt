package com.clase1.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.clase1.myapplication.catalogo.Libro
import com.clase1.myapplication.data.libros


@Composable
fun LibroApp() {

    var pantalla by remember {
        mutableStateOf("home")
    }

    var libroSeleccionado by remember {
        mutableStateOf<Libro?>(null)
    }

    when (pantalla) {

        "home" -> {

            LibroHomeScreen(
                onVerCatalogo = {
                    pantalla = "catalogo"
                }
            )
        }

        "catalogo" -> {

            LibroCatalogoScreen(
                sillas = libros,

                onSillaClick = { libro ->

                    libroSeleccionado = libro
                    pantalla = "detalle"
                },

                onBack = {
                    pantalla = "home"
                }
            )
        }

        "detalle" -> {

            libroSeleccionado?.let { libro ->

                LibroDetalleScreen(
                    libro = libro,

                    onBack = {
                        pantalla = "catalogo"
                    }
                )
            }
        }
    }
}