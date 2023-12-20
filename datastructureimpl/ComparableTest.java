package collection;

import java.util.Arrays;

class Student2 implements Comparable{
	private int id;
	private String name;
	public Student2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "ComparableForStudent [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
//		if(this.getId()>o.id) {
//			return 1;             FOR ID
//		}
//		return -1;
		
		return name.compareTo(((Student2)o).name);
		
	}
	
}
public class ComparableTest{

	
	public static void main(String[] args) {
		Student2 s1 = new Student2(1, "Rakesh");
		Student2 s2 = new Student2(0, "Aajesh");
		Student2 s3 = new Student2(2, "Rahul");
		Student2 s4 = new Student2(3, "Zubil");
		
		Student2 [] s = {s1,s2,s3,s4};
		
		Arrays.sort(s);
		
		for(Student2 c:s) {
			System.out.println(c);
		}
	}
}
/*        Comaparable                                    Comparator
 * it is providing single sorting sequence      it is providing multiple sorting sequence
 * comparable effect the original class         it doesnot effect the original class
 * comparable is providing default sorting      comparator is providing custome sorting
 * comparable is present in java.lang package   comparator is present in java.util package
 * and its having compareTo method              and its having compare method
 */