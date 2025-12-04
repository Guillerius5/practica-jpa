package es.fpsumma.dam2.videoclub.persistence.jpa.entity;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.graphql.ConditionalOnGraphQlSchema;

@Entity
@Table (name="PELICULAS")
public class PeliculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name="genero")
    private String genero;

    @Column(name = "anio_Estreno")
    private Integer anioEstreno;

    @Column(name="puntuacion")
    private double puntuacion;


    @ManyToOne
    @JoinColumn(name="director_id")
    private DirectorEntity director;


    @ManyToMany(mappedBy = "pelicula")

    )
}
