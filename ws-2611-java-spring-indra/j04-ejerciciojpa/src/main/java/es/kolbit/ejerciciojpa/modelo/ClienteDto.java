package es.kolbit.ejerciciojpa.modelo;

public record ClienteDto(
	Integer idCliente,
	String apellidos,
	Integer nroCliente,
	String categoria
) {}
