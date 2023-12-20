package PatternProgramme;

import java.util.regex.*;

public class UrlCheck {
    public static void main(String[] args) {
        String text = "Visit my website: https://www.example.com";
        String pattern = "\\bhttps?://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]+[-a-zA-Z0-9+&@#/%=~_|]";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("URL found: " + m.group());
        }
    }
}
