package FileHandling;

import java.io.IOException;

class AgeNotFoundElligible extends RuntimeException{
	
	public AgeNotFoundElligible(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
	    
public class ExceptionPropagation {

	public static void main(String args[])  {
	
		int age = 3;
		
		if(age<=10) {
			try {
				throw new AgeNotFoundElligible("Not Eligible");
			}catch (AgeNotFoundElligible e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
		}
		else {
			System.err.println("Eligible");
		}
	}
}
