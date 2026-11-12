package es.kolbit.jpa.ej03_pk_compuesta;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona_03")
public class Persona03b implements Serializable {

	@EmbeddedId
	private Dni dni;
	
	@Column(name = "nombre")
	private String nombre; 
	
	
	public Dni getDni() {
		return dni;
	}
	public void setDni(Dni dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona03b other = (Persona03b) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Persona03b [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
