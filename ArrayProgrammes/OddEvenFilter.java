package ArrayProgrammes;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenFilter {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Original Array: " + Arrays.toString(numbers));

		int[] oddNumbers = filterOdd(numbers);
		int[] evenNumbers = filterEven(numbers);

		System.out.println("Odd Numbers: " + Arrays.toString(oddNumbers));
		System.out.println("Even Numbers: " + Arrays.toString(evenNumbers));
	}

	private static int[] filterEven(int[] numbers) {
		int[] array = Arrays.stream(numbers).filter(e -> e % 2 == 0).toArray();
		return array;
	}

	private static int[] filterOdd(int[] numbers) {
		int[] array = Arrays.stream(numbers).filter(e -> e % 2 != 0).toArray();
		return array;
	}
}
