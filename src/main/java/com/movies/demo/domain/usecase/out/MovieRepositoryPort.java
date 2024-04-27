package com.movies.demo.domain.usecase.out;

import com.movies.demo.domain.entity.Categories;
import com.movies.demo.domain.entity.Movies;

import java.util.List;
import java.util.Optional;

public interface MovieRepositoryPort {

    Movies saveMovie(Movies movie, Categories categories);
    Optional<Movies> findById(Long id);
    List<Movies> findAll();
    Optional<Movies> update(Movies movie);
    boolean deleteById(Long id);
}
