/*******************************************************
* Name:Christa Fox
* Assignment: A10
*******************************************************/
import java.util.Arrays;
import java.util.Random;

public class Dice
{
	private final static Random rand = new Random();
	
	public static void main(String[] args)
	{
		System.out.printf("%3s%12s%12s%n", "Sum", "Frequency", "Percentage");
		int[] results = new int[36000];
		
		for (int i = 0; i < 36000; i++)
		{
			int roll1 = rollDice();
			int roll2 = rollDice();
			int sum = roll1 + roll2;
			
			results[i] = sum;
		} 
		
		for(int x = 2; x <= 12; x++)
		{
			int countOfResult = 0;
			
			for(int r = 0; r < 36000; r++)
			{
				if(results[r] == x)
				{
					countOfResult++;
				}
			}
			
			System.out.printf("%3d%12d%12.1f%%%n", x, countOfResult, (countOfResult/36000.0)*100.0);
		}
	}	
	
	private static int rollDice()
	{
		int die1;
		die1 = rand.nextInt(6) + 1;
		return die1;
	}
}