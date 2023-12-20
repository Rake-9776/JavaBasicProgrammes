package NumberProgrammes;

public class MultiplyAndSum {
    ///25 = 2*2 + 5*5 = 4+25 = 29
   public static void main(String[] args) {
	   
	   int num = 25;
	   int sum = 0;
	   while(num>0) {
		   int rem = num%10;
		   int res  = rem*rem;
		   sum = sum + res;
		   num/=10;
	   }
	   System.out.println(sum);
   }
}
