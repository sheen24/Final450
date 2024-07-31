 
        int max= arr[0];
        int min= arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min=arr[i];
            }
            else if(max< arr[i]){
                max=arr[i];
            }
        }
        System.out.println(min +" " + max);


/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int element = sc.nextInt();
       
        
        int[] arr = new int[element];
        
        System.out.print("Enter the elements: ");
        // Entering array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Optional: Print original array
        // System.out.print("Original Array: ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        
        // Finding min and max
        int min = findMin(arr);
        int max = findMax(arr);
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        
      
    }

    // Method to find minimum value in an array
    public static int findMin(int[] arr) {
        int min = arr[0];//Integer.MAX_VALUE
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method to find maximum value in an array
    public static int findMax(int[] arr) {
        int max = arr[0];//Integer.MIN_VALUE
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
