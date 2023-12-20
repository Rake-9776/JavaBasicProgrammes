package PatternProgramme;

import java.util.regex.*;

public class HTMLCheck {
    public static void main(String[] args) {
        String html = "<div><h1>Heading</h1><p>Paragraph</p></div>";
        String pattern = "<[^>]+>";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(html);

        while (m.find()) {
            System.out.println("HTML Tag found: " + m.group());
        }
    }
}
