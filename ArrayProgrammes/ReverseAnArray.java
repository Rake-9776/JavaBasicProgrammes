package ArrayProgrammes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnArray {

	public static void RverseAnArray() {
		int[] a = { 2, 3, 5, 6, 7 };
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + ", ");
		}
	}

	public static void RverseAnArray2() {
		int[] a = { 1, 2, 4, 6, 7 };
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));

	}

	public static void ReverseArray3() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] array = IntStream.range(0, arr.length).map((i) -> arr[arr.length - 1 - i]).toArray();

		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		RverseAnArray2();
		RverseAnArray();
	}

}
