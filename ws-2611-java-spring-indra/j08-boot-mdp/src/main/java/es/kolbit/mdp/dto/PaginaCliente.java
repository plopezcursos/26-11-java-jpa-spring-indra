package es.kolbit.mdp.dto;

import java.util.List;

import org.springframework.data.domain.Page;

public record PaginaCliente(
	List<ClienteDto> clientes,
	int pagina,
	int tam,
	long cantTotal,
	int cantPaginas
	) {

		//Page<ClienteDto> -> PaginaCliente
		public static PaginaCliente toPaginaCliente(Page<ClienteDto> page) {
			return new PaginaCliente(
				page.getContent(), 
				page.getNumber(), 
				page.getSize(), 
				page.getTotalElements(), 
				page.getTotalPages()
			);
		}
}
