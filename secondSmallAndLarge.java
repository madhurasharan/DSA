import java.util.*;
public class secondSmallAndLarge {


    public static int secondSmallest(int[] arr, int n){
          if (n<2) return -1;
           int small = Integer.MAX_VALUE;
           int secondSmall = Integer.MAX_VALUE;

           for(int i=0; i<n; i++){
            if( arr[i]<small){
                secondSmall = small;
                small = arr[i];
            } else if(arr[i]<secondSmall && arr[i]!=small){
                secondSmall=arr[i];
            }
           }

          return (secondSmall == Integer.MAX_VALUE ? -1 : secondSmall);
       }

    public static int secondLargest(int[] arr, int n){
          if (n<2) return -1;
           int large = Integer.MIN_VALUE;
           int secondLarge = Integer.MIN_VALUE;

           for(int i=0; i<n; i++){
            if( arr[i]>large){
                secondLarge = large;
                large = arr[i];
            } else if(arr[i]>secondLarge && arr[i]!=large){
                secondLarge=arr[i];
            }
           }

          return (secondLarge == Integer.MIN_VALUE ? -1 : secondLarge);
       }


    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];

       for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
       }

       int secSmallest = secondSmallest(arr, n);
       int secLargest = secondLargest(arr, n);

       System.out.println(secSmallest);
       System.out.println(secLargest);

      sc.close();
    }
}
