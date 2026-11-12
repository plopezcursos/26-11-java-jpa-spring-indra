package es.kolbit.jpa.ej04_insertable;

import java.io.Serializable;
import java.util.Objects;

import es.kolbit.jpa.ej02_nombres_enum.Genero;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona_04")
public class Persona04 implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpersona")
	private Integer idPersona;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "apodo")
	private String apodo;
	
	@Column(name = "dni")
	private String dni;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "genero")
	private Genero sexo;
	
	@Embedded
	@AttributeOverride(name = "tipoVia", column = @Column(name = "tipo_via"))
	@AttributeOverride(name = "codigoPostal", column = @Column(name = "codigo_postal"))
	private Domicilio domicilio;
	
	public Persona04() {
	}

	public Persona04(Integer idPersona, String nombre, String apellidos, String apodo, String dni) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.apodo = apodo;
		this.dni = dni;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Genero getSexo() {
		return sexo;
	}

	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
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
		Persona04 other = (Persona04) obj;
		return Objects.equals(idPersona, other.idPersona);
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", dni=" + dni + "]";
	}
	
	
}
