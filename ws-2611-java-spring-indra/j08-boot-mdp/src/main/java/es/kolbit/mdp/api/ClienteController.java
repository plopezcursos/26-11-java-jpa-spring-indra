package es.kolbit.mdp.api;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;

import es.kolbit.mdp.dto.ClienteDto;
import es.kolbit.mdp.dto.NuevoClienteRequest;
import es.kolbit.mdp.dto.PaginaCliente;
import es.kolbit.mdp.service.ClienteService;
import es.kolbit.mdp.service.exc.ClienteNotFoundException;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	private final ClienteService scio;

	public ClienteController(ClienteService scio) {
		this.scio = scio;
	}

	@GetMapping("/all")
	public List<ClienteDto> todos() {
		return scio.buscarTodos();
	}
	
	@GetMapping("/{id}")
	public ClienteDto buscar(@PathVariable int id) {
		try {
			return scio.buscar(id);
		} catch(ClienteNotFoundException e) {
			throw new ResponseStatusException(NOT_FOUND, e.getMessage());
		}
	}
	
	// 	/api/clientes?provincia=Madrid&apellido=Perez&page=3&size=10
	@GetMapping
	public PaginaCliente buscar(
			@RequestParam(required = false) String provincia, 
			@RequestParam(required = false) String apellido, 
			@RequestParam(defaultValue = "0") int page, 
			@RequestParam(defaultValue = "10") int size) {
		if (page < 0 || size < 1)
			throw new ResponseStatusException(BAD_REQUEST, "Parametros paginacion incorrectos");
		var orden = Sort.by("apellido1", "apellido2", "nombre", "idPersona");
		return PaginaCliente.toPaginaCliente(
			scio.buscar(provincia, apellido, PageRequest.of(page, size, orden)));
	}
	
	@PostMapping
	public ResponseEntity<ClienteDto> crear(
			@RequestBody NuevoClienteRequest nuevo, 
			UriComponentsBuilder uri){
		
		var cliente = scio.alta(nuevo);
		
		var ubicacion = 
			uri.path("/api/clientes/{id}")
			.buildAndExpand(cliente.idCliente())
			.toUri();
		
		return ResponseEntity.created(ubicacion).body(cliente);
	}
}
