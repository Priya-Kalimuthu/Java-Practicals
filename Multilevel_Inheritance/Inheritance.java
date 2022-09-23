package Multilevel_Inheritance;

class Shapes{
	
	public void name() {
		System.out.println("NAMES");
	}
}

class Square extends Shapes{
	
	public void area() {
		System.out.println("Area of Square");
	}
}

class cube extends Shapes{
	
	public void volume() {
		System.out.println("volume of cube");
	}
}

public class Inheritance{
	public static void main(String[] args) {
	
		Square ab = new Square();
		ab.area();
		
		cube cd = new cube();
		cd.volume();
		

	}

}

