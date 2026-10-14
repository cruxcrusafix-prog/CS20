package Mastery;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class investment {
	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in); {}
	
		Scanner scanner = new Scanner(System.in);
	
		BigDecimal baseprice = null;
		BigDecimal monthlymultiplier = new BigDecimal (1.075);
		System.out.println("Enter your price: ");
	
		String userInput = scanner.nextLine();
	
		baseprice = new BigDecimal(userInput);
	
	//ENTER YOUR TARGET PRICE HERE
		BigDecimal Targetprice = new BigDecimal (5000);
	
		int months = 0;
	
		
		while (baseprice.compareTo(Targetprice) < 0) {
		months++;
	
		baseprice = baseprice.multiply(monthlymultiplier).setScale(2, RoundingMode.HALF_UP);
		}
		System.out.println("On month " + months + ", you have achieved your target price of $" + Targetprice + " with $" + baseprice);
	
	
	
	
	
}
}
