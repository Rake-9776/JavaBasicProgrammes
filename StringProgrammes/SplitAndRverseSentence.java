package StringProgrammes;

public class SplitAndRverseSentence {

	public static void main(String[] args) {
		SplitAndRverseSentence2();
	}
	public static void SplitAndRverseSentence1() {
		//maharana kumar rakesh  - reverse of sentence
		String s = "rakesh kumar maharana";
		String[] sp = s.split(" ");
		int i = 0;int j = sp.length-1;
		
		while(i<j) {
			String temp = sp[i];
			sp[i] = sp[j];
			sp[j] = temp;
			i++;
			j--;
		}
		for(String x:sp) {
			System.out.print(x+" ");
		}
	}
	public static void SplitAndRverseSentence2() {
		//maharana kumar rakesh  - reverse of character
		String s = "rakesh kumar maharana";
		String[] sp = s.split(" ");
		String temp = "";
		for(int i=sp.length-1;i>=0;i--) {
			temp = temp + sp[i]+" ";
		}
		System.out.println(temp);
	}
	
	
	
	
	
	
}
