package designpatterns;

interface Shape {
	void draw();	//public,abstract
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("In rectangle class: draw()");
	}
	
}

class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("In Circle class: draw()");
	}
	
}

class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("In Square class: draw()");
	}
	
}

class ShapeFactory{
	public Shape getShape(String shapeType)
	{
		if(shapeType==null)
		{
			return null;
		}
		if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if(shapeType.equalsIgnoreCase("Square"))
			return new Square();
		
		return null;
	}
}

public class FactoryPatternDemo{
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//get an obj of circle and call it's draw()
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		
		//get an obj of rectangle and call it's draw()
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();		
		
		//get an obj of square and call it's draw()
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
		
	}
}













