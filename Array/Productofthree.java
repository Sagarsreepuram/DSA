// Problem Statement
// Given an integer array, find the maximum product of any three numbers.

// Example Input:
// arr = [-10, -3, -5, -6, -20]

// Expected Output:
// -90

package Array;

public class Productofthree {
    
    public static void main(String[] args) {
        int arr[] = {-10, -3, -5, -6, -20};
        productnum(arr);
    }
    static void productnum(int[] arr){
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
        System.out.println("Multiplication of "+first + second +"and"+third+ "is:"+(first*second*third));
    }
    
}


// 🔑 Core Logic

// The maximum product of 3 numbers can come from:

// The three largest numbers (positive case).

// The two smallest negative numbers + the largest number (because two negatives make a positive).

// Current code only tracks the top 3 largest numbers, but for full correctness, you also need the two smallest numbers.

// Final Answer = max(first * second * third, first * min1 * min2)

// Keyword to remember: "Max product = either 3 biggest OR 2 smallest × biggest."