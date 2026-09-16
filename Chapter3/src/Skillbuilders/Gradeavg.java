package Skillbuilders;

import java.util.Scanner;

public class Gradeavg {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
		double sum = 0;
		int count = 0;

		System.out.println("Enter your grades and type -1 to stop: ");

		while (true) {
			double grade = scanner.nextDouble();

			if(grade == -1) {
				break;
			}
				sum += grade;
				count++;

			}

			if(count > 0) {

				double average = sum / count;
				System.out.printf("Average Grade: %.2f\n", average);
			

			if(average >= 98) {
				System.out.println("You are a prodigy!");
			} else if (average >= 90) {
				System.out.println("Wow, that is absolutely amazing work. Keep it up!");
			} else if (average >= 80) {
				System.out.println("That's a pretty good mark! Keep it up and you'll succeed no problem.");
			} else if (average >= 70) {
				System.out.println("Not bad but you could improve. You did good though");
			} else if (average >= 60) {
				System.out.println("Oof! That was a disappointing grade for you. But you'll bounce back.");
			} else if (average >= 50) {
				System.out.println("You barely made that one, do you need some extra studying time?");
			} else if (average >= 40) {	
				System.out.println("You really need to start paying attention in class.");
			} else if (average >= 30) {
				System.out.println("And that's what happens when you sleep in class.");
			} else if (average >= 20) {
				System.out.println("What are you, a little kid?");
			} else if (average >= 1) {
				System.out.println("My god. I'm pretty sure a 2 year old can get a better grade than this.");
			}
			} else {
				System.out.println("No grades were entered");











}
}
	}
    


			
			
			
			
	
    
}



