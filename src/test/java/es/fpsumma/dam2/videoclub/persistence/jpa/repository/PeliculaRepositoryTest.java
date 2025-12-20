package es.fpsumma.dam2.videoclub.persistence.jpa.repository;


import es.fpsumma.dam2.videoclub.persistence.jpa.entity.PeliculaEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@ActiveProfiles("test")
public class PeliculaRepositoryTest {



   @Autowired
    private PeliculaRepository peliculaRepository;

    @Test
    void deberiaEncontrarPeliculasPorGenero(){
        List<PeliculaEntity> resultado = peliculaRepository.findByGenero("Drama");

        assertThat(resultado).isNotNull();

        assertThat(resultado).allSatisfy(pelicula -> {
            assertThat(pelicula.getGenero().equals("Drama")).isTrue();
        });
    }

    @Test
    void deberiaEncontrarPeliculaPorActorPorNombreQuery(){

        String nombreBuscado="Leonardo DiCaprio";

        List<PeliculaEntity> resultado = peliculaRepository.buscarPorActorPorNombre("Nolan");
        assertThat(resultado).isNotEmpty();

      assertThat(resultado.get(0).getId()).isNotNull();

      assertThat(resultado).allSatisfy(pelicula -> {
          boolean tieneAlActor = pelicula.getActores().stream()
                  .anyMatch(actor->actor.getNombre().equals(nombreBuscado));
          assertThat(tieneAlActor).isTrue();
      });


    }

}
