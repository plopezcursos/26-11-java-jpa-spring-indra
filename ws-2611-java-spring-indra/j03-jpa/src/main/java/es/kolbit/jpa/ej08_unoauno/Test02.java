package es.kolbit.jpa.ej08_unoauno;

import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test02 {
	public static void main(String[] args) {
		try(EntityManager em = Emf.get().createEntityManager()) {
			
//			Contacto2 c = em.find(Contacto2.class, 7);
//			System.out.println(c);
//			System.out.println(c.getDomicilio());
			
			DomicilioContacto2 dom = em.find(DomicilioContacto2.class, 3);
			System.out.println(dom);
			System.out.println(dom.getContacto());
		}
	}
}
