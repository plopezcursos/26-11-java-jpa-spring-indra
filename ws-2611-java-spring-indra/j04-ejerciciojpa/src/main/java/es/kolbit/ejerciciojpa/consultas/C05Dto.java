package es.kolbit.ejerciciojpa.consultas;

import es.kolbit.ejerciciojpa.modelo.ClienteDto;
import es.kolbit.ejerciciojpa.util.Emf;
import jakarta.persistence.TypedQuery;

public class C05Dto {
	public static void main(String[] args) {
		
		try(var em = Emf.getInstance().createEntityManager()) {
			
			//Todos los clientes en ClienteDto
			String jpql = 
				"""
				select new es.kolbit.ejerciciojpa.modelo.
					ClienteDto(c.idPersona, c.apellidos, c.nroCliente, c.categoria) 
				from Cliente c
				""";
			TypedQuery<ClienteDto> q = em.createQuery(jpql, ClienteDto.class);
			
			q.getResultList().forEach(System.out::println);
		}
	}
}
