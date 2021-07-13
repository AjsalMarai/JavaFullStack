package labexercises;

import java.util.Scanner;

public class AreaOfASquare {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the length of the side of the square");
		double a = scan.nextDouble();
		
		double Area=a*a;
		
		System.out.println("The area of the square is: "+Area);
	}

}
