package Collection_objects;

import java.util.Iterator;
import java.util.LinkedList;

public class A_Linkedlist {
	
	public static void main(String[] args) {
		
		LinkedList MyLinkedList = new LinkedList();
		
		MyLinkedList.add("Priya");
		MyLinkedList.add("Sri ");
		MyLinkedList.add("Sathya ");
		MyLinkedList.add("lakshmi ");
		MyLinkedList.add(null);
		
		Iterator iterator = MyLinkedList.iterator();
	
		for(int i = 0; iterator.hasNext(); i++ ) {
			
			System.out.println(iterator.next());
		}
		
		System.out.println("Iterating using for each:");
		for (Object Object : MyLinkedList) {
			
			System.out.println(Object);
			
		}
	}
}
