package es.fpsumma.dam2.videoclub.persistence.jpa.entity;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.graphql.ConditionalOnGraphQlSchema;

import java.util.List;

@Entity
@Table (name="pelicula")
public class PeliculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false,length = 100)
    private String titulo;

    @Column(name="genero",length=50)
    private String genero;

    @Column(name = "anio_Estreno",nullable = false)
    private Integer anioEstreno;

    @Column(name="puntuacion")
    private double puntuacion;

    @ManyToOne
    @JoinColumn(name="director_id")
    private DirectorEntity director;


    @ManyToMany
    @JoinTable(
            name="pelicula_actor",
            joinColumns = @JoinColumn(name = "pelicula_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private List<ActorEntity> actores;

    @OneToMany(mappedBy = "pelicula")
    private List<AlquilerEntity> alquileres;


}
