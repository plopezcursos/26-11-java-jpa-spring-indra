package es.kolbit.clientes.domain;

public record ClienteDto(
	Long id, 
	String nombre, 
	String apellido, 
	String email
){}
