package labexercises;

import java.util.Scanner;

public class PyramidExamples {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		System.out.println();
		
		int term=6;
		for(int i=1;i<=term;i++) {
			for(int j=term;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();  
		}
		
		System.out.println("----------------------");
		System.out.println();
		
		int rows,number=1,counter,j;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of rows for Floyd's Triangle");
		
		rows=input.nextInt();
		System.out.println("Floyd's Triangle");
		System.out.println("***********");
		
		for(counter=1;counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
				
	
	}

}
