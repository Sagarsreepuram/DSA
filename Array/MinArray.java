// Problem Statement
// Given an array of integers, find the largest element in the array.

// Example Input:
// arr = [12, 35, 1, 10, 34, 1]

// Expected Output:
// The largest Number is: 35


package Array;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        maxarray(arr); 
    }
    static void maxarray(int[] arr){
        int max = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The largest Number is: "+max);
    }
    
}


// 🔑 Core Logic

// Assume first element is max.

// Traverse array → compare each element with max.

// If element is greater → update max.

// At the end, max = largest number.

// Keyword to remember: "Keep updating max if a bigger one comes."