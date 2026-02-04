package com.example.pokedexapp_compose.network

import com.example.pokedexapp_compose.utils.Constantes
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {
    val retrofit: APIService by lazy {
        Retrofit
            .Builder()
            .baseUrl(Constantes.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIService::class.java)
    }
}