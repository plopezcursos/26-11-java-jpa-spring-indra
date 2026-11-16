package es.kolbit.clientes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.kolbit.clientes.config.Config2;
import es.kolbit.clientes.service.ClienteService;

public class Aplicacion2 {
	public static void main(String[] args) {
		
		try (var ctx = new AnnotationConfigApplicationContext(Config2.class)) {
			
			ClienteService servicio = ctx.getBean(ClienteService.class);

			System.out.println(servicio.buscar(1).orElseThrow());
		}
		
	}
}
