package PatternProgramme;

import java.util.regex.*;

public class MultiplePatternMatching {
    public static void main(String[] args) {
        String text = "The cat and the dog are playing.";
        String[] patterns = {"cat", "dog"};

        for (String pattern : patterns) {
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(text);

            while (m.find()) {
                System.out.println("Pattern '" + pattern + "' found at index " + m.start());
            }
        }
    }
    
}

