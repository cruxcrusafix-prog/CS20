package Mastery;
import java.util.Random;
import java.util.Scanner;

public class guessinggame2 {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in); {}	
	
		int randomNum = (int)(Math.random() * 50);	
		System.out.println("I'm thinking of a number between 1 and 50, guess what it is: ");
		int num = userinput.nextInt();
		
		while(num != randomNum) {
		System.out.println("Guess my number: ");
		}
		
		if (num > randomNum) {
		System.out.println("Guess a lower number.");
		
		
		if (num < randomNum) {
		System.out.println("Guess a greater number.");
		

		num = userinput.nextInt();
		}	
		if (num == randomNum)
		System.out.println("You got it correctly!");
	
	
	
	
	
	
	
	
}
}
		}
	
