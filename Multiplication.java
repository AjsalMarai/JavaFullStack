package labexercises;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter value for i");
		int i=scan.nextInt();
		
		System.out.println("Enter value for j");
		int j=scan.nextInt();
		
		int product=i*j;
		
		System.out.println("The product of i and j is: "+product);
		
	
	}

}
