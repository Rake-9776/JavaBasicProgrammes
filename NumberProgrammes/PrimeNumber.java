package NumberProgrammes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if (prime2(number)) {
			System.out.println(number + " is a prime.");
		} else {
			System.out.println(number + " is not prime.");
		}
//		prime1();

	}

	public static void prime1() {
		int num = 7;
		int c = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			System.out.println("prime");
		}
	}

	public static boolean prime2(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
