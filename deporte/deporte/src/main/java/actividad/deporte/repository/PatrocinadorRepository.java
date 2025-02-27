package actividad.deporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import actividad.deporte.model.Patrocinador;
@Repository
public interface PatrocinadorRepository extends JpaRepository< Patrocinador, Long>{

}
