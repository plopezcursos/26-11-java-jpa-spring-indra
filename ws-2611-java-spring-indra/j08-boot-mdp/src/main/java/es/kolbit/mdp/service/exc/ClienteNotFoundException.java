package es.kolbit.mdp.service.exc;

public class ClienteNotFoundException extends RuntimeException {

	public ClienteNotFoundException(int id) {
		super("Cliente " + id + " no existe");
	}
}
