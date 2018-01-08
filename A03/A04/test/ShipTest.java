/*******************************************************
* Name:Christa Fox
* Assignment: A04
*******************************************************/

public class ShipTest
{
	public static void main(String[] args)
	{
		Ship paddleSteamer = new Ship();
		paddleSteamer.setName("Rob Roy");
		paddleSteamer.setSpeed(6);
		
		Ship hovercraft = new Ship();
		hovercraft.setName("Princess Ann");
		hovercraft.setSpeed(60);
		
		System.out.println("Paddle Steamer: ");
		System.out.printf("Name: %s%n", paddleSteamer.getName());
		System.out.printf("Speed: %.2f knots%n", paddleSteamer.getSpeed());
		System.out.printf("Time to cross the channel: %.2f%n%n"
			,paddleSteamer.timeToCrossEnglishChannel());
			
		System.out.println("Hovercraft: ");
		System.out.printf("Name: %s%n", hovercraft.getName());
		System.out.printf("Speed: %.2f knots%n", hovercraft.getSpeed());
		System.out.printf("Time to cross the channel: %.2f%n%n"
			,hovercraft.timeToCrossEnglishChannel());
	}
}