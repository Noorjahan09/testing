//Random Number game
import java.lang.*;
import java.util.*;
class RandomNumberGame{
	
	public static void main(String[] args) {
		//object of random class
		Random r = new Random();
		//System.out.println(Math.random()*100);
		//random number gerated and stored in a variables
		int number = r.nextInt(50);
		//message to the user
		System.out.println("Ur game starts, guess the number below 50:");
		//object of scanner class to take user input
		Scanner scan = new Scanner(System.in);
		//game starts
		for(int i=1; i<10; i++){
			//variable to store user input
			int guessed = scan.nextInt();
			if(number == guessed){
			//if user input is equals to the ramdom number game stops here
				System.out.println("congrats you won");
				break;
			}
			else if(number<guessed){
			//if user input is greater than the generated will say try lesser and also chances remaining to guess
				System.out.println("try lesser!!!\n you'll have only "+(10-i)+" chances");
			}
			else if(number>guessed){
			//if user input is lesser than the generated will say try greater and also chances remaining to guess
				System.out.println("try greater!!!\n you'll have only "+(10-i)+" chances");
			}
			else{
			//if chances completed tells the user that they lost and shows the number they missed
				System.out.println("oh! you lose it");
				System.out.println("The Number is "+number);
			}
		}
	}
}