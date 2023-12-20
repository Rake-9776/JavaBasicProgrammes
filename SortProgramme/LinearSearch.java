package SortProgramme;

public class LinearSearch {

	public static void main(String[] args) {
		int [] a= {2,3,45,7,9};
		System.out.println(search(a, 3));
		
	}
	public static int search(int [] a,int ele) {
		for(int i=0;i<a.length;i++) {
			if(a[i] ==ele) {
				return i;
			}
		}
		return -1;
	}
}
