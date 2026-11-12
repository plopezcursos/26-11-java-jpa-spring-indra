package es.kolbit.jpa.ej03_pk_compuesta;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona_03")
@IdClass(Dni.class)
public class Persona03 implements Serializable {

	@Id
	@Column(name = "nrodoc")
	private Integer nroDoc;
	
	@Id
	@Column(name = "letradoc")
	private char letraDoc; 
	
	@Column(name = "nombre")
	private String nombre; 
	
	
	public Integer getNroDoc() {
		return nroDoc;
	}
	public void setNroDoc(Integer nroDoc) {
		this.nroDoc = nroDoc;
	}
	public char getLetraDoc() {
		return letraDoc;
	}
	public void setLetraDoc(char letraDoc) {
		this.letraDoc = letraDoc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona03 [nroDoc=" + nroDoc + ", letraDoc=" + letraDoc + ", nombre=" + nombre + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Character.valueOf(letraDoc), nroDoc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona03 other = (Persona03) obj;
		return letraDoc == other.letraDoc && Objects.equals(nroDoc, other.nroDoc);
	}


}
