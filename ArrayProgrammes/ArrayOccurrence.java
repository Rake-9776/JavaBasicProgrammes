package ArrayProgrammes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayOccurrence {
	
	////Interview Asked Question
	public static void ArrayOccurence1() {
		int[] array = { 1, 2, 3, 4, 1, 2, 3, 5, 1, 2 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : array) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Number " + entry.getKey() + " occurs " 
		                                         + entry.getValue() + " times.");
		}
	}

	public static void ArrayOccurenceUsingJava82() {
		int[] array = { 1, 2, 3, 4, 1, 2, 3, 5, 1, 2 };

		Map<Integer, Long> collect = Arrays.stream(array).boxed()
				.collect(Collectors.groupingBy(arr -> arr, Collectors.counting()));

		collect.forEach((number, count) -> System.out.println("Number " + number + " occurs " + count + " times."));

	}

	public static void main(String[] args) {
		ArrayOccurenceUsingJava82();
		ArrayOccurence1();
	}

}
