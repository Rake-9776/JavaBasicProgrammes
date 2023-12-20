package StringProgrammes;

public class RemoveSpace {

	public static void RemoveSpaceusingSplit() {
		//maharana kumar rakesh  - reverse of character
		String s = "rakesh kumar maharana";
		String[] sp = s.split(" ");
		String temp = "";
		for(int i=0;i<sp.length;i++) {
			temp = temp + sp[i]+"";
		}
		System.out.println(temp);
		
	}
	
	public static void main(String[] args) {
		RemoveSpaceusingSplit();
	}
}
