package Skillbuilders;

import java.util.Scanner;

public class distance {


	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
	
		Scanner userinput = new Scanner(System.in); {}
	
		double kilometres;
		double kilometres1;
		double kilometres2;
		
		System.out.print("Enter the first racer's distance: ");
	
		kilometres = userinput.nextDouble();
	
		System.out.print("Enter the second racer's distance: ");
	
		kilometres1 = userinput.nextDouble();
	
		System.out.print("Enter the third racer's distance: ");
	
		kilometres2 = userinput.nextDouble();
	
		System.out.println("The first racer's distance is: " + kilometres + " km");
		System.out.println("The second racer's distance is: " + kilometres1 + " km");
		System.out.println("The third racer's distance is: " + kilometres2 + " km");
	
	
		if(kilometres >= kilometres1 && kilometres >= kilometres2) {
		System.out.println("The first player is the winner!");
		if(kilometres1 >= kilometres2) {
		System.out.println("The second player is the runner-up!");
		System.out.println("The third player is in last!");
		} else {
		System.out.println("The third player is the runner-up!");	
		System.out.println("The second player is in last!");	
		
		}
		}
		
		else {if(kilometres1 >= kilometres && kilometres1 >= kilometres2) {
		System.out.println("The second player is the winner!");
		if(kilometres >= kilometres2) {
		System.out.println("The first player is the runner-up!");
		System.out.println("The third player is in last!");
		} else {
		System.out.println("The third player is the runner-up!");
		System.out.println("The first player is in last!");
		
		}
		}
		
		else {if(kilometres2 >= kilometres && kilometres2 >= kilometres1) {
		System.out.println("The third player is the winner!");
		if(kilometres >= kilometres1) {
		System.out.println("The first player is the runner-up!");
		System.out.println("The second player is in last!");
		} else {
		System.out.println("The second player is the runner-up!");
		System.out.println("The first player is in last!");
		}
		
		}
		
		
		
		
		
		}
		
	
	}
	
	}
	
}
