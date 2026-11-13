package es.kolbit.jpa.ej08_unoauno;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		try(EntityManager em = Emf.get().createEntityManager()) {
			
			Contacto c = em.find(Contacto.class, 7);
			System.out.println(c);
			System.out.println(c.getDomicilio());
		}
	}
}
