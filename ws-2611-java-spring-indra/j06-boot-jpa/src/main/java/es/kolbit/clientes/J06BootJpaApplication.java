package es.kolbit.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class J06BootJpaApplication {

	public static void main(String[] args) {
		
		try(var ctx = SpringApplication.run(J06BootJpaApplication.class, args)) {

		}

	}

}
