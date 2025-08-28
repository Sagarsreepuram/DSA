// Problem Statement
// Given two integers, write a program to find their Greatest Common Divisor (GCD).

// Example Input:
// a = 12
// b = 15

// Expected Output:
// 3


import java.util.Scanner;
public class Gcd {

    static int findgcd(int a, int b) {
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findgcd(a, b));
        
    }
}


// 🔑 Core Logic

// Find the smaller of the two numbers.

// Traverse from min down to 1:

// If i divides both numbers (a % i == 0 && b % i == 0) → return i as GCD.

// If no number divides both (edge case), return 1.

// Keyword to remember: "Start from min(a,b) and find the largest number dividing both."