package StringProgrammes;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(anagram2("abb","bba"));
	}
	public static void anagram1() {
		String s1 = "blog";
		String s2 = "glob";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if (s1.length() != s2.length()) {
			System.out.println("not ana");
		} else {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if (Arrays.equals(c1, c2)) {
				System.out.println("Ana");
			} else {
				System.out.println("Not Ana");
			}
		}
	}
	public static boolean anagram2(String s1,String s2) {
         while(true) {
        	 if(s1.length()==s2.length()) {
        		 return true;
        	 }
        	 if(s1.length()!=s2.length()) {
        		 return false;
        	 }
        	 char c = s1.charAt(0);
        	 s1 = s1.replace(c+"", "");
        	 s2 = s2.replace(c+"", "");
         }
		
	}

}