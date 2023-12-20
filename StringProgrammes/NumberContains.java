package StringProgrammes;


public class NumberContains {
	     //rakesh@123 = (yes contains)123
	public static void main(String[] args) {
		String s = "rakesh@123";
		
		String re = s.replaceAll("[^1-9]", "");
	    for(int i=0;i<re.length();i++) {
	    	char c = re.charAt(i);
	    	if(s.contains(c+"")) {
	    		System.out.println("yes contains number"+c);
	    	}
	    }
	}
}
