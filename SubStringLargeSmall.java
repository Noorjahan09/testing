import java.util.Scanner;

public class SubStringLargeSmall {
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        String str;
        int len = s.length();
       for(int i=0; i<=len-k; i++){

           str = s.substring(i,i+k);
           System.out.println(str);
           if(str.compareTo(smallest)<0)
                smallest = str;
            if(str.compareTo(largest)>0)
                largest = str;
       }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}