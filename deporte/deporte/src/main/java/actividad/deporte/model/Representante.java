package actividad.deporte.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="representates")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Representante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_representante",nullable = false)
	private Long id_represantes;
	@Column(name="nombre",nullable = false)
	private String nombre;
	@Column(name="apellido",nullable = false)
	private String apellido;

}
