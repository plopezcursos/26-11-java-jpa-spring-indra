package es.kolbit.jpa.ej07_herencia_joined;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		try(EntityManager em = Emf.get().createEntityManager()) {
			
			Rectangulo2 r = em.find(Rectangulo2.class, 36);
			System.out.println(r);
			
			Circulo2 c = em.find(Circulo2.class, 37);
			System.out.println(c);
		}
	}
}
