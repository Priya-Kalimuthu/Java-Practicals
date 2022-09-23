package ControlFlow;

public class A_SwitchJava {

	public static void main(String[] args) {
		
		int weekDay = 0;
		
		switch(weekDay) {
		case 1:
			
			System.out.println("Happy Sunday");
			break;
			
		case 2:
			System.out.println("Happy Monday");
			break;
			
		case 3:
			System.out.println("Happy Tuesday");
			break;
			
			default:
				System.out.println("This day is not listed.");
				break;
		}
		
		

	}

}
