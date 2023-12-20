package StringProgrammes;

public class PalidromeSubstring {
    // Using substring to find palindromes
    public static void main(String[] args) {
        String s = "malayalam";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) { // Corrected the end index
                String sub = s.substring(i, j);
                if (isPal(sub)) {
                    System.out.println(sub);
                }
            }
        }
    }

    public static boolean isPal(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

