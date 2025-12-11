package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.PeliculaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Repository
public interface PeliculaRepository extends JpaRepository<PeliculaEntity,Long> {


    List<PeliculaEntity> findByNombreDirector(String nombreDirector);

    List<PeliculaEntity> findByGenero(String genero);

    List<PeliculaEntity> findByPuntuacionGreaterThanEqual(double puntuacion);

    @Query("SELECT p FROM PeliculaEntity p JOIN p.actores a WHERE a.nombre = :nombreActor")
    List<PeliculaEntity> buscarPorActorPorNombre(@Param("nombreActor")String nombreActor);

    Page<PeliculaEntity> findByGeneroNombre(String generoNombre, Pageable pageable);

    List <PeliculaEntity> findByAnioEstrenoDesc();
    List <PeliculaEntity> findByAnioEstrenoAsc();

    List <PeliculaEntity> findByPuntuacionDesc();
    List <PeliculaEntity> findByPuntuacionAsc();

}
