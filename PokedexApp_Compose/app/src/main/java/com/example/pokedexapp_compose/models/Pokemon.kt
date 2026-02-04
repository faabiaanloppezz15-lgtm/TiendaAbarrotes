package com.example.pokedexapp_compose.models

data class Pokemon(
    val image_pokemon: String,
    val numero_pokedex: Int,
    val nombre: String,
    val evoluciones: List<String> = emptyList(),
    val tipo:List<String>
)
