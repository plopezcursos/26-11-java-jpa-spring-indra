package es.kolbit.jpa.ej12.muchosamuchos;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		
		try(EntityManager em = Emf.get().createEntityManager()) {
			
			Equipo e = em.find(Equipo.class, 10);
			
			System.out.println(e);
			System.out.println(e.getJugadores());
			
		}
	}
}
