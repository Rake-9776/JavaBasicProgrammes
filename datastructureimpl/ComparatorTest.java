package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}

class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}

class SortByAge implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
}

public class ComparatorTest {
	public static void main(String[] args) {
		
		Student s1 = new Student(12,"Rakesh",26);
		Student s2 = new Student(10,"Surya",28);
		Student s3 = new Student(19,"Akash",25);
		Student s4 = new Student(15,"John",29);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println("---------------------sort by name---------------------");
//		Collections.sort(list,(e1,e2)->
//		              e1.name.compareTo(e2.name)
//				);
		
		Collections.sort(list,new SortByName());
		list.forEach(e->System.out.println(e));
		
		System.out.println("---------------------sort by age---------------------");

		Collections.sort(list,new SortByAge());
        list.forEach(System.out::println);
		
	}
}
