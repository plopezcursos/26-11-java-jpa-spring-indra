package lambdas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
	public static void main(String[] args) {
		
		List<String> palabras = new ArrayList<>();
		palabras.add("uno");
		palabras.add("aa");
		palabras.add("catorce");
		palabras.add("x");
		
//		Collections.sort(palabras, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.length() - o2.length();
//			}
//		});

		Collections.sort(palabras, (s1, s2) -> s1.length() - s2.length());
		
		System.out.println(palabras);
		
	}
}
