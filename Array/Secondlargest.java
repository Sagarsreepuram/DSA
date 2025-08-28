// Problem Statement
// Given an array of integers, find the largest and second largest elements without sorting the array.

// Example Input:
// arr = [12, 35, 1, 10, 34, 1]


// Expected Output:
// The Largest Element is: 35
// The Second Largest Element is: 34

package Array;

public class Secondlargest {
    static void secondlar(int[] arr){
        int max = Integer.MIN_VALUE;      //max = 35
        int secmax = Integer.MIN_VALUE;   //sec = 35
        for (int i = 0; i < arr.length; i++) { // 4  4<6
            if (arr[i] > max) {        // 34 > 35 
                secmax = max; //    35
                max = arr[i]; //    max = 35 
            } else if (arr[i] > secmax && arr[i] != max) {   // 35 > 12   35 != 12
                secmax = arr[i]; // Update second largest      sec = 35
            }
        }
        System.out.println("The Largest Element is: "+max);
        System.out.println("The second largest Element is: "+secmax);

    }
   public static void main(String[] args) {
       int[] arr = {12, 35, 1, 10, 34, 1};
       secondlar(arr);
    }
    
}


// 🔑 Core Logic

// Keep two variables: max and secmax.

// Traverse array:

// If arr[i] > max → update secmax = max, then max = arr[i].

// Else if arr[i] > secmax and arr[i] != max → update secmax.

// Print max and secmax.

// Keyword to remember: "If bigger comes → push old max to second."