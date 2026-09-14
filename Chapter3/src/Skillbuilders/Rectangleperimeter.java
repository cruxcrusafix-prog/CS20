package Skillbuilders;

import java.util.Scanner;

public class Rectangleperimeter {

	
	
	private static int area;

	public static void main(String[] args) {
	

	
		try (Scanner userinput = new Scanner(System.in)) {
			{


			
int length;
int width;
int perimeter;

System.out.print("Enter the width: ");

width = userinput.nextInt();

System.out.print("Enter the length: ");

length = userinput.nextInt();

area = length * width;

		System.out.print(" Area of rectangle is " + area);

		
		//Calculate perimeter
		perimeter = (2 * length + 2 * width);

		//Display perimeter on screen
		System.out.println(" Perimeter = "+ perimeter);



}
		}
	
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

