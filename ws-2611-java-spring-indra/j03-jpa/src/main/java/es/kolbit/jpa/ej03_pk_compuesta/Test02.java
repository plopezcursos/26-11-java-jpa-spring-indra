package es.kolbit.jpa.ej03_pk_compuesta;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test02 {
	public static void main(String[] args) {
		
		try(EntityManager em = Emf.get().createEntityManager()) {
			
			Dni dni = new Dni(1230321, 'A');
			
			Persona03b p = em.find(Persona03b.class, dni);
			
			if (p != null) {
				System.out.println(p);
			}
			
		}
		
		
	}
}
