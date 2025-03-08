package actividad.deporte.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaisDTO {

	private Long id_pais;	
	private String continente;
	private String nombre;

}
