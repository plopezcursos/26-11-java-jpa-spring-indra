package es.kolbit.ejerciciojpa.consultas;

import es.kolbit.ejerciciojpa.modelo.Empleado;
import es.kolbit.ejerciciojpa.util.Emf;
import jakarta.persistence.TypedQuery;

public class C02Empleados {
	public static void main(String[] args) {
		
		try(var em = Emf.getInstance().createEntityManager()) {
			
			//Empleados con la categoria ANALISTA FUNCIONAL
			String categoria = "ANALISTA FUNCIONAL";
			
			String jpql = "select e from Empleado e where e.categoria.categoria = :cate";
			TypedQuery<Empleado> q = em.createQuery(jpql, Empleado.class);
			q.setParameter("cate", categoria);
			
			q.getResultList().forEach(System.out::println);
			System.out.println("--------------");
			

			//Empleados con la categoria 5 y su apellido comience con P
			jpql = 
				"""
				select e from Empleado e 
				where e.categoria.idCategoria = :idC 
				and e.apellidos like :ape
				""";
			q = em.createQuery(jpql, Empleado.class);
			q.setParameter("idC", 5);
			q.setParameter("ape", "P%");
			
			q.getResultList().forEach(System.out::println);
		}
	}
}
