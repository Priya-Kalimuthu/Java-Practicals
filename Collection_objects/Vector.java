package Collection_objects;

import java.util.Enumeration;

public class Vector {

	public static void main(String[] args) {
		
		java.util.Vector<String> vector = new java.util.Vector<String>();
		
		vector.addElement("Sathya");
		vector.addElement("Priya");
		vector.addElement("Lakshmi");
		vector.addElement("Sri");
		vector.addElement(null);
		
		Enumeration<String> ab = vector.elements();
		while (ab.hasMoreElements()) {
			System.out.println(ab.nextElement());
			
		}
	}

}
