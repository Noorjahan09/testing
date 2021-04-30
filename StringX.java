//program that removing x's in the string except in the very first and last
import java.util.*;
class StringX{
	public static void main(String[] args) {
		//asking user to give input
		System.out.println("Enter a String:");
		//scanning input
		Scanner scan = new Scanner(System.in);
		//reading input
		String input = scan.next();
		//finding length of the given string
		int len = input.length();
		//declaration of the string variables that holds the output
		String output="";
		//adding the very first char into output variable
		output=output+input.charAt(0);
		//checking the x's present in the string or not
		for (int i=1; i<(len-1); i++) {
			//dividing each char from the string
			char ch = input.charAt(i);
			//checking each char other than the first and last char's
			if((ch=='X')||(ch=='x')){
				//removing x's
				continue;	
			}
			else{
				//adding remaining char's to the output variable
				output=output+ch;
			}
		}	
		//adding the last char to the output variables
		output=output+input.charAt(len-1);
		//given input
		System.out.println("Given String = "+input);
		//final result
		System.out.println("The Final Result : "+output);
	}
}