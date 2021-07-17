package com.br.natanfc.filmesflix.data

import com.br.natanfc.filmesflix.domain.Movie

interface MovieDatasource {

    fun getAllMovies(): List<Movie>

}