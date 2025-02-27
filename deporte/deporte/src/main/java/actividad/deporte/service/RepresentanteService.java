package actividad.deporte.service;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import actividad.deporte.dto.RepresentanteDTO;
import actividad.deporte.model.Representante;
import actividad.deporte.repository.RepresentanteRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RepresentanteService {

	@Autowired
	private RepresentanteRepository representanteRepository;

	public RepresentanteDTO saveRepresentante(RepresentanteDTO representanteDTO) {
		Representante representante = new Representante();
		representante.setNombre(representanteDTO.getNombre());
		representante.setApellido(representanteDTO.getApellido());

		Representante savedRepresentante = representanteRepository.save(representante);
		representanteDTO.setId_represantes(savedRepresentante.getId_represantes());
		return representanteDTO;
	}

	public List<RepresentanteDTO> getAllRepresentantes() {
		List<Representante> representantes = representanteRepository.findAll();
		return representantes.stream()
				.map(this::convertToDTO)
				.collect(Collectors.toList());
	}

	private RepresentanteDTO convertToDTO(Representante representante) {
		return new RepresentanteDTO(
				representante.getId_represantes(),
				representante.getNombre(),
				representante.getApellido()
		);
	}







}