package StringProgrammes;

public class ExistCharacter {

	public static void main(String[] args) {
//		welcome  = wel, elc, lco, com, ome
//		rakesh  = ra, ak, ke, es, sh
		String s = "malayalam";
		
		for(int i=0;i<s.length();i++) {
			int j = i+3;
			if(j<=s.length()-1) {
				System.out.println(s.substring(i,j));
			}
		}
	}
}
