package Skillbuilders;

import java.util.Scanner;

public class hurricane {
	static int kmph_to_mps(double kmph){
		 {
			 return(int) (0.277778 * kmph);
		 }
	}
	static int mps_to_kmph(double mps) {
		{
		return(int) (3.6 * mps);
	}
	}
	
	static int kts_to_kmph(double kts) {
		{
	return(int) (1.852 * kts);
		}
	}
	static int mph_to_kmph(double mph) {
		{
		return(int) (1.609 * mph);
		}
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in); {}
		


		
		System.out.println("What speed is the hurricane at: ");
		
		double kmph = userinput.nextDouble();
		
		int mps = kmph_to_mps(kmph);
		
		System.out.println("The hurricane's speed is " + mps + "mps");
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}