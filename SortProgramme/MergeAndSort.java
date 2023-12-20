package SortProgramme;

//print dynamic array
public class MergeAndSort {
	public static void main(String[] args) {

		int[] a = {2,1,5,9,6};
		sort(a);
		for(int x:a) {
			System.out.println(x);
		}
		
	}
	
	public static void sort(int [] arr) {
		if(arr.length==1) return;
		
		int[] left = new int[arr.length/2];
		int right[] = new int[arr.length-left.length];
		
		for(int i=0;i<left.length;i++) {
			left[i] = arr[i];
		}
		int i=left.length;
		for(int j=0;j<right.length;j++) {
			right[j] = arr[i];   //point
			i++;
		}
		sort(left);
		sort(right);
		merge(left,right,arr);
		
	}
	public static void merge(int [] a,int [] b,int []c) {
		int i=0,j=0,k=0;
		
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {                                        ////  left[]  right[]
				c[k] = a[i];    // if small keep left side of array Ex- [1,2,3,4,5,6,7,8]
				k++;
				i++;
			}
			else {
				c[k]  = b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			c[k] = a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k] = b[j];
			j++;
			k++;
		}
	}
}

//        left(a)- [ 1,2,4,5] right(b)- [6,7,8,9](sort array) - > (c)[1,2,3,4,5,6,7,8,9] (merge array)
