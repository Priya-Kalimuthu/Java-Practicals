package MyProject;

public class DivisiblebyThree {
	static void result (int N) {
		
		for (int num = 0; num < N; num++) {       //iterate from 0 to N
			if (num % 3==0)
				System.out.println(num + "");
			
		}

	}

	public static void main(String[] args) {
		
		int N = 100;                               //input 
		result(N);                                 //calling function
		
			
	}

}
