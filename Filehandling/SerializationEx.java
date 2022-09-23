package Filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		
		Employee employee = new Employee(101, "Priya");
		
		FileOutputStream outputStream = new FileOutputStream("D:\\Documents\\ser.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(employee);
		outputStream.flush();
		System.out.println("Converted into Stream");
		
	}

}
