package es.kolbit.mdp.dto;

import es.kolbit.mdp.domain.Cliente;
import es.kolbit.mdp.domain.Genero;

public record NuevoClienteRequest(
		String nombre, 
		String apellido1, 
		String apellido2, 
		String nif, 
		Genero sexo, 
		String municipio,
		String provincia, 
		Integer nroCliente) {

	public static Cliente toCliente(NuevoClienteRequest dto) {
		return new Cliente(
				dto.nombre(), dto.apellido1(), dto.apellido2(), 
				dto.nif(), dto.sexo(), dto.municipio(), dto.provincia(), dto.nroCliente());
	}
}
