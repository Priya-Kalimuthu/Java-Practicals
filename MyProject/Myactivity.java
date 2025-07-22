package MyProject;

public class Myactivity {
	
	String Mystring = "";
	
	public void myMethod () {
		Mystring = "Priya";
		System.out.println("myname="+Mystring);
	}
	
	public void myMethod1 () {
		
		Mystring = "abcdefghijklmno";
		
		
		System.out.println(Mystring.indexOf("g"));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myactivity m = new Myactivity();
		
		m.myMethod();
		m.myMethod1();
	

	}

}
