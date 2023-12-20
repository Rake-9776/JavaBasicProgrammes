package StringProgrammes;

public class PalidromString {

	public static void main(String[] args) {
		String s = "massas";
		boolean b = palidromString2(s);
		System.out.println(b);
		
	}

	public void palidromString1() {
		String s = "RRARR";

		char[] c = s.toCharArray();
		int i = 0;
		int j = c.length - 1;
		while (i < j) {
			if (c[i] == c[j]) {
				System.out.println("palidrom");
				break;
			} 
			i++;
			j--;
		}
	}
	public static boolean palidromString2(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j) {
        	if(s.charAt(i)!=s.charAt(j)) {
        		return false;
        	}
        	i++;
        	j--;
        }
        return true;
	}
	
}
