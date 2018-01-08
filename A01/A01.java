/*******************************************************
* Name:Christa Fox
* Assignment: A01
*******************************************************/
import java.util.Scanner;

public class A01
{
	public static void main(String[] args)
	{
		// part1
		System.out.println("o o o o o");
		System.out.println("o . . . o");
		System.out.println("o . . . o");
		System.out.println("o . . . o");
		System.out.println("o o o o o");

		// part2
		Scanner input = new Scanner(System.in);
		System.out.print("Favorite Athlete: ");
		String athlete = input.nextLine();
		System.out.print("Country they are from: ");
		String country = input.nextLine();	
		System.out.printf("My favorite athlete is %s from %s.",athlete,country);
		
	}
}