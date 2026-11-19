package es.kolbit.mdp.config;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(initMethod = "start", destroyMethod = "stop")
	@ConditionalOnProperty(
		prefix = "app.h2.web", 
		name = "enabled", 
		havingValue = "true"
	)
	Server h2Server() throws SQLException {
		return Server.createWebServer("-web", "-ifNotExists", "-webPort", "8082");
	}
	
}
