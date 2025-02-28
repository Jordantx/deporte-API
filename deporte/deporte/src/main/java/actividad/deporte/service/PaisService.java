package actividad.deporte.service;

import actividad.deporte.dto.PaisDTO;
import actividad.deporte.model.Pais;
import actividad.deporte.repository.PaisRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public PaisDTO savePais(PaisDTO paisDTO) {
        Pais pais = new Pais();
        pais.setContinente(paisDTO.getContinente());
        pais.setNombre(paisDTO.getNombre());

        Pais savedPais = paisRepository.save(pais);
       paisDTO.setId_pais(savedPais.getId_pais());
        return paisDTO;
    }	
    
    
    
    public List<PaisDTO> getAllPais() {
        List<Pais> pais = paisRepository.findAll();
        return pais.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private PaisDTO convertToDTO(Pais pais) {
        return new PaisDTO(
                pais.getId_pais(),
                pais.getContinente(),
                pais.getNombre()
        );
    }
}
