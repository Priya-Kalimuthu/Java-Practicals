package ControlFlow;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int j = sc.nextInt();
		for(int i=2; i<=10;i++) {
			if(j%i==0) {
				
				System.out.println(i);
				
				v.addElement(i);
			}
		}
		
		if (v.size() == 0) {
			
			System.out.println("This is a prime number");
		}

	
	}

}
