package es.kolbit.jpa.ej10_muchosauno;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test02 {
	public static void main(String[] args) {

		Campo2 c = findById(2);

		System.out.println(c);
//		System.out.println(c.getPartidos());
	}

	//dao
	public static Campo2 findById(Integer id) {
		try (EntityManager em = Emf.get().createEntityManager()) {
			return em.find(Campo2.class, 2);
		}
	}
}
