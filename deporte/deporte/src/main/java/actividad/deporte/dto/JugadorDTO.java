package actividad.deporte.dto;

import actividad.deporte.model.Equipo;
import actividad.deporte.model.Representante;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JugadorDTO {

	private Long id_jugador;
	private String nacionalidad;
	
	private String nombre;
	
	private String posicion;
	
	private Equipo equipo;

	private Representante representante;

}
