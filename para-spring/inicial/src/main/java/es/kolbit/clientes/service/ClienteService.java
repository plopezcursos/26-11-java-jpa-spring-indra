package es.kolbit.clientes.service;

import java.util.Optional;

import es.kolbit.clientes.domain.ClienteDto;
import es.kolbit.clientes.repository.ClienteDao;
import es.kolbit.clientes.repository.ClienteDaoEnMemoria;

public class ClienteService {

	private ClienteDao dao = new ClienteDaoEnMemoria();

	public Optional<ClienteDto> buscar(long id) {
		return dao.findById(id);
	}
}
