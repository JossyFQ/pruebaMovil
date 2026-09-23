package com.clase1.myapplication.catalogo

data class Libro(
    val id: Int,
    val nombre: String,
    val imagenUrl: String,
    val descripcion: String,
    val precio: Double,
)