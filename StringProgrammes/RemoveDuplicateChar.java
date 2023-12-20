package StringProgrammes;

public class RemoveDuplicateChar { //Or Remove Conjugative character

	public static void main(String[] args) {
		RemoveDuplicateChar1();
	}
	public static void RemoveDuplicateChar1() {
		String s  = "Successc";
		String temp = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(!temp.contains(c+"")) {
				temp = temp + s.charAt(i);
			}
		}
         System.out.println(temp);		
	}
	
	
}
