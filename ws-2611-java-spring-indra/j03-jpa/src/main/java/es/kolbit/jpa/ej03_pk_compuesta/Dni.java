package es.kolbit.jpa.ej03_pk_compuesta;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Dni implements Serializable {

	private Integer nroDoc;
	private char letraDoc;

	public Dni(Integer nroDoc, char letraDoc) {
		this.nroDoc = nroDoc;
		this.letraDoc = letraDoc;
	}
	
	public Dni() {
	}
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
		Dni other = (Dni) obj;
		return letraDoc == other.letraDoc && Objects.equals(nroDoc, other.nroDoc);
	}
	@Override
	public String toString() {
		return "Dni [nroDoc=" + nroDoc + ", letraDoc=" + letraDoc + "]";
	}

}
