
package Practicle_Task;

public class Reverse_String {

	public static void main(String[] args) {
		
		String a = "Alok";
		String s = "";
		
		for(int i=a.length()-1 ; i>=0; i--) {
			
			s=s+a.charAt(i);
		}
		System.out.println(s);
	
		}   
}
