package es.kolbit.mdp.repository;

import java.util.List;

import es.kolbit.mdp.domain.Tarjeta;

public interface TarjetaRepoCustom {

	
	List<Tarjeta> findVigentes();
}
