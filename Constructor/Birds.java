package Constructor;
class A {
	A()
	{
		System.out.println("IN Animal");
	}
   A(int i)
	{
		System.out.println("IN Animal int"+i);
	}
   void name() {
	   System.out.println("Priya");
   }
}
public class Birds extends Animal{
	Birds()
	{
     super();
	System.out.println("IN Birds");
}
	Birds(int i)
	{
		super();
		System.out.println("IN Birds int"+i);
	}
	void lastnmae()
	{
		super.name();
		System.out.println("Sri");
	}


 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds b=new Birds(5);
		b.lastnmae();

	}

}



	
