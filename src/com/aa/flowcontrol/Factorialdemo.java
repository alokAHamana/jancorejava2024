package com.aa.flowcontrol;

public class Factorialdemo {
	
		public static void main(String[] args) {
			
			int num = 5;
			int factorial =1;
			
			for(int i=1; i<=num; i++) {       //i=1            ;2             ;3            ;4
				                              
				factorial =factorial*i;       //fac=1*1=1      ;1*2=2         ;2*3=6        ;6*4=24

			}
			
			System.out.println(factorial);                 //factorial =   24
			
		}

	}                    //output = 24

