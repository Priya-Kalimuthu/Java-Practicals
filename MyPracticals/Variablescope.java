package MyPracticals;

public class Variablescope {
	static int x=100;
	int y=50;

	public void method1() {
		x=200;
		System.out.println("method1......"+x);
		System.out.println("y="+y);
	}
	
	public void method2() {
		
		System.out.println("method2......"+x);
		System.out.println("y="+y);
	}
	
	public Variablescope( ) {
		
		System.out.println("constructor......"+x);
		System.out.println("y="+y);
	}
	
	public static void main(String[] args) {
		
		Variablescope SV =new Variablescope();
		SV.method1();
		SV.method2();
		System.out.println("x="+x);
		
	}

}
