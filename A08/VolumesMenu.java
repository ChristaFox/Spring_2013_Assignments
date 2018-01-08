import java.util.Scanner;

public class VolumesMenu
{
	public static void menuPrompt()
	{
		System.out.printf("1 .. cuboid(2, 4, 6)    %25d .. cuboid(4)%n", 2);
		System.out.printf("3 .. ellipsoid(2, 4, 6) %25d .. ellipsoid(4)%n", 4);
		System.out.printf("5 .. cylinder(3, 4)     %25d .. cone(6, 5)%n", 6);
		System.out.printf("0 .. exit%n");
		System.out.print("Your choice: ");
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int selection;
		do
		{
			menuPrompt();
			selection = input.nextInt();
			switch (selection)
				{
					case 0:
						System.out.println("good bye");
						break;
						
					case 1:
						System.out.printf("cuboid(2, 4, 6): volume = %.1f", 
						Volumes.cuboid(2,4,6));
						break;
					case 2:
						System.out.printf("cuboid(4): volume = %.1f",
						Volumes.cuboid(4));
						break;
					case 3:
						System.out.printf("ellipsoid(2, 4, 6): volume = %.1f",
						Volumes.ellipsoid(2, 4, 6));
						break;
					case 4:
						System.out.printf("ellipsoid(4): volume = %.1f",
						Volumes.ellipsoid(4));
						break;
					case 5:
						System.out.printf("cylinder(3, 4): volume = %.1f",
						Volumes.cylinder(3, 4));
						break;						
					case 6:
						System.out.printf("cone(6, 5): volume = %.1f",
						Volumes.cone(6, 5));
						break;
					default:
						System.out.println("invalid input");
						break;					
				}
			System.out.println();	
				
			} while (selection != 0);

	}
}