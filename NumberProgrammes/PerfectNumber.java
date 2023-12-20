package NumberProgrammes;

public class PerfectNumber {

	//6 = divisors are = 1+2+3 = 6
	public static void main(String[] args) {
		int num = 6;
		int sum = 0;
		int temp = num;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum = sum + i;
			}
		}
		if(temp ==sum) {
			System.out.println("perfect..");
		}
		else {
			System.out.println("not perfecct....");
		}
	}
}
