// ❓ Problem Statement
// Write a program to check if a given array is sorted. An array is considered sorted if it is either in ascending order or in descending order.

// Example Input 1:
// arr = [1, 2, 3, 4, 5]

// Expected Output:
// true


// Example Input 2:
// arr = [5, 4, 3, 2, 1]

// Expected Output:
// true


// Example Input 3:
// arr = [5, 4, 3, 2, 1, 10]

// Expected Output:
// false


package Array;

public class sortedarray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,10};
        System.out.println( sort(arr));
    }
    static boolean sort(int[] arr) {
        boolean ascending = true;
        boolean descending = true;
    
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;  // Not ascending if a later number is smaller
            } 
            if (arr[i] < arr[i + 1]) {
                descending = false; // Not descending if a later number is larger
            }
        }        
        return ascending || descending; // True if either ascending or descending
    }
}

// 🔑 Core Logic

// Assume both ascending = true and descending = true.

// Traverse array:

// If any pair violates ascending → set ascending = false.

// If any pair violates descending → set descending = false.

// If at least one of them remains true → array is sorted.

// Keyword to remember: "Check both directions; if one survives, it’s sorted."