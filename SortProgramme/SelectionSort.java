package SortProgramme;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = { 8, 6, 4, 3, 2, 0, 11 };
		sort(a);
		for (Integer x : a) {
			System.out.println(x);
		}
	}

	public static void sort(int [] a) {
		for(int i=0;i<a.length-1;i++) {
			int ind = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[ind])
				     ind = j;    ///i select here the index
			}
			int temp = a[ind];  //i swap here that 
			a[ind] = a[i];
			a[i] = temp;
		}
	}
}
