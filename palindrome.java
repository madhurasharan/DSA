import java.util.*;
public class palindrome {
    public static boolean paliNum(int n){   
 /*if(n==0){
    return true;
} Not needed — because: Loop won’t run for "0", rev = 0, original = 0, So it already returns true */
        
     if(n<0){
     return false;   
     }

      int original = n;
       int rev =0;

       while(n !=0){
        int lastDigit = n%10;
        rev = rev * 10 + lastDigit;
        n=n/10;
       }

     return rev == original;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = paliNum(n);
        System.out.println(result);
        }
}
