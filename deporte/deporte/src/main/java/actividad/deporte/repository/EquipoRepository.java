package actividad.deporte.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import actividad.deporte.model.Equipo;
import actividad.deporte.model.Pais;
@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long>{

	Optional<Equipo> findById(Long id_equipo);
}
