package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8WithCollection {

	public static void main(String[] args) {
		squareofList();
		filterEven();
		avarageNumber();
		specificChar();
		maxValue();
		filterList();
		listToMap();
		maxAndMinValue();
	}

	// Program to Find the Square of Numbers in a List:
	public static void squareofList() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(2);
		al.add(120);

		Object[] array = al.stream().map(n -> n * n).toArray();

		System.out.println(Arrays.toString(array));

	}

	// Program to Filter Even Numbers:
	public static void filterEven() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(25);
		al.add(120);

		al.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

	// Program to Find the Average of Numbers:
	public static void avarageNumber() {
		List<Integer> al = Arrays.asList(1, 2, 4, 5, 6);

		OptionalDouble average = al.stream().mapToDouble(Integer::doubleValue).average();

		if (average.isPresent()) {
			System.out.println("Average: " + average.getAsDouble());
		} else {
			System.out.println("No elements in the list.");
		}
	}

	// Program to Check if a String Contains a Specific Character:
	public static void specificChar() {
        String str = "Hello, World!";

		char target = 'o';

		boolean containsChar = str.chars().anyMatch(c -> c == target);

		System.out.println("String contains " + target + "? " + containsChar);
	}

	// Program to Find Maximum Value in a List:
	public static void maxValue() {
        List<Integer> lis = Arrays.asList(1,2,3,4,5,6);
        
        Optional<Integer> max = lis.stream().max(Integer::compareTo);
        
        max.ifPresent(value -> System.out.println("Maximum value: " + value));
	}
	//Program to Filter a List:
    public static void filterList() {
        List<String> names = Arrays.asList("John", "Jane", "Doe", "Alice");
        
        List<String> c = names.stream().filter(name->name.startsWith("J"))
        		.collect(Collectors.toList());
        System.out.println(c);
    }
    
    //Program to Convert a List to a Map:
    public static void listToMap() {
        List<String> names = Arrays.asList("John", "Jane", "Doe", "Alice");

        Map<String, Integer> co = names.stream()
        		.collect(Collectors.toMap(name->name, String::length));
    	
        System.out.println(co);
    }
    
    //Program to Find Maximum and Minimum Values in a List:
    public static void maxAndMinValue() {
        List<Integer> names = Arrays.asList(1,2,3,4,65);
        
        Optional<Integer> max = names.stream()
                .max(Integer::compareTo);

        Optional<Integer> min = names.stream()
                .min(Integer::compareTo);

        max.ifPresent(value -> System.out.println("Maximum value: " + value));
        min.ifPresent(value -> System.out.println("Minimum value: " + value));
    	
    }
    
	
	
}
