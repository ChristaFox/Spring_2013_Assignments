/*******************************************************
* Name:Christa Fox
* Assignment: A05
*******************************************************/

public class CircleTest
{
	public static void main(String[] args)
	{
		for(int i = -2;i <= 6; i += 4)
		{
			System.out.printf("%ni = %d%n",i);
			System.out.println();
			
					Circle myCircle = new Circle(i);
					System.out.printf("radius: %.1f%n", myCircle.getRadius());
					System.out.printf("diameter: %.1f%n", myCircle.diameter());
					System.out.printf("area: %.1f%n", myCircle.area());
					System.out.printf("circumference: %.1f%n", myCircle.circumference());
					
					myCircle.setRadius(i*2);
					System.out.printf("radius: %.1f%n", myCircle.getRadius());
					System.out.printf("diameter: %.1f%n", myCircle.diameter());
					System.out.printf("area: %.1f%n", myCircle.area());
					System.out.printf("circumference: %.1f%n", myCircle.circumference());	
		}
	}		
}