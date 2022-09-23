package MyProject;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String Mystring = "";          //empty typing
		String Mystring1 = null;       //null typing
		String Str = "I Love India";
		String Str1 = "SP";
		String Str2 = "SRIPRIYA";
		
		System.out.println("given string="+Mystring);
		System.out.println("given string="+Mystring1);
		System.out.println("given string="+Str);
		
		String Str3 = new String("java");
		System.out.println("given string="+Str3);
		
		String Str4 = new String();
		Str4 = "HTML";
		System.out.println("givan string="+Str4);
		
		String name = "Priya";
		String name2 = "Sri";
		String join = name + name2;
		
		System.out.println(join);
		
		String join1 = name.concat(name2);
		
		System.out.println(join1);
		
		char b[] = new char[4];
		name.toCharArray();
		System.out.println("name.toCharArray="+name.toCharArray());
		
		
		String Name = "Priya";
		String Name1 = "Priya";
		String Name2 = "PRIYA";
		int a = Name.compareTo(Name1);
		int e = Name.compareTo(Name2);
		System.out.println(a);
		System.out.println(e);
		
		String country = "India";
		String country1 = "INDIA";
		String country2 = "INDIAN";
		int c = country.compareToIgnoreCase(country1);
		int d = country1.compareToIgnoreCase(country2);
		System.out.println(c);
		System.out.println(d);
		
		String myEmptyStr = "";       
		String myBlankStr = "    ";
		System.out.println("myEmptyStr="+myEmptyStr);
		System.out.println("myBlankStr="+myBlankStr);
		
		myEmptyStr.isEmpty();
		myBlankStr.isBlank();
		
		myEmptyStr.isBlank();
		myBlankStr.isEmpty();
		
		System.out.println("myEmptyStr="+myEmptyStr.isEmpty());
		System.out.println("myBlankStr="+myBlankStr.isBlank());
		
		System.out.println("myEmptyStr="+myEmptyStr.isBlank());
		System.out.println("myBlankStr="+myBlankStr.isEmpty());
		
		String MyName = "Priya sri";
		
		boolean x = MyName.startsWith("Priya");
		boolean y = MyName.endsWith("sri");
		System.out.println(x);
		System.out.println(y);
		
		String lettercase = "ABCDEFGH";
		String lettercase1 = "abcdefgh";
		
		System.out.println("lettercase="+lettercase.toUpperCase());
		System.out.println("lettercase="+lettercase.toLowerCase());
		
		String Name3 = "   Priya   ";
		System.out.println("Name3.trim()="+Name3.trim());
		System.out.println("Name3.strip()="+Name3.strip());
		System.out.println("Name3.stripLeading()="+Name3.stripLeading());
		System.out.println("Name3.stripleading()="+Name3.stripTrailing());
		
		String a1 = "skillking";
		String a2 = "skillking";
		a1.contentEquals(a2);
		System.out.println("contentEquals="+a1.contentEquals(a2));
		
		
		String g = "Hello";
		String h = "!";
		for(int i=1;i<4;i++) {
			
			System.out.print(g.repeat(i)+h.repeat(i));
			
		}
			
		

	}

}
