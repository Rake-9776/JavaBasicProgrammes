package ArrayProgrammes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// Add Sum Of Odd And Even

		int[] arr = { 1, 2, 3, 2, 6, 4, 56, 6 };
		int[] se = remove2(arr);

		System.out.println(Arrays.toString(se));
	}

	private static int[] remove2(int[] arr) {

		Arrays.sort(arr);

		int ar1[] = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				ar1[index++] = arr[i];
			}
		}

		ar1[index++] = arr[arr.length - 1];

		return Arrays.copyOf(ar1, index);
	}
	
	public static void remove1() {
		int[]  arr = {1,2,3,9,4,1};

        int[] array = Arrays.stream(arr).distinct().sorted().toArray();
       
        System.out.println(Arrays.toString(array));
	}

}