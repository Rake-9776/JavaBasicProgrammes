package NumberProgrammes;

public class Neon {

	// 9 = 9*9 = 81 = 8+1 = 9
	public static void main(String[] args) {
		int num = 9;
		int temp = num;
		int sqr = num * num;
		int sum = 0;
		while (sqr > 0) {
			int rem = sqr % 10;
			sum = sum + rem;
			sqr /= 10;
		}
		if (temp == sum) {
			System.out.println("Neon");
		} else {
			System.out.println("Not Neon");
		}
	}
}
