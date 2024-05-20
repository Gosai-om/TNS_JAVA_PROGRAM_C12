package GetArea;

public class Area {

	double length,breadth;
	
	public void setDim(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public double getArea()
	{
		return length*breadth;
	}
}
