package es.kolbit.clientes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import es.kolbit.clientes.domain.Cliente;
import es.kolbit.clientes.domain.ClienteDto;
import es.kolbit.clientes.repository.ClienteDao;

@Service
public class ClienteService {

	private final ClienteDao dao;

	public ClienteService(ClienteDao dao) {
		this.dao = dao;
	}

	public Optional<ClienteDto> buscar(long id) {
		return dao.findById(id);
	}

	public List<ClienteDto> buscarTodos() {
		return dao.findAll();
	}
	
	public Optional<Cliente> buscarCliente(long id) {
		return dao.findClienteById(id);
	}
}
