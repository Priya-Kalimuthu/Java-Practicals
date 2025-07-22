package Inheritance;

public class A_Myclass1 extends A_Myclass {
	
	public void myMethod() {
		System.out.println("myMethod");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A_Myclass1 xyz = new A_Myclass1();
		
		xyz.myMethod();
		xyz.myFriend="Sri";
		
		System.out.println(xyz.myName);
		System.out.println(xyz.myFriend);
		

	}

}
