import java.util.*;
public class coutDigit {

    public static int coutDigits(int n) {
     int count = 0;
     if(n==0){
       return 1;
     }
     while(n>0){
        count = count + 1;
        n = n/10;
     }
    return count;
        
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter N value");
       int n = sc.nextInt();
       int result = coutDigits(n);
       System.out.println(result);
       sc.close();
    }
}
