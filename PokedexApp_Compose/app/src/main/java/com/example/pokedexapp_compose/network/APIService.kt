package com.example.pokedexapp_compose.network

import com.example.pokedexapp_compose.network.response.PokemoResponse
import  retrofit2.Response
import retrofit2.http.GET

interface APIService {
    @GET("pokemon_150.json")
    suspend fun obtenerPokemons()
    : Response<PokemoResponse>
}   