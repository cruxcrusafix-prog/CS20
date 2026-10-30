package Skillbuilders;

import java.util.Scanner;

public class spanishnumbers {
	public static void main(String args[]) {
		
		Scanner userinput = new Scanner(System.in); {}
		
		String[] numbers = {"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};
		
		System.out.println("Please enter a number through 0 to 10: ");
		
		int num = userinput.nextInt();			
				
		if(num >= 0 && num < numbers.length) {
			System.out.println("Your entered number: " + numbers[num]);
		} else {
			System.out.println("Invalid value. Please try again.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
