package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Colecciones {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>(List.of("uno", "dos", "tres", "siete"));
		
		// Collection removeIf(Predicate)
		lista.removeIf(l -> l.contains("t"));
		System.out.println(lista);
		
		// List replaceAll(UnaryOperator)
		lista.replaceAll(String::toUpperCase);
		System.out.println(lista);
		
		// Map forEach(BiConsumer)
		Map<Integer, String> mapa = Map.of(1, "uno", 2, "dos", 3, "tres");
		mapa.forEach((k, v) -> System.out.println("clave " + k + " - valor " + v));
		
	}
}
