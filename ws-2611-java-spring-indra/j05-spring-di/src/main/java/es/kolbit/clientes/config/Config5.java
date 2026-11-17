package es.kolbit.clientes.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.kolbit.clientes.Aplicacion5;
import es.kolbit.clientes.repository.ClienteDaoEnMemoria;
import es.kolbit.clientes.service.ClienteService;

@Configuration
//@ComponentScan({"es.kolbit.clientes.service", "es.kolbit.clientes.repository"})
//@ComponentScan("es.kolbit.clientes")
@ComponentScan(basePackageClasses = {ClienteService.class, ClienteDaoEnMemoria.class})
//@ComponentScan(basePackageClasses = Aplicacion5.class)
public class Config5 {
	
}
