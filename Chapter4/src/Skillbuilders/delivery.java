package Skillbuilders;

import java.util.Scanner;

public class delivery {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in); {}	
	
		//Declare dimensions	
	double length;	
	double width;
	double height;
	
	//Prompt the user to enter length	
	System.out.println("Enter the length: ");
	
	//User enters prompt for length
	length = userinput.nextDouble();
		
	//Prompt the user to enter width
	System.out.println("Enter the width: ");	
		
	//User enters prompt for width
	width = userinput.nextDouble();	
		
	//Prompt the user to enter height
	System.out.println("Enter the height: ");	
		
	//User enter prompt for height
	height = userinput.nextDouble();	
		
	//Determines whether or not you can deliver the package
	System.out.println("Your package is " + length + " x " + width + " x " + height);	
		
	//Prompt to show the user if the package has gone through	
	if(length <= 10 || width <= 10 || height <= 10)	{
		System.out.println("Your package is too small. Denied.");
	
	} else if(length > 10 || width > 10 || height > 10) {	
		System.out.println("Your package has been accepted and successfully delivered!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
}

