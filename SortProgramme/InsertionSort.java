package SortProgramme;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 2, 5, 8, 34, 1, 0 };
		sort(a);

		for (int o : a) {
			System.out.println(o);
		}
		sort2();
	}

	public static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i]; // if key = 5 if key = 8
			int j = i - 1; // if j = 0 j = 1 , j = 0
			while (j > -1 && a[j] > key) { // key value is always same j value only change
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key; // it assign that value on that particular index pos. a[0+1] = 5
		}
	}

	public static void sort2() {
		int[] a1 = { 2, 5, 8, 34, 1, 0 };

		for (int i = 1; i < a1.length; i++) {
			int j = i - 1;
			int key = a1[i];

			while (j >= 0 && a1[j] >= key) { //if this condition true insert value
				a1[j + 1] = a1[j];
				j--;
			}
			a1[j + 1] = key;
		}

		for (int o : a1) {
			System.out.println(o);
		}
	}
}
