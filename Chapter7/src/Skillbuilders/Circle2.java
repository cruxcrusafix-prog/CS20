package Skillbuilders;

import java.util.Scanner;

public class Circle2 {
	
	public double radius;
	
	public static final double PI = 3.14159265359;
	
public String toString()
{
String c;

c = "Circle has radius " + radius;
	
return(c);
	
}
public double area()
{
	double cArea;
	cArea = PI * radius * radius;
	
	return cArea;
}
public double circumference()
{
	double cCircumference;
	cCircumference = PI * 2 * radius;
	
	return cCircumference;
	}
	public double getradius() {
		return(radius);
	}
	public double getcircumference() {
			return 2 * PI * radius;
	}
	public double getarea() {
		return PI * radius * radius;
	}
	public static void main (String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		Circle spot = new Circle();
		
		System.out.print("Enter the circle radius: ");
	        
		 double userradius = userinput.nextDouble();
		
		 spot.setRadius(userradius);
	
		 System.out.println("Circle radius: " + spot.getradius());
		
		 System.out.println("Circle circumference: " + spot.getcircumference());
		
		 System.out.println("Circle area: " + spot.area());
		}
		
		
		
		
		
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

