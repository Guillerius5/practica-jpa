package es.fpsumma.dam2.videoclub.persistence.jpa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "director")
public class DirectorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "director")
    private List<PeliculaEntity> peliculas;



    // ===== Constructores =====
    public DirectorEntity(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public DirectorEntity() {
    }


    // ===== Getters y setters =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
