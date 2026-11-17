package es.kolbit.clientes.repository;

import java.util.Optional;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import es.kolbit.clientes.domain.ClienteDto;

@Repository
@Profile("desarrollo")
public class ClienteDaoAlternativo implements ClienteDao {

	@Override
	public Optional<ClienteDto> findById(long id) {
		return Optional.of(
			new ClienteDto(id, "ALTERNATIVO", "APE ALTERNATIVO", "ALTER@ALTER.COM"));
	}

}
