package mastery;
import java.util.Random;
import java.util.Scanner;
public class adder {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);	
	
Random random = new Random();
int lives = 3;	
int score = 0;
while (lives > 0) {	

int number1 = random.nextInt(100) + 1;	

int number2 = random.nextInt(100) + 1;
	
System.out.println("Guess the correct number: " + number1 + " + " + number2 + ":");

int usernumber = userinput.nextInt();

int correctanswer = (number1 + number2);

if (usernumber >= 999) {
    break;
}

    if (usernumber == correctanswer) {
        int pointsEarned = 0;
        if (lives == 3) {
            pointsEarned = 5;
        } else if (lives == 2) {
            pointsEarned = 3;
        } else if (lives == 1) {
            pointsEarned = 1;
        }
    
        score += pointsEarned;

if (usernumber == correctanswer) {

	  System.out.println("Correct!");
} else {
    lives--;
    System.out.println("Wrong answer! The correct answer was " + correctanswer);
    System.out.println("You now have " + lives + " lives left.");
}

if (usernumber >= 999);
System.out.println("Your score is: " + score);
{


	}
}
}
	}
}



