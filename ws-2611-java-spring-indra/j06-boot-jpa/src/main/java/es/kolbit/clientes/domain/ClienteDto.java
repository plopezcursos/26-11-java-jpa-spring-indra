package es.kolbit.clientes.domain;

public record ClienteDto(
	Long id, 
	String nombre, 
	String apellido, 
	String email
){
	public static ClienteDto fromCliente(Cliente c) {
		return new ClienteDto(c.getId(), c.getNombre(), c.getApellido(), c.getEmail());
	}
}
