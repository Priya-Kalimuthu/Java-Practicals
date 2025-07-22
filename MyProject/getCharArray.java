package MyProject;

public class getCharArray {

	public static void main(String[] args)  {

		
		String str1 = "Priya";
		char b[] = new char[4];
		str1.getChars(0,4,b,0);
		for(char content:b) {
			
			System.out.println(content);
	
			System.out.println("Character at index value="+str1.charAt(3));
		}
			
			
		
		
		
				

	}

}
