import java.util.Scanner;

public class revNum {
    public static int reverse(int n){
        int rev = 0;

        if(n == 0){
            return 0;
        }
        n = Math.abs(n);

        while(n != 0){
            int lastDigit = n%10;
            rev = rev * 10 + lastDigit;
            n = n/10;
        }

       return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the value of n");
        int n = sc.nextInt();
        int result = reverse(n);
        System.out.println(result);
    }
    
}
