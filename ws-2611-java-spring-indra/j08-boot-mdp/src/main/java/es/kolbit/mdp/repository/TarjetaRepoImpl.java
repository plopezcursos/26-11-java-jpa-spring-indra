package es.kolbit.mdp.repository;

import java.time.YearMonth;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.kolbit.mdp.domain.Tarjeta;
import jakarta.persistence.EntityManager;

public class TarjetaRepoImpl implements TarjetaRepoCustom {

	@Autowired
	private EntityManager em;
	
	@Override
	public List<Tarjeta> findVigentes() {
		int anyo = YearMonth.now().getYear();
		int mes = YearMonth.now().getMonth().getValue();
		String jpql =
			"""
			select t from Tarjeta t
			where t.anyoVencimiento > :anyo
			or t.anyoVencimiento = :anyo and t.mesVencimiento >= :mes
			order by t.anyoVencimiento, t.mesVencimiento
			""";
		return em.createQuery(jpql, Tarjeta.class)
				.setParameter("anyo", anyo)
				.setParameter("mes", mes)
				.getResultList();	
	}

}
