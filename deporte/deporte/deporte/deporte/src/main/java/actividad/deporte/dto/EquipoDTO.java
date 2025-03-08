package actividad.deporte.dto;

import actividad.deporte.model.Pais;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipoDTO {
	
		private Long id_equipo;

		private String liga;
		private String division;
		private String nombre;
		private String trofeo;
		private Pais pais;
}
	