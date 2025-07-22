package MyProject;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cls [][] = {{10,20,30,40,50,60,70,80,90}};
		
		int det = 0;
			
		det = (cls[0][4]*cls[0][8])-(cls[0][7]*cls[0][5]);
		
		System.out.println("det="+det);
		
		int a = det*cls[0][0];
		
		System.out.println("a="+a);
		

	}

}
