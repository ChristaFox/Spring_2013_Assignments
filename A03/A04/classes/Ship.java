/*******************************************************
* Name:Christa Fox
* Assignment: A04
*******************************************************/

public class Ship
{
	//feilds
	
	private String name;
	private double speed;
	
	
	//constructors
	
	public Ship (String n, double s)
	{
		name = n;
		speed = s;
	}

	//methods
	
	public String getName ()
	{
		return name;
	}
	public double getSpeed ()
	{
		return speed;
	}
	public void setName (String n)
	{
		name = n;
	}
	public void setSpeed (double s)
	{
		speed = s;
	}
	
	public double timeToCrossEnglishChannel()
	{
		return speed*1.151;
	}
	
}




