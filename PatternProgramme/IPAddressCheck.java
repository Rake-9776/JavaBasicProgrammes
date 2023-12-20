package PatternProgramme;
import java.util.regex.*;
public class IPAddressCheck {
    public static void main(String[] args) {
        String text = "IP Addresses: 192.168.0.1, 10.0.0.1, 172.16.0.1";
        String pattern = "\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("IP Address found: " + m.group());
        }
    }
}

