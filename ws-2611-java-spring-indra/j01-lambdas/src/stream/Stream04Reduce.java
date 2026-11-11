package stream;

import java.util.List;

public class Stream04Reduce {
	public static void main(String[] args) {
		List<Integer> nums = List.of(17, -50, 88, 7);

		//Mayor número par
		System.out.println(
				nums.stream()
				.filter(n -> n % 2 == 0)
				.reduce(Math::max)
		);
		
		// producto de todos los números
		System.out.println(
				nums.stream()
				.reduce(1, (x, y) -> x * y)
		);
		
		// sumatorio de todos los números
		System.out.println(
				nums.stream()
				.reduce(0, (x, y) -> x + y)
		);
		
		System.out.println(
				nums.stream()
				.mapToInt(x -> x)
				.sum()
		);
		
		
	}
}
