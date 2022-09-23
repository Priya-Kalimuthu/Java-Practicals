package MyProject;

public class sortname {
	
	String str= "PriyaSri";
	String str1 = "SriPriya";
	int length = 0;
	
	public  void names() {
		
		 String [] Names = {"Priya", "Sri", "Sivasathya", "Seetha" , "Lakshmi", "Siva"};
		 
		 for(int i =0;i<6;i++) 
		 {
			 
			 
		 
		 length = Names[i].length();
		 
		 if(length < 5) {
			 System.out.println("length is less than 5 for name=" + Names[i]);
		 }else {
			 System.out.println("length is greater than 5 for name=" + Names[i]);
		 }
		 }
		
		
		
		
	} 
	
	

	public static void main(String[] args) {
		
		sortname s = new sortname();
		s.names();
		
	}

}
