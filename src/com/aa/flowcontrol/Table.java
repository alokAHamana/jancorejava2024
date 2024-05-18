package com.aa.flowcontrol;
import java.util.Scanner;

public class Table {
	
	
    public static void main(String[] args) {
        int a;
        System.out.println("write a table number");
        Scanner scanner =new Scanner(System.in);
        a=scanner.nextInt();
        int i=1;
        int temp=0;
        while(i<=10) {
            temp=a*i;
            System.out.println(temp);
            i++;
            
        }
    }

}