package Mastery;
import java.util.Random;
import java.util.Scanner;

public class guessinggame2 {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
	
		int randomNum = (int)(Math.random() * 50) + 1;	
		System.out.println("I'm thinking of a number between 1 and 50, guess what it is: ");
		int num = userinput.nextInt();
		
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

	
	
	
	
	
	
	


		




	
