package Collection_objects;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "Priya", 30));
		list.add(new Student(102, "Sri", 35));
		list.add(new Student(103, "Abi", 25));
		list.add(new Student(104, "Lakshmi", 20));
		
		System.out.println("Sorting on basis age:");
		Collections.sort(list, new AgeComparator());
		for (Student student : list) {
			System.out.println(student);
			
		}
		
		System.out.println("Sorting on basis name:");
		Collections.sort(list, new NameComparator());
		for (Student student : list) {
			System.out.println(student);
			
		}

	}

}
