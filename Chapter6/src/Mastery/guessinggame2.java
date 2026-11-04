package Mastery;
import java.util.Random;
import java.util.Scanner;

public class guessinggame2 {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
	
		
		//The prompt to randomize the program's number so it doesn't repeat. + 1 is added to make the number of randomization 50 and not 49
		int randomNum = (int)(Math.random() * 50) + 1;	
		System.out.println("I'm thinking of a number between 1 and 50, guess what it is: ");
		int num = userinput.nextInt();
		
		
		//Moved the input statement out of the while statement so as to not create an infinite loop
		while(num != randomNum) {	
		if (num > randomNum) {
		System.out.println("Guess a lower number.");
		} else if (num < randomNum) {
		System.out.println("Guess a greater number.");
		}
		System.out.println("Guess my number:");
		num = userinput.nextInt();
			
	}
		System.out.println("You got it correctly!");
		
}
}

	
	
	
	
	
	
	


		




	
