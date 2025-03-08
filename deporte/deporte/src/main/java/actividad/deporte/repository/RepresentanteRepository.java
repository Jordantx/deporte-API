package actividad.deporte.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import actividad.deporte.model.Representante;
@Repository
public interface RepresentanteRepository extends JpaRepository< Representante, Long> {

	Optional<Representante> findById(Long id_represantes);

}
