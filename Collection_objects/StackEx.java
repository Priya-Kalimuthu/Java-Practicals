package Collection_objects;
import java.util.Stack;
public class StackEx {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.add("Priya");
		stack.push("Sri");
		stack.push("Sathya");
		stack.push("Lakshmi");
		stack.push("Siva");
		stack.push(null);
		
		
		System.out.println(stack);
		
		System.out.println("removing element :"+stack.pop());
		System.out.println("removing element :"+stack.pop());
		System.out.println(stack);
		
		System.out.println("searching element:" +stack.search("Sathya"));
		
		System.out.println("searching element:" +stack.search("Dazz"));
		System.out.println("searching element:" +stack.search("Priya"));

		
		

	}

}
