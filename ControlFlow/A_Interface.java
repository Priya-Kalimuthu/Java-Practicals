package ControlFlow;

public class A_Interface implements MyInterface {
	
	float a = 0.2f;
	
	public void myMethod() {
		System.out.println("myMethod="+a);
	}
		
	public void urMethod() {
		System.out.println("urmethod");
	}
	
	public void ourMethod() {
		myMethod();                     //method calling one method to another method
		System.out.println("ourMethod");
	}
	
	public void xyzMethod() {
		System.out.println("xyzMethod");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A_Interface abc = new A_Interface();
		
		
		abc.urMethod();
		abc.myMethod();
		abc.ourMethod();
		abc.xyzMethod();
		
		

	}

}
