package Filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream outputStream = new FileOutputStream("D:\\Documents\\ABCD.txt",true);
		String str = ", Howare you";
		byte bArr[] =str.getBytes();  //converting string into byte
		outputStream.write(bArr);
		outputStream.close();
		System.out.println("file created");

	}

}
