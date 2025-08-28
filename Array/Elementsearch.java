// Given an array of integers and a target value, write a program to determine whether the target element exists in the array. If it exists, print its index.

// Example Input:
// arr = [7, 3, 5, 2, 1]
// target = 3

// Expected Output:
// Yes the Element 3 is Present at index: 1

package Array;

public class Elementsearch {
    public static void main(String[] args) {
        int[] arr = {7,3,5,2,1};
        int target = 3;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Yes the Element "+arr[i]+" is Present at index: "+i);
            }
        }
        
    }
}


// Linear Search

// Logic:
// Traverse array → compare each element with target → if match, print index.

// Keyword to remember: "Check one by one until found."
