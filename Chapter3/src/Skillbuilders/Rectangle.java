package Skillbuilders;

import java.util.Scanner;

import java.util.Locale; // Import locale

public class Rectangle 
{

	private static Scanner userinput;

	public static void main(String[] args) 
	{
		//Declare Variables
		int length;
		int width;
		
		try (//Create a Scanner Object
		Scanner userinput = new Scanner(System.in)) {
			//Ask the user to enter the width
			System.out.print("Enter the width: ");
			
			//Get the width value from the user
			width = userinput.nextInt();
			
			//Ask the user to enter the length
					System.out.print("Enter the length: ");
			
					//Get the length value from the user
					length = userinput.nextInt();
		}
		
		//Display the width and length on the console
				System.out.print("The width is: " + width);
				System.out.print(" The length is: " + length);
			
		//Hello
			
				int length1 = 13;
				int width1 = 4;
				int area = length1 * width1;
				System.out.print(" Area of rectangle is " + area);			
				
				int n1 = 0, n2 = 1, count = 20;
				
				System.out.print(" Fibonacci: " + n1 + " " + n2);
				
				
				for (int i = 2; i < count; i++) {
				int n3 = n1 + n2;
				System.out.print(" " + n3);
				n1 = n2;
				n2 = n3;
				}
				
				try (Scanner input = new Scanner(System.in).useLocale(Locale.CANADA)){ 
					System.out.print("Enter temperature in Celsius: ");
					
					double celsius = input.nextDouble();
					double fahrenheit = celsius * 9.0 / 5.0 + 32;
					
					
					System.out.print( celsius + " C = " + fahrenheit + "F");
				
				}
				
				
				
				
				
				
				
				
	}
	

}
