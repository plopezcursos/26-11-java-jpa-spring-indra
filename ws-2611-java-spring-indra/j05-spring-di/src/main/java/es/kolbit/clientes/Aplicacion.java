package es.kolbit.clientes;

import es.kolbit.clientes.repository.ClienteDao;
import es.kolbit.clientes.repository.ClienteDaoAlternativo;
import es.kolbit.clientes.repository.ClienteDaoEnMemoria;
import es.kolbit.clientes.service.ClienteService;

public class Aplicacion {
	public static void main(String[] args) {
		
		// El valor de modo lo leemos de un fichero de configuracion
		String modo = "ALT";
				
		ClienteDao cDao = null;
		
		if (modo.equals("MEM"))
			cDao = new ClienteDaoEnMemoria();
		
		if (modo.equals("ALT"))
			cDao = new ClienteDaoAlternativo();
		

		ClienteService servicio = new ClienteService(cDao);

		System.out.println(servicio.buscar(1).orElseThrow());
	}
}
