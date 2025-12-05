package es.fpsumma.dam2.videoclub.persistence.jpa.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "alquileres")
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

    @Column(name="fechaAlquiler",nullable = false)
    private Date fecha_Alquiler;

    @Column(name="fechaDevolucion")
    private Date fecha_devolucion;



}



