package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.CharacterList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterService {

    //https://rickandmortyapi.com/api/
    @GET("character")
    fun getCharacter(): Call<CharacterList>

    @GET ("character/{id}")
    fun getCharacterById(@Path("id") id:Long):Call<br.senai.sp.jandira.rickandmorty.model.Character>

    @GET("character/")
    fun getCharacterByPage(@Query("page")pageNumber: Int):Call<CharacterList>

    //https://rickandmortyapi.com/api/character/?name=rick&status=alive
    @GET("characters/")
    fun getCharactrByNameAndStatus(
        @Query("name") name: String,
        @Query("status") status:String)
        :Call<CharacterList>
}

