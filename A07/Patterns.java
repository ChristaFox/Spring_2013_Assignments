/*******************************************************
* Name:Christa Fox
* Assignment: A07
*******************************************************/
public class Patterns
{
		public static void pattern1(int size)
		{
			for(int i = 0; i < size; i++)
			{
				//Spacer Loop
				for(int spacer = 0; spacer < ((size-1)-i); spacer++)
				{
					System.out.print(" ");
				}
				
				//Character Loop Left
				for(int l = 0; l <= i; l++)
				{
					System.out.print("@");
				}
				
				//Character Loop Right
				for(int r = 0; r < i; r++)
				{
					System.out.print("@");
				}
				
				System.out.println();
				
			}
		}
		
		public static void pattern2(int size)
		{
			for(int i = 0; i < size; i++)
			{	
				//Spacer
				for(int spacer = (size-i); spacer < size; spacer++)
				{
					System.out.print(" ");
				}
								
				//Character Loop Left
				for(int l = 0; l <= ((size-1)-i); l++)
				{
					System.out.print("@");
				}
				
				//Character Loop Right
				for(int r = 0; r < ((size-1)-i); r++)
				{
					System.out.print("@");
				}
				System.out.println();
				
			}
		}
		
		public static void pattern3(int size)
		{
			for(int i = 0; i < size; i++)
			{
				//Spacer Loop
				for(int spacer = 0; spacer < ((size-1)-i); spacer++)
				{
					System.out.print(" ");
				}
				
				//Character Loop Left
				for(int l = 0; l < i; l++)
				{
					System.out.print("@");
				}
				
				//Character Center Star
				System.out.print("*");
				
				//Character Loop Right
				for(int r = 0; r < i; r++)
				{
					System.out.print("@");
				}
				
				System.out.println();
				
			}
		}
		
		public static void pattern4(int size)
		{
			for(int i = 0; i < size; i++)
			{	
				//Spacer
				for(int spacer = (size-i); spacer < size; spacer++)
				{
					System.out.print(" ");
				}
								
				//Character Loop Left
				for(int l = 0; l < ((size-1)-i); l++)
				{
					System.out.print("@");
				}
				
				//Character Center Star
				System.out.print("*");
				
				//Character Loop Right
				for(int r = 0; r < ((size-1)-i); r++)
				{
					System.out.print("@");
				}
				
				System.out.println();
				
			}
		}
		
	}