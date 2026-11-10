package lambdas;

import java.util.List;
import java.util.function.Supplier;

public class ReferenciaMetodo {
	public static void main(String[] args) {
		List<String> nombres = List.of("Santiago", "Ana", "Mercedes");
		List<Integer> nums = List.of(17, -50, 88, -7);
		
		nombres.forEach(s -> System.out.println(s));
		
		//referencia a método
		nombres.forEach(System.out::println);
		
		
		//referencia a método estático - Math::abs
		System.out.println();
		nums.forEach(n -> System.out.println(Math.abs(n)));
		
		System.out.println();
		nums.stream().map(Math::abs).forEach(System.out::println);
		
		//referencia a método propio
		System.out.println();
		nombres.forEach(ReferenciaMetodo::cantLetras);
		
		//referencia a método de un objeto existentes
		System.out.println();
		String saludo = "Buenos dias ";
//		saludo.concat("Pablo");
		nombres.stream().map(saludo::concat).forEach(System.out::println);
		
		//referencia a método de instancia del elemento actual
		System.out.println();
//		nombres.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
		nombres.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//referencia a método constructor
		System.out.println();
		nombres.stream().map(Persona::new).forEach(System.out::println);
		
		System.out.println();
		Supplier<Persona> creaP = Persona::new;
		Persona p1 = creaP.get();
		Persona p2 = creaP.get();
		System.out.println(p1);
		System.out.println(p2);
	}
	
	static void cantLetras(String s) {
		System.out.println(s.length());
	}
}
