package com.aa.flowcontrol;

public class SumofDigit {

	public static void main(String[] args) {

		
				int num = 12345;
				int remdr = 0;
				int sum = 0;
				
				while(num>0) {
					
				   remdr =  num%10;    // 12345%10=5   1234%10=4    123%10=3    12%10=2       1%10=1
					
				   sum = sum + remdr;    //  0+5=5        5+4=9        9+3=12     12+2=14       14+1= 15-> print this
			
					
				   num =  num/10;      //1234.5=1234   123.4=123	  12.3		 1.2            0.1 -> now cond false 
				}                       //                                                             loop exit 
					
				System.out.println(sum);
			}
		}               //output = 15

	