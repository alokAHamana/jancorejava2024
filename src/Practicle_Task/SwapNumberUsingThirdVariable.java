package Practicle_Task;

public class SwapNumberUsingThirdVariable {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 0;
		
		System.out.println("Before Swapping : a=" + a + " and b=" + b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("After  Swapping : a=" + a + " and b=" + b);

	}
}