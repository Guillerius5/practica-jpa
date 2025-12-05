package es.fpsumma.dam2.videoclub.persistence.jpa.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "mail",nullable = false,unique = true)
    private String email;

    @OneToMany(mappedBy = "director")
    private List<AlquilerEntity> alquileres;
}


