package actividad.deporte.dto;

import actividad.deporte.model.Equipo;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PatrocinadorDTO {

	private Long id_patrocinador;
	
	private String nombre;
	
	private String apellido;
	
	private String email;
	
	
	private Equipo equipo;
}
