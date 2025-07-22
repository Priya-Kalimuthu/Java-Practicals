package MyProject;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mdarray [][] = {{1,2,3,4},{10,20,30,40}};
		
		System.out.println(mdarray[0][0]);
		System.out.println(mdarray[0][1]);
		System.out.println(mdarray[0][2]);
		System.out.println(mdarray[0][3]);
		
		System.out.println(mdarray[1][0]);
		System.out.println(mdarray[1][1]);
		System.out.println(mdarray[1][2]);
		System.out.println(mdarray[1][3]);
		
		int det = 0;
		
		det = (mdarray[0][0]*mdarray[0][3])-(mdarray[0][2]*mdarray[0][1]);
		System.out.println("det="+det);
		
		det = (mdarray[1][0]*mdarray[1][3])-(mdarray[1][2]*mdarray[1][1]);
		System.out.println("det="+det);
			
	}

}
