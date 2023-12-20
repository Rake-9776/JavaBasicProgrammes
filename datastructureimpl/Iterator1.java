package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Iterator1 {
  
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(12);
		a.add(123);
		a.add(13);
		a.add(10);
		Iterator<Object> it = a.iterator();
		while(it.hasNext()) {
			Integer l = (int)it.next();  
//			if(l%2!=0) {
//				it.remove();
//			}
			if(l%2==0) {
				System.out.println(l);
			}
			else {
				it.remove();
			}
		}
		System.out.println(a);
		
//		Vector v = new Vector();
//		v.add(122);
//		v.add(223);
//		
//		Enumeration ele = v.elements();
//		while(ele.hasMoreElements()) {
//			System.out.println(ele.nextElement());
//		}
//		
//		ListIterator<Object> lis2 = a.listIterator();
//		while(lis2.hasPrevious()) {
//			Object n = lis2.previous();
//			
//		}
	}
}
