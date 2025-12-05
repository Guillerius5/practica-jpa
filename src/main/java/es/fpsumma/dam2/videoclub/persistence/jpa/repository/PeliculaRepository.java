package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<PeliculaEntity,Long> {
}
