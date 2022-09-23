package Collection_objects;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Priya", 30));
		list.add(new Employee(102, "Sri", 35));
		list.add(new Employee(103, "Abi", 25));
		list.add(new Employee(104, "Divya", 20));
		
		System.out.println("Ascending order:");
		Collections.sort(list);
		for (Employee employee : list) {
			System.out.println(employee);
			
		}
		
		System.out.println("\nDescending order:");
		Collections.reverse(list);
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

}
