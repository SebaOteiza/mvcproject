package cl.infoclub.fsj.entidades;

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
@Table(name="forma_pago")
public class FormaDePago {


	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFormaDePago;
	
	private String descripcion;
	
	private double recargo;
}
