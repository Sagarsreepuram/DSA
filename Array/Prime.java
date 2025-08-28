// Write a program to check whether a given number is prime or not.


class Main {
    static boolean primenumber(int n){
        if (n <= 1) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(primenumber(n));
    }
}

// 🔑 Core Logic (Step by Step)

// Definition:
// A prime number is a number greater than 1 that has only two divisors → 1 and itself.

// Example: 2, 3, 5, 7, 11 …

// Steps to solve:
// If n <= 1 → Not a prime.
// Otherwise, check divisibility:
// Run a loop from 2 to √n. / n/2
// If any i divides n (n % i == 0) → Not a prime.
// If no divisor is found → Prime.
// Why √n?
// Because if n has a factor larger than √n, the corresponding smaller factor will already be found before √n.
// Example: For n = 36, factors are (2,18), (3,12), (6,6) … beyond √36 = 6, they repeat.