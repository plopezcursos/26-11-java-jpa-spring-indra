package stream;

import java.util.List;

public class Stream01Filter {
	public static void main(String[] args) {
		List<String> ciudades = List.of("Valencia", "Malaga", "Rosario", "Madrid", "Malaga");
		
		List<String> lista1 = ciudades.stream()
				.filter(c -> c.contains("l"))
				.filter(c -> !c.contains("V"))
				.distinct()
				.toList();
		System.out.println(lista1);
		
		//skip(n) filtra los n primeros elementos
		//limit(n) limita la cantidad de elementos
		List<String> lista2 = ciudades.stream()
				.skip(1)
				.limit(2)
				.toList();
		System.out.println(lista2);
		
		//takeWhile(Predicate)
		//El flujo se detiene en cuanto Predicate es false
		List<String> lista3 = ciudades.stream()
				.takeWhile(c -> c.contains("l"))
				.toList();
		System.out.println(lista3);

		//dropWhile(Predicate)
		//Descarta elementos mietras Predicate sea verdadero. Una vez que da falso, no filtra mas.
		List<String> lista4 = ciudades.stream()
				.dropWhile(c -> c.contains("l"))
				.toList();
		System.out.println(lista4);
		
		List<String> lista5 = ciudades.stream()
				.peek(System.err::println)
				.toList();
		
	}
}
