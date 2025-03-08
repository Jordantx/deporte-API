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
@Table(name="patrocinadores")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Patrocinador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_patrocinador",nullable = false)
	private Long id_patrocinador;
	
	@Column(name="nombre",nullable = false)
	private String nombre;
	
	@Column(name="apellido",nullable = false)
	private String apellido;
	
	@Column(name="email",nullable = false)
	private String email;
	
	@ManyToOne
	@JoinColumn(name="id_equipo",referencedColumnName = "id_equipo")
	private Equipo equipo;
	
	

	
	
	

	
	
	
	
	

}
