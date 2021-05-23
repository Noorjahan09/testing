import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    sc.close();
    int count = 0;
    for(int i=0, j=A.length()-1;i<=j;i++,j--){
        if(A.charAt(i)!=A.charAt(j)) count = 1;
    }
    if(count == 0)
        System.out.println("Yes");
    else
        System.out.println("No");
    }
}