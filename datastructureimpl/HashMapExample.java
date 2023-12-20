package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<>();
		hm.put(1, "rakesh");
		hm.put(2, "rajesh");   ///one put is called one entryset
		hm.put(3, "rahul");
		hm.put(2, "rooohit");
//		hm.put(null, null);   //null only accept once
		hm.put(9, null);
		hm.put(10, null);
		hm.put(null, "sanagata");   //duplicate keys are not allowed
		hm.put(null, "sammer");
		
		
		System.out.println(hm);
		
		HashMap<Object, Object> hm2 = new HashMap<>();
		hm2.putAll(hm);
		System.out.println(hm2);
		
		System.out.println(hm.get(1));
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsValue("rakesh"));
		
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
//        hm.clear();	
        
        Set<Object> ks = hm.keySet();
        Iterator<Object> it = ks.iterator();
        while(it.hasNext()) {
        	Object n = it.next();
        	Object o = hm.get(n);
        	System.out.println(n +" "+ o);
        }
        
//    	hm.forEach((key,value)->
//	      System.out.println(key +" "+ value));
        
	}
}
