package Java8Features;

@FunctionalInterface
interface Square{
	int square(int a); 
}

@FunctionalInterface
interface Circle{
	float circle(float r);
}

@FunctionalInterface
interface SimpleInterest{
	float simpleInterest(float p,float n,float r);
}

@FunctionalInterface
interface Percentage{
	float percentage(double m1,double m2 ,double m3);
}

public class squareFunctionalInterface {

	public static void main(String[] args) {
		
		Square s1 = (a) ->{
			return a*a;
		};
		
		Circle s2 = (r) ->{
			return 3.14f*r*r;	
		};
		
		SimpleInterest s3 = (p,n,r) ->{
			return p*n*r/100;
				
		};
		
		Percentage s4 = (m1,m2,m3)->{
			return (float) (m1+m2+m3/3);
		};
		
		System.out.println(s1.square(5));
		System.out.println(s2.circle(2));
		System.out.println(s3.simpleInterest(4, 2, 3));
		System.out.println(s4.percentage(5, 2, 2));
			
	}

}
