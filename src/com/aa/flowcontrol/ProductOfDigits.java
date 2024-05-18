package com.aa.flowcontrol;
import java.util.Scanner;

public class ProductOfDigits {

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Enter an integer: ");
        
    	int number = scanner.nextInt();

        // Handle negative numbers
        int product = 1;
        if (number < 0) {
            number = Math.abs(number); // Convert to positive
        }

        // Find the product of digits using a loop
        while (number > 0) {
            product *= number % 10; // Multiply by the last digit
            number /= 10; // Remove the last digit
        }

        System.out.println("Product of digits: " + product);
    }
}
