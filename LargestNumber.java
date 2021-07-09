package labexercises;

public class LargestNumber {
	public static void main(String[] args) {
		double n1 = 4.5, n2 = 3.5, n3 = 5.5;
		
		if(n1 >= n2 && n1 >= n3) {
			System.out.println("The largest number is: "+n1);
		}
		else if(n2 >= n1 && n2 >= n3) {
			System.out.println("The largest number is: "+n2);
		}
		else {
			System.out.println("The largest number is: "+n3);
		}
	}

}
