package PatternProgramme;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdCheck {

	// \\b = for any content match
	// \\d = for any digit match
	// \\s = for any space match
	// \\. = .(single dot match)

	public static void main(String[] args) {

		String text = "Emails: user1@example.com, user2@gmail.com, user3@yahoo.com";

		String pattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,7}\\b";

		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(text);

		if (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}

//Ex = \\b = Emails , [A-Za-z0-9._%+-] = user1 , @[A-Za-z0-9.-] = @example, \\.[A-Z|a-z]{2,7} = .com