package Collection_objects;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("Tea");
		deque.offer("Coffee");
		deque.offer("Cool drinks");
		deque.offer("Tea");
		deque.offerFirst("Pizza");
		deque.offerLast("Sandwitch");
		
		for (String string : deque) {
			System.out.println(string);
		}
		
		System.out.println("\nremoving 1st element :");
		deque.pollFirst();
		for (String string : deque) {
			System.out.println(string);
		}
		
		System.out.println("\nremoving Last element :");
		deque.pollLast();
		for (String string : deque) {
			System.out.println(string);
		}
		

	}

}
