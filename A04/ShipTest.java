/*******************************************************
* Name:Christa Fox
* Assignment: A04
*******************************************************/

public class ShipTest
{
	public static void main(String[] args)
	{
		Ship paddleSteamer = new Ship("Rob Roy",6);
		Ship hovercraft = new Ship("Princess Ann",60);
		
		System.out.println("Paddle Steamer: ");
		System.out.printf("Name: %s%n", paddleSteamer.getName());
		System.out.printf("Speed: %.1f knots%n", paddleSteamer.getSpeed());
		System.out.printf("Time to cross the channel: %.1f hours %n%n",
			paddleSteamer.timeToCrossEnglishChannel());
		
		System.out.println("Hovercraft: ");
		System.out.printf("Name: %s%n", hovercraft.getName());
		System.out.printf("Speed: %.1f knots%n", hovercraft.getSpeed());
		System.out.printf("Time to cross the channel: %.1f hours %n%n",
			hovercraft.timeToCrossEnglishChannel());			
	}
}