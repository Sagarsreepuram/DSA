// ❓ Problem Statement
// Given a binary array (containing only 0s and 1s), find the maximum number of consecutive identical elements (either 0s or 1s).

// Example Input:
// arr = [0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1]

// Expected Output:
// 2

// (Because the longest streak is 0,0 or 1,1, both of length 2.)

package Array;

public class NoZero {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        int res = findzeroorone(arr);
        System.out.println(res);
    }
    static int findzeroorone(int[] arr){
      int maxcount = 0;
      int count = 1;
      for(int i=1; i<arr.length; i++){
        if(arr[i] == arr[i-1]){
            count++;
        }else{
            maxcount = Math.max(maxcount, count);
            count = 1;
        }
      }
      return Math.max(maxcount, count);
    }
    
}
 

// 🔑 Core Logic

// Keep a count of current streak (start from 1).

// Traverse array → if current element == previous, increase count.

// Else, update maxcount with count and reset count to 1.

// Final answer = maximum between maxcount and count.

// Keyword to remember: "Count streaks, reset when break happens, keep max."