package Constructor;

class AllAnimal{
	
	public void myDog(String str) {
		System.out.println("  myDog  "+str);
	}
	
	AllAnimal(){}
	
}

public class Animal extends AllAnimal {
	
	AllAnimal all = new AllAnimal();	
	
	public void myAnimal() {
	
		System.out.println("  myAnimal  ");
		all.myDog( "from myAnimal using -- all");
		super.myDog( "using super");
	}
	
	Animal(){
		System.out.println("  Animal  ");
		super.myDog( "using super");
		
	}

	public static void main(String[] args) {
		
	Animal a = new Animal();
	a.myDog("from main");
	a.myAnimal();

	}

	public void name() {
		// TODO Auto-generated method stub
		
	}

}

