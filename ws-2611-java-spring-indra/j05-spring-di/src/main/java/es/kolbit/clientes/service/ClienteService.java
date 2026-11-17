package es.kolbit.clientes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import es.kolbit.clientes.domain.ClienteDto;
import es.kolbit.clientes.repository.ClienteDao;
//nombre del bean clienteService
@Service
//@Scope("prototype")
public class ClienteService {

//	@Autowired
	private final ClienteDao dao;

//	public ClienteService() {
//		System.out.println("constructor por defecto Servicio");
//	}
	
//	public ClienteService(@Qualifier("clienteDaoAlternativo") ClienteDao dao) {
	public ClienteService(ClienteDao dao) {
		System.out.println("constructor con el dao");
		this.dao = dao;
	}

	public Optional<ClienteDto> buscar(long id) {
		return dao.findById(id);
	}

	public ClienteDao getDao() {
		return dao;
	}

//	@Autowired
//	public void setDao(ClienteDao dao) {
//		System.out.println("setDAo");
//		this.dao = dao;
//	}
	
	
}
