package NumberProgrammes;

import java.util.Scanner;

public class Nivin {

	// 18 = 1+8 = 18%9 == 0
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num /= 10;
		}
		if (temp % sum == 0) {
			System.out.println("niven nu");
		} else {
			System.out.println("no niiven");
		}
	}
}
