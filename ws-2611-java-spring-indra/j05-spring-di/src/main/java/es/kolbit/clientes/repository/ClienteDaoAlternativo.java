package es.kolbit.clientes.repository;

import java.util.Optional;

import es.kolbit.clientes.domain.ClienteDto;

public class ClienteDaoAlternativo implements ClienteDao {

	@Override
	public Optional<ClienteDto> findById(long id) {
		return Optional.of(
			new ClienteDto(id, "ALTERNATIVO", "APE ALTERNATIVO", "ALTER@ALTER.COM"));
	}

}
