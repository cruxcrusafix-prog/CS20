package Mastery;

import java.util.Scanner;

public class metricconversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); {}	
//The program asks the user what number they'd want to convert from 2 chosen measurements		
System.out.println("Enter a number you'd want to convert: ");		
		
double value = scanner.nextDouble();	

//The options below are selected by choosing a number (1-8)		
System.out.println("Enter the conversion you'd like:");
System.out.println("1. Inches to Centimetres   5. Centimetres to Inches");
System.out.println("2. Feet to Centimetres     6. Centimetres to Feet");
System.out.println("3. Yards to Metres         7. Metres to Yards");
System.out.println("4. Miles to Kilometres     8. Kilometres to Miles");		


int num = scanner.nextInt();
double result = 0.0;


//Values are multiplied or divided which is how the conversion to the chosen conversion is made
switch(num) {		
case 1 -> {		
	result = value * 2.54;
	System.out.printf("%.2f Inches give you %.3f centimetres.", value, result);
}
case 2 -> {
	result = value * 30.48;
	System.out.printf("%.2f feet give you %.3f centimetres.", value, result);
}
case 3 -> {
	result = value * 0.9144;
	System.out.printf("%.2f yards give you %.3f metres.", value, result);
}
case 4 -> {
	result = value * 1.60934;
	System.out.printf("%.2f miles give you %.3f kilometres.", value, result);
}
case 5 -> {
	result = value / 2.54;
	System.out.printf("%.2f centimetres give you %.3f inches.", value, result);
}
case 6 -> {
	result = value / 30.48;
	System.out.printf("%.2f centimetres give you %.3f feet.", value, result);
}
case 7 -> {
	result = value / 0.9144;
	System.out.printf("%.2f metres give you %.3f yards.", value, result);
}
case 8 -> {
	result = value / 1.60934;
	System.out.printf("%.2f kilometres give you %.3f miles.", value, result);
}		
		






}
}
}