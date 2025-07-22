package Java8Features;

@FunctionalInterface
interface Sayable1{
	String sat(String str);
}

public class LambaWithSinglePara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable1 s1 = (name)->{
			return "Hello "+name;
		};
		System.out.println(s1.sat("Priya"));

	}

}
