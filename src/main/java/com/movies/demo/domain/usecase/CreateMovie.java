package com.movies.demo.domain.usecase;

import com.movies.demo.domain.entity.Categories;
import com.movies.demo.domain.entity.Movies;

public interface CreateMovie {

    Movies createMovie(Movies movies, Categories categories);
}
