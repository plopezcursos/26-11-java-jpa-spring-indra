package es.kolbit.jpa.ej10_muchosauno;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "partidos")
public class Partido2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpartido")
	private int idPartido;
	
	private String partido;
	
	@ManyToOne
	@JoinColumn(name = "idcampo")
	private Campo campo;
	
	public Partido2() {
	}
	
	public Partido2(int idPartido, String partido, Campo campo) {
		this.idPartido = idPartido;
		this.partido = partido;
		this.campo = campo;
	}
	public int getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public Campo getCampo() {
		return campo;
	}
	public void setCampo(Campo campo) {
		this.campo = campo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idPartido);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido2 other = (Partido2) obj;
		return idPartido == other.idPartido;
	}
	@Override
	public String toString() {
		return "Partido (" + idPartido + ", " + partido + ", " + campo + ")";
	}
	

}
