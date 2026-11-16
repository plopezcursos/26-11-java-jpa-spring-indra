package es.kolbit.ejerciciojpa.consultas;

import es.kolbit.ejerciciojpa.modelo.Cliente;
import es.kolbit.ejerciciojpa.modelo.Producto;
import es.kolbit.ejerciciojpa.util.Emf;
import jakarta.persistence.TypedQuery;

public class C03ClientesProductos {
	public static void main(String[] args) {
		
		try(var em = Emf.getInstance().createEntityManager()) {
			
			//Clientes que compraron productos con precio > 100
			double precio = 100;
			
			String jpql = 
				"""
				select c from Cliente c 
				join c.productos p
				where p.precio > :precio
				""";
			TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
			q.setParameter("precio", precio);
			
			q.getResultList().forEach(System.out::println);
			System.out.println("--------------");
			
			//Todos los clientes y los productos que compraron
			jpql = 
				"""
				select c from Cliente c	
				left join fetch c.productos
				""";
			q = em.createQuery(jpql, Cliente.class);
//			q.getResultList()
//				.forEach(c -> {
//					System.out.println(c);
//					c.getProductos().
//						forEach(System.out::println);
//				});
			
			for (Cliente c : q.getResultList()) {
				System.out.println(c);
				for (Producto p : c.getProductos())
					System.out.println(p);
			}
		}
	}
}
