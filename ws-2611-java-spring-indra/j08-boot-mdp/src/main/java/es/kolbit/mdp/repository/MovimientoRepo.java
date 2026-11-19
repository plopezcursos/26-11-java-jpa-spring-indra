package es.kolbit.mdp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.kolbit.mdp.domain.Movimiento;
import es.kolbit.mdp.dto.MovimientoProjection;

public interface MovimientoRepo extends JpaRepository<Movimiento, Integer> {

	@Query(
		"""
		select m.idMovimiento as idMovimiento, 
			m.tarjeta.idTarjeta as idTarjeta, 
			m.fecha as fecha,
			m.importe as importe, 
			m.proveedor as proveedor
		from Movimiento m
		where m.tarjeta.idTarjeta = ?1
		"""
	)
	List<MovimientoProjection> findAllProjectionByTarjeta(Integer idTarjeta);
}
