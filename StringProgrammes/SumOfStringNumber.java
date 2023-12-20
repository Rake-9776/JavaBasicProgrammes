package StringProgrammes;

public class SumOfStringNumber {

	public static void main(String[] args) {
		SumOfStringNumber1();
	}
	public static void SumOfStringNumber1() {
		String s = "12 34";
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(c>='0'&&c<='9') {
				int num = c-48;
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
	public static void SumOfStringNumber2() {
        String s1 = "14";
        String s2 = "23";
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        System.out.println(n1+n2);
	}
	public static void SumOfStringNumber3() {
		String s = "java20 is a progra10mming la80guage";
	    int sum = 0;
		StringBuilder st = new StringBuilder();
		char[] ch = s.toCharArray();
		for(char a: ch) {
			if(Character.isDigit(a)) {
				st.append(a);
			}
			else if(st.length()>0) {
				sum = sum  + Integer.parseInt(st.toString());
				st.setLength(0);
			}
		}
		if(st.length()>0) {
			sum = sum  + Integer.parseInt(st.toString());
		}
		System.out.println(sum);
	}
}
