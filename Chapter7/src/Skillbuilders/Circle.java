package Skillbuilders;

public class Circle {
	
public static final double PI = 3.14159265359;

public double radius;

private String getcircumference;
public Circle() {
radius = 1;
}
public void setRadius(double newradius) {
radius = newradius;	
}
public double area() {	
	
	double circlearea;
	
	double circumference;
	
	circlearea = PI * radius * radius;
	
	circumference = 2 * PI * radius;
	
return(circlearea);
}
public double getradius() {
	return(radius);
}
public double getcircumference() {
		return 2 * PI * radius;
}

public static void main (String[] args) {
Circle spot = new Circle();

//Set your radius here
spot.setRadius(10);
System.out.println("Circle radius: " + spot.getradius());
System.out.println("Circle circumference: " + spot.getcircumference());
}



}
