package Collection_objects;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplClassesEx {

	private static final String[] LinkedHashSet = null;

	public static void main(String[] args) {
		Set<String> hset = new HashSet<String>();
		
		hset.add("Apple");
		hset.add("Banana");
		hset.add("Carrot");
		hset.add("Beetroot");
		hset.add("Tomato");
		hset.add(null);
		
		System.out.println("implementing Hashset :");
		for (String string : hset) {
			System.out.println(string);
		}
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		linkedHashSet.add("Briyani");
		linkedHashSet.add("Pasta");
		linkedHashSet.add("Noodles");
		linkedHashSet.add("Briyani");
		linkedHashSet.add("parotta");
		linkedHashSet.add(null);
		
		System.out.println("\nimplementing LinkedHAshSet : ");
		for (String string : linkedHashSet) {
			System.out.println(string);
		}
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Lotus");
		treeSet.add("Jasmine");
		treeSet.add("Rose");
		treeSet.add("Lilly");
		treeSet.add("Lotus");
		
		
		
		System.out.println("\nimplementing TreeSet : ");
		for (String string : treeSet) {
			System.out.println(string);
		}
		
		
		

	}

}
