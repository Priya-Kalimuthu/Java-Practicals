package Collection_objects;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Priya");
		list.add("Sri");
		list.add("Sathya");
		list.add(0,"Lakshmi");
		list.add("Siva");
		
		ListIterator<String> itr = list.listIterator();
		System.out.println("Iterating in forward direction :");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\niterating in backward direction :");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
