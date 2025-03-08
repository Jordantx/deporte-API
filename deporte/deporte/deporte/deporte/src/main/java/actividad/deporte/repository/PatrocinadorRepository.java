package actividad.deporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import actividad.deporte.model.Patrocinador;

import java.util.Optional;

@Repository
public interface PatrocinadorRepository extends JpaRepository< Patrocinador, Long>{
    Optional<Patrocinador> findById(Long id_patrocinador);
}
