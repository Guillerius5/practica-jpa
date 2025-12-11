package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.AlquilerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlquilerRepository extends JpaRepository<AlquilerEntity,Long> {

    List<AlquilerEntity> findByEmail(String email);

    List<AlquilerEntity> findByTitulo(String titulo);

    List<AlquilerEntity> findByFechaDevolucionIsNull();


}
