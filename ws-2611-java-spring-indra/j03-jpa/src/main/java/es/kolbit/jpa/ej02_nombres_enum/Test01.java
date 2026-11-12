package es.kolbit.jpa.ej02_nombres_enum;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		
		try(EntityManager em = Emf.get().createEntityManager()) {
			
			Persona02 p = em.find(Persona02.class, 11);
			
			if (p != null) {
				System.out.println(p);
				System.out.println(p.getSexo());
			}
			
		}
		
		
	}
}
