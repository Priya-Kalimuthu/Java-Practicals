package MyProject;

public class Stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Priya";
		String str2 = "Priya";
		
		if(str1.equals(str2)) {
			System.out.println("True"); 
		}
		else {
			System.out.println("False");
		}
		String str3 = "password";
		String str4 = "passwo";
		
		
		if(str1.equals(str4)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		String myStr = new String("yogesh");
		
		StringBuffer s = new StringBuffer("abcdef");
		s.append("xyz");
		 System.out.println(s);
		
		 StringBuffer s1 = new StringBuffer(7);
		 
		 s1.append(5);
		 System.out.println("append="+s1);
		 
		 myStr = myStr+"myName";
		 System.out.println("myStr="+myStr);
		 
		 s.capacity();
		 System.out.println("capacity="+s.capacity());
		 
		 System.out.println("reverse="+s.reverse());
		
		 System.out.println("s.charAt(2)="+s.charAt(2));
		 
		 System.out.println("s.deleteCharAt(3)="+s.deleteCharAt(3));
		 
		 System.out.println("s.length()="+s.length());
		 
		 System.out.println("s.replace()="+s.replace(3,6,"PQR"));
		 
		 StringBuffer s2 = new StringBuffer ("PRIYA");
			s2.replace(2, 3, str2);
			System.out.println(s2);
		


	}

}
