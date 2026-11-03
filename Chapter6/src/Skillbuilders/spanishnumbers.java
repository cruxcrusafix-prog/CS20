package Skillbuilders;

import java.util.Scanner;

public class spanishnumbers {
	public static void main(String args[]) {
		
		Scanner userinput = new Scanner(System.in); {}
		
		//The user will be able to input a number from 0-10 and the selected number is manually set to the number it would be translated to.
		String[] numbers = {"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};
		
		//The program will ask the user to type a number
		System.out.println("Please enter a number through 0 to 10: ");
		
		int num = userinput.nextInt();			
		
		
		//A value that is below 0 or above 10 will not be accepted as it wasn't manually added into the potential numbers the program can use and the user will need to rerun the program.
		if(num >= 0 && num < numbers.length) {
			System.out.println("Your entered number: " + numbers[num]);
		} else {
			System.out.println("Invalid value. Please try again.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
