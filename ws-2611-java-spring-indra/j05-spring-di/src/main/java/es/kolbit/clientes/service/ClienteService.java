package es.kolbit.clientes.service;

import java.util.Optional;

import es.kolbit.clientes.domain.ClienteDto;
import es.kolbit.clientes.repository.ClienteDao;

public class ClienteService {

	private ClienteDao dao;

	public ClienteService(ClienteDao dao) {
		this.dao = dao;
	}

	public Optional<ClienteDto> buscar(long id) {
		return dao.findById(id);
	}
}
