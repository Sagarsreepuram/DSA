// Write a Java program to find the factorial of a given number using iteration.


package Methods;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int num = sc.nextInt();
    fact(num);
}

static void fact(int num){
    int fac=1;
    for(int i=1; i<=num; i++){
        fac = fac*i;
    }
    System.out.println("The Factorial of "+ num +" is "+ fac);
}
}



// 🔑 Core Logic

// Definition:

// Factorial of n is:

// n!=n×(n−1)×(n−2)×…×1

// Example: 5! = 5 × 4 × 3 × 2 × 1 = 120.

// Steps:

// Take input num.

// Initialize a variable fac = 1.

// Run a loop from 1 → num.

// Multiply each number with fac.

// Print the result.

// Edge Case:

// 0! = 1 (by definition).

// Negative numbers don’t have factorial in normal mathematics.