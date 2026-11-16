package es.kolbit.ejerciciojpa.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado extends Persona {
	private static final long serialVersionUID = 1L;

	private int nroEmpleado;
	
	@ManyToOne
	@JoinColumn(name = "idcategoria")
	private Categoria categoria;

	public Empleado(){
	}
	
	public int getNroEmpleado() {
		return nroEmpleado;
	}

	public void setNroEmpleado(int nroEmpleado) {
		this.nroEmpleado = nroEmpleado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Empleado [" + nroEmpleado + ", " + categoria + ", " + getIdPersona() + ", " + getApellidos() + "]";
	}

}
