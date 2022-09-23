package MyProject;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float Array [] = new float [4];
		
		float percentages [] = {50.2f, 50.3f, 50.4f, 50.5f};
		
		float a = percentages[0];
		float b = percentages[1];
		float c = percentages[2];
		float d = percentages[3];
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		
		
		String Names [] = {"Sri", "Divya", "Abi", "Sathya"};
		
		System.out.println(Names[0]);
		System.out.println(Names[1]);
		System.out.println(Names[2]);
		System.out.println(Names[3]);
		
		String copynames [] = Names; 
		
		System.out.println(copynames[0]);
		System.out.println(copynames[1]);
		System.out.println(copynames[2]);
		System.out.println(copynames[3]);
			
	}
		

}
