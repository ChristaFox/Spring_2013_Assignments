/*******************************************************
* Name:Christa Fox
* Assignment: A05
*******************************************************/

public class Circle
{
	//feilds
	private double radius;
	
	//constructors
	public Circle(double i)
	{
		setRadius(i);
	}
	
	//method
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double r)
	{
		if (r >= 0)
		{
			radius = r;
		}
		else
		{
			radius = 0;
		}
	}
	
	public double diameter()
	{
		return (radius * 2);
	}
	
	public double area()
	{
		return (Math.PI * radius * radius);
	}
	
	public double circumference()
	{
		return (diameter() * Math.PI);
	}
	
}