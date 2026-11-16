package es.kolbit.clientes;

import es.kolbit.clientes.service.ClienteService;

public class Aplicacion {
	public static void main(String[] args) {

		ClienteService servicio = new ClienteService();

		System.out.println(servicio.buscar(1).orElseThrow());
	}
}
