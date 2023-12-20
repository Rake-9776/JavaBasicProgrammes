package StringProgrammes;

public class SwapLastTwoCharacter {
	public static void main(String[] args) {
		swapLastTwoCharacters();
	}

	public static void swapLastTwoCharacters() {
		String s = "Hello";
		char[] ch = s.toCharArray();
		int i = 3;
		int j = 4;

		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		System.out.println(ch);
	}
}
