package com.aa.flowcontrol;


public class FabnocciSeriesDemo {

	public static void main(String[] args) {

		int x = 1;
		int y = 1;
		int temp = 0;

		System.out.print(x+" "+y+" ");

		for (int i = 1; i <= 10; i++) { // i=1,2,3,4,5,6,7,8,9,10,11

			temp = x + y; 

			System.out.print(temp+" "); // temp =2 3 5 8 13 21 34 55 89 144 
			
			x = y;    // 89             
			y = temp;  // 144        
		}

	}
	}
