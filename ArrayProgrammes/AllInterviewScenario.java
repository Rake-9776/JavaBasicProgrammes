package ArrayProgrammes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllInterviewScenario {

	// find the second highest number from this array
	public static void main(String[] args) {

		// Add sum of Odd And Even
		// Remove Duplicate

		Integer[] arr = { 1, 2, 5, 6, 4, 1, 2, 3, 4 };
		search(arr);
		Integer[][] sum = findPairsWithSum(arr);
		for (Integer[] pair : sum) {
			System.out.println(Arrays.toString(pair));
		}
		stringOccurrenceExample();
	}

	// 1st interview
	private static void search(Integer[] arr) {
		// Array Occurence
		// Odd Even Filter

		List<Integer> asList = Arrays.asList(arr);
		Map<Object, Long> mp = asList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		mp.forEach((e1, e2) -> System.out.println(e1 + " = " + e2));
	}

	// 2nd interview
	public static Integer[][] findPairsWithSum (Integer[] arr) {
		int targetSum = 9;
		return Arrays.stream(arr)
				.flatMap(i -> Arrays.stream(arr).filter(j -> i + j == targetSum).map(j -> new Integer[] { i, j }))
				.distinct().toArray(Integer[][]::new);
	}

	// 3rd interview
	public static void stringOccurrenceExample() {
		String input = "java programming language java";
        String searchString = "java";

        long count = Arrays.stream(input.split(searchString))
                .filter(part -> !part.isEmpty())
                .count() - 1;

        System.out.println("The occurrence of \"" + searchString + "\" is: " + count);
	}

}
