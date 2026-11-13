package es.kolbit.jpa.ej07_herencia_joined;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test02 {
	public static void main(String[] args) {
		try(EntityManager em = Emf.get().createEntityManager()) {
			
			Circulo2 c = new Circulo2(11, 12, 13);
			
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
		}
	}
}
