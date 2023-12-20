package PatternProgramme;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberCheck {

	public static void main(String[] args) {
		String text = "Phone Numbers: (123) 456-7890, 555-555-5555";
		String pattern = "\\(\\d{3}\\)\\s\\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}";
		
        //String pattern1 = "[6-9][0-9]{9}";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		while (m.find()) {
			System.out.println("Phone Number found: " + m.group());
		}
	}
}
///  \\s = space , \\d = digit
