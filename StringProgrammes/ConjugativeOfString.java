package StringProgrammes;

public class ConjugativeOfString {

	///if Suceess = Suces
	public static void main(String[] args) {
		String s = "Success";
		
		char[] ch = s.toCharArray();
		String s2 = "";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=ch[i+1]) {  //if not equal print all
				s2 = s2 + ch[i];
			}
			else {
				s2 = s2 + ch[i]; //if equal only print one time and i++
				i++;
			}
		}
		System.out.println(s2);
	}
}