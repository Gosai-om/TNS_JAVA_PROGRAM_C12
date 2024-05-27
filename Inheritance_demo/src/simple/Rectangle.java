package simple;

public class Rectangle {
	
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public double Area()
	{
		return length * breadth;
	}
	public double Perimeter()
	{
		return (length * breadth )*2;
	}
}
