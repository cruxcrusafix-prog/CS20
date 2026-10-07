package Skillbuilders;

import java.util.Scanner;

public class evens {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); {}

		System.out.println("Enter your number: ");
		
		int number = scanner.nextInt();	
		
		for (int x = 1; x <= number; x++ ) {
		
			boolean isEven = (x % 2 == 0); 
		
			if (isEven) {
		
			System.out.print(x + " ");
		}
}
}
}