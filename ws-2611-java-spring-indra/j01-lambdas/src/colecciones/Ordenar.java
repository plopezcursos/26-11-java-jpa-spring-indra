package colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenar {
	public static void main(String[] args) {
		List<String> nombres = List.of("Santiago", "Ana", "Mercedes", "Pepe");
		List<Integer> nums = List.of(17, -50, 88, -7);

		List<String> orden1 = nombres.stream().sorted().toList();
		System.out.println(orden1);
		
		List<Integer> orden2 = 
				nums.stream()
				.sorted((n1, n2) -> Integer.compare(n2, n1)).toList();
		System.out.println(orden2);
		
		List<Integer> orden3 = 
				nums.stream()
				.sorted(Comparator.<Integer>naturalOrder().reversed()).toList();
		System.out.println(orden3);
		
		List<Integer> numsMutable = new ArrayList<Integer>(nums);
		numsMutable.sort(Comparator.<Integer>naturalOrder().reversed());
		System.out.println(numsMutable);
		
		nombres.stream()
			.sorted(Comparator.comparing(String::length).reversed())
			.forEach(System.out::println);
	}
}
