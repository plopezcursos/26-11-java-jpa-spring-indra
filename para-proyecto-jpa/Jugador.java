

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class Jugador implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idJugador;
	private int dorsal;
	private String nombre;
	private String licencia;
	private Set<Equipo> equipos;

	public Jugador() {
	}
	
	public Jugador(int idJugador, int dorsal, String nombre, String licencia) {
		super();
		this.idJugador = idJugador;
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.licencia = licencia;
	}

	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Set<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(Set<Equipo> equipos) {
		this.equipos = equipos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idJugador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return idJugador == other.idJugador;
	}

	@Override
	public String toString() {
		return "Jugador (" + idJugador + ", " + dorsal + ", " + nombre + ", " + licencia + ")";
	}
}
