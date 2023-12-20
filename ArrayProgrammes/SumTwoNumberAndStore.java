package ArrayProgrammes;

import java.util.Arrays;

///core java practice.......


public class SumTwoNumberAndStore {
    
	//[1,4,6,7,8,9] = whose sum is 10 
	public static void main(String[] args) {
         int[] arr = {1,4,6,7,8,9};
         
         int []arr1 = new int[2];
         int ind = 0 ;
         for(int i=0;i<arr.length-1;i++) {
        	 if(arr[i]+arr[i+1]==10) {
        		 arr1[ind++] = arr[i];
        		 arr1[ind++] = arr[i+1];
        	 }
         }
         System.out.println(Arrays.toString(arr1));
         
	}

}