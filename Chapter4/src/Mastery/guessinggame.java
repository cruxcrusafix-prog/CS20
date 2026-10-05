package Mastery;
import java.util.Scanner;
public class guessinggame {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in); {}
	int randomNum = (int)(Math.random() * 20);
	System.out.println("Guess the computer's chosen number: ");
		
		
	int number = userinput.nextInt();	
		
	System.out.println("The computer's number is: " + randomNum);
		
	System.out.println("Your number is: " + number);	
		
	if(number == randomNum) {
	System.out.println("You guessed correctly! Good job!");
	} 
	if(number != randomNum)
	System.out.println("You guessed incorrectly. Better luck next time.");
	}
		
		
}

