package cl.infoclub.fsj.entidades;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "inscripcion")
public class Inscripcion {

	@Id
	@Column(name = "id_inscripcion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // para que el id sea autoincremental
	private int idInscripcion;
	
	// cuando el nombre del atributo de la entidad y el
	// nombre de la columna de la tabla, se puede eliminar
	// el paréntesis con el name después de @Column
	@Basic
	@Column
	private String nombre;
	
	@Basic
	@Column
	private int telefono;
	
	@Basic
	@Column(name = "id_curso")
	private int idCurso;
	
	@Basic
	@Column(name = "id_forma_pago")
	private int idFormaPago;
	
}
