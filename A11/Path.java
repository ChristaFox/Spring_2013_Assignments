/*******************************************************
* Name:Christa Fox
* Assignment: A11
*******************************************************/
import java.util.Random;

public class Path
{
	//feilds
	private Point[] point;
	
	//ctors
	public Path(int numberOfRandomPoints)
	{	
		if(numberOfRandomPoints < 2)
		{
			throw new IllegalArgumentException("Path needs to be at least two points.");
		}
		else
		{
			point = new Point[numberOfRandomPoints];
			initializePoints();
		}
	}
	
	public Path (Point ... newPoints)
	{
		if(newPoints.length < 2)
		{
			throw new IllegalArgumentException("Path needs to be at least two points.");
		}
		else
		{
			point = newPoints;
		}
	}
	
	private void initializePoints()
	{
			Random random = new Random();
			
			for(int i = 0; i < point.length; i++)
			{
				point[i] = new Point(1+random.nextInt(10), 1+random.nextInt(10));
			}
	}
	
	public double totalLength()
	{
		double totalLength = 0;
		
		for(int i = 0; i < point.length-1; i++)
		{
			totalLength += point[i].distance(point[i+1]);
		}
		return totalLength;
	}
	
	public void displayPoints()
	{
		for(Point el : point)
		{			
			System.out.printf(el.toString());
		}
	
	}		
}