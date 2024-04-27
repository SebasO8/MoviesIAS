package com.movies.demo.domain.entity;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
@Getter
@Setter
public class Movies {
    private int id;

    private String titulo;

    private String descripcion;

    private int duracion;

    private int puntuacion;

    private Categories categorias;

}
