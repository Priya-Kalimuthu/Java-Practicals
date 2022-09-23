package Exception_Handling;

public class D_Exception {

	public static void main(String[] args) {
		
		int A = 0,B = 0,C = 0;
		int x = 40;
		String a = "Priya";
		
		try {
			int c = x/A*B;
			System.out.println("This is output");
		}catch(ArithmeticException Z) {
			System.out.println("ArithmeticException="+Z);
			
		}
		
	

	}

}
