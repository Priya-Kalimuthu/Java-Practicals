package Java8Features;

import java.util.ArrayList;

public class WithStream {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Priya");
		list.add("Sri");
		list.add("Sathya");
		list.add("Seetha");
		list.add("lakshmi");
		list.add("Muthu");
		
		long count = list.stream().filter(str-> str.length()>=5).count();
		System.out.println("Threre are "+count+" strings with length greater than 5");

	}

}
