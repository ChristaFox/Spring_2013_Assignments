/*******************************************************
* Name:Christa Fox
* Assignment: A11
*******************************************************/
public class Point
{
	//feilds
	private int x;
	private int y;
	
	//ctors
	public Point (int xCoord, int yCoord)
	{
		x = xCoord;
		y = yCoord;	
	}
	
	//methods
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public double distance (Point p)
	{
		return  Math.sqrt(Math.pow((p.y - y), 2) + Math.pow((p.x - x), 2));
	}
	@Override
	public String toString()
	{	
		String s = String.format("(%d,%d) ", getX(), getY());
		return s;
	}
}