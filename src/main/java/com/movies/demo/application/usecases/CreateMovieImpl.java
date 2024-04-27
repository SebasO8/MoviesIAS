package com.movies.demo.application.usecases;

import com.movies.demo.domain.entity.Categories;
import com.movies.demo.domain.entity.Movies;
import com.movies.demo.domain.usecase.CreateMovie;
import com.movies.demo.domain.usecase.out.MovieRepositoryPort;

public class CreateMovieImpl implements CreateMovie {

    private final MovieRepositoryPort movieRepositoryPort;


    public CreateMovieImpl(MovieRepositoryPort movieRepositoryPort) {
        this.movieRepositoryPort = movieRepositoryPort;
    }

    @Override
    public Movies createMovie(Movies movie, Categories categories){
        return movieRepositoryPort.saveMovie(movie, categories);
    }
}
