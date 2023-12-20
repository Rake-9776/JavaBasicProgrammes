package NumberProgrammes;

public class AutoMorphicNumber {

	public static void main(String[] args) {
		AutoMorphicNumber au = new AutoMorphicNumber();
		int num = 6;
		int temp = num;
		int sq = au.square(num, 2);
		int c = au.count(num);
		
		int res = sq%(int)Math.pow(10, c);
		if(res==temp) {
			System.out.println("auto..");
		}
		else {
			System.out.println("not auto..");
		}
	}
	public int square(int base,int exp) {
		int res = 1;
		for(int i=1;i<=exp;i++) {
			res = res*base;
		}
		return res;
	}
	public int count(int num) {
		int c = 0;
		while(num>0) {
			num/=10;
			c++;
		}
		return c;
	}
}
