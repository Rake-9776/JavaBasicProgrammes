package ArrayProgrammes;

public class AddSumOfOddAndEven {

	public static void main(String[] args) {
		AddSumOfOddAndEven();
		AddSumOfOddAndEven2();
	}
	public static void AddSumOfOddAndEven() {
		int a[] = {2,3,5,6,7,8};
		
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("Even " + a[i]);
			}
			else {
				System.out.println("Odd " +a[i]);
			}
		}
	}
	public static void AddSumOfOddAndEven2() {
		int a[] = {2,3,5,6,7,8};
        int evenSum = 0;
        int oddSum = 0;
        
        for(int i=0;i<a.length;i++) {
        	if(a[i]%2==0) {
        		evenSum = evenSum + a[i];
        	}
        	else {
        		oddSum = oddSum +a[i];
        	}
        }
        System.out.println("Even Sum Is :"+evenSum);
        System.out.println("Odd Sum Is :"+oddSum);
		
	}

	
}
