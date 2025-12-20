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

    public List<ActorEntity> getActores() {
        return actores;
    }

    public void setActores(List<ActorEntity> actores) {
        this.actores = actores;
    }

    public List<AlquilerEntity> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<AlquilerEntity> alquileres) {
        this.alquileres = alquileres;
    }

    public Integer getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(Integer anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public DirectorEntity getDirector() {
        return director;
    }

    public void setDirector(DirectorEntity director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
