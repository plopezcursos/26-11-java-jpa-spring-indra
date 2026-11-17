package es.kolbit.clientes.repository;

import java.util.Map;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import es.kolbit.clientes.domain.ClienteDto;

@Repository
//@Primary
@Profile("produccion")
public class ClienteDaoEnMemoria implements ClienteDao {

	private final Map<Long, ClienteDto> clientes = 
		Map.of(1L, new ClienteDto(1L, "Ana", "López", "ana@example.test"));

	@Override
	public Optional<ClienteDto> findById(long id) {
		return Optional.ofNullable(clientes.get(id));
	}
}
