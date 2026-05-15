import java.util.*;
public class Recursion {

   public static void printDec(int n){
    if(n==0) {
        return;
    }
    System.out.print(n + " ");
    printDec(n-1);
    }
    
   public static void printAsc(int n){
    if(n==0) {
        return;
    }
    printAsc(n-1);
    System.out.print(n + " ");
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n =sc.nextInt();

    printDec(n);
    System.out.println();
    printAsc(n);
   


}

}
