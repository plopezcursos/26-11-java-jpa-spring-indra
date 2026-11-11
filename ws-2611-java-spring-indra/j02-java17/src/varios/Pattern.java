package varios;

public class Pattern {

	public static void main(String[] args) {
		procesa(456);
		procesa("hola");
	}
	
	public static void procesa(Object o) {
		if (o instanceof String) {
			String obj = (String) o;
			System.out.println(obj);
		}
		
		//Pattern Matching
		if (o instanceof String obj) {
			obj = obj.toUpperCase();
			System.out.println(obj);
		}
	
		//Java 21
		switch(o) {
		case String s -> System.out.println(s.toUpperCase());
		case Integer i -> System.out.println(i + 17);
		case null -> System.out.println("null");
		default -> throw new RuntimeException();
		}

	
	}
	
	
}


