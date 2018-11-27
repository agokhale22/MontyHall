import java.util.Random;
import java.util.Scanner;

public class Montyhal 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		int guess2 = 1;
		int car = rand.nextInt(3)+1;
		
		System.out.println("Which door would you like to pick:  ");
		int guess = keyboard.nextInt();
		
		if (1<=guess && guess<=3)
		{
			if (guess == car)
			{
			
				if (car == 1)
				{
					System.out.println("There is a goat behind door 2");
					int goat = 2;
					guess2 = 3;
				}
				else if (car == 2)
				{
					System.out.println("there is a goat behind door 3");
					int goat = 3;
					guess2 = 1;
				
				}
				else if (car == 3)	
				{
					System.out.println("there is a goat behind door 1");
					int goat = 1;
					guess2 = 2;
				}
				
			}
			else
			{
				if (car == 1 && guess == 2)
				{
					System.out.println("there is a goat behind door 3");
					int goat = 3;
					guess2 = 1;
				}
				else if (car == 2 && guess == 3)
				{
					System.out.println("There is a goat behind door 1");
					int goat = 1;
					guess2 = 2;
				}
				else if (car == 3 && guess == 1)
				{
					System.out.println("there is a goat behind door 2");
					int goat = 2;
					guess2 = 3;
					
				}
				else if (car == 1 && guess == 3)
				{
					System.out.println("there is a goat behind door 2");
					int goat = 2;
					guess2 = 1;
				}
				else if (car == 2 && guess == 1)
				{
					System.out.println("there is a goat behind door 3");
					int goat = 3;
					guess2 = 2;
				}
				else if (car == 3 && guess == 2)
				{
					System.out.println("there is a goat behing door 1");
					int goat = 1;
					guess2 = 3;
				}
				System.out.println("Would you like to change your guess");
				String answer = keyboard.next();
				answer = answer.toLowerCase();
				
				if (answer.equals("yes"))
				{
					if(guess2 == car)
					{
						System.out.println("the car was behind door " + car);
						System.out.println("YOU WON");
					}
					else
					{
						System.out.println("YOU LOST");
					}
				
				}	
				if (answer.equals("no"))
				{
					if (guess == car)
						System.out.println("YOU WON");
				}
				else 
				{
					System.out.println("YOU LOST");
				}
			}
		}

	}

}
