package es.kolbit.jpa.ej03_pk_compuesta;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		
		try(EntityManager em = Emf.get().createEntityManager()) {
			
			Dni dni = new Dni(1230321, 'A');
			
			Persona03 p = em.find(Persona03.class, dni);
			
			if (p != null) {
				System.out.println(p);
			}
			
		}
		
		
	}
}
