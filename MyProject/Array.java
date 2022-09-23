package MyProject;

public class Array {

	public static void main(String[] args) {
		
		int [] marks = new int [5];
		
		marks[0] = 90;
		marks[1] = 80;
		marks[2] = 70;
		marks[3] = 75;
		marks[4] = 60;
		
		int x = marks[1];
		int y = marks[2];
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		int [] add;
		add = new int [5];
		add [1] = marks[1] + marks[1]; 
		
		System.out.println(add [1]);
		

	}

	public static void getChar(char[] a, int i) {
		// TODO Auto-generated method stub
		
	}

}
