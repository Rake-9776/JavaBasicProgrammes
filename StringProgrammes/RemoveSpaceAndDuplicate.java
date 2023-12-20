package StringProgrammes;

public class RemoveSpaceAndDuplicate {
    
	public static void main(String[] args) {

	     String s = " aa b b cc ddd ";
         String s2 = "";

	     for(int i=0;i<s.length();i++) {
	    	 char c = s.charAt(i);
	    	 if(!s2.contains(c+"")) {
	    		 s2 =s2+c;
	    	 }
	     }
	     System.out.print(s2.trim());
	}
}
