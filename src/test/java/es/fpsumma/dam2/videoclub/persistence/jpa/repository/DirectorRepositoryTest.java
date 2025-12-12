package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.DirectorEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
class DirectorRepositoryTest {

    @Autowired
    private DirectorRepository directorRepository;

    @Test
    void deberiaEncontrarDirectorPorNombre() {

        Optional<DirectorEntity> resultado= directorRepository.findByNombre("Christopher Nolan");
        assertThat(resultado).isPresent();
        assertThat(resultado.get().getNombre()).isEqualTo("Christopher Nolan");
    }

    @Test
    void deberiaComprobarExistenciaExistenciaPorNombre() {

        boolean existe= directorRepository.existsByNombre("Christopher Nolan");
        assertThat(existe).isTrue();
    }

    @Test
    void deberiaComprobarDirectorPorNombreQuery() {

       List<DirectorEntity> resultado = directorRepository.findDirectoresByNombre("Christopher Nolan");
        assertThat(resultado).hasSize(1);
        assertThat(resultado.get(0).getNombre()).isEqualTo("Christopher Nolan");
    }

}
