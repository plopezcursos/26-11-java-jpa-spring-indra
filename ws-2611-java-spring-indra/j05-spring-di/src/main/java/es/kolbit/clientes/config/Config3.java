package es.kolbit.clientes.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;

import es.kolbit.clientes.repository.ClienteDao;
import es.kolbit.clientes.repository.ClienteDaoEnMemoria;
import es.kolbit.clientes.service.ClienteService;

@Configuration
@ImportResource("config3.xml")
public class Config3 {

	
	@Bean
	@Primary
	ClienteDao clienteDaoEnMemoria() {
		return new ClienteDaoEnMemoria();
	}
	
	@Bean
	ClienteService clienteService(@Qualifier("clienteDaoAlternativo") ClienteDao cDao) {
		return new ClienteService(cDao);
	}
	
}
