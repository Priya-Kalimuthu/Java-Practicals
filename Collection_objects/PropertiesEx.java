package Collection_objects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("C:\\Users\\ELCOT\\eclipse-workspace\\Priya1\\src\\Collection_objects\\db.properties");
		
		Properties p = new Properties();
		p.load(reader); //used to load properties file
		
		System.out.println("Usernmae : "+p.getProperty("Username"));
		System.out.println("Password : "+p.getProperty("Password"));

	}

}
