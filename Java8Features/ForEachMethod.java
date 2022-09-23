package Java8Features;

import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Virudhunagar");
		list.add("Madhurai");
		list.add("Theni");
		list.add("Bodi");
		list.add("Chennai");
		
		list.forEach(str -> System.out.println(str));

	}

}
