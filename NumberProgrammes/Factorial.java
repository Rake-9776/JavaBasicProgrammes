package NumberProgrammes;

public class Factorial {
       //fact digit sum,fact number
	public static void main(String[] args) {
		fact2();
	}
	public static void fact1() {
		int num = 5;
		int fact = 1;
		while(num>0) {
			fact = fact *num;
			num--;
		}
		System.out.println(fact);
	}
	public static void fact2() {
		int num = 123;
		int sum = 0;
		while(num>0) {
			 int fact = 1;
		     int rem = num%10;
		     for(int i=1;i<=rem;i++) {
		    	 fact = fact *i;
		     }
		     sum = sum + fact;
		     num/=10;
		}
		System.out.println(sum);
		
	}
}
