package Mastery;
import java.util.Scanner;



//The program uses this code so the questions aren't all the same
import java.util.Random;
public class mathtutor {
	public static void main(String[] args) {
		
		
		Scanner userinput = new Scanner(System.in); {}
		
		Random random = new Random();

		
		
int number1 = random.nextInt(25) + 1;	
int number2 = random.nextInt(25) + 1;	
	
//The program's equation for the user	
System.out.println("What is " + number1 + " x " + number2 + "?: " );	
	
int usernumber = userinput.nextInt();	
	
int correctanswer = (number1 * number2);
		
//The message that is sent to determine that the user is correct
if (usernumber == correctanswer) {		
	System.out.println("Nice job, you got it.");	
//The message that is sent to show that the user made a mistake in their answer
} else { if (usernumber != correctanswer) {
	System.out.println("Not quite right, the correct answer is: " + correctanswer );
}
		
		
		
		
	
	
	
	
}
}
}