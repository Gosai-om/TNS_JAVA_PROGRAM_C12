package day5_1_Geometry;


public class Circle {

	private double radius;
	static final double PI = 3.14;

	public Circle(double radius) {
		//super();
		this.radius = radius;
	}

	public double getArea()
	{
		return PI*radius*radius;
	}
	
	public double getPerimeter()
	{
		return 2 * PI * radius;
	}
}
