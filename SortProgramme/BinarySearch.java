package SortProgramme;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {12,3,6,9,56};
		System.out.println(search(a,6));
	}
	public static int search(int [] a,int ele) {
            int st = 0;int ed = a.length;
            
            while(st<=ed) {
            	int mid = (st+ed)/2;
            	if(ele==a[mid]) return mid;
            	else if(ele<a[mid])  ed = mid-1;
            	else 
            	  st=mid+1;
            }
            return -1;
	 }
	
}
