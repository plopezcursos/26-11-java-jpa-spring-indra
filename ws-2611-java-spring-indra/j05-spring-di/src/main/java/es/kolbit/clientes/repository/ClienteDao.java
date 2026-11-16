package es.kolbit.clientes.repository;

import java.util.Optional;

import es.kolbit.clientes.domain.ClienteDto;

public interface ClienteDao {
	
    Optional<ClienteDto> findById(long id);
}
