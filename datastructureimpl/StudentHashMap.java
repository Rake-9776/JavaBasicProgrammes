package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

class Student3 {

	String name;
	long mobileNo;
	String course;
	String email;
	double fee;
	public Student3(String name, long mobileNo, String course, String email, double fee) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.course = course;
		this.email = email;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mobileNo=" + mobileNo + ", course=" + course + ", email=" + email
				+ ", fee=" + fee + "]";
	}
	
}
public class StudentHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Key For Fetch :");
//		long key = sc.nextLong();
//		int key = sc.nextInt();
		
//		HashMap <Long,Student>hm = new HashMap<Long,Student>();
//		hm.put((long) 123, new Student("Rakesh",9776080,"java","rake@gmail.com",120000));
//		hm.put((long) 124, new Student("Akash",8777344,"python","raje@gmail.com",1520000));
//		hm.put((long) 125, new Student("Sammer",2455656,"java","rohit@gmail.com",130000));
//		System.out.println(hm.get(key));
		
//		HashMap <Integer,Student>hm = new HashMap<Integer,Student>();
		LinkedHashMap<Integer,Student3> hm = new LinkedHashMap<Integer,Student3>();
		hm.put(123, new Student3("Rakesh",9776080,"java","rake@gmail.com",120000));
		hm.put( 124, new Student3("Akash",8777344,"python","raje@gmail.com",1520000));
		hm.put( 125, new Student3("Sammer",2455656,"java","rohit@gmail.com",130000));
//		System.out.println(hm.get(key));
		System.out.println(hm);
		
	}
	
}

