package NumberProgrammes;

public class DecimalToBinary {

	public static void main(String[] args) {
		int num = 7;
		int i = 1;
		int bin = 0;
		while(num>0) {
			int rem = num%2;
			bin = bin + (rem*i);
			num/=2;
			i = i*10;
		}
		System.out.println(bin);
	}  
}
