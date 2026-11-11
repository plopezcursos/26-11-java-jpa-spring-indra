package stream;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamParallel {
	public static void main(String[] args) {
		
		List<Integer> lista = 
			Stream.generate(() -> new Random().nextInt(10000))
			.limit(100_000_000)
			.toList();
		System.out.println(lista.size());
		
		long t0, tf;
		
		//stream secuencial
		t0 = System.currentTimeMillis();
		System.out.println(lista.stream().filter(n -> Math.log(n) > 8.75).count());
		tf = System.currentTimeMillis();
		System.out.println("Stream secuencial: " + (tf - t0));
		
		//stream paralelo
		t0 = System.currentTimeMillis();
		System.out.println(lista.parallelStream().filter(n -> Math.log(n) > 8.75).count());
		tf = System.currentTimeMillis();
		System.out.println("Stream paralelos: " + (tf - t0));
	}
}
