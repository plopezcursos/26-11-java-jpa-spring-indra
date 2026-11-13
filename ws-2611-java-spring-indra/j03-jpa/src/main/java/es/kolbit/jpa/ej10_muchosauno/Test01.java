package es.kolbit.jpa.ej10_muchosauno;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		try(EntityManager em = Emf.get().createEntityManager()) {
			
			Partido p = em.find(Partido.class, 3);
			System.out.println(p);
			System.out.println(p.getCampo());
			
		}
	}
}
