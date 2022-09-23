package ControlFlow;

import java.sql.Date;

public class MyEnumSwitch {
	
	enum days{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY, SATURDAY}

	private static final Date SUNDAY = null;
	private static final Date MONDAY = null;
	private static final Date TUESDAY = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date day = Date.MONDAY;
		
		switch(day){  
		case SUNDAY:   
		 System.out.println("sunday");  
		 break;  
		case MONDAY:   
		 System.out.println("monday");  
		 break;
		case TUESDAY:
			System.out.println("tuesday");
			break;
		default:  
		System.out.println("other day");
		}
		
		

	}

}
