package es.kolbit.jpa.ej04_insertable;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		
		try(EntityManager em = Emf.get().createEntityManager()) {
			
			Persona04 p = em.find(Persona04.class, 7);
			
			if (p != null) {
				System.out.println(p);
				System.out.println(p.getSexo());
				System.out.println(p.getDomicilio());
			}
		}
	}
}
