package NumberProgrammes;

public class HCF {
	
	public static void main(String[] args) {
		int a = 16;
		int b = 8;
		int num = 1;
		int gr = 0;
		while(num>0) {
			if(a%num==0&&b%num==0) {
				gr = num;
			}
			num++;
		}
		System.out.println(gr);
	}
}
