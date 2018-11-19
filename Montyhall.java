import java.util.Random;
import java.util.Scanner;

public class Montyhall 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		rand.nextInt(3 + 1);
		int car = rand.nextInt(3+1);
		
		System.out.println("Which door would you like to pick:  ");
		int door = keyboard.nextInt();
		System.out.println("The car was behind door " + car);
		System.out.println("\nYou have selected door " + door);
		
	}

}
