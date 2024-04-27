package com.movies.demo.infraestructure.entities;

import com.movies.demo.domain.entity.Categories;
import com.movies.demo.domain.entity.Movies;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;

    private String descripcion;

    private int duracion;

    private int puntuacion;

    private Categories categorias;

    public MovieEntity(int id, String titulo, String descripcion, int duracion, int puntuacion, Categories categorias) {
        this.id = id;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.puntuacion =puntuacion;
        this.categorias = categorias;
    }

    public static MovieEntity fromDomainModel(Movies movie){
        return new MovieEntity(movie.getId(), movie.getTitulo(), movie.getDescripcion(), movie.getDuracion(),
                movie.getPuntuacion(), movie.getCategorias());
    }

}
