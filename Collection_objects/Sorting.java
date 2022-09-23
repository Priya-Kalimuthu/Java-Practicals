package Collection_objects;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Priya");
		list.add("Sri");
		list.add("Abi");
		list.add("Twinkle");
		
		Collections.sort(list);
		
		System.out.println("Sorting String objects :");
		for (String string : list) {
			System.out.println(string);
			
		}
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(50);
		list1.add(70);
		list1.add(20);
		list1.add(100);
		list1.add(30);
		
		Collections.sort(list1);
		
		System.out.println("\nSorting wrapper objects:");
		for (Integer integer : list1) {
			System.out.println(integer);
			
		}
		
		

	}

}
