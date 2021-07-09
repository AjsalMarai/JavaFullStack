package labexercises;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int i=reader.nextInt();
		
		if(i%2==0) {
			System.out.println(i+" is even");	
		}
		else {
			System.out.println(i+" is odd");
		}
	}
}
