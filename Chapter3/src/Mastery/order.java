package Mastery;

import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class order {
	public static void main(String[] args) 
	{
	
		Scanner userinput = new Scanner(System.in); {}
	
		
		System.out.println("Enter the number of burgers you order: ");
	
		int burgers = userinput.nextInt();
	
		System.out.println("Enter the number of fries you order: ");
		
		int fries = userinput.nextInt();
	
		System.out.println("Enter the number of sodas you order: ");
		
		int sodas = userinput.nextInt();
	

		BigDecimal burgerPrice = new BigDecimal("4.99");
		BigDecimal friesPrice = new BigDecimal("2.49");
		BigDecimal sodasPrice = new BigDecimal("1.49");
		
		BigDecimal TotalburgerPrice = burgerPrice.multiply(BigDecimal.valueOf(burgers));
		BigDecimal TotalfriesPrice = friesPrice.multiply(BigDecimal.valueOf(fries));
		BigDecimal TotalsodasPrice = sodasPrice.multiply(BigDecimal.valueOf(sodas));
		
		BigDecimal Total = TotalburgerPrice
		.add(TotalfriesPrice)
		.add(TotalsodasPrice);
		
		BigDecimal Tax = BigDecimal.valueOf(0.05);
		
		BigDecimal Taxamount = Total.multiply(Tax);
		
		BigDecimal GrandTotal = Total.add(Taxamount);
		
		System.out.println("Total before tax: $" + Total);
		
		System.out.println("Taxes: $" + Taxamount);
		
		System.out.println("Grand Total: $" + GrandTotal);
}
}