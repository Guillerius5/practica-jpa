package es.fpsumma.dam2.videoclub.persistence.jpa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name="actores")
public class ActorEntity {


    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nombre")
    private String nombre;


    @ManyToMany
    @JoinTable(
            name="pelicula_actor",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "pelicula_id")
    )
    private List<PeliculaEntity> peliculas;
}
