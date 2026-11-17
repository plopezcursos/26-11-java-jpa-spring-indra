package es.kolbit.clientes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.kolbit.clientes.config.Config4;
import es.kolbit.clientes.service.ClienteService;

public class Aplicacion4 {
	public static void main(String[] args) {
		
		try (var ctx = new AnnotationConfigApplicationContext(Config4.class)) {
			
			ClienteService servicio = ctx.getBean(ClienteService.class);
			System.out.println(servicio.buscar(1).orElseThrow());
			
			ClienteService otro = ctx.getBean(ClienteService.class);
			
			System.out.println(servicio == otro);
			
			System.out.println(servicio.getDao() == otro.getDao());
		}
		
	}
}
