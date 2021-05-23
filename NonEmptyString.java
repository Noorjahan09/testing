//Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NonEmptyString{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        int i=1;
        while(scan.hasNext()){
            str = scan.nextLine();
            System.out.println(i+" "+str);
            i++;
        }
    }
}