package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Priya","Sri","Sathya","Seetha","Lakshmi","Muthu");
		
		
		Stream<String> allNames = names.stream();
		
		
		Stream<String> longNames = allNames.filter(str -> str.length()>4);
		
		
		longNames.forEach(str -> System.out.println(str));

	}

}
