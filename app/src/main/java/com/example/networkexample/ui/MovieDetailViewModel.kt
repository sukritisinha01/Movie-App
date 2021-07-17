package com.example.networkexample.ui

import android.app.Application
import androidx.lifecycle.*
import com.example.networkexample.data.Movie
import com.example.networkexample.data.MovieDetailRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieDetailViewModel(id: Long, application: Application): ViewModel(){
    private val repo: MovieDetailRepository =
        MovieDetailRepository(application)

    val movie: LiveData<Movie> =
            repo.getMovie(id)
}