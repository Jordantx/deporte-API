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
@Table(name="equipos")
@Data
@AllArgsConstructor //me genera metodo con parametros
@NoArgsConstructor //me genera metodo vacio

public class Equipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_equipo",nullable = false)
	private Long id_equipo;
	@Column(name="liga",nullable = false)
	private String liga;
	@Column(name="division",nullable = false)
	private String division;
	@Column(name="nombre",nullable = false)
	private String nombre;
	@Column(name="trofeo",nullable = false)
	private String trofeo;
	
	
	@ManyToOne
	@JoinColumn(name="id_pais",referencedColumnName = "id_pais")
	private Pais pais;
	

}
