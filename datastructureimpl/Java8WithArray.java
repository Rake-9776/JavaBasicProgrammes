package collection;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8WithArray {

	public static void main(String[] args) {
		minormax();
		sumAll();
		oddNumber();
		average();
		specificEle();
		stringWithMap();
	}

	// Program to Find Maximum and Minimum Value in an Array Using JAVA8:
	public static void minormax() {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int mini = Arrays.stream(arr).min().orElse(Integer.MIN_VALUE);
		int maxi = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);

		System.out.println("minimum :" + mini);
		System.out.println("maximu :" + maxi);
	}

	// Program to Sum all Elements in an Array:
	public static void sumAll() {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int sum = Arrays.stream(arr).sum();
		System.out.println("sum is " + sum);
	}

	// Program to Filter Odd Numbers from an Array:
	public static void oddNumber() {
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int[] array = Arrays.stream(arr).filter(n -> n % 2 != 0).toArray(); // filter
		int[] array2 = Arrays.stream(arr).sorted().toArray(); // sorted

		System.out.println("Filter Odd Numbers :" + Arrays.toString(array));
		System.out.println("Sorted Number :" + Arrays.toString(array2));
	}

	// Program to Find Average of an Array:
	public static void average() {
		int[] numbers = { 5, 2, 9, 1, 7, 3, 8, 6, 4 };

		double average = Arrays.stream(numbers).average().orElse(0);

		System.out.println("Average: " + average);
	}

	// Program to Check if Array Contains a Specific Element:
	public static void specificEle() {
		int[] numbers = { 5, 2, 9, 1, 7, 3, 8, 6, 4 };
		int target = 7;

		boolean match = Arrays.stream(numbers).anyMatch(n -> n == target);

		System.out.println(match);
	}

	//Programme to check and collect name
	public static void stringWithMap() {

		String s = "Rakesh kumar mharana";
		String[] sp = s.split(" ");

		Map<Object, Object> collect = Arrays.asList(sp).stream()
				.collect(Collectors.toMap(e -> e, t -> t.equals("Rakesh")));

		collect.forEach((e, e1) -> System.out.println(e + " ==== " + e1));
	}

}
