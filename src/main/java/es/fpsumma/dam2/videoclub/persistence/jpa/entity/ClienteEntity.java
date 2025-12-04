package es.fpsumma.dam2.videoclub.persistence.jpa.entity;


import jakarta.persistence.*;

@Entity
@Table(name="cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique=true,name = "nombre")
    private String nombre;

    @Column(name = "mail")
    private String email;

}


