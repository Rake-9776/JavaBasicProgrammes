package SortProgramme;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {12,2,3,5,0,6};
		sort(a);
		for(Integer x:a) {
			System.out.println(x);
		}
	}
//	public static void sort(int[] a) {
//		for(int i=0;i<a.length-1;i++) {
//			for(int j= 0;j<a.length-i-1;j++) {
//				if(a[j]>a[j+1]) {
//					int temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//		}
//	}
	
	protected static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

	
}
