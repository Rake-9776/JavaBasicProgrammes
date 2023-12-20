package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Stack;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 

 ///use of comparable 
//use of comparator
public class HighestSalary{
	private Integer id;
	private String name;
	private String village;
	private double salary;
	public HighestSalary(Integer id, String name, String village, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.village = village;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVillage() {
		return village;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary, village);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HighestSalary other = (HighestSalary) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(village, other.village);
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", village=" + village + ", salary=" + salary + "]";
	}

	public static <E> void main(String[] args) {
		
		HighestSalary d1 = new HighestSalary(1,"rakesh","jahada",1200.0);
		HighestSalary d2 = new HighestSalary(2,"aakesh","jahada",1500.0);
		HighestSalary d3 = new HighestSalary(0,"xakesh","jahada",233.0);
		
		ArrayList<HighestSalary> al = new ArrayList<HighestSalary>();
		al.add(d1);
		al.add(d2);
		al.add(d3);
		
		Comparator<HighestSalary> d = new Comparator<HighestSalary>() {

			@Override
			public  int compare(HighestSalary o1, HighestSalary o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getSalary()-o2.getSalary());
			}
		};
		
		HighestSalary max = al.stream().min(Comparator.comparing(HighestSalary::getSalary))
				.orElse(null);
		
		System.out.println("-----");
		System.out.println(max);
		System.out.println("----");
		for(HighestSalary sd:al) {
			System.out.println(sd);
		}
          		  
	}

}
