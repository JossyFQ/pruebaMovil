package com.clase1.myapplication.catalogo

import androidx.annotation.DrawableRes
data class Libro(
    val id: Int,
    val nombre: String,
    //val imagenUrl: String,
    @DrawableRes val imageResourceId: Int,
    val descripcion: String,
    val precio: Double,
)