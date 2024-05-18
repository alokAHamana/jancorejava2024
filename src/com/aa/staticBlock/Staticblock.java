package com.aa.staticBlock;

public class Staticblock {
	
	static {
		System.out.println("Static block  1 "); 
	}

	static {
		System.out.println("Static block 2 "); 
	}

	public static void main(String[] args) {
		System.out.println("Main block");
	}

	static {
		System.out.println("Static block 3 "); 
	}
}
/* Static block 1      Static Block execute at the time of class loading 
   Static block 2      Static block will exwcte before main method
   Static block 3 
    Main block     */
