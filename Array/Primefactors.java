// Write a program to print all the prime factors of a given number.

// 👉 Example:

// Input: 28

// Output:

// 2
// 2
// 7

// (because 28 = 2 × 2 × 7 (28=2×2×7)


import java.util.*;

class Main {
    public static void primefactors(int n){
        
        int i =2;

    while(n>2){
        while(n % i == 0){
            System.out.println(i);
             n = n / i ; 
        }
        i++;
    }
    }
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      primefactors(n);
    }
}



// Core Logic

// Start with the smallest prime factor i = 2.

// While the number n is greater than 2:

// Check if n is divisible by i.

// If yes → print i, then divide n = n / i.

// Keep dividing until n is no longer divisible by i.

// Increment i and repeat the process.

// Continue until n is fully reduced to 1.