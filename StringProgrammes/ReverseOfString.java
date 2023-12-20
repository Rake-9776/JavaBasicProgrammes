package StringProgrammes;

public class ReverseOfString {

	public static void main(String[] args) {
		ReverseOfString1();
		ReverseOfString2();
		ReverseOfString3();
	}
	public static void ReverseOfString1() {
		String s = "malaya";
		String temp = "";
		for(int i=s.length()-1;i>=0;i--) {
			temp = temp + s.charAt(i);
		}
		System.out.println(temp);
	}
	
	//without using any built-in method reveres a string
	public static void ReverseOfString2() {
        String s = "malayalam";
        char[] c = s.toCharArray();
        int i = 0,j = c.length-1;
        while(i<j) {
        	if(c[i]!=c[j]) {
        		char temp = c[i];
        		c[i] = c[j];
        		c[j] = temp;
        	}
        	i++;
        	j--;
        }
        System.out.println(c);
	}
	
	public static void ReverseOfString3() {
		String s = "Rakesh";    
		String temp = "";
		for(int i=0;i<s.length();i++) {
	         char c = s.charAt(i);
	         temp = c+temp;
		}
		System.out.println(temp);
	}
}
