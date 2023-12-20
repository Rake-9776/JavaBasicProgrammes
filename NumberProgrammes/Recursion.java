package NumberProgrammes;

public class Recursion {

	// 12345 = 15 = 6(Output)
	public static void main(String[] args) {
//			int num = 12345;
//			
//			int sum = 0;
//			while(num>0) {
//				int rem = num%10;
//				sum = sum + rem;
//				num/=10;
//			}
//			int sum2 = 0;
//			while(sum>0) {
//				int rem1 = sum%10;
//				sum2 = sum2 + rem1;
//				sum/=10;
//			}
//			System.out.println(sum2);
//			System.out.println(m6(12345));
//			System.out.println(m1(5));
//			System.out.println(m2(1234));
//			m3(1234);
//		System.out.println(m4(12345));
//		System.out.println(m7(1223));
//		System.out.println(m8(1223));
//		System.out.println(rev(1234,0));
		
	}

	// 5 = 120(fact digit)
	public static int m1(int n) {
		if (n == 0) {
			return 1;
		}
		return n * m1(n - 1);
	}

	// 12345 = 5(count digit)
	public static int m2(int n) {
		if (n == 0) {
			return 1;
		}
		return 1 + m2(n / 10);
	}

	// 12345 = 54321(reverse digit)
	public static void m3(int num) {
		if (num == 0) {
			return;
		}
		int rem = num % 10;
		System.out.print(rem);
		m3(num / 10);
	}

	// 12345 = 5(last digit)
	public static int m4(int num) {
		if (num <= 0) {
			return 0;
		}
		int rem = num % 10;
		return rem + m1(num / 10);
	}

	// 12345 = 15 = 6
	public static int m6(int n) {
		if (n == 0)
			return 0;
		int a = n % 10 + m6(n / 10);
		if (a > 9)
			return m6(a);
		return a;
	}

	// prime number programme
	public static boolean m6(int num, int div) {
		if (num <= 2) {
			return (num == 2);
		} else if (num % div == 0) {
			return false;
		} else if (div * div > num) {
			return true;
		} else {
			return m6(num, div + 1);
		}
	}
	//1234  = 12
	public static int m7(int n) {
		if(n==0) {
			return 1;
		}
		int rem = n%10;
		return rem *m7(n/10);
	}
	//1234 = 10
	public static int m8(int n) {
		if(n==0) {
			return 0;
		}
		int rem = n%10;
		return rem + m8(n/10);
	}
	
}

