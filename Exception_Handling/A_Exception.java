package Exception_Handling;

public class A_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		
		
		int c =0;
		
		try {
			c = a/b;
			
		}catch (ArithmeticException e) {
			System.out.println("e="+e);
			
		}
		
		System.out.println("c="+c);
	}

}
