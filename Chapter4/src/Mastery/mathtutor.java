package Mastery;
import java.util.Scanner;
import java.util.Random;
public class mathtutor {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in); {}
		Random random = new Random();
	
int number1 = random.nextInt(25) + 1;	
int number2 = random.nextInt(25) + 1;	
	
	
System.out.println("What is " + number1 + " x " + number2 + "?: " );	
	
int usernumber = userinput.nextInt();	
	
int correctanswer = (number1 * number2);
		
		
if (usernumber == correctanswer) {		
	System.out.println("Nice job, you got it.");	
} else { if (usernumber != correctanswer) {
	System.out.println("Not quite right, the correct answer is: " + correctanswer );
}
		
		
		
		
	
	
	
	
}
}
}