//importing Scanner from util package
import java.util.Scanner;
//class name 
class PrimeRange{
	//main method starts
	public static void main(String[] args) {
		//Scanner object initilization
		Scanner scan = new Scanner(System.in);
		//asking user input for upperrange
		System.out.println("Enter the UpperRange:");
		//scanning input to variable
		int upperRange = scan.nextInt();
		//asking user input for lowerrange
		System.out.println("Enter the LowerRange:");
		//scanning input to variable
		int lowerRange = scan.nextInt();
		//initilizing array of String datatype 
		String primeNumbers[] = new String[upperRange];
		//variable to define the array index
		int k=0;
		//starting to print prime numbers
		System.out.print("desc: [");
		//loop starts for primenumbers in decending order
		for (int i = upperRange; i>=lowerRange ;i-- ) {
			int count=0;
		//loop for the count of factors
			for(int j=1; j<i; j++) {
				if(i%j==0){
		//incrimenting when factors found
				count++;
				}
			}
		//if factors are only one apart of itself then it is prime
			if(count==1){
		//prime numbers are converted to string and assigning to array of string datatype
				primeNumbers[k]=Integer.toString(i);
		//printing the prime numbers in decending order
				System.out.print(primeNumbers[k]+",");
				k++;
			}
		}
		//ending to print prime numbers
		System.out.print("]\n");
	}
}