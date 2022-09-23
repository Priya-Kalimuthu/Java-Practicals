package Constructor;

public class constructorclass {
	
	
	
	public void aMethod(String Wishes, int i) {
		System.out.println("aMethod");
		System.out.println("Wishes=..."+Wishes+ "i="+i);
	}
	constructorclass(){
		
		System.out.println("Default constructor....");
	}
	
	 constructorclass(String MyWishes, int j) {
		 this.aMethod(MyWishes, j);
		
		System.out.println("constructorclass");
		System.out.println("MyWishes=..."+MyWishes+"j="+j);
	}
	 
	 constructorclass(String ourWishes, char b ){
		 System.out.println("ourWishes=.."+ourWishes+ " b = "+b);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorclass a = new constructorclass("Good afternoon",3);
		constructorclass b = new constructorclass("Good night",'S');
		String Wishname = "Good morning";
		a.aMethod(Wishname, 2);
	}

}
