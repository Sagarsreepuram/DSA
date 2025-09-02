// Write a program in Java to convert a decimal number to binary and also convert that binary number back to its decimal form.

// For example:
// Input: 25

// Binary: 11001
// Decimal (from binary): 25


class BinaryDecimal {
    static String DecimalToBinary(int n) {
        String b = "";
        while (n >= 1) {
            int x = n % 2;
            n = n / 2;
            b = x + b;   // prepend the bit
        }
        return b;
    }

    static int BinaryToDecimal(String b) {
        int result = 0;
        int powerof2 = 1;
        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                result = result + powerof2;
            }
            powerof2 = powerof2 * 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 25;
        String b = DecimalToBinary(n);
        System.out.println("Decimal to Binary: " + b);   // should be 11001
        System.out.println("Binary to Decimal: " + BinaryToDecimal(b)); // should be 25
    }
}



// Core Logic:
// 1. Decimal → Binary

// Keep dividing the number by 2.

// Collect the remainder (n % 2) each time.

// Append remainders in reverse order (last remainder is the most significant bit).