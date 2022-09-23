package ControlFlow;

public class StraightlineEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 2;
		int c = 0;
		int y = 1;
		float x = 0f;
		
		
		
		while(y<=5) {
			
			x = (y - c)/m;
			
			System.out.println("x ="+ x + "and y =" +y);
			y++;
			
		}

	}

}
