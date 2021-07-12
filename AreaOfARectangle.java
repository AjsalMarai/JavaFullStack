package labexercises;

import java.util.Scanner;

public class AreaOfARectangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		double length=scan.nextDouble();
		System.out.println("Enter the breadth of rectangle");
		double breadth=scan.nextDouble();
		double area=length*breadth;
		System.out.println("The area of the rectangle is: "+area);
	}

}
