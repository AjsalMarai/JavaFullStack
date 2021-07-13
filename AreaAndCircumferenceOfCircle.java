package labexercises;

import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle");
		double r = scan.nextDouble();
		
		double Area = Math.PI * (r*r);
		System.out.println("Area of the circle is: "+Area);
		
		double Circumference = 2 * Math.PI * r;
		System.out.println("The circumfernce of the circle is: "+Circumference);
	}

}
