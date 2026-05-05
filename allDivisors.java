import java.util.*;
public class allDivisors {

   public static int divisors(int n){
    List <Integer> list = new ArrayList<>();

    for(int i = 1; i)

   }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter the number");
       int n = sc.nextInt();
       int result = divisors(n);
       System.out.println(result);

    }
}
