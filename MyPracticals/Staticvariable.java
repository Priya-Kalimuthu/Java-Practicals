package MyPracticals;

public class Staticvariable {
	

	public void method1() {
		int x = 200;
		 int y=10;
		System.out.println("method1......"+x);
		System.out.println("y="+y);
	}
	
	public void method2() {
		int y = 150;
		System.out.println("method2......");
		System.out.println("y="+y);
	}
	
	public Staticvariable( ) {
		int y = 500;
		System.out.println("constructor......");
		System.out.println("y="+y);
	}
	
	public static void main(String[] args) {
		
		Staticvariable SV =new Staticvariable();
		SV.method1();
		SV.method2();
		
		
	}

}
