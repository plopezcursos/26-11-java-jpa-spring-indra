package es.kolbit.clientes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import es.kolbit.clientes.domain.Cliente;
import es.kolbit.clientes.domain.ClienteDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class ClienteDaoJpa implements ClienteDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Optional<ClienteDto> findById(long id) {
		return Optional
			.ofNullable(em.find(Cliente.class, id))
			.map(ClienteDto::fromCliente);
	}

	@Override
	public List<ClienteDto> findAll() {
		return em.createQuery("select c from Cliente c", Cliente.class)
				.getResultList()
				.stream()
				.map(ClienteDto::fromCliente)
				.toList();
	}

	@Override
	public Optional<Cliente> findClienteById(long id) {
		TypedQuery<Cliente> q = em.createQuery(
			"""
			select c
			from Cliente c
			left join fetch c.telefonos
			where c.id = :id	
			""",
			Cliente.class
		);
		q.setParameter("id", id);
		return Optional.ofNullable(q.getSingleResultOrNull());
	}

}
