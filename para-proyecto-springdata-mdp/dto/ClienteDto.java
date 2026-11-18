package es.kolbit.mdp.dto;

import es.kolbit.mdp.domain.Cliente;
import es.kolbit.mdp.domain.Genero;

public record ClienteDto(Integer idCliente, String nombre, String apellido1, String apellido2, String nif,
		Integer nroCliente, String sexo, String municipio, String provincia) {

	
	public ClienteDto(Integer idCliente, String nombre, String apellido1, String apellido2, String nif,
			Integer nroCliente, Genero sexo, String municipio, String provincia) {
		this(idCliente, nombre, apellido1, apellido2, nif, nroCliente, sexo.toString(), municipio, provincia);
	}
		
	
	
//	public static ClienteDto toClienteDto(Cliente c) {
//		if (c == null) return null;
//		return new ClienteDto(c.getIdPersona(), c.getNombre(), c.getApellido1(), c.getApellido2(), c.getNif(),
//				c.getNroCliente(), c.getSexo().toString(), c.getMunicipio(), c.getProvincia());
//	}
	
//	public static Cliente dtoToCliente(ClienteDto dto) {
//		if (dto == null) return null;
//		return new Cliente(dto.nombre(), dto.apellido1(), dto.apellido2(), dto.nif(), Genero.valueOf(dto.sexo()),
//				dto.municipio(), dto.provincia(), dto.nroCliente);
//	}

	public static void aplicarDto(Cliente c, ClienteDto dto) {
		if (dto == null)
			return;
		c.setNombre(dto.nombre());
		c.setApellido1(dto.apellido1());
		c.setApellido2(dto.apellido2());
		c.setNif(dto.nif());
		c.setNroCliente(dto.nroCliente());
//		c.setSexo(Genero.valueOf(dto.sexo()));
		c.setMunicipio(dto.municipio());
		c.setProvincia(dto.provincia());
	}

}
