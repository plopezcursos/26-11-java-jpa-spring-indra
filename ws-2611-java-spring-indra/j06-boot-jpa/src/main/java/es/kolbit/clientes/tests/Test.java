package es.kolbit.clientes.tests;

import java.util.Optional;

import org.springframework.stereotype.Component;

import es.kolbit.clientes.domain.Cliente;
import es.kolbit.clientes.service.ClienteService;
import jakarta.annotation.PostConstruct;

@Component
public class Test {

	private final ClienteService scio;

	public Test(ClienteService scio) {
		this.scio = scio;
	}
	
	@PostConstruct
	public void run() {
		System.out.println();
		scio.buscarTodos().forEach(System.out::println);
		
		System.out.println("\n" + scio.buscar(3));
		System.out.println();
		
		Optional<Cliente> c = scio.buscarCliente(2);
		
		System.out.println(c);
		System.out.println(c.get().getTelefonos());
	}
}
