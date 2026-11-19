package es.kolbit.mdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.kolbit.mdp.domain.Tarjeta;

public interface TarjetaRepo extends JpaRepository<Tarjeta, Integer>, TarjetaRepoCustom {

}
