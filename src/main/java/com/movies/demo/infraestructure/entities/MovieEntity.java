package com.movies.demo.infraestructure.entities;

import com.movies.demo.domain.entity.Categories;
import com.movies.demo.domain.entity.Movies;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;

    private String descripcion;

    private int duracion;

    private int puntuacion;

    private Categories categorias;

    public static MovieEntity fromDomainModel(Movies movie){
        return new MovieEntity(movie.getId(), movie.getTitulo(), movie.getDescripcion(), movie.getDuracion());
    }

}
