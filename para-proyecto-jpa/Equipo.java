

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class Equipo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idEquipo;
	private String equipo;
	private Set<Jugador> jugadores;
	
	public Equipo() {
	}

	public Equipo(int idEquipo, String equipo) {
		this.idEquipo = idEquipo;
		this.equipo = equipo;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEquipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return idEquipo == other.idEquipo;
	}

	@Override
	public String toString() {
		return "Equipo (" + idEquipo + ", " + equipo + ", " + jugadores + ")";
	}
	
}
