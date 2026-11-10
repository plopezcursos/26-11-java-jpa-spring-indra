package interfaces;

@FunctionalInterface
public interface EjemploInterface {

	void procesa();  //public abstract
	
	default void heceCosas() {
		haceCosasPrivadas();
		System.out.println("Hace cosas desde default");
	}
	
	static void haceCosasEstaticas() {
		haceCosasPrivadasEstaticas();
		System.out.println("Hace cosas estaticas");
	}
	
	private void haceCosasPrivadas() {
		System.out.println("Metodo privado de interface");
	}
	
	private static void haceCosasPrivadasEstaticas() {
		System.out.println("Privado estatico");
	}
}
