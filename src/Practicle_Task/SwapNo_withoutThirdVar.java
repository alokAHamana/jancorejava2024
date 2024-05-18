package Practicle_Task;

public class SwapNo_withoutThirdVar {
	
	public static void main(String[] args) {
	        int a = 10;
	        int b = 20;
	        
	        System.out.println("Before Swaping: a = " + a + " and b = " + b);
	    
	        a=a+b;  //30
	        b=a-b;  //10
	        a=a-b;  //20
	        
	        System.out.println("After swapping: a = " + a + " and b = " +b);
	        
	
	    }
}

