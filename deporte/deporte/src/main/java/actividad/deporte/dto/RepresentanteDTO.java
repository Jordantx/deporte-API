package actividad.deporte.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 	
public class RepresentanteDTO {

	private Long id_represantes;
	private String nombre;
	private String apellido;
}
