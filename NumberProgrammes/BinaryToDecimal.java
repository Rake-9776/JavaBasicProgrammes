package NumberProgrammes;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int num = 111;
		int dec = 0;
		int i = 1;
	    while(num>0) {
	    	int rem = num%10;
	    	dec = dec + (rem*i);
	    	num = num/10;
	    	i = i*2;
	    }
	    System.out.println(dec);
	}
}
