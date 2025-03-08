package actividad.deporte.service;

import actividad.deporte.dto.PatrocinadorDTO;
import actividad.deporte.model.Patrocinador;
import actividad.deporte.repository.EquipoRepository;
import actividad.deporte.repository.PatrocinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatrocinadorService {

    @Autowired
    private PatrocinadorRepository patrocinadorRepository;
    @Autowired
    private EquipoRepository equipoRepository;

    public PatrocinadorDTO saveEquipo(PatrocinadorDTO patrocinadorDTO) {
        // Buscar el país usando el ID proporcionado
        Patrocinador equipo = patrocinadorRepository.findById(patrocinadorDTO.getEquipo().getId_equipo())
                .orElseThrow(() -> new RuntimeException("Equipos no encontrado"));

        // Crear un nuevo equipo
        Patrocinador nuevoPatrocinador = new Patrocinador();
            nuevoPatrocinador.setNombre(patrocinadorDTO.getNombre());
        nuevoPatrocinador.setApellido(patrocinadorDTO.getApellido());
        nuevoPatrocinador.setEmail(patrocinadorDTO.getEmail());
        nuevoPatrocinador.setEquipo(patrocinadorDTO.getEquipo());
        nuevoPatrocinador.setEquipo(equipo.getEquipo());

        // Guardar el equipo
        Patrocinador savedPatrocinador = patrocinadorRepository.save(nuevoPatrocinador);

        // Devolver el DTO con el ID del equipo guardado
        patrocinadorDTO.setId_patrocinador(savedPatrocinador.getId_patrocinador());
        return patrocinadorDTO;
    }
}
