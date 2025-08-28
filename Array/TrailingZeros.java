// Find the Number Of Trailing Zeros In A Factorial

public class TrailingZeros {
    public static int countTrailingZeros(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Trailing zeros in " + n + "! = " + countTrailingZeros(n));
    }
}



// 🔑 Core Logic

// A trailing zero is produced by a factor of 10 = 2 × 5.

// In factorials, we have plenty of 2s (every even number contributes one).

// The limiting factor is 5s.

// So, the number of trailing zeros = count of factors of 5 in n!.

// But wait ⚠️

// Numbers like 25, 125 contribute extra 5s.

// Example: 25 = 5 × 5 (two 5s).

// So we keep dividing n by powers of 5.