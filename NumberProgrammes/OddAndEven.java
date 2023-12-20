package NumberProgrammes;

public class OddAndEven {

	//From a digit,sum of that odd and even digits
	public static void main(String[] args) {
		OddAndEven2();
	}
	public static void OddAndEven() {
		int num = 12345;
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				System.out.println("Even NUmbers "+rem);
			}
			else {
				System.out.println("Odd NUmbers "+rem);
			}
			num/=10;
		}
	}
	public static void OddAndEven2() {
		int num = 12334;
		int even = 0;
	    int odd = 0;
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				even = even + rem;
			}
			else {
				odd= odd + rem;
			}
			num/=10;
		}
		System.out.println("Sum of Even Numbers Are :"+even);
		System.out.println("Sum Of Odd Numbers Are :"+odd);
	}
}
