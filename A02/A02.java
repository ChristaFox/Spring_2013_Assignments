/*******************************************************
* Name: Christa Fox
* Assignment: A02
*******************************************************/

public class A02
{
	public static void main(String[] args)
	{
      // exmaple 0
		System.out.println("Example 0:");
      System.out.print("xxxx");
      System.out.print("\nx  x");
      System.out.print("\nxxxx");
      
      // example 1
		System.out.println("\n\nExample 1:");
      String name = "Ian";
      int weight = 94;
      System.out.printf("%s weighs %d pounds.", name, weight);
      
      // example 2
		System.out.println("\n\nExample 2:");
      int number = 7;
      System.out.printf("2 + %d = %d", number, 2 + number);

      // example 3
		System.out.println("\n\nExample 3:");
      int side = 3;
      System.out.printf("The perimeter of a square with side %d is %d.", side, 12);

      // example 4
		System.out.println("\n\nExample 4:");
      int y = 456;
		System.out.printf("The value of y is %d.\n",y);
      System.out.printf("%-3d %-3d %-3d",y%10,y%100/10,y%1000/100);

      // example 5
		System.out.println("\n\nExample 5:");
      int number1 = 21;
		int number2 = 7;
      if (number1 % 7 == 0)
		{
         System.out.printf("%d is %d times %d.",number1,number1/number2,
			number2);
      }
      if (number1 % 7 != 0)
		{
         System.out.printf("%d is not a multiple of %d.",number1,number2);
      }
      // example 6
		System.out.println("\n\nExample 6:");
      String shape = "triangle";
      if (shape == "triangle")
      {
         System.out.println("oooo\nooo");
         System.out.println("oo");
         System.out.print("o");

      }
      		
		// example 7
		System.out.println("\n\nExample 7:");
		int n1 = 2;
		int n2 = 4;
		int n3 = 6;
		System.out.println("Number\t Square\t Cube");
		System.out.printf("%d \t %d \t %d\n", n1, n1 * n1, n1 * n1 * n1);
		System.out.printf("%d \t %d \t %d\n", n2, n2 * n2, n2 * n2 * n2);
		System.out.printf("%d \t %d \t %d\n", n3, n3 * n3, n3 * n3 * n3);

	}
}