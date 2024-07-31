// Reversing an array 
import java.util.*;


public class Main{
    
     public static void ReverseArray(int[] arr){
       int size =arr.length;
       int newarr[]= new int[size];
       System.out.println();
       System.out.println("Reversed Array:");
       for (int i = size -1 ; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    
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
        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        ReverseArray(arr);
       
    }
}
