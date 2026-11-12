package es.kolbit.jpa.ej05_tipoacceso;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		
		try(EntityManager em = Emf.get().createEntityManager()) {
			
			Persona05 p = em.find(Persona05.class, 1005);
			
			if (p != null)
				System.out.println(p);
			

		}
		
		
	}
}
