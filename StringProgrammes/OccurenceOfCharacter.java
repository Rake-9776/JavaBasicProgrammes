package StringProgrammes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurenceOfCharacter {
	
    //if "aaabbbbcc" = 3a4b2c
	public static void main(String[] args) {
		OccurenceOfCharacter2();
	}
	
	public static void OccurenceOfCharacter1() {
		String s = "aabbccddd";
		
		while(s.length()>0) {
			char c = s.charAt(0);
			String re = s.replace(c+"", "");
			int count = s.length()-re.length();
			System.out.println(c+"= "+count);
			s = re;
		}
	}
	
	public static void OccurenceOfCharacter2() {
		String mainString = "Hello, World! Hello, Universe!";
		String subString = "Hello";

		Pattern pattern = Pattern.compile(subString);
		Matcher matcher = pattern.matcher(mainString);

		int count = 0;
		while (matcher.find()) {
		    count++;
		}
		System.out.println("Occurrences: " + count);
	}
}
