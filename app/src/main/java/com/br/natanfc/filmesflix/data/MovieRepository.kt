package com.br.natanfc.filmesflix.data

class MovieRepository(private val movieDatasource: MovieDatasource) {

    fun getAllMoviesFromDataSource() = movieDatasource.getAllMovies()

}