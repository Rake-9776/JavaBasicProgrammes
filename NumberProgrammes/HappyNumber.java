package NumberProgrammes;

import java.util.HashSet;

public class HappyNumber {

	public static boolean happyNumber1(int num) {
		HashSet set = new HashSet();
		while(set.add(num))
		{
			int value = 0;
			while(num>0) {
				int rem = num%10;
				value = value + (int)Math.pow(rem, 2);
				num/=10;
			}
			num = value;
			
		}
		return num == 1;
	}
	public static void happyNumber2() {
		int num = 49;
		do {
			int sum = 0;
			while(num>0) {
				int rem = num%10;
				int sqr = rem*rem;
				sum = sum + sqr;
				num/=10;
			}
			num = sum;
		}
		while(num>9);
		if(num==1) {
			System.out.println("Happy..");
		}
	}
	public static void main(String[] args) {
		System.out.println(happyNumber1(11)?"happy":"unhappy");
	    happyNumber2();
	}
}
//if my loop is execute only one time there i can use do while
//Happy Numbers are = 13 = 1*1 + 3*3 = 10 = 1*1 + 0*0 = 1
//Happy Numbers are = 49 = 4*4 + 9*9 = 97 = 9*9+7*7= 130 = 1*1+3*3+0*0 = 10 = 1