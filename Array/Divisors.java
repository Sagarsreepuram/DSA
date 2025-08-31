// ❓ Question

// Write a program in Java to find and print all divisors of a given integer.

// The program should take an integer n as input.

// Then, it should print all numbers that divide n exactly (i.e., with remainder 0).


import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Divisors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}


// ⚡ Core Logic

// Input a number → Let’s call it n.

// Loop from 1 to n (inclusive).

// For each i, check if n % i == 0.

// % is the modulus operator → checks remainder.

// If remainder is 0, it means i divides n.

// Print all such i values.