// ❓ Problem Statement
// Given two integers, write a program to find their Least Common Multiple (LCM).

// Example Input:
// a = 12
// b = 15


// Expected Output:
// 60

import java.util.Scanner;

public class Lcm{
    static int findlcm(int a, int b){
        int res = Math.max(a, b);
        while(true){
            if(res%a == 0 && res%b == 0){
                break; 
            }
            res++;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findlcm(a, b));

    }

}


// 🔑 Core Logic

// Start from the maximum of the two numbers.

// Check each number (res) incrementally:

// If res is divisible by both a and b → it’s the LCM.

// Otherwise, increment res.

// Stop at the first number that satisfies the condition.

// Keyword to remember: "Start from max(a,b) and find the first divisible by both."