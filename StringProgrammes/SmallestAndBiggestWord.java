package StringProgrammes;

public class SmallestAndBiggestWord {

//34. welcome to java programming  find small word - to ,big word - programming

	public static void main(String[] args) {
		String s = "rakesh kumar jmaharana is a best boy";

		String[] sp = s.split(" ");
		String bigc = sp[0];
		String smlc = sp[0];

		for (int i = 0; i < sp.length; i++) {
			if (sp[i].length() > bigc.length()) {
				bigc = sp[i];
			}

			else if (sp[i].length() < smlc.length()) {
				smlc = sp[i];
			}
		}
		System.out.println("Big: " + bigc);
		System.out.println("Small: " + smlc);
	}

	public static void grChar() {
		String s = "rakesh kumar jmaharana is a best boy";

		char greatestChar = Character.MIN_VALUE;
		char smallestChar = Character.MAX_VALUE;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c > greatestChar) {
				greatestChar = c;
			}
			if (c < smallestChar) {
				smallestChar = c;
			}
		}

		System.out.println("Greatest character: " + greatestChar);
		System.out.println("Smallest character: " + smallestChar);
	}
}
