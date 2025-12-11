package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.DirectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DirectorRepository extends JpaRepository<DirectorEntity, Long> {


    Optional<DirectorEntity> findByNombre(String nombre);

    boolean existsByNombre(String nombre);

    @Query ("SELECT d FROM DirectorEntity d WHERE d.nombre = :nombre")
    List<DirectorEntity> findDirectoresByNombre(@Param("nombre") String nombre);


    List<DirectorEntity>findAllByOrderByNombreAsc();
    
    List<DirectorEntity> findAllByOrderByNombreDesc();
}
