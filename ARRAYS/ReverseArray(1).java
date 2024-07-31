// Reversing an array 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int element=sc.nextInt();
        int []arr = new int[element];
        
        System.out.print("Enter the elements:");
        // entering array
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // printing array 
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        
        // reversing array
         for (int i=arr.length-1;i>=0;i--){
              System.out.println(arr[i]+" ");
         }
        
    }
}
