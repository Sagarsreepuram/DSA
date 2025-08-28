// Given an array of integers, move all the zeros to the end of the array while maintaining the relative order of the non-zero elements.

// Example Input:
// arr = [1, 2, 0, 4, 3, 0, 5, 0]

// Expected Output:
// [1, 2, 4, 3, 5, 0, 0, 0]



package Array;

public class Arrayzero {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        perfectarr(arr);
        
    }
    static void perfectarr(int[] arr){   // 1 2 
       int index = 0;            // index = 3
       for(int i=0; i<arr.length; i++){  // 3 3<8
        if(arr[i]!=0){              // 4 != 0
            int temp = arr[i];      // temp = 4
            arr[i] = arr[index];   // arr[3] = arr[3]
            arr[index] = temp;   // 1 = 2
            index++;    // 2
        }
       }
       for(int nums:arr){
        System.out.print(nums+" ");
       }
    
    }
} 
    

// Core Logic for Your Problems

// Move Zeros to End

// Logic:
// Keep an index to place non-zero elements → swap current non-zero with arr[index] → increment index → fill zeros naturally at the end.

// Keyword to remember: "Index points to next non-zero slot."