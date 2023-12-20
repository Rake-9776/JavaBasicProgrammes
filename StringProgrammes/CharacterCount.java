package StringProgrammes;

public class CharacterCount {

	public static void main(String[] args) {
		CharacterCount2();
	}
	public static void CharacterCount1() {
		String s = "rakesh";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='a'&&c<='z'||c>='A'&&c<='Z') {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void CharacterCount2() {
        String s  = "rakesh123@gmail.com";
        int vc = 0;
        int cc = 0;
        int sc = 0;
        int nc = 0;
        String vowels = "aeiouAEIOU";
        
        for(int i=0;i<s.length();i++) {
        	char c = s.charAt(i);
        	if(vowels.contains(c+"")) {
        		vc++;
        	}
        	else if(vowels.contains(c+"")!=(c>='a'&&c<='z'||c>='A'&&c<='Z')) {
        		cc++;
        	}
        	else if(c>='0'&&c<='9') {
        		nc++;
        	}
        	else {
        		sc++;
        	}
        }
        System.out.println("Vowels: "+vc);
        System.out.println("Consonents: "+cc);
        System.out.println("Numbers: "+nc);
        System.out.println("Special: "+sc);
	}
}
