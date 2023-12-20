package NumberProgrammes;

public class LCM {

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int num = 1;
		int lcm = 0;
		while(num>0) {
			if(num%a==0&&num%b==0) {
				lcm = num;
				break;
			}
			num++;
		}
		System.out.println(lcm);
	}
}
