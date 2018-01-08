/*******************************************************
* Name:Christa Fox
* Assignment: A06
*******************************************************/

import java.util.Scanner;

public class TriangleTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Side1: ");
		double side1 = input.nextDouble();
		System.out.print("Side2: ");		
		double side2 = input.nextDouble();
		System.out.print("Side3: ");
		double side3 = input.nextDouble();
		System.out.println();
		Triangle myTriangle = new Triangle (side1, side2, side3);
		System.out.printf("Triangle (%.1f,%.1f,%.1f) ", 
			myTriangle.getside1(), myTriangle.getside2(), myTriangle.getside3());
		if (myTriangle.isEquilateral() == true)
			System.out.print("is equilateral");
		else if (myTriangle.isRight() == true)	
			System.out.print("is right");
	}
}