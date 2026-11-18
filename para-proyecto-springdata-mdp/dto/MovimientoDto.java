package es.kolbit.mdp.dto;

import java.time.LocalDate;

public record MovimientoDto(
	Integer idMovimiento,
	Integer idTarjeta, 
	LocalDate fecha, 
	double importe, 
	String proveedor, 
	String tipo
) {}
