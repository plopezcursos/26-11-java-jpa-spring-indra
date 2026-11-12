package es.kolbit.jpa.ej01_mismosnombres;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		
		try(EntityManager em = Emf.get().createEntityManager()) {
			
			Persona p = em.find(Persona.class, 1005);
			
			if (p != null)
				System.out.println(p);
			
			
			Persona nueva = new Persona(null, "Prueba nom", "Prueba ape", "Prueba apodo", "pr dni");
			
			em.getTransaction().begin();
			em.persist(nueva);
			em.getTransaction().commit();
		}
		
		
	}
}
