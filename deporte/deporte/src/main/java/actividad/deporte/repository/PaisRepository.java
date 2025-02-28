package actividad.deporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import actividad.deporte.model.Pais;

import java.util.Optional;

@Repository
public interface PaisRepository extends JpaRepository< Pais, Long>{

    Optional<Pais> findById(Long id_pais);

}
