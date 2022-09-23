package Inheritance1;

import Inheritance.*;
import Inheritance.A_Myclass;

public class A_Myclass2 {
	
	public void myMethod1() {
		System.out.println("myMethod1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A_Myclass2 ab = new A_Myclass2();
		A_Myclass abc = new A_Myclass();
		
		ab.myMethod1();
		
		System.out.println(abc.mySister);

	}
}
