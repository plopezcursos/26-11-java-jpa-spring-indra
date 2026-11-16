package es.kolbit.clientes.repository;

import java.util.Map;
import java.util.Optional;

import es.kolbit.clientes.domain.ClienteDto;

public class ClienteDaoEnMemoria implements ClienteDao {

	private final Map<Long, ClienteDto> clientes = 
		Map.of(1L, new ClienteDto(1L, "Ana", "López", "ana@example.test"));

	@Override
	public Optional<ClienteDto> findById(long id) {
		return Optional.ofNullable(clientes.get(id));
	}
}
