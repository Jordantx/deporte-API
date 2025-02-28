package actividad.deporte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import actividad.deporte.dto.EquipoDTO;
import actividad.deporte.model.Equipo;
import actividad.deporte.model.Pais;
import actividad.deporte.repository.EquipoRepository;
import actividad.deporte.repository.PaisRepository;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private PaisRepository paisRepository;


    public EquipoDTO saveEquipo(EquipoDTO equipoDTO) {  // Buscar el país usando el ID proporcionado
    Pais pais = paisRepository.findById(equipoDTO.getPais().getId_pais())
            .orElseThrow(() -> new RuntimeException("País no encontrado"));

    // Crear un nuevo equipo
    Equipo nuevoEquipo = new Equipo();
    nuevoEquipo.setLiga(equipoDTO.getLiga());
    nuevoEquipo.setDivision(equipoDTO.getDivision());
    nuevoEquipo.setNombre(equipoDTO.getNombre());
    nuevoEquipo.setTrofeo(equipoDTO.getTrofeo());
    nuevoEquipo.setPais(pais);

    // Guardar el equipo
    Equipo savedEquipo =    equipoRepository.save(nuevoEquipo);

    // Devolver el DTO con el ID del equipo guardado
    equipoDTO.setId_equipo(savedEquipo.getId_equipo());
    return equipoDTO;
    }	
}
