package stream;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import lambdas.Persona;

public class Stream05Collector {
	public static void main(String[] args) {
		List<String> nombres = List.of("Santiago", "Ana", "Mercedes");
		List<Integer> nums = List.of(17, -50, 88, -7);
		
		List<Persona> personas = 
				nombres.stream()
				.map(Persona::new)
				.toList();
		System.out.println(personas);
//		personas.add(new Persona("Pepe"));
		
		List<Persona> personasMutable = 
				nombres.stream()
				.map(Persona::new)
				.collect(Collectors.toList());
		System.out.println(personasMutable);
		personasMutable.add(new Persona("Pepe"));
		System.out.println(personasMutable);
		
		Set<String> nombresSet = 
				personasMutable.stream()
				.map(Persona::getNombre)
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(nombresSet);
		
		String todosLosNombres =
				personasMutable.stream()
				.map(Persona::getNombre)
				.collect(Collectors.joining(", "));
		System.out.println(todosLosNombres);
	}
}
