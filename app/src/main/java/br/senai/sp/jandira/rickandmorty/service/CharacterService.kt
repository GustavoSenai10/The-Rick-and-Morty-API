package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.CharacterList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {

    //https://rickandmortyapi.com/api/
    @GET("character")
    fun getCharacter(): Call<CharacterList>

    @GET ("character/{id}")
    fun getCharacterById(@Path("id") id:Long):Call<br.senai.sp.jandira.rickandmorty.model.Character>
}

