package com.br.natanfc.filmesflix.implementations

import android.util.Log
import com.br.natanfc.filmesflix.data.MovieDatasource
import com.br.natanfc.filmesflix.domain.Movie
import com.br.natanfc.filmesflix.framework.api.MovieRestApiTask

class MovieDataSourceImplementation(private val movieRestApiTask: MovieRestApiTask) :
    MovieDatasource {

    companion object {
        const val TAG = "MovieRepository"
    }

    private val movieList = arrayListOf<Movie>()

    override fun getAllMovies(): List<Movie> {
        val request = movieRestApiTask.retrofitApi().getAllMovies().execute()

        if (request.isSuccessful) {
            request.body()?.let {
                movieList.addAll(it)
            }
        } else {
            request.errorBody()?.let {
                Log.d(TAG, it.toString())
            }
        }

        return movieList
    }

}