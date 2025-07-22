package Collection_objects;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Dog");
		queue.offer("Cat");
		queue.offer("Fox");
		queue.offer("Cow");
		queue.add("Cat");
		//queue.add(null);  //can't store null,other
		for (String string : queue) {
			System.out.println(string);
		}

	}

}
