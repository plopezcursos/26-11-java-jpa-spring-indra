

import java.io.Serializable;
import java.util.Objects;

public class Partido implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idPartido;
	private String partido;
	private Campo campo;
	
	public Partido() {
	}
	
	public Partido(int idPartido, String partido, Campo campo) {
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
		Partido other = (Partido) obj;
		return idPartido == other.idPartido;
	}
	@Override
	public String toString() {
		return "Partido (" + idPartido + ", " + partido + ", " + campo + ")";
	}
	

}
