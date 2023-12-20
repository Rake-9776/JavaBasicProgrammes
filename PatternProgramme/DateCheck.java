package PatternProgramme;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateCheck {
	public static void main(String[] args) {
		String text = "Dates: 2023-10-31, 2023-11-01, 2023-12-25";
		String pattern = "\\b\\d{4}-\\d{2}-\\d{2}\\b";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		while (m.find()) {
			System.out.println("Date found: " + m.group());
		}
	}

}
///     \\b = content, \\d = digit 