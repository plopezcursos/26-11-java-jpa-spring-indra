package es.kolbit.ejerciciojpa.consultas;

import es.kolbit.ejerciciojpa.modelo.Cliente;
import es.kolbit.ejerciciojpa.modelo.Producto;
import es.kolbit.ejerciciojpa.util.Emf;
import jakarta.persistence.TypedQuery;

public class C06OtrasConsultas {
	public static void main(String[] args) {
		
		try(var em = Emf.getInstance().createEntityManager()) {
			
			//Productos que no han sido comprados
			String jpql = "select p from Producto p where p.clientes is empty";
			
			jpql = 
				"""
				select p from Producto p
				left join p.clientes c
				where c is null
				""";
			
			jpql =
				"""
				select p from Producto p
				where p.idProducto not in 
					(select distinct p.idProducto
					 from Producto p
					 join p.clientes)
				""";
			
			TypedQuery<Producto> q = em.createQuery(jpql, Producto.class);
			
			q.getResultList().forEach(System.out::println);
			System.out.println("--------------");
			
		}
	}
}
