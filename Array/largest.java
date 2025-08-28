// Problem Statement:
// Given an array of integers, find the largest, second largest, and third largest elements in the array without sorting it.


// Example Input:
// arr = [1, 14, 2, 16, 10, 20]


// Expected Output:
// Largest element is: 20, Second Largest element is: 16, Third Largest element is: 14


package Array;

public class largest {
    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        findarray(arr);
    }
    static void findarray(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>first){    
                third = second;
                second = first;
                first = arr[i];
            }else if(arr[i] > second && second != arr[i]){
                second = arr[i];
            }else if(arr[i] > third && third != arr[i] && third != second){
                third = arr[i];
            }
        }
        System.err.println("Largest element is: "+first+",Second Largest element is: "+second+ "Third Largest element is: "+third);
    }
    
}


// First, Second, Third Largest

// Logic:
// Keep first, second, third initialized to very small values → update them in order when finding a bigger element.

// Keyword to remember: "Shift down values like a scoreboard: first → second → third."