package Exception_Handling;

public class Throw_ExceptionHandling {
	
	//int[] myNumbers = {11, 22, 33, 44, 55, 66, 77};
	
	String[] myFriends = {"Suresh","Mahesh", "Nilesh","Ganesh","Hitesh","Ritesh"};
	
	public void CheckAge(int MyAge) throws ArithmeticException {		
		int age = MyAge;		
		if(age < 17) {			
			//System.out.println("Not permitted");
			throw new ArithmeticException("You Are not permitted");			
		}else {
			System.out.println("Permitted");
		}				
	}
	
	public void CheckList(int rank) throws IndexOutOfBoundsException{
		
		int MyRank = rank;
		
		if (MyRank < 4 ) {
			throw new ArithmeticException("You are qualified--"+myFriends[rank+1]);
		}else {
			System.out.println("You are not qualified--"+myFriends[rank-1]);
		}
		
	}
	
	
	

	public static void main(String[] args) {
		Throw_ExceptionHandling e = new Throw_ExceptionHandling();
		//e.CheckAge(15);
		e.CheckList(5);

	}

}
