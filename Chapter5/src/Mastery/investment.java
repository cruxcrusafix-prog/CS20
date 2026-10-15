package Mastery;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class investment {
	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in); {}
	
		Scanner scanner = new Scanner(System.in);
	//User chooses their price. Must be below the target price to work properly
		BigDecimal basemoney = null;
		
	//Every month, the user's money will have 7.5% more than previously.
		BigDecimal monthlymultiplier = new BigDecimal (1.075);
		System.out.println("Enter your money: ");
	
		String userInput = scanner.nextLine();
	
		basemoney = new BigDecimal(userInput);
	
	//ENTER YOUR TARGET PRICE HERE
		BigDecimal Targetprice = new BigDecimal (1000000);
	
		int months = 0;
	
		
		while (basemoney.compareTo(Targetprice) < 0) {
		months++;
	
		basemoney = basemoney.multiply(monthlymultiplier).setScale(2, RoundingMode.HALF_UP);
		}
		System.out.println("On month " + months + ", you have achieved your target price of $" + Targetprice + " with $" + basemoney);
	
	
	
	
	
}
}
