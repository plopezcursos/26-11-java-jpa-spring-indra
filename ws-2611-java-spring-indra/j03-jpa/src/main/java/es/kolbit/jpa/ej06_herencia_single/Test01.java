package es.kolbit.jpa.ej06_herencia_single;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		try(EntityManager em = Emf.get().createEntityManager()) {
			Rectangulo r = em.find(Rectangulo.class, 36);
			System.out.println(r);
			
			Circulo c = em.find(Circulo.class, 37);
			System.out.println(c);
		}
	}
}
