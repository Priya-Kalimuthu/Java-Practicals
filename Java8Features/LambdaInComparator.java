package Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class LambdaInComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(101, "Laptop", 75000));
		list.add(new Product(102, "Camera", 50000));
		list.add(new Product(103, "Computer", 60000));
		list.add(new Product(104, "Mobile", 40000));
		list.add(new Product(105, "Speakers", 5000));
		
		Collections.sort(list, (p1,p2) -> {
			return p1.prodName.compareTo(p2.prodName);
			
			
		});
		list.forEach(p -> System.out.println(p));

	}

}
