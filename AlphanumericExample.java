/*import java.util.regex.*;
 
class AlphanumericExample
{
	public static void main(String...s)
	{
		String s1="adA_12", s2="jh@l";
		System.out.println(s1.matches("[a-zA-Z0-9_]+"));
		System.out.println(s2.matches("[a-zA-Z0-9_]+"));
	}
}*/
import java.util.Scanner;
class UsernameValidator {
    public static final String regularExpression = "^[A-Za-z]\\w{7,29}$";
}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}