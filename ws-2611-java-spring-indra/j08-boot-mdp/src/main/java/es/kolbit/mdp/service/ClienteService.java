package es.kolbit.mdp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import es.kolbit.mdp.dto.ClienteDto;
import es.kolbit.mdp.dto.NuevoClienteRequest;
import es.kolbit.mdp.repository.ClienteRepo;
import es.kolbit.mdp.service.exc.ClienteNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class ClienteService {
	private final ClienteRepo cliR;

	public ClienteService(ClienteRepo cliR) {
		this.cliR = cliR;
	}

	public List<ClienteDto> buscarTodos() {
		return cliR.findAll()
				.stream()
				.map(ClienteDto::toClienteDto)
				.toList();
	}
	
	public ClienteDto buscar(int id) {
		return cliR.findById(id)
				.map(ClienteDto::toClienteDto)
				.orElseThrow(() -> new ClienteNotFoundException(id));
	}
	
	public Page<ClienteDto> buscar(String provincia, String apellido, Pageable p) {
		return cliR.findByProvinciaAndNombre(opcional(provincia), opcional(apellido), p)
				.map(ClienteDto::toClienteDto);
	}
	
	private String opcional(String s) {
		return s == null || s.isBlank() ? null : s.strip();
	}
	
	@Transactional
	public ClienteDto alta(NuevoClienteRequest nuevo) {
		//validacion de nuevo
		return ClienteDto.toClienteDto(cliR.save(NuevoClienteRequest.toCliente(nuevo)));
	}
}
