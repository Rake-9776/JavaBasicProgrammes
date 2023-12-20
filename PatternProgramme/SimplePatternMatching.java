package PatternProgramme;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimplePatternMatching {
	 public static void main(String[] args) {
	        String text = "Hello, this is a sample text.";
	        String pattern = "sample";

	        Pattern p = Pattern.compile(pattern);
	        Matcher m = p.matcher(text);

	        if (m.find()) {
	            System.out.println("Pattern found!");
	        } else {
	            System.out.println("Pattern not found.");
	        }
	    }
}
