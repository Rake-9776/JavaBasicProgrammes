package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo  {


	public static <E> void main(String[] args) {
         
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(23);
		al.add(23);
		al.add(23);
		
		HashSet<String> set = new HashSet<String>();
		set.add("rakesh");set.add("ritesh");
		HashMap< ArrayList<Integer>,HashSet<String>> hm = new HashMap< ArrayList<Integer>,HashSet<String>> ();
	    
		hm.put(al.,set);
		
		for(Entry<HashSet<String>, ArrayList<Integer>> s: hm.entrySet())
		{
			System.out.println(s.getKey()+" "+s.getValue());
		}
		
		hm.forEach((e1,e2)->System.out.println(e1+" "+e2));
	
	
	}
}
