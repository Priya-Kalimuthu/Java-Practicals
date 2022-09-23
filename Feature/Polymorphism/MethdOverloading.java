package Feature.Polymorphism;

public class MethdOverloading {
	
	


	public void Methods(double a) {
		double a1 = 3.14*a*a;
		System.out.println("the area of circle is"+a1+"sq units");
	}
	public void Methods(float b) {
		System.out.println("the area of square is"+b*b+"sq units");
	}
	public void Methods(float a,float b) {
		System.out.println("the area of rectangle is"+a*b+"sq units");
	}
	
	public class Area extends MethdOverloading {
		public void Square (int a) {
			System.out.println("the area of square is="+a*a+"sq units");
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethdOverloading cd = new MethdOverloading();
	 
		cd.Methods(2.5);
		cd.Methods(3.0f);
		cd.Methods(2.0f, 3.0f);
		
		
		
		
		

	}
	
}
