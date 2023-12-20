package StringProgrammes;

public class EncryptionString {
 
	//if "rakesh" = "tcmguj"  
	public static void main(String[] args) {
		String s = "sidhart";
		int n = 2;
		System.out.println(encrypt(s,n));
	}
	public static String encrypt(String s,int n) {
		char[] c = new char[26];
		char ch = 'a';
		for(int i=0;i<26;i++) {
			c[i] = ch;
			ch++;
		}
		String s2 = "";
		for(int i=0;i<s.length();i++) {
			char x = s.charAt(i);
			int ind = x - 'a';
			ind += n;
			s2 += c[ind%26];
		}
		return s2;
	}
}
