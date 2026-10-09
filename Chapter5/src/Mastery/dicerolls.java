package Mastery;
import java.util.Scanner;
import java.util.Random;
public class dicerolls {
	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in); {}
		
		Random random = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		int Rollfirstdie = random.nextInt(6) + 1;
		int Rollseconddie = random.nextInt(6) + 1;
		int Diceroll = (Rollfirstdie + Rollseconddie);
		//Asks the user to roll the first die
		System.out.println("Enter Roll die 1 to roll the first die: ");
	
		String input = scanner.nextLine();
		//The command the user should input. Not case sensitive
		if(input.equalsIgnoreCase("Roll die 1")) {
		
		//Shows what the user rolled
		System.out.println("You rolled a " + Rollfirstdie);
		
		} else { System.out.println("Incorrect command. Please enter Roll die 1");
		}
		System.out.println("Enter Roll die 2 to roll the second die: ");
		
		String input1 = scanner.nextLine();
		
		if(input1.equalsIgnoreCase("Roll die 2")) {
		
		System.out.println("You rolled a " + Rollseconddie);
		
		} else { System.out.println("Incorrect command. Please enter Roll die 2");
		}
		System.out.println("Your dice rolled " + Diceroll + " in total");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

