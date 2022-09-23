package Collection_objects;

import java.util.ArrayList;
import java.util.Iterator;


public class Arraylist_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList List = new ArrayList<>();    //non-generic
		
		List.add("Priya");
		List.add("10");
		List.add("10.5");
		List.add("S");
		List.add("null");
		
		System.out.println("Iterating list:");
		Iterator itr1 = List.iterator();
		while (itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		ArrayList<String> List1 = new ArrayList<String>();    //generic
		List1.add("Priya");
		List1.add("Sri");
		List1.add("Sathya");
		
		System.out.println("\nIterating list using for each loop");
		for(String str : List1)
		{
			System.out.println(str);
		}
		
		
		
		

	}

}
