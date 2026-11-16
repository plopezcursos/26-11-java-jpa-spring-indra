package es.kolbit.clientes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.kolbit.clientes.service.ClienteService;

public class Aplicacion1 {
	public static void main(String[] args) {
		
		try (var ctx = new ClassPathXmlApplicationContext("config1.xml")) {
			
			ClienteService servicio = ctx.getBean(ClienteService.class);

			System.out.println(servicio.buscar(1).orElseThrow());
		}
		
	}
}
