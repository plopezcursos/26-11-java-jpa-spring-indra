package es.kolbit.ejerciciojpa.consultas;

import es.kolbit.ejerciciojpa.modelo.Cliente;
import es.kolbit.ejerciciojpa.util.Emf;
import jakarta.persistence.TypedQuery;

public class C01Clientes {
	public static void main(String[] args) {
		
		try(var em = Emf.getInstance().createEntityManager()) {
			
			//Todos los clientes
			String jpql = "select c from Cliente c";
			TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
			
			q.getResultList().forEach(System.out::println);
			System.out.println("--------------");
			
			//Clientes con categoria VIP
			String cate = "VIP";
			
			jpql = "select c from Cliente c where c.categoria = :cate";
			q = em.createQuery(jpql, Cliente.class);
			q.setParameter("cate", cate);
			q.getResultList().forEach(System.out::println);
		}
	}
}
