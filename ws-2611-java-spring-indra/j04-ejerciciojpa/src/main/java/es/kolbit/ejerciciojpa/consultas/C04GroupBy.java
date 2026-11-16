package es.kolbit.ejerciciojpa.consultas;

import java.util.List;

import es.kolbit.ejerciciojpa.modelo.CategoriaCantCliente;
import es.kolbit.ejerciciojpa.modelo.Cliente;
import es.kolbit.ejerciciojpa.util.Emf;
import jakarta.persistence.TypedQuery;

public class C04GroupBy {
	public static void main(String[] args) {
		
		try(var em = Emf.getInstance().createEntityManager()) {
			
			//Cantidad de clientes por categoría
			String jpql = 
				"""
				select c.categoria, count(c)
				from Cliente c
				group by c.categoria	
				""";
			TypedQuery<Object[]> q = em.createQuery(jpql, Object[].class);
			
			List<Object[]> resu = q.getResultList();
			
			for (Object[] obj : resu) {
				System.out.println(obj[0] + ": " + obj[1]);
			}
			System.out.println("--------------");
			
			//Mapear el resultado
			
			List<CategoriaCantCliente> categorias =
				resu.stream()
				.map(o -> new CategoriaCantCliente((String)o[0], (Long)o[1]))
				.toList();
			
			categorias.forEach(System.out::println);
			
			System.out.println("------------------");
			//La consulta nos retorne CategoriaCantCliente
			
			jpql = 
				"""
				select new es.kolbit.ejerciciojpa.modelo.CategoriaCantCliente(c.categoria, count(c))
				from Cliente c
				group by c.categoria
				""";
			TypedQuery<CategoriaCantCliente> qCate = em.createQuery(jpql, CategoriaCantCliente.class);
			qCate.getResultList().forEach(System.out::println);
		}
	}
}
