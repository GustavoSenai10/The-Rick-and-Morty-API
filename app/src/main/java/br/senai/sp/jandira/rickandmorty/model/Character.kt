package br.senai.sp.jandira.rickandmorty.model

data class Character(
    val Id: Long,
    val name: String,
    val status: String,
    val species: String,
    val image: String,
    val location: Location,
    val origin: Origin
)
