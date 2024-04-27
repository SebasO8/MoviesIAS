package com.movies.demo.application.services;

import com.movies.demo.domain.entity.Categories;
import com.movies.demo.domain.entity.Movies;
import com.movies.demo.domain.usecase.CreateMovie;

public class MoviesServices implements CreateMovie {

    private final CreateMovie createMovie;

    public MoviesServices(CreateMovie createMovie) {
        this.createMovie = createMovie;
    }


    @Override
    public Movies createMovie(Movies movies, Categories categories) {
        return createMovie.createMovie(movies, categories);
    }
}
