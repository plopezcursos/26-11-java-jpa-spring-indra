package streams.auxiliar;

import java.util.Objects;

public class Departamento {
	private int idDepartamento;
	private String departamento;
	
	public Departamento(int idDepartamento, String departamento) {
		this.idDepartamento = idDepartamento;
		this.departamento = departamento;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDepartamento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return idDepartamento == other.idDepartamento;
	}

	@Override
	public String toString() {
		return "Departamento [" + idDepartamento + ", " + (departamento != null ? departamento : "") + "]";
	}
	
	
}
