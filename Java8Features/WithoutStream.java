package Java8Features;

import java.util.ArrayList;

public class WithoutStream {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Priya");
		list.add("Sri");
		list.add("Sathya");
		list.add("Seetha");
		list.add("lakshmi");
		list.add("Muthu");
		
		int count = 0;
		for (String string : list) {
			if(string.length()<5)
				count++;
		}
		
		System.out.println("Threre are "+count+" strings with length less than 5");
		
	

	}

}
