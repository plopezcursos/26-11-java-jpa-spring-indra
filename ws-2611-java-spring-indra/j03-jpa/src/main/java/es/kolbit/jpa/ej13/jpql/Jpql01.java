package es.kolbit.jpa.ej13.jpql;

import java.util.List;

import es.kolbit.jpa.ej01_mismosnombres.Persona;
import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Jpql01 {
	public static void main(String[] args) {
		
		try(EntityManager em = Emf.get().createEntityManager()){
			
			String jpql = "select p from Persona p where p.nombre like :nom";
			
			TypedQuery<Persona> q = em.createQuery(jpql, Persona.class);
			q.setParameter("nom", "%Juan%");
			
			List<Persona> personas = q.getResultList();
			
			personas.forEach(System.out::println);
			
		}
		
	}
}
