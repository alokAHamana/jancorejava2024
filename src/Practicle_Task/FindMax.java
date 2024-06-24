package Practicle_Task;

import java.util.Arrays;

public class FindMax {
	
	public static void main(String[] args) {
		
		int[] arr = {2,1,5,3,9,0};
		
	int max = Arrays.stream(arr).max().getAsInt();
	
	System.out.println(max);
	}

}
