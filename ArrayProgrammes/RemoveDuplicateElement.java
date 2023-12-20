package ArrayProgrammes;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 2, 8, 2 };
		
		RemoveDuplicateElement2();
	}
	public static void RemoveDuplicateElement2() {
		int a[] = { 2, 3, 5, 2, 8, 2 };

		HashSet<Integer> hs = new HashSet<>();
		for (int x : a) {
			hs.add(x);
		}

		for (int h : hs) {
			System.out.print(h+" ");
		}
	}
}
