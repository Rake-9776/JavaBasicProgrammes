package StringProgrammes;

public class ChageCase {

	public static void main(String[] args) {
		String s = "rakesh";
		ChageCase1();
	}
	public static void ChageCase1() {
		String s = "Rakesh";
		String temp = "";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			char c1 = ' ';
			if(c>='A'&&c<='Z') {
				 c1 = (char)(c+ 32);
			}
			else if(c>='a'&&c<='z') {
				c1 = (char)(c-32);
			}
			temp = temp + c1;
		}
		System.out.println(temp);
	}
}
