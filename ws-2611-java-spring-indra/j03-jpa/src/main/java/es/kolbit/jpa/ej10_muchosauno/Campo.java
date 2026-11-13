package es.kolbit.jpa.ej10_muchosauno;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "campos")
public class Campo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcampo")
	private int idCampo;
	private String campo;
	private String direccion;
	
	public Campo() {
	}
	
	public Campo(int idCampo, String campo, String direccion) {
		this.idCampo = idCampo;
		this.campo = campo;
		this.direccion = direccion;
	}
	public int getIdCampo() {
		return idCampo;
	}
	public void setIdCampo(int idCampo) {
		this.idCampo = idCampo;
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idCampo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campo other = (Campo) obj;
		return idCampo == other.idCampo;
	}
	@Override
	public String toString() {
		return "Campo (" + idCampo + ", " + campo + ", " + direccion + ")";
	}
	

}
