package ArrayProgrammes;

import java.util.Arrays;

public class SecondHighestNumberFromArray {

	public static void main(String[] args) {
		secondHighest1();
		secondHighest2();
		secondHighest3();
	}

	public static void secondHighest3() {

		int[] arr = { 23, 34, 45, 6, 7, 78 };

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if(arr[i] > secondMax && arr[i] != max) {
				secondMax = max;
			}
		}
		System.out.println(secondMax);
	}

	// without using java8
	public static void secondHighest1() {
		int[] arr = { 1, 2, 3, 54, 56 };

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > max) {
				secondMax = max;
				max = num;
			} else if (num > secondMax && num != max) {
				secondMax = num;
			}
		}

		System.out.println("The second highest number is: " + secondMax);
	}

	// using java8
	public static void secondHighest2() {
		int[] arr = { 1, 2, 3, 54, 56 };

		Integer integer = Arrays.stream(arr).boxed().distinct().sorted((a, b) -> b - a).skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Array is empty or has only one element"));
		System.out.println(integer);
	}
}
