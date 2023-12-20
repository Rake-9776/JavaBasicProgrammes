package NumberProgrammes;

public class ArmStrongNumber {

	public static void main(String[] args) {
		for(int st=0;st<=1000;st++) {
			int n = st;
			int temp = n;
			int num = Arm(n);
			if(temp==num) {
				System.out.println("Arm"+num);
			}
		}
	}
	public static int Arm(int num) {
		int temp = num;
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			sum = sum + rem*rem*rem;
			num/=10;
		}
		return sum;
	}
	public static void Arm2(int num) {
		int temp = num;
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			sum = sum + rem*rem*rem;
			num/=10;
		}
		if(temp==sum) {
			System.out.println("Arm..");
		}
		else {
			System.out.println("Not Arm..");
		}
	}
	
}
