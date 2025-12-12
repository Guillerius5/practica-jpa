package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.PeliculaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface PeliculaRepository extends JpaRepository<PeliculaEntity,Long> {


    List<PeliculaEntity> findByDirectorNombre(String nombreDirector);

    List<PeliculaEntity> findByGenero(String genero);

    List<PeliculaEntity> findByPuntuacionGreaterThanEqual(double puntuacion);

    @Query("SELECT p FROM PeliculaEntity p JOIN p.actores a WHERE a.nombre = :nombreActor")
    List<PeliculaEntity> buscarPorActorPorNombre(@Param("nombreActor")String nombreActor);

    Page<PeliculaEntity> findByGenero(String genero, Pageable pageable);

    List <PeliculaEntity> findAllByOrderByAnioEstrenoDesc();
    List <PeliculaEntity> findAllByOrderByAnioEstrenoAsc();

    List <PeliculaEntity> findAllByOrderByPuntuacionDesc();
    List <PeliculaEntity> findAllByOrderByPuntuacionAsc();

}
