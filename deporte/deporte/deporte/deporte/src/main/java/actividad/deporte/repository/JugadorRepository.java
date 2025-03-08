package actividad.deporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import actividad.deporte.model.Jugador;
@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long>{
    //Optional<Representante> findById(Long id_represantes);
}
