package actividad.deporte.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="jugadores")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jugador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_jugador",nullable = false)
	private Long id_jugador;
	@Column(name="nacionalidad",nullable = false)
	private String nacionalidad;
	
	@Column(name="nombre",nullable = false)
	private String nombre;
	
	@Column(name="posicion",nullable = false)
	private String posicion;
	
	@ManyToOne
	@JoinColumn(name="id_equipo",referencedColumnName = "id_equipo")
	private Equipo equipo;
	
	@ManyToOne
	@JoinColumn(name="id_representante",referencedColumnName = "id_representante")
	private Representante representante;

}
