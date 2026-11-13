package es.kolbit.jpa.ej08_unoauno;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contacto")
public class Contacto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcontacto")
	private Integer idContacto;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "apodo")
	private String apodo;
	
	@OneToOne
	@JoinColumn(name = "iddomicilio")
	private DomicilioContacto domicilio;
	
	public Contacto() {
	}

	public Contacto(Integer idContacto, String nombre, String apellidos, String apodo, String dni) {
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.apodo = apodo;
	}


	public Integer getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

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

	public DomicilioContacto getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(DomicilioContacto domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idContacto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(idContacto, other.idContacto);
	}

	@Override
	public String toString() {
		return "Persona [idContacto=" + idContacto + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + "]";
	}
	
	
}
