// Write a Java program to print all the prime numbers up to a given number n.

// Input: An integer n.
// Output: All prime numbers from 2 to n.

// Example:
// Input: 10
// Output: 2 3 5 7


import java.util.*;

public class RangePrime {
    static boolean IsPrime(int n) {
        if (n <= 1) return false;   // 0 and 1 are not prime
        for (int i = 2; i * i <= n; i++) {  // check till sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void CheckPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (IsPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CheckPrime(n);
    }
}

// Core Logic

// Prime Number Definition:
// A prime number is a number greater than 1 that has no divisors other than 1 and itself.

// Check if a number is prime (IsPrime):

// If n <= 1, return false.

// Run a loop from 2 to √n.

// If any number divides n, return false.

// Otherwise, return true.

// Print all primes up to n (CheckPrime):

// Start from 2 and go up to n.

// For each number, call IsPrime(i).

// If true, print it.




// Write a Java program using the Sieve of Eratosthenes algorithm to print all prime numbers less than a given number n.

// Example:
// Input: 10
// Output: 2 3 5 7



// import java.util.*;

// public class Main
// {
//     static void SievePrime(int n){
//         boolean[] prime = new boolean[n+1];
//         for(int i=2; i<n; i++){
//             if(prime[i] == false){
//                 for(int j=i*2; j<n; j=j+i){
//                     prime[j] = true;
//                 }
//             }
//         }
//         for(int i=2; i<n; i++){
//             if(prime[i] == false){
//             System.out.print(i+" ");
//             }
//         }
//     }
// 	public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
// 	    int n = sc.nextInt();
// 	     SievePrime(n);
// 	}
// }


// Core Logic

// Idea of Sieve

// Create a boolean array prime[] of size n+1.

// Initially, assume all numbers are prime (false means prime, true means composite in your code).

// Start from i = 2 and mark all multiples of i as composite.

// Continue this for all numbers up to n.

// At the end, the indices which remain false are prime numbers.

// Steps in Code

// boolean[] prime = new boolean[n+1];
// → Array to mark composite numbers.

// Outer loop: for (int i = 2; i < n; i++)
// → Traverse through numbers.

// If prime[i] == false, it means i is prime → mark multiples of i (j = i*2; j < n; j += i) as composite (prime[j] = true).

// Finally, print all i where prime[i] == false.