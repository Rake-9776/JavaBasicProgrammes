package NumberProgrammes;

public class GreatestDigitFromaNumber {

	public static void main(String[] args) {
		int num = 20386;
		
		int gr= 0;
		int sm = 9;
		while(num>0) {
			int rem = num%10;
			if(rem>gr) {
				gr = rem;
			}
			else if(sm>rem) {
				sm = rem;
			}
			num/=10;
		}
		System.out.println("Greatest Digit is "+gr );
		System.out.println("Smallest Digit is "+sm);
	}
}
