package Java8Features;

@FunctionalInterface
interface Sayable{
	public String say();
}

public class LambdaWithNoPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable s1 = ()->{
			return "Hello Useer";
		};
		System.out.println(s1.say());

	}

}
