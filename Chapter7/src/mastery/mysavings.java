package mastery;

import java.util.Scanner;

public class mysavings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); {}	
		 double Totalamount = 0.0;
	        int num = -1;
	        
	    while(num != 0) {
		System.out.println("You have $" + Totalamount);
		System.out.println("1. Add a penny");
		System.out.println("2. Add a nickel");
		System.out.println("3. Add a dime");
		System.out.println("4. Add a quarter");
		System.out.println("5. Take out a penny");
		System.out.println("6. Take out a nickel");
		System.out.println("7. Take out a dime");
		System.out.println("8. Take out a quarter");
		System.out.println("Enter 0 to quit");
		
		
		num = scanner.nextInt();
	
		switch(num) {		
		case 1 -> {
		Totalamount += 0.01;
		System.out.println("You've added 1 cent to your piggy bank. You now have $%.2f." + Totalamount);
		}
		case 2 -> {
		Totalamount += 0.05;
		System.out.println("You've added 5 cents to your piggy bank. You now have $%.2f." + Totalamount);
		}
		case 3 -> {
		Totalamount += 0.10;
		System.out.println("You've added 10 cents to your piggy bank. You now have $%.2f." + Totalamount);
		}
		case 4 -> {
		Totalamount += 0.25;
		System.out.println("You've added 25 cents to your piggy bank. You now have $%.2f." + Totalamount);
		}
		case 5 -> {
		Totalamount -= 0.01;
		System.out.println("You've removed 1 cent from your piggy bank. You now have $%.2f." + Totalamount);
		}
		case 6 -> {
		Totalamount -= 0.05;
		System.out.println("You've removed 5 cents from your piggy bank. You now have $%.2f." + Totalamount);
		}
		case 7 -> {
		Totalamount -= 0.10;
		System.out.println("You've removed 10 cents from your piggy bank. You now have $%.2f." + Totalamount);
		}
		case 8 -> {
		Totalamount -= 0.25;
		System.out.println("You've removed 25 cents from your piggy bank. You now have $%.2f." + Totalamount);
		}
		case 0 -> {
		System.out.println("Goodbye!");
		}
	
	
	
	}	
}
}
}