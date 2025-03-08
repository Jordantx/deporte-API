package actividad.deporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import actividad.deporte.model.Equipo;

import java.util.Optional;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long>{
    Optional<Equipo> findById(Long id_equipo);
}
