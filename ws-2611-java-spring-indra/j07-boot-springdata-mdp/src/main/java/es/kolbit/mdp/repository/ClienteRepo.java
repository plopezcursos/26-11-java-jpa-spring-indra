package es.kolbit.mdp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import es.kolbit.mdp.domain.Cliente;
import es.kolbit.mdp.dto.ClienteDto;

public interface ClienteRepo extends JpaRepository<Cliente, Integer> {

	//Declared Query Method
	
	@Query(
		"""
		select c from Cliente c
		where c.nombre like %?1%
			or c.apellido1 like %?1%
			or c.apellido2 like %?1%
		"""
		)
	public List<Cliente> findClienteNombreCompleto(String nombre);
	
	// Derived Query Method
	public List<Cliente> findByApellido1(String ape);
	
	
	// Constructor expression - NO USAR!!!
	@Query(
		"""
		select new es.kolbit.mdp.dto.ClienteDto(
			c.idPersona, c.nombre, c.apellido1, c.apellido2, c.nif, 
			c.nroCliente, c.sexo, c.municipio, c.provincia
			)
		from Cliente c
		"""
	)
	public List<ClienteDto> findDto();
	
	//DTO Query
	@Query(
		"""
		select c.idPersona, c.nombre, c.apellido1, c.apellido2, c.nif, 
			c.nroCliente, c.sexo, c.municipio, c.provincia
		from Cliente c
		where lower(c.municipio) = lower(:municipio) 
		"""
	)
	public List<ClienteDto> findDtoByMunicipio(@Param("municipio") String municipio);
	
//	@Override
//	@Query(
//		"""
//		select c
//		from Cliente c
//		left join fetch c.cuentas cu
//		left join fetch cu.tarjetas t
//		where c.idPersona = ?1	
//		"""
//	)
//	Optional<Cliente> findById(Integer id);

	@Override
	@EntityGraph(attributePaths = {"cuentas.tarjetas"})
	Optional<Cliente> findById(Integer id);
	
//	@Override
//	default List<Cliente> findAll() {
//		return null;
//	}
}
