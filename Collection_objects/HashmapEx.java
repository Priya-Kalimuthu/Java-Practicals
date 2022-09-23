package Collection_objects;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashmapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Fr", "France");
		map.put("In", "Indian");
		map.put("Ge", "Germany");
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("country code :"+entry.getKey()+" Country name :"+entry.getValue());
			
		}
		System.out.println("\n"+map.get("In"));
		
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("A10", "Priya");
		treeMap.put("A05", "Sri");
		treeMap.put("B40", "Satya");
		treeMap.put("B15", "Lakshmi");
		
		System.out.println("\nimplementing TreeMap :");
		for (Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.println("Code:"+entry.getKey()+" Name "+entry.getValue());
		
		}
		
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("A10", "Priya");
		hashtable.put("A05", "Sri");
		hashtable.put("B40", "Satya");
		hashtable.put("B15", "Lakshmi");
		
		System.out.println("\nimplementing Hashtable :");
		for (Map.Entry<String, String> entry : hashtable.entrySet()) {
			System.out.println("Code:"+entry.getKey()+" Name "+entry.getValue());
			
		}

	}

}
