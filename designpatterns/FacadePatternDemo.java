package designpatterns;

import java.util.Scanner;

interface Mobileshop{
	public void modelno();
	public void price();
}
class IPhone implements Mobileshop{

	@Override
	public void modelno() {
		// TODO Auto-generated method stub
		System.out.println("IPhone 6 Pro");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.85000");
		
	}
}
class Tecno implements Mobileshop{

	@Override
	public void modelno() {
		// TODO Auto-generated method stub
		System.out.println("Tecno");
			
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.30000");
			
	}
}
class Redmi implements Mobileshop{

	@Override
	public void modelno() {
		// TODO Auto-generated method stub
		System.out.println("Redmi");
			
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.40000");
			
	}
	
}

class ShopKeeper{
	private Mobileshop iphone;
	private Mobileshop tecno;
	private Mobileshop redmi;
	
	public ShopKeeper() {
		iphone = new IPhone();
		tecno = new Tecno();
		redmi = new Redmi();
	}
	
	public void iphonesale() {
		iphone.modelno();
		iphone.price();
	}
	public void TecnoSale() {
		tecno.modelno();
		tecno.price();
	}
	public void RedmiSale() {
		redmi.modelno();
		redmi.price();
	}
}

public class FacadePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		
		ShopKeeper shopKeeper = new ShopKeeper();
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter Your Choice. Press\n 1.IPhone\n 2.Tecno\n 3.Redmi\n 4.Exit");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:shopKeeper.iphonesale();
				break;
			case 2:shopKeeper.TecnoSale();
				break;
			case 3:shopKeeper.RedmiSale();
				break;
			default: System.out.println("Invalid choice");
				break;
			}
		}
		while(choice!=4);

	}
}


