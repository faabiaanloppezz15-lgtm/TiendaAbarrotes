package com.example.pokedexapp_compose.network.response

import com.example.pokedexapp_compose.models.Pokemon

data class PokemoResponse(
    val lisaPokemon: List<Pokemon>
)
