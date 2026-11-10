package stream;

import java.util.Arrays;
import java.util.List;

public class Stream02Map {
	public static void main(String[] args) {
		List<String> ciudades = List.of("Valencia", "Malaga", "Rosario", "Madrid", "Malaga");

		List<String> lista1 = ciudades.stream()
				.map(String::toUpperCase)
				.toList();
		System.out.println(lista1);
		
		List<Integer> lista2 = ciudades.stream()
				.map(String::length)
				.toList();
		System.out.println(lista2);
		
		List<String> temas = List.of("Taller funcional", "Taller lambdas", "Taller API streams");
		
		//generamos un stream de String[] a partir de un stream de String
		List<String[]> lista3 = temas.stream()
				.map(t -> t.split(" "))  // Stream(String[])
				.toList();
		lista3.forEach(a -> System.out.println(Arrays.asList(a)));
		
		// A partir del stream de String[] generamos uno de String
		List<String> lista4 = lista3.stream()
				.flatMap(Arrays::stream)
				.distinct()
				.toList();
		System.out.println(lista4);

		
	}
}
