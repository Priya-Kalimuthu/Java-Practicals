package MyProject;

public class Myenum {
	
	public enum days{ Monday, Tuesday, Wednesday, Thursday, Friday };
	
	public enum level{Low, Medium, High};
	
	public static void main(String[] args) {
		
		System.out.println(days.Monday);
		
		System.out.println(level.Medium);
		
		days myFav = days.Monday;
		System.out.println("myFav="+myFav);
		
		System.out.println("days.valueOf(\"Monday\")="+days.valueOf("Monday"));
		for( days d : days.values() ) {
					System.out.println("days.values = "+d);
				}
		System.out.println("days.valueOf(\"wednesday\").ordinal()="+days.valueOf("wednesday").ordinal());


		
	}


}


	