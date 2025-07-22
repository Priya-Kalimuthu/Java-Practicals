package MyPracticals;

import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) {
		
		int a = 90;
		float b = 90f;
		double c = 90.99d;
		int e = 60;
		String d ="30";
		
		int H = a+(int)b; //type casting from float to int
		System.out.println("H="+H);
		
		float f = a+b;  //to convert float no need to use type cast
		System.out.println("f="+f);
		
		int g = a+(int)c;  //type casting from double to int
		System.out.println("g="+g);
		
		int i = a+Integer.parseInt(d);  //type casting from string to int
		System.out.println("i="+i);
		
		double k =c+Double.parseDouble(d);  //type casting from string to double
		System.out.println("k="+k);
		
		float l =(float)c+Float.parseFloat(d);  //type casting from double to float and string to float
		System.out.println("l="+l);
		
		String j = Integer.toString(a)+Double.toString(c);
		System.out.println("j="+j);
		
		System.out.println(String.valueOf(g));
		
		
		
	}

}
