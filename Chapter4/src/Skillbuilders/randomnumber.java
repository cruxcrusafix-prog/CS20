package Skillbuilders;

import java.util.Scanner;

public class randomnumber {
	public static void main(String[] args) { 
int min, max;

//Introduce the Scanner Class
Scanner input = new Scanner(System.in);

//Record the min number
System.out.println("Enter the min number: ");

//Ask the user for the min number
min = input.nextInt();

//Prompt the user for the max number
System.out.println("Enter the max number: ");
		
//Record the max number
max = input.nextInt();	

//Generate the random numbers
System.out.println("Random number: "
				+ (int)((max - min + 1) * Math.random()
				+ min));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}




