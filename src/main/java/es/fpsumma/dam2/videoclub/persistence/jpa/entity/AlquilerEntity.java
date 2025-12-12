package es.fpsumma.dam2.videoclub.persistence.jpa.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "alquiler")
public class AlquilerEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="cliente_id",nullable = false)
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name="peliculas_id",nullable = false)
    private PeliculaEntity pelicula;

    @Column(name="fecha_alquiler", nullable = false) //
    private Date fechaAlquiler;

    @Column(name="fecha_devolucion")
    private Date fechaDevolucion;



}



