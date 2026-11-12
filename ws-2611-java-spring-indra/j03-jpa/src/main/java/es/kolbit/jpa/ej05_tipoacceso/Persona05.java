package es.kolbit.jpa.ej05_tipoacceso;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "persona")
public class Persona05 implements Serializable {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPersona;
	private String nombre;
	private String apellidos;
	private String apodo;
	private String dni;
	
	public Persona05() {
		System.out.println("Constructor por defecto de Persona05");
	}

	public Persona05(Integer idPersona, String nombre, String apellidos, String apodo, String dni) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.apodo = apodo;
		this.dni = dni;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		System.out.println("setIdPersona()");
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		System.out.println("setNombre");
		this.nombre = nombre;
	}

	@Column(name = "apellidos")
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Transient
	public String getNombreCompleto() { //nombreCompleto
		return apellidos + ", " + nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPersona);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona05 other = (Persona05) obj;
		return Objects.equals(idPersona, other.idPersona);
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", dni=" + dni + "]";
	}
	
	
}
