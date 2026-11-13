package es.kolbit.jpa.ej11_contextopersistencia;

import es.kolbit.jpa.ej01_mismosnombres.Persona;
import es.kolbit.jpa.persistenceutil.Emf;
import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		
		try(EntityManager em = Emf.get().createEntityManager()) {
			
			Persona p = em.find(Persona.class, 5);
			p.setApodo("APODO NUEVO");
			
			//...
			
			Persona nueva = new Persona(null, "otro", "otro", "otro", "otro");
			
			em.getTransaction().begin();
			em.persist(nueva);
			em.getTransaction().commit();
			
			
		}
	}
}
