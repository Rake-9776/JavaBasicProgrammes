package ArrayProgrammes;

import java.util.Arrays;

public class InputOutputProgramme {

	// I/o = {2,3,10,1,5,7} => {20,10,10,10,10}
// in an array, if the elements are 1 & 2 multiply with 10, else replace with 10.
	
	public static void main(String[] args) {
		int arr[] = {2,3,10,1,5,7};
		
		for(int i=0;i<arr.length;i++) {
            if(arr[i]==2||arr[i]==1) {
            	arr[i] = arr[i] *10;
            }
            else {
            	arr[i] = 10;
            }
            System.out.print(arr[i]+" ");
		}
	}
	
	public void usingJava8() {
		int arr[] = {2,3,10,1,5,7};

		Arrays.setAll(arr, i -> (arr[i] == 1 || arr[i] == 4) ? 40 : 0);
        System.out.println(Arrays.toString(arr));
	}
}
