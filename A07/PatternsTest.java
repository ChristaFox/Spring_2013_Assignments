/*******************************************************
* Name:Christa Fox
* Assignment: A07
*******************************************************/
import java.util.Scanner;
public class PatternsTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int selection;
		do
		{
			System.out.print("Choose a pattern (1-4) or 0 to quit: ");
			selection = input.nextInt();
			System.out.print("Size: ");
			int size = input.nextInt();
			
			switch (selection)
				{
					case 1:
						Patterns.pattern1(size);
						break;
					case 2:
						Patterns.pattern2(size);
						break;
					case 3:
						Patterns.pattern3(size);
						break;
					case 4:
						Patterns.pattern4(size);
						break;
					case 0:
						System.out.println("Good bye");
						break;
				}
			System.out.println();	
				
			} while (selection != 0);
	}
}