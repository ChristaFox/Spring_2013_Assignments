/*******************************************************
* Name:Christa Fox
* Assignment: A06
*******************************************************/

public class Triangle
{
	//feilds
	private double side1;
	private double side2;
	private double side3;
	
	//ctors
   public Triangle(double sideA, double sideB, double sideC) 
	{	
		if (isTriangle() == true)
		{
			side1 = sideA;
			side2 = sideB;
			side3 = sideC;
		}
		else
		{ 
			side1 = 1;
			side2 = 1;
			side3 = 1;				
		}	
	}
	
		//methods
	
	public double getside1()
	{
		return side1;
	}
	public double getside2()
	{
		return side2;
	}	
	public double getside3()
	{
		return side3;
	}
	
 public boolean isTriangle () 
	{
		if (((side1 + side2) > side3) ||
          ((side2 + side3) > side1) ||
          ((side3 + side1) > side2))
         return true;
      else
         return false;
	}
	
 public boolean isEquilateral () 
 	{
      if ((side1 == side2) && (side2 == side3))
         return true;
      else
         return false;
   }
 public boolean isRight () 
 	{
      if	(((side1 * side1) == ((side2 * side2) + (side3 * side3))) ||
          ((side2 * side2) == ((side1 * side1) + (side3 * side3))) ||
          ((side3 * side3) == ((side1 * side1) + (side2 * side2))))         
			 return true;
      else 
         return false;

   }

}