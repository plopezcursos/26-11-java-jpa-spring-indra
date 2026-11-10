package stream;

import java.util.List;
import java.util.Optional;

public class Stream03TerminalesSumAvg {
	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 3, 4);

		Optional<Integer> maximo = nums.stream().max(Integer::compareTo);
		System.out.println(maximo.orElse(Integer.MAX_VALUE));
		
		//.min

		System.out.println(nums.stream().mapToInt(i -> i).sum());
		System.out.println(nums.stream().mapToDouble(Integer::doubleValue).average().getAsDouble());
	}
}
