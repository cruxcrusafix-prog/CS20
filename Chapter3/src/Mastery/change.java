package Mastery;

import java.util.Scanner;

public class change {
	public static void main(String[] args) 
	{
	
		Scanner userinput = new Scanner(System.in); {}
		
		

		System.out.println("Enter the amount of change: ");
		
		int cents = userinput.nextInt();
		
		int Quarters = cents / 25;
		
		cents = cents % 25;
		
		
		int Dimes = cents / 10;
		
		cents = cents % 10;
		
		int Nickels = cents / 5;
		
		cents = cents % 5;
		
		int Pennies = cents / 1;

		cents = cents % 1;
		
		
		System.out.println("You have " + Quarters + " Quarters" );
		System.out.println("You have " + Dimes + " Dimes" );
		System.out.println("You have " + Nickels + " Nickels" );
		System.out.println("You have " + Pennies + " Pennies" );
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
