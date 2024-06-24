package Practicle_Task;

import java.util.Arrays;

public class FindMaxBy_allMethod {
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,2,88,44,99,77,55};
		
		maxByJava8(arr);
		
		maxByForLoop(arr);
		
		maxBySwapping(arr);
	}



	// max by using java 8 
	private static void maxByJava8(int[] arr) {

		int max1 = Arrays.stream(arr).max().getAsInt();
		System.out.println("max by java8 : "+max1);
		
	}
	// find max by for loop
	private static void maxByForLoop(int[] arr) {

		int temp=0;
		for(int i=0; i<arr.length ; i++) {
			if(arr[i]>temp) {
				temp= arr[i];
			}
		}
		System.out.println("max by for loop : "+temp);
	}

	//Find max by Swapping and inner for loop
	private static void maxBySwapping(int[] arr) {

		int temp=0;
		for(int i=0; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("max :"+temp);
		System.out.println("min :"+arr[0]);
		//System.out.println("max :"+arr[arr.length-1]);
	}
}
