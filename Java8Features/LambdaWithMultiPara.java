package Java8Features;

@FunctionalInterface
interface Addable{
	int add(int a,int b);
}

public class LambdaWithMultiPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable ad1 = (x,y) -> {
			return x+y;
		};
		
		Addable ad2 = (p,q) -> p+q;
		
		System.out.println("Add : "+ad1.add(12, 26));
		System.out.println("Add : "+ad2.add(123, 381));

	}

}
