package ControlFlow;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		for (i=20, j=50, k=70; i<=20 && j<=60 && k<=80; i++, j++, k++) {
			System.out.println(i+"<...i and j...>"+j+"<...k...>"+k);
		}
		for (i=20, j=50, k=70; i<=20 || j<=60 || k<=80; i++, j++, k++) {
			System.out.println(i+"<...i and j...>"+j+"<...k...>"+k);
		}
			
		
	}

}
