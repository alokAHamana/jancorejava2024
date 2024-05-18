package com.aa.flowcontrol;

import java.util.Scanner;

public class FindProductofdigits {
	

	public class ProductOfDigits {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt user to enter a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        // Calculate the product of digits
	        int product = calculateProductOfDigits(number);
	        
	        // Display the result
	        System.out.println("The product of digits of " + number + " is: " + product);
	        
	        scanner.close();
	    }
	    
	    // Method to calculate the product of digits
	    public static int calculateProductOfDigits(int number) {
	        int product = 1;
	        while (number != 0) {
	            int digit = number % 10;
	            product *= digit;
	            number /= 10;
	        }
	        return product;
	    }
	}

}
