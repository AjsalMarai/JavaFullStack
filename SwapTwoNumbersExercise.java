package labexercises;

public class SwapTwoNumbersExercise {
	public static void main(String[] args) {
		
		float first = 2.50f, second = 3.50f;
		
		System.out.println("--Bedfore Swap--");
		System.out.println("The first number is: "+first);
		System.out.println("The second number is: "+second);
		
		float temporary = first;
		first = second;
		second = temporary;
		
		System.out.println("--After Swap--");
		System.out.println("The first number is: "+first);
		System.out.println("The second number is: "+second);
	}
}
