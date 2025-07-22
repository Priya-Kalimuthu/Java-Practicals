package MyProject;

public class multiDarray_forloop {

	public static void main(String[] args) {
		
		int mdarray [][] = {{10,20,30,40},{1,2,3,4}};
		
		
		int i = 0;
		int j = 0;
		
		for(i=0; i<mdarray.length;i++) {
			for (j=0; j<mdarray[i].length;j++) {
				
				System.out.println(mdarray[i][j]);
			}
		}
			
			

	}

}
