package es.kolbit.clientes.tests;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(
	prefix = "app.h2.web", 
	name = "enabled", 
	havingValue = "true"
)
public class ConsolaH2 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Presione intro para finalizar...");
		new Scanner(System.in).nextLine();
	}

}
