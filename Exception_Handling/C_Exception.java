package Exception_Handling;

import java.util.Vector;

public class C_Exception {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.add("Lion");
		v.add("Fox");
		v.add("wolf");
		v.add("Deer");
		
		int i = 0;
		try {
			for(i=0;i>=0;i++);{
				System.out.println(v.get(i));
			}
		}catch(Exception A) {
			System.out.println("Sop="+A);
			System.err.println("Sep="+A);
		}


	}

}
