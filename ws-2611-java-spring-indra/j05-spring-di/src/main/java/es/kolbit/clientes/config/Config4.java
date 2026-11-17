package es.kolbit.clientes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import es.kolbit.clientes.repository.ClienteDao;
import es.kolbit.clientes.repository.ClienteDaoAlternativo;
import es.kolbit.clientes.repository.ClienteDaoEnMemoria;

@Configuration
@ComponentScan("es.kolbit.clientes.service")
public class Config4 {
	
	@Bean
	@Primary
	ClienteDao clienteDaoEnMemoria() {
		return new ClienteDaoEnMemoria();
	}
	
	@Bean
	ClienteDao clienteDaoAlternativo() {
		return new ClienteDaoAlternativo();
	}
	
}
