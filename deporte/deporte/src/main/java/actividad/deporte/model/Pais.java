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
@Table(name="paises")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pais",nullable = false)
	private Long id_pais;
	
	@Column(name="continente",nullable = false)
	private String continente;
	
	@Column(name="nombre",nullable = false)
	private String nombre;

}
