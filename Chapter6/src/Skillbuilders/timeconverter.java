package Skillbuilders;

import java.util.Scanner;

public class timeconverter {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in); {}	
//Ask the user to input how many seconds they want to input.		
System.out.println("Enter an amount of seconds: ");		
		
int Totalseconds = userinput.nextInt();		
		
int days = Totalseconds / 86400;		
int hours = (Totalseconds % 86400) / 3600;		
int minutes = ((Totalseconds % 86400) % 3600) / 60;		


//Will remove the s if there is only 1 day, hour, or minute, to make the word singular rather than plural.
if (days == 1) {
	System.out.print(days + " day, ");
} else {
	System.out.print(days + " days, ");
if (hours == 1) {
	System.out.print(hours + " hour, and ");
} else {
	System.out.print(hours + " hours, and ");
}
}
		
if (minutes == 1) {
	System.out.print(minutes +  " minute.");
} else {
	System.out.print(minutes + " minutes.");
}
		
}
}