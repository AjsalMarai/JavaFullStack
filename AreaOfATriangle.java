package labexercises;

import java.util.Scanner;

public class AreaOfATriangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the base of the triangle");
		double b = scan.nextDouble();
		
		System.out.println("Enter the height of the triangle");
		double h = scan.nextDouble();
		
		double Area = 0.5*b*h;
		System.out.println("The area of the triangle is: "+Area);
		
	}
	
}
