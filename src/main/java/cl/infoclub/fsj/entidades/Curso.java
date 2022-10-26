package cl.infoclub.fsj.entidades;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "curso")


public class Curso {
	
	@Id
	@Column(name = "id_curso")
	private int idCurso;
	
	
	@Basic
	@Column(name = "descripcion")
	private String descripcion;
	
	
	@Basic
	@Column(name = "precio")
	private double precio;
	

}
