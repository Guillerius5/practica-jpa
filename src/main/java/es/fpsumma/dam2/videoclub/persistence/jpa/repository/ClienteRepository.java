package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.ClienteEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity,Long> {


    Optional<ClienteEntity> findByEmail(String email);

    boolean existsByEmail(String email);

    Page<ClienteEntity> findAll(Pageable pageable);
}
