package es.fpsumma.dam2.videoclub.persistence.jpa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name="actor")
public class ActorEntity {


    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nombre",nullable = false)
    private String nombre;

    @ManyToMany(mappedBy = "actores")
    private List<PeliculaEntity> peliculas;

}
