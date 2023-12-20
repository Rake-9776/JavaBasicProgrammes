package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator1 {

	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		
		for(int i=1;i<=10;i++) {
			a.add(i);
		}
		
		ListIterator lis = a.listIterator(); //index number i pass here
		
		while(lis.hasNext()) {
		     int m =  (int) lis.next();
		     if(m==5) {
		    	 lis.set(100);
		     }
		}
		System.out.println(a);
	}
}
