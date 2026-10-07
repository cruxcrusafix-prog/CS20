package Mastery;

import java.util.Scanner;

public class guessinggame {
	
	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in); {}
	
		
		//The code that make the program guess
		int randomNum = (int)(Math.random() * 20);
	
		//Asks the user to input a number from 0 to 20
		System.out.println("Guess the computer's chosen number: ");
		
	//The input the user will add	
	int number = userinput.nextInt();	
	
	
	//Shows your's and the program's number
	System.out.println("The computer's number is: " + randomNum);
	System.out.println("Your number is: " + number);	
	
	
	//Determines whether or not you guessed correctly
	if(number == randomNum) {
	System.out.println("You guessed correctly! Good job!");
	} 
	if(number != randomNum)
	System.out.println("You guessed incorrectly. Better luck next time.");
	}
		
		
}

