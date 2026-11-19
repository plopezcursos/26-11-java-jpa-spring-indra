package es.kolbit.mdp.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import es.kolbit.mdp.domain.Cliente;
import es.kolbit.mdp.repository.ClienteRepo;
import es.kolbit.mdp.repository.MovimientoRepo;
import es.kolbit.mdp.repository.TarjetaRepo;

@Component
public class Test01 implements CommandLineRunner {

	@Autowired
	private ClienteRepo cliRepo;
	
	@Autowired
	private MovimientoRepo movRepo;

	@Autowired
	private TarjetaRepo tarRepo;
	
	@Override
	public void run(String... args) throws Exception {
//		cliRepo.findAll().forEach(System.out::println);
		System.out.println(cliRepo.count());
		System.out.println(cliRepo.findById(4));
		
		cliRepo.findClienteNombreCompleto("pe").forEach(System.out::println);
		System.out.println("---------");
		cliRepo.findByApellido1("López").forEach(System.out::println);
		System.out.println("---------");
		cliRepo.findDto().forEach(System.out::println);
		System.out.println("---------");
		cliRepo.findDtoByMunicipio("Madrid").forEach(System.out::println);
		System.out.println("---------");
		movRepo.findAllProjectionByTarjeta(5)
			.forEach(mp -> System.out.println(mp.getIdMovimiento() + " " + mp.getImporte()));
		System.out.println("---------");
		
		Cliente c = cliRepo.findById(353).get();
		System.out.println(c);
		c.getCuentas().forEach(System.out::println);
		c.getCuentas().forEach(cu -> System.out.println(cu + " " + cu.getTarjetas()));
		System.out.println("---------");
		
		tarRepo.findVigentes().forEach(System.out::println);
	}

}
