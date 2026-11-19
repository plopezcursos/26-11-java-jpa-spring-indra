package es.kolbit.mdp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@SuppressWarnings("serial")

@Entity
@Table(name = "movimientos")
public class Movimiento implements Comparable<Movimiento>, Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_movimiento")
	private Integer idMovimiento;
	
	@ManyToOne
	@JoinColumn(name = "fk_tipo_mov")
	private TipoMovimiento tipo;

	@ManyToOne
	@JoinColumn(name = "fk_tarjeta")
	private Tarjeta tarjeta;
	
	private LocalDate fecha;
	
	@Column(name = "importe")
	private Double importe;
	private String proveedor;
	
	@ManyToOne
	@JoinColumn(name = "fk_extracto")
	private Extracto extracto;
	
	public Movimiento() {
	}

	public Movimiento(TipoMovimiento tipo, Tarjeta tarjeta, LocalDate fecha, double importe, String proveedor) {
		this.tipo = tipo;
		this.tarjeta = tarjeta;
		this.fecha = fecha;
		this.importe = importe;
		this.proveedor = proveedor;
	}
	
	public Movimiento(TipoMovimiento tipo, Tarjeta tarjeta, int dia, int mes, int anyo, double importe, String proveedor) {
		this(tipo, tarjeta, null, importe, proveedor);
		this.fecha = LocalDate.of(anyo, mes, dia);
	}

	public Integer getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(Integer idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public TipoMovimiento getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimiento tipo) {
		this.tipo = tipo;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getFechaFormat() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return fecha.format(fmt);
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public void setFecha(int anyo, int mes, int dia) {
		fecha = LocalDate.of(anyo, mes, dia);
	}
	
	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMovimiento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movimiento other = (Movimiento) obj;
		return Objects.equals(idMovimiento, other.idMovimiento);
	}

	@Override
	public int compareTo(Movimiento o) {
		if(this.equals(o)) return 0;
		else return this.fecha.compareTo(o.fecha);
	}

	@Override
	public String toString() {
		return "Movimiento [" + idMovimiento + ", " + tipo + ", " + getFechaFormat() + ", " + importe + ", " + proveedor + "]";
	}
	
	
}
