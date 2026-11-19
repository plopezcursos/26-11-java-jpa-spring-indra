package es.kolbit.mdp.dto;

import java.time.LocalDate;

import es.kolbit.mdp.domain.TipoMovimiento;

public interface MovimientoProjection {
	Integer getIdMovimiento();
	Integer getIdTarjeta();
	LocalDate getFecha();
	public Double getImporte();
	public String getProveedor();
}