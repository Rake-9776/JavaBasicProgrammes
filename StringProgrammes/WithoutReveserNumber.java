package StringProgrammes;

public class WithoutReveserNumber {

	public static void main(String[] args) {
		String s = "rakesh20maharana";
		String reversed = reverseStringWithoutNumbers(s);
		System.out.println(reversed);
		System.out.println(reverseString(s));
	}

	public static String reverseStringWithoutNumbers(String s) {
		StringBuilder reversed = new StringBuilder();
		StringBuilder numbers = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				numbers.append(c);
			} else {
				reversed.append(c);
			}
		}

		return numbers.toString() + reversed.reverse().toString();
	}

	public static String reverseString(String input) {
		char[] characters = input.toCharArray();
		int left = 0;
		int right = characters.length - 1;

		while (left < right) {
			// Swap characters
			if (Character.isLetter(characters[left]) && Character.isLetter(characters[right])) {
				char temp = characters[left];
				characters[left] = characters[right];
				characters[right] = temp;
				left++;
				right--;
			} else if (Character.isDigit(characters[left])) {
				left++;
			} else if (Character.isDigit(characters[right])) {
				right--;
			}
		}

		return new String(characters);
	}

	//input="rakes12ma34mah" output="mah34am12sekar"
	public static String reverseString1(String input) {
		char[] characters = input.toCharArray();
		int left = 0;
		int right = characters.length - 1;

		while (left < right) {
			// Swap characters
			if (Character.isLetter(characters[left]) && Character.isLetter(characters[right])) {
				char temp = characters[left];
				characters[left] = characters[right];
				characters[right] = temp;
				left++;
				right--;
			} else if (Character.isDigit(characters[left]) && Character.isDigit(characters[right])) {
				left++;
				right--;
			} else if (Character.isDigit(characters[left])) {
				right--;
			} else if (Character.isDigit(characters[right])) {
				left++;
			}
		}

		return new String(characters);
	}
	
}
