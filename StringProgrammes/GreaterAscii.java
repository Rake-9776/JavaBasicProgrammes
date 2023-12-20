package StringProgrammes;

public class GreaterAscii {
	public static void main(String[] args) {
		grAscii();

	}

	public static void grAscii() {
		String s = "rake ku maharana1234";
		char greatestChar = 'a';

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 'a' && c <= 'z') {
				if (c > greatestChar) {
					greatestChar = c;
				}
			}
		}
		System.out.println("The greatest ASCII character is: " + greatestChar);

	}
}
